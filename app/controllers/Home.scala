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

}
