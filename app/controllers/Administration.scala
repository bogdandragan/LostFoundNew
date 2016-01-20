package controllers

import java.sql.Timestamp
import java.util.UUID

import models.Tables._
import play.api.Play
import play.api.db.slick._
import play.api.libs.json._
import play.api.mvc.{Result, Action, Controller}
import slick.driver.JdbcProfile
import play.api.libs.functional.syntax._
import slick.driver.MySQLDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

class Administration extends Controller with HasDatabaseConfig[JdbcProfile]{
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def index = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok(views.html.management.announcements())
    }.getOrElse {
      Redirect(routes.Administration.loginAdmin())
    }
  }

  def users = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok(views.html.management.users())
    }.getOrElse {
      Redirect(routes.Administration.loginAdmin())
    }
  }

  def loginAdmin = Action { implicit request =>
      Ok(views.html.management.login())
  }

  def checkAdminRole = Action.async { implicit request =>
    request.session.get("id").map { user =>
      val q = db.run(Admins.filter(_.token === user).result)
      Ok(Json.obj("error"->""))
      q.map(
        res =>
          if(res.nonEmpty){
            Ok(Json.obj("error"->""))
          }
          else{
            Unauthorized(Json.obj("error"->"access denied"))
          }
      )
    }.getOrElse {
      Future.successful(Unauthorized(Json.obj("error"->"access denied")))
    }
  }

  implicit val rds2 = (
    (__ \ "email").read[String] and
      (__ \ "password").read[String]
    ).tupled

  def doAdminLogin() = Action.async(parse.json) { implicit request =>
    request.body.validate[(String, String)].map{
      case (email, pass) =>
        val id = UUID.randomUUID().toString
        val q = db.run(Admins.filter(f=> f.email === email && f.password === pass).map(_.token).update(id))

        q.map{
          res =>
            if(res > 0){
              Ok(Json.obj("error" -> "")).withSession("id" -> id)
            }
            else{
              Ok(Json.obj("error" -> "User not found"))
            }
        }
    }.recoverTotal{
      e => Future.successful(BadRequest("Invalid json:"+ JsError.toJson(e)))
    }
  }

  def doAdminLogout() = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok("Bye").withNewSession
    }.getOrElse {
      Ok("")
    }
  }

  case class GetLastAnn (from: Long, to: Long)
  implicit val an2Reads: Reads[GetLastAnn] = (
    (JsPath \ "from").read[Long] and
      (JsPath \ "to").read[Long]
    )(GetLastAnn.apply _)

  implicit val announcementsWrites = new Writes[(Int, Option[Timestamp], String, String, String, String, String, String, String, String)] {
    def writes(t: (Int, Option[Timestamp], String, String, String, String, String, String, String, String)) =
      Json.obj("id" -> t._1, "timestamp" -> t._2, "title" -> t._3, "description"->t._4, "photo"->t._5, "phone"->t._6, "type"->t._7, "email"->t._8, "region"->t._9, "city"->t._10)
  }

  def dbGetAnnouncements(from : Timestamp, to : Timestamp) = {
      val q = db.run(Announcements.filter(f => f.date.between(from, to))
      .join(Regions).on(_.regionId === _.id)
      .join(Cities).on(_._1.cityId === _.id)
      .map(m=>(m._1._1.id, m._1._1.date, m._1._1.title, m._1._1.description, m._1._1.photo, m._1._1.phone, m._1._1.`type`, m._1._1.email, m._1._2.name, m._2.name)).result)
      q.map{m=>m}
  }

  def dbGetUsers() = {
    val q = db.run(Users.map(m=>(m.id, m.email, m.contact, m.phone, m.newUser)).result)
    q.map{m=>m}
  }

  def getAdminAnnouncements = Action.async(parse.json) {implicit request =>
    request.session.get("id").map { user =>
      val admin = db.run(Admins.filter(_.token === user).result)

      admin.map(
        res=>
          if(res.nonEmpty){
            request.body.validate[GetLastAnn].fold(
              errors => {
                BadRequest("Invalid json:" + JsError.toJson(errors))
              },
              success => {
                val from = new Timestamp(success.from)
                val to = new Timestamp(success.to)

                val res = Await.result(dbGetAnnouncements(from, to), Duration(15, SECONDS))
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

  implicit val usersWrites = new Writes[(Int, String, Option[String], Option[String], Byte)] {
    def writes(t: (Int, String, Option[String], Option[String], Byte)) =
      Json.obj("id" -> t._1, "email" -> t._2, "contact" -> t._3, "phone"->t._4, "isNew"->t._5)
  }

  def getAdminUsers = Action.async {implicit request =>
    request.session.get("id").map { user =>
      val admin = db.run(Admins.filter(_.token === user).result)

      admin.map(
        res=>
          if(res.nonEmpty){
            val res = Await.result(dbGetUsers(), Duration(15, SECONDS))
            Ok(Json.obj("count"->res.length,"result"->Json.toJsFieldJsValueWrapper(res)))
          }
          else{
            Unauthorized(Json.obj("error"->"access denied"))
          }
      )
    }.getOrElse {
      Future.successful(Unauthorized(Json.obj("error"->"access denied")))
    }
  }

  case class AnParam (action:String, id: String)
  implicit val anParam2Reads: Reads[AnParam] = (
    (JsPath \ "action").read[String] and
      (JsPath \ "id").read[String]
    )(AnParam.apply _)

  def deleteAnnouncementById() = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Announcements.filter(_.id === param.id.toInt).delete)

        q.map(
          res =>
            if(res > 0){
              Ok(Json.obj("error"->""))
            }
            else{
              Ok(Json.obj("error"->"empty result"))
            }
        )
      }
    )
  }

  def deleteUserById() = Action.async(parse.json) { implicit request =>
    request.body.validate[AnParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val q = db.run(Users.filter(_.id === param.id.toInt).delete)

        q.map(
          res =>
            if(res > 0){
              Ok(Json.obj("error"->""))
            }
            else{
              Ok(Json.obj("error"->"empty result"))
            }
        )
      }
    )
  }

}
