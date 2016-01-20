package controllers

import java.awt.image.BufferedImage
import java.io.File
import java.sql.Timestamp
import java.util.logging.Logger
import javax.inject.Inject

import models.Tables._
import org.joda.time.{UTCDateTimeZone, LocalDateTime, DateTimeZone, DateTime}
import play.api
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.json._
import play.api.libs.json.Json
import play.api.mvc.{Result, Action, Controller}
import play.api.libs.mailer._
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import scala.concurrent.duration._
import java.nio.file._
import javax.imageio.ImageIO
import org.imgscalr.Scalr
import org.apache.commons.codec.binary.Base64
import play.api.libs.functional.syntax._
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

class Announcement extends Controller  with HasDatabaseConfig[JdbcProfile] {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def newAnnouncement = Action {
    Ok(views.html.announcement.newannouncement())
  }

  def newConfirm = Action {
    Ok(views.html.announcement.newconfirm())
  }

  def notFound = Action {
    Ok(views.html.announcement.notfound())
  }

  def edit = Action {
    Ok(views.html.announcement.editannouncement())
  }

  case class NewAnnouncement (_type: String, title: String, category: String, contact: String, description: String, email: String, region: Int, city: Int, base64: String, filetype: String, phone: String)
  implicit val an2Reads: Reads[NewAnnouncement] = (
    (JsPath \ "_type").read[String] and
      (JsPath \ "title").read[String] and
      (JsPath \ "category").read[String] and
      (JsPath \ "contact").read[String] and
      (JsPath \ "description").read[String] and
      (JsPath \ "email").read[String] and
      (JsPath \ "region").read[Int] and
      (JsPath \ "city").read[Int] and
      (JsPath \ "base64").read[String] and
      (JsPath \ "filetype").read[String] and
      (JsPath \ "phone").read[String]
    )(NewAnnouncement.apply _)

