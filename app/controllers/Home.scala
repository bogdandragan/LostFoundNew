package controllers

import akka.japi.Option.java2ScalaOption
import models.Tables._
import org.mindrot.jbcrypt.BCrypt
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.json.Json
import play.api.mvc.{Result, Action, Controller}
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import play.api.libs.json._


import scala.concurrent.duration._
import scala.util.Success

// you need this import to have combinators
import play.api.libs.functional.syntax._
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

class Home extends Controller with HasDatabaseConfig[JdbcProfile]{
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def index = Action{
    Ok(views.html.index())
  }

  def searchResult(key: Option[String], regionId: Option[Int], cityId: Option[Int], categoryId: Option[Int]) = Action{
    Ok(views.html.results())
  }

  implicit val rds = (
    (__ \ "email").read[String] and
      (__ \ "password").read[String]
    ) tupled

  def getAuth(email:String) = {
    val q = db.run(Users.filter(f=>f.sessionId === "5656").map(m=>(m.email, m.password, m.sessionId)).result).map(res => res)
    q.map{
      u=>
        if(u.nonEmpty)
          true
        else
          false
    }
  }

  val futureResult: Future[Result] = {
    Future.successful(Ok("PI value computed"))
  }



  def authorize() = Action.async(parse.json) { request =>

    request.body.validate[(String, String)].map {
      case (email, pass) =>
        val q = db.run(Users.filter(f => f.email === email && f.password === pass).result).map(users => users)

        q.map {
          u =>
            if (u.nonEmpty) {

              val res = Await.result(getAuth(email), Duration(10, SECONDS))

              if(res)
                Ok(Json.obj("status" -> "1"))
              else{
                Ok(Json.obj("status" -> "2"))
              }
            }
            else {
              Ok(Json.obj("status" -> "notfound"))
            }
        }

    }.recoverTotal {
      e => Future.successful(BadRequest("Detected error:" + JsError.toJson(e)))
    }

  }

  case class User (status: String, token: String)
  implicit val place2Reads: Reads[User] = (
    (JsPath \ "status").read[String] and
      (JsPath \ "token").read[String]
    )(User.apply _)

  def notification() = Action.async(parse.json) { request =>
    request.body.validate[User].fold (
      errors => {
        Future.successful(BadRequest("Detected error:" + JsError.toJson(errors)))
      },
      user => {
        val q = db.run(Users.filter(f => f.email === user.status && f.password === user.token).result).map(users => users)

        q.map {
          u =>
            if (u.nonEmpty) {
              val res = Await.result(getAuth(user.status), Duration(10, SECONDS))

              if(res)
                Ok(Json.obj("status" -> "1"))
              else{
                Ok(Json.obj("status" -> "2"))
              }
            }
            else {
              Ok(Json.obj("status" -> "notfound"))
            }
        }
      }
    )
  }

  case class NewAnnouncement (_type: String, title: String, category: String, contact: String, description: String, email: String, region: Int, city: Int, base64: String, filetype: String)
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
      (JsPath \ "filetype").read[String]
    )(NewAnnouncement.apply _)

  def postAnnouncement = Action.async(parse.json) { implicit request =>
    request.body.validate[NewAnnouncement].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      announcement => {
        val photoPath = ""//saveImage(announcement.base64, announcement.filetype)
        if(announcement._type == "found"){
//          val found = new AnnouncementsRow(0,announcement.title,"found",announcement.category.toInt,announcement.description,announcement.region,announcement.city,announcement.contact,announcement.email, photoPath)
 //         db.run(models.Tables.Announcements += found)
          Future.successful(Ok(Json.obj("error"->photoPath)))
        }
        else{
   //       val lost = new AnnouncementsRow(0,announcement.title,"lost",announcement.category.toInt,announcement.description,announcement.region,announcement.city,announcement.contact,announcement.email, photoPath)
     //     db.run(models.Tables.Announcements += lost)
          Future.successful(Ok(Json.obj("error"->photoPath)))
        }
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
        Future.successful(Ok(Json.obj("error"->"")))
      }
    )
  }

}
