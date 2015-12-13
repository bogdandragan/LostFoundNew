package controllers

import java.time.Duration
import javax.inject.Inject

import models.Tables._
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.json.{Json, Writes}
import play.api.libs.mailer._
import play.api.mvc._
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Success

class Announcement @Inject()(mailer: MailerClient) extends Controller  with HasDatabaseConfig[JdbcProfile] {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def newAnnouncement = Action {
    Ok(views.html.announcement.newannouncement())
  }

  def newConfirm = Action {
    Ok(views.html.announcement.newconfirm())
  }

  def postAnnouncement = Action.async { implicit request =>
    val json = request.body.asJson.get

    val action = (json \ "action").as[String]

    if(action != "postAd"){
      Future.successful(BadRequest)
    }
    else {
      val params = json \ "params"

      val _type = (params \ "type").as[String]
      val title = (params \ "title").as[String]
      val category = (params \ "category").as[String].toInt
      val contact = (params \ "contact").as[String]
      val description = (params \ "description").as[String]
      val email = (params \ "email").as[String]
      val region = (params \ "region").as[String]
      val city = (params \ "city").as[String]

      var regionId = 0
      var cityId = 0
      //val regionId = db.run(Regions.filter(f=>f.name === region).map{case(c)=>c.id}.result.head)
      getRegionId(region).onComplete {
        case Success(value) => regionId = value
      }
      Thread.sleep(200)
      getCityId(city, regionId).onComplete {
        case Success(value) => cityId = value
      }
      Thread.sleep(200)

      if(_type == "found"){
        val found = new AnnouncementsRow(0,title,"found",category,description,regionId,cityId,contact,email)
        db.run(models.Tables.Announcements += found)
      }
      else{
        val lost = new AnnouncementsRow(0,title,"lost",category,description,regionId,cityId,contact,email)
        db.run(models.Tables.Announcements += lost)
      }

      Future.successful(Ok(Json.obj("error"->"")))
    }
  }

  def getRegionId(name : String) = db.run(Regions.filter(f=>f.name === name).map{case(c)=>c.id}.result.head).map(res => res)
  def getCityId(name : String, regId : Int) = db.run(Cities.filter(f=>f.name === name && f.regionId === regId).map{case(c)=>c.id}.result.head).map(res => res)

  implicit val addressWrites = new Writes[(String, String)] {
    def writes(t: (String,String)) =
      Json.obj("formatted_address" -> Json.toJsFieldJsValueWrapper(t._1+", "+t._2))
  }
  def getAddress = Action.async { implicit request =>
    val param = request.getQueryString("q").getOrElse("")

    val q = db.run(Cities.filter(_.name.like('%'+param.toString+'%')).join(Regions).on(_.regionId === _.id).map{case(c, r) =>(c.name, r.name)}.result)

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
   // Future.successful(Ok(Json.toJson(q)))
  }


  implicit val announcementsWrites = new Writes[(Int, String, String, String, String, String, String, String, String)] {
    def writes(t: (Int, String, String, String, String, String, String, String, String)) =
      Json.obj("id" -> t._1, "title" -> t._2, "description"->t._3, "contact"->t._4, "email"->t._5, "category"->t._6, "region"->t._7, "city"->t._8, "type"->t._9)
  }
  def getLast12 = Action.async{ implicit request =>

    val q = db.run(Announcements.join(Categories).on(_.categoryId === _.id)
      .join(Regions).on(_._1.regionId === _.id)
      .join(Cities).on(_._1._1.cityId === _.id)
      .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.email, m._1._1._2.name, m._1._2.name, m._2.name, m._1._1._1.`type`)).take(12).sortBy(s => s._1.desc).result)

    q.map(
      res => Ok(Json.toJson(res))
    )

  }
}