  def postAnnouncement = Action.async(parse.json) { implicit request =>
    request.body.validate[NewAnnouncement].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      announcement => {
        val photoPath = saveImage(announcement.base64, announcement.filetype)
        val tz = DateTimeZone.getDefault
        val dt : DateTime = DateTime.now
        val timestamp : Timestamp = new Timestamp(tz.convertLocalToUTC(dt.getMillis, false))

        request.session.get("id").map { user =>
          val q = db.run(Users.filter(f => f.sessionId === user).map(m=>m.id).result.headOption)

          q.map(
            res => {
              val newAnn = new AnnouncementsRow(0, announcement.title, announcement._type, announcement.category.toInt, announcement.description, announcement.region, announcement.city, announcement.contact, announcement.email, photoPath, Some(timestamp), announcement.phone, res)
              val insertQuery = db.run(Announcements.returning(Announcements.map(_.id)) += newAnn)
              val id = Await.result(insertQuery, Duration(15, SECONDS))
              Ok(Json.obj("error" -> "", "id" -> id))
            }
          )
        }.getOrElse {
          val newAnn = new AnnouncementsRow(0,announcement.title,announcement._type,announcement.category.toInt,announcement.description,announcement.region,announcement.city,announcement.contact,announcement.email, photoPath, Some(timestamp), announcement.phone)
          val insertQuery = db.run(Announcements.returning(Announcements.map(_.id)) += newAnn)
          val id = Await.result(insertQuery, Duration(15, SECONDS))
          Future.successful(Ok(Json.obj("error"->"", "id"->id)))
        }

      }
    )
  }

  case class UpdateAnnouncement (id: Int, _type: String, title: String, category: String, contact: String, description: String, email: String, region: Int, city: Int, base64: String, filetype: String, phone: String)
  implicit val updAn2Reads: Reads[UpdateAnnouncement] = (
    (JsPath \ "id").read[Int] and
    (JsPath \ "_type").read[String] and
      (JsPath \ "title").read[String] and
      (JsPath \ "category").read[String] and
      (JsPath \ "contact").read[String] and
      (JsPath \ "description").read[String] and
      (JsPath \ "email").read[String] and
      (JsPath \ "region").read[Int] and
      (JsPath \ "city").read[Int] and
      (JsPath \ "base64").read[String] and
      (JsPath \ "filetype").read[String] and
      (JsPath \ "phone").read[String]
    )(UpdateAnnouncement.apply _)

  def updateAnnouncement() = Action.async(parse.json) { implicit request =>
    request.body.validate[UpdateAnnouncement].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      announcement => {
        request.session.get("id").map { user =>
          val q = db.run(Users.filter(f => f.sessionId === user).map(m=>m.id).result.headOption)

          q.map(
            res => {
              val getUserId = db.run(Announcements.filter(_.id === announcement.id).map(m=>m.userId).result.head)
              val userId = Await.result(getUserId, Duration(15, SECONDS))
              if(userId.get == res.get){
                if(announcement.base64 != ""){
                  val photoPath = saveImage(announcement.base64, announcement.filetype)
                  val updateQuery = db.run(Announcements.filter(f=> f.id === announcement.id)
                    .map(m=>(m.`type`, m.title, m.categoryId, m.contact, m.cityId, m.regionId, m.description, m.phone, m.photo))
                    .update((announcement._type, announcement.title, announcement.category.toInt, announcement.contact, announcement.city.toInt, announcement.region.toInt, announcement.description, announcement.phone, photoPath)))
                }
                else{
                  val updateQuery = db.run(Announcements.filter(f=> f.id === announcement.id).map(m=>(m.`type`, m.title, m.categoryId, m.contact, m.cityId, m.regionId, m.description, m.phone))
                    .update((announcement._type, announcement.title, announcement.category.toInt, announcement.contact, announcement.city.toInt, announcement.region.toInt, announcement.description, announcement.phone)))
                }
                Ok(Json.obj("error" -> ""))
              }
              else{
                Unauthorized(Json.obj("error" -> "forbidden"))
              }
            }
          )
        }.getOrElse {
          Future.successful(Unauthorized(Json.obj("error" -> "forbidden")))
        }
      }
    )
  }

  def deleteAnnouncementById() = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        request.session.get("id").map { user =>
          val q = db.run(Users.filter(f => f.sessionId === user).map(m=>m.id).result.headOption)

          q.map(
            res => {
              val getUserId = db.run(Announcements.filter(_.id === param.id.toInt).map(m=>m.userId).result.head)
              val userId = Await.result(getUserId, Duration(15, SECONDS))
              if(userId.get == res.get){
                val deleteQuery = db.run(Announcements.filter(_.id === param.id.toInt).delete)
                val deleteRes = Await.result(deleteQuery, Duration(15, SECONDS))
                if(deleteRes > 0){
                  Ok(Json.obj("error"->""))
                }
                else{
                  Ok(Json.obj("error"->"empty result"))
                }
              }
              else{
                Unauthorized(Json.obj("error" -> "forbidden"))
              }
            }
          )
        }.getOrElse {
          Future.successful(Unauthorized(Json.obj("error" -> "forbidden")))
        }
      }
    )
  }

  def saveImage(base64: String, filetype: String) = {
    var path = ""
    if(base64.isEmpty){
      path = "images/default.jpg"
    }
    else{
      val ext = filetype.split('/')(1)
      val filename = System.currentTimeMillis.toString+"."+ext
      path = "images/"+filename
      try{
        val byteArr : Array[Byte] = Base64.decodeBase64(base64)
        Files.write(Paths.get("public/"+path), byteArr, StandardOpenOption.CREATE)
        val originalImg = ImageIO.read(new File("public/"+path))
        val resizedImg = Scalr.resize(originalImg, 800, Scalr.OP_ANTIALIAS)
        ImageIO.write(resizedImg, ext,  new File("public/"+path))
      }catch {
        case e: Exception => api.Logger.warn("Can't save image " + e.toString)
      }
    }
    path
  }

  def showAd(id: Option[String]) = Action{
    Ok(views.html.announcement.showdetails())
  }

  case class AnParam (action:String, id: String)
  implicit val anParam2Reads: Reads[AnParam] = (
    (JsPath \ "action").read[String] and
    (JsPath \ "id").read[String]
    )(AnParam.apply _)

  implicit val announcementWrites = new Writes[(Int, String, String, String, String, String, String, String, Int, String, Int, String, String, Option[Timestamp], Int)] {
    def writes(t: (Int, String, String, String, String, String, String, String, Int, String, Int, String, String, Option[Timestamp], Int)) =
      Json.obj("id" -> t._1, "title" -> t._2, "description"->t._3, "contact"->t._4, "photo"->t._5, "email"->t._6, "phone"->t._7, "category"->t._8, "regionId"->t._9, "region"->t._10, "cityId"->t._11, "city"->t._12, "type"->t._13, "timestamp"->t._14, "categoryId"->t._15)
  }

  def loadAd = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Announcements.filter(_.id === param.id.toInt).join(Categories).on(_.categoryId === _.id)
          .join(Regions).on(_._1.regionId === _.id)
          .join(Cities).on(_._1._1.cityId === _.id)
          .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._1.phone, m._1._1._2.name, m._1._2.id, m._1._2.name, m._2.id, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).result)

        q.map(
          res => Ok(Json.toJson(res))
        )
      }
    )
  }

  def getRegionById = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Regions.filter(_.id === param.id.toInt).map(m=>m.name).result)

        q.map(
          res => Ok(Json.obj("region" -> res.head))
        )
      }
    )
  }

  def getCityById = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Cities.filter(_.id === param.id.toInt).map(m=>m.name).result)

        q.map(
          res => Ok(Json.obj("city" -> res.head))
        )
      }
    )
  }

  def getCategoryById = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Categories.filter(_.id === param.id.toInt).map(m=>m.name).result)

        q.map(
          res => Ok(Json.obj("category" -> res.head))
        )
      }
    )
  }


  case class SearchParams (key: String, region: String, city: String, category: String)
  implicit val search2Reads: Reads[SearchParams] = (
    (JsPath \ "key").read[String] and
      (JsPath \ "region").read[String] and
      (JsPath \ "city").read[String] and
      (JsPath \ "category").read[String]
    )(SearchParams.apply _)

  def doFilter() = Action.async(parse.json){ implicit request =>
    request.body.validate[SearchParams].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      searchParams => {
        if(searchParams.key.isEmpty){
          if(searchParams.category.toInt == 0){
            if(searchParams.region.toInt == 0 && searchParams.city.toInt == 0){ // all cat, all city, all region, all key
              val q = db.run(Announcements
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.region.toInt == 0){ // all cat, all region, city, all key
              val q = db.run(Announcements.filter(f=>f.cityId === searchParams.city.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.city.toInt == 0){ // all cat, all city, region, all key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else{ // all cat, city, region, all key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt && f.cityId === searchParams.city.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
          }
          else{
            if(searchParams.region.toInt == 0 && searchParams.city.toInt == 0){ // cat, all city, all region, all key
              val q = db.run(Announcements.filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.region.toInt == 0){ // cat, all region, city, all key
              val q = db.run(Announcements.filter(f=>f.cityId === searchParams.city.toInt).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.city.toInt == 0){ // cat, all city, region, all key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else{ // cat, city, region, all key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt && f.cityId === searchParams.city.toInt).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
          }

        }
        else{
          if(searchParams.category.toInt == 0){
            if(searchParams.region.toInt == 0 && searchParams.city.toInt == 0){ // all cat, all region, all city, key
              val q = db.run(Announcements.filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%'))
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.region.toInt == 0){ // all cat, all region, city, key
              val q = db.run(Announcements.filter(f=>f.cityId === searchParams.city.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%'))
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.city.toInt == 0){ // all cat, all city, region, key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%'))
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else{//all cat, city, region, key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt && f.cityId === searchParams.city.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%'))
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
          }
          else{ //cat, all city, all region, key
            if(searchParams.region.toInt == 0 && searchParams.city.toInt == 0){
              val q = db.run(Announcements.filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%')).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.region.toInt == 0){ // cat, all region, city, key
              val q = db.run(Announcements.filter(f=>f.cityId === searchParams.city.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%')).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else if(searchParams.city.toInt == 0){ // cat, all city, region, key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%')).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
            else{ // cat, city, region, key
              val q = db.run(Announcements.filter(f=>f.regionId === searchParams.region.toInt && f.cityId === searchParams.city.toInt).filter(f=>f.title.like('%'+searchParams.key+'%') || f.description.like('%'+searchParams.key+'%')).filter(_.categoryId === searchParams.category.toInt)
                .join(Categories).on(_.categoryId === _.id)
                .join(Regions).on(_._1.regionId === _.id)
                .join(Cities).on(_._1._1.cityId === _.id)
                .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(100).result)

              q.map(
                res => Ok(Json.toJson(res))
              )
            }
          }
        }
      }
    )
  }

  //def getRegionId(name : String) = db.run(Regions.filter(f=>f.name === name).map{case(c)=>c.id}.result.head).map(res => res)
  //def getCityId(name : String, regId : Int) = db.run(Cities.filter(f=>f.name === name && f.regionId === regId).map{case(c)=>c.id}.result.head).map(res => res)

  implicit val addressWrites = new Writes[(String, String, Int, Int)] {
    def writes(t: (String,String, Int, Int)) =
      Json.obj("formatted_address" -> Json.toJsFieldJsValueWrapper(t._1+", "+t._2), "regionId"->t._3, "cityId"->t._4)
  }
  def getAddress = Action.async { implicit request =>
    val param = request.getQueryString("q").getOrElse("")

    val q = db.run(Cities.filter(_.name.like('%'+param.toString+'%')).join(Regions).on(_.regionId === _.id).map{case(c, r) =>(c.name, r.name, r.id, c.id)}.result)

    q.map(
      res =>
        if(res.nonEmpty)
        Ok(Json.toJson(res))
    else
          Ok(Json.obj(param.toString -> param))
    )
   // Future.successful(Ok(Json.obj("city"->Json.arr(Json.obj("formated" -> "Alabama"),Json.obj("formated"->"Bababa")))))
  }

  implicit val categoriesWrites = new Writes[(Int, String)] {
    def writes(t: (Int,String)) =
      Json.obj("id" -> t._1, "name" -> t._2)
  }
  def getCategories = Action.async { implicit request =>
    var q = db.run(Categories.map(m=>(m.id, m.name)).result)
    q.map(
      res =>
        Ok(Json.toJson(res))
    )
  }


  implicit val announcementsWrites = new Writes[(Int, String, String, String, String, String, String, String, String, String, Option[Timestamp] , Int)] {
    def writes(t: (Int, String, String, String, String, String, String, String, String, String, Option[Timestamp], Int)) =
      Json.obj("id" -> t._1, "title" -> t._2, "description"->t._3, "contact"->t._4, "photo"->t._5, "email"->t._6, "category"->t._7, "region"->t._8, "city"->t._9, "type"->t._10, "timestamp"->t._11, "categoryId"->t._12)
  }
  def getLast12 = Action.async{ implicit request =>

    val q = db.run(Announcements.join(Categories).on(_.categoryId === _.id)
      .join(Regions).on(_._1.regionId === _.id)
      .join(Cities).on(_._1._1.cityId === _.id)
      .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).sortBy(s => s._11.desc).take(12).result)

    q.map(
      res => Ok(Json.toJson(res))
    )
  }

  case class MoreAnParam (id:Int, email: String)
  implicit val moreAnParam2Reads: Reads[MoreAnParam] = (
    (JsPath \ "id").read[Int] and
      (JsPath \ "email").read[String]
    )(MoreAnParam.apply _)


  def loadMoreAd = Action.async(parse.json) { implicit request =>
    request.body.validate[MoreAnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Announcements.filter(_.id =!= param.id)
          .join(Categories).on(_.categoryId === _.id)
          .join(Regions).on(_._1.regionId === _.id)
          .join(Cities).on(_._1._1.cityId === _.id)
          .join(Users).on(_._1._1._1.userId === _.id).filter(_._2.email === param.email)
          .map(m=>(m._1._1._1._1.id, m._1._1._1._1.title, m._1._1._1._1.description, m._1._1._1._1.contact, m._1._1._1._1.photo, m._1._1._1._1.email, m._1._1._1._2.name, m._1._1._2.name, m._1._2.name, m._1._1._1._1.`type`, m._1._1._1._1.date, m._1._1._1._2.id)).take(3).result)

        q.map(
          res => Ok(Json.toJson(res))
        )
      }
    )
  }

  def dbGetUserAnnouncements(email : String) = {
    val q = db.run(Announcements.join(Categories).on(_.categoryId === _.id)
      .join(Regions).on(_._1.regionId === _.id)
      .join(Cities).on(_._1._1.cityId === _.id)
      .join(Users).on(_._1._1._1.userId === _.id).filter(_._2.email === email)
      .map(m=>(m._1._1._1._1.id, m._1._1._1._1.title, m._1._1._1._1.description, m._1._1._1._1.contact, m._1._1._1._1.photo, m._1._1._1._1.email, m._1._1._1._2.name, m._1._1._2.name, m._1._2.name, m._1._1._1._1.`type`, m._1._1._1._1.date, m._1._1._1._2.id)).sortBy(s => s._11.desc).result)

     q.map{m=>m}
  }

  case class UserAnParam (action:String, email: String)
  implicit val userAnParam2Reads: Reads[UserAnParam] = (
    (JsPath \ "action").read[String] and
      (JsPath \ "email").read[String]
    )(UserAnParam.apply _)

  def getUserAnnouncements = Action.async(parse.json) {implicit request =>
    request.session.get("id").map { id =>
      val user = db.run(Users.filter(_.sessionId === id).result)

      user.map(
        res=>
          if(res.nonEmpty){
            request.body.validate[UserAnParam].fold(
              errors => {
                BadRequest("Invalid json:" + JsError.toJson(errors))
              },
              success => {
                val email = success.email

                val res = Await.result(dbGetUserAnnouncements(email), Duration(15, SECONDS))
                Ok(Json.obj("count"->res.length,"result"->Json.toJsFieldJsValueWrapper(res)))
              }
            )
          }
          else{
            Unauthorized(Json.obj("error"->"access denied"))
          }
      )
    }.getOrElse {
      Future.successful(Unauthorized(Json.obj("error"->"access denied")))
    }
  }

}

