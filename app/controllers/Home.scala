package controllers

import javax.inject.Inject

import akka.japi.Option.java2ScalaOption
import models.Tables._
import org.mindrot.jbcrypt.BCrypt
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.json.Json
import play.api.libs.mailer.{MailerClient, Email}
import play.api.libs.ws.WS
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
import play.api.Play.current

class Home @Inject()(mailer: MailerClient) extends Controller with HasDatabaseConfig[JdbcProfile]{
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def index = Action{
    Ok(views.html.index())
  }

  def about = Action{
    Ok(views.html.about())
  }

  def contact = Action{
    Ok(views.html.contact())
  }

  def searchResult(key: Option[String], regionId: Option[Int], cityId: Option[Int], categoryId: Option[Int]) = Action{
    Ok(views.html.results())
  }

  case class MailParam (email:String, name: String, message: String)
  implicit val mailParam2Reads: Reads[MailParam] = (
    (JsPath \ "email").read[String] and
      (JsPath \ "name").read[String] and
      (JsPath \ "message").read[String]
    )(MailParam.apply _)

  def sendPrivateMessage() = Action.async(parse.json) { implicit request =>
    request.body.validate[MailParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        sendEmailMessage(param.email, param.name, param.message)
        Future.successful(Ok(Json.obj("error"->"")))
      }
    )
  }

  def sendEmailMessage(from: String, name: String, message: String){
    val email = Email(
      "Новое сообщение от пользователя",
      "Бюро находок Украина <info.znahidka@gmail.com>",
      Seq("<"+"bogdan@dragan.com.ua"+">"),
      bodyText = Some("Новое сообщение от пользователя: Email"+from+", Name: "+name+", Message: "+message),
      bodyHtml = Some("<html><body><p>Новое сообщение от пользователя: <b>"+name+"</b> </p> Текст сообщения: "+message+"</p><p>Email: "+from+"</p></body></html>")
    )
    val id = mailer.send(email)
  }

}
