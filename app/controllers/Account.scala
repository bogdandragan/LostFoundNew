package controllers

import java.security.MessageDigest
import java.sql.Timestamp
import javax.inject.Inject

import models.Tables._
import org.joda.time.{DateTime, DateTimeZone}
import org.mindrot.jbcrypt.BCrypt
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.Codecs
import play.api.libs.json.{JsPath, Reads, JsError, Json}
import play.api.libs.mailer._
import play.api.libs.ws.ssl.certificate2X509Certificate
import play.api.mvc._
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import play.api.libs.functional.syntax._


class Account @Inject()(mailer: MailerClient) extends Controller  with HasDatabaseConfig[JdbcProfile] {
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  def index = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok(views.html.account.account())
    }.getOrElse {
      Redirect(routes.Account.signin())
    }
  }

  def signin = Action { implicit request =>
    request.session.get("id").map { user =>
      Redirect(routes.Account.index())
    }.getOrElse {
      Ok(views.html.account.signin())
    }
  }

  def myAnnouncements = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok(views.html.account.announcements())
    }.getOrElse {
      Ok(views.html.account.signin())
    }
  }

  def register = Action {
    Ok(views.html.account.register())
  }

  def forgot = Action {
    Ok(views.html.account.forgot())
  }

  def newPassword = Action {
    Ok(views.html.account.newpassword())
  }

  def checkSession = Action.async { implicit request =>
    request.session.get("id").map { user =>

      val q = db.run(Users.filter(f => f.sessionId === user).map(m=>(m.email, m.phone, m.contact)).result.headOption)

      q.map(
        res =>
          if(res.nonEmpty)
            Ok(Json.obj("error" -> "", "email" -> Some(res.map(_._1)), "phone" -> Some(res.map(_._2)), "contact" -> Some(res.map(_._3))))
          else
            Ok(Json.obj("error" -> "invalid session")).withNewSession
      )
    }.getOrElse {
      Future.successful(Ok(Json.obj("error" -> "invalid session")).withNewSession)
    }
  }

  case class AcParam (action:String, id: String)
  implicit val anParam2Reads: Reads[AcParam] = (
    (JsPath \ "action").read[String] and
      (JsPath \ "id").read[String]
    )(AcParam.apply _)

  def checkMyAnnouncement = Action.async(parse.json) { implicit request =>
    request.session.get("id").map { id =>
      request.body.validate[AcParam].fold (
        errors => {
          Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
        },
        param => {
          val q = db.run(Users.filter(f => f.sessionId === id).map(m=>m.id).result.headOption)

          q.map(
            res => {
              val getUserId = db.run(Announcements.filter(_.id === param.id.toInt).map(m=>m.userId).result.headOption)
              val userId = Await.result(getUserId, Duration(15, SECONDS))
              if(userId.get == res){
                Ok(Json.obj("error" -> ""))
              }
              else{
                Unauthorized(Json.obj("error" -> "Forbidden")).withNewSession
              }
            }
          )
        }
      )
    }.getOrElse {
      Future.successful(Unauthorized(Json.obj("error" -> "Forbidden")).withNewSession)
    }
  }

  def logout = Action { implicit request =>
    request.session.get("id").map { user =>
      Ok("Bye").withNewSession
    }.getOrElse {
      Ok("")
    }
  }

  def doSignin() = Action.async { implicit request =>
    val json = request.body.asJson.get

    val action = (json \ "action").as[String]

    if (action != "login") {
      Future.successful(BadRequest)
    }
    else {
      val params = json \ "params"
      val email = (params \ "email").as[String]
      val password = (params \ "password").as[String]

      val q = db.run(Users.filter(f => f.email === email && f.newUser === 0.toByte).map{case(c) =>(c.password)}.result.headOption)

      q.map {
        u =>
          if (u.nonEmpty && BCrypt.checkpw(password, u.get)) {
            val sessionId = BCrypt.hashpw(System.currentTimeMillis.toString, BCrypt.gensalt())
            val q = db.run(Users.filter(f=> f.email === email).map(_.sessionId).update(Some(sessionId)))

            Ok(Json.obj("error" -> "")).withSession("id" -> sessionId)
          }
          else {
            Ok(Json.obj("error" -> "User not found"))
          }
      }
    }
  }

  def doRegister() = Action.async { implicit request =>

    val json = request.body.asJson.get

    val action = (json \ "action").as[String]
    if(action != "register"){
      Future.successful(BadRequest)
    }
    else{
      val params = json \ "params"
      val email = (params \ "email").as[String]
      val password = (params \ "password").as[String]

      //check if user exists
      val q = db.run(Users.filter(f => f.email === email).result).map(users => users)

      q.map {
        u =>
          if (u.nonEmpty) {
            Ok(Json.obj("error" -> "Этот email-адрес уже зарегистрирован"))
          }
          else {
            //generate password hash
            val passwordHash : String = BCrypt.hashpw(password, BCrypt.gensalt())
            //insert user
            val user = new UsersRow(0,email,passwordHash,None,1)
            db.run(Users += user)
            //send email
            sendRegConfirmation(email, passwordHash)
            Ok(Json.obj("error" -> ""))
          }
      }
    }
  }


  def regConfirm = Action {
    Ok(views.html.account.regconfirm())
  }

  def checkRegistration = Action.async { implicit request =>
    val json = request.body.asJson.get

    val action = (json \ "action").as[String]

    if(action != "checkReg"){
      Future.successful(BadRequest)
    }
    else{
      val params = json \ "params"
      val email = (params \ "email").as[String]
      val hash = (params \ "hash").as[String]

      val q = db.run(Users.filter(f=> f.email === email && f.password === hash).map(_.newUser).update(0))

      q.map(
        u =>
          if(u > 0){
            val sessionId = BCrypt.hashpw(System.currentTimeMillis.toString, BCrypt.gensalt())
            val q = db.run(Users.filter(f=> f.email === email).map(_.sessionId).update(Some(sessionId)))

            Ok(Json.obj("error" -> "")).withSession("id" -> sessionId)
          }
          else{
            Ok(Json.obj("error" -> "User not found"))
          }
      )
    }
  }

  def doForgot = Action.async{ implicit request =>

    val json = request.body.asJson.get

    val action = (json \ "action").as[String]
    if(action != "forgot"){
      Future.successful(BadRequest)
    }
    else{
      val params = json \ "params"
      val email = (params \ "email").as[String]

      val q = db.run(Users.filter(_.email === email).result).map(users=>users)

      q.map(
        u=>
          if(u.nonEmpty){
            val hash : String = BCrypt.hashpw(email, BCrypt.gensalt())
            db.run(Users.filter(f=> f.email === email).map(_.newPassword).update(Option(hash)))
            sendForgotEmail(email, hash)
            Ok(Json.obj("error" -> ""))
          }
          else{
            Ok(Json.obj("error" -> "Пользователь не найден"))
          }
      )
    }
  }

  def doNewPassword = Action.async{ implicit request =>

    val json = request.body.asJson.get

    val action = (json \ "action").as[String]
    if(action != "newpassword"){
      Future.successful(BadRequest)
    }
    else{
      val params = json \ "params"
      val email = (params \ "email").as[String]
      val hash = (params \ "hash").as[String]
      val newPassword = (params \ "newpassword").as[String]

      val newPasswordHash : String = BCrypt.hashpw(newPassword, BCrypt.gensalt())

      val q = db.run(Users.filter(f=> f.email === email && f.newPassword === hash).map(m=>(m.password,m.newPassword)).update(newPasswordHash,Option("")))

      q.map(
        u =>
          if(u > 0){
            val sessionId = BCrypt.hashpw(System.currentTimeMillis.toString, BCrypt.gensalt())
            val q = db.run(Users.filter(f=> f.email === email).map(_.sessionId).update(Some(sessionId)))

            Ok(Json.obj("error" -> "")).withSession("id" -> sessionId)
          }
          else{
            Ok(Json.obj("error" -> "User not found, password not updated"))
          }
      )
    }
  }

  def getUserData = Action.async{ implicit request =>
    request.session.get("id").map { user =>
      Future.successful(Ok(Json.obj("id" -> request.session.get("id"))))
    }.getOrElse {
      Future.successful(Ok(Json.obj("error" -> "invalid")))
    }

  }

  case class UpdateUserParam (email:String, contact: String, phone: String, password: String)
  implicit val updateUserParam2Reads: Reads[UpdateUserParam] = (
    (JsPath \ "email").read[String] and
      (JsPath \ "contact").read[String] and
      (JsPath \ "phone").read[String] and
      (JsPath \ "password").read[String]
    )(UpdateUserParam.apply _)

  def updateUser() = Action.async(parse.json) { implicit request =>
    request.body.validate[UpdateUserParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        if(param.password == ""){
          val q = db.run(Users.filter(f=> f.email === param.email).map(m=>(m.contact, m.phone)).update(Option(param.contact), Option(param.phone)))
          q.map(
            res =>
              if(res > 0){
                Ok(Json.obj("error"->""))
              }else{
                Ok(Json.obj("error"->"empty result"))
              }
          )
        }
        else{
          val newPasswordHash : String = BCrypt.hashpw(param.password, BCrypt.gensalt())
          val q = db.run(Users.filter(f=> f.email === param.email).map(m=>(m.contact, m.phone, m.password)).update(Option(param.contact), Option(param.phone),newPasswordHash))
          q.map(
            res =>
              if(res > 0){
                Ok(Json.obj("error"->""))
              }else{
                Ok(Json.obj("error"->"empty result"))
              }
          )
        }
      }
    )
  }

  case class SendMessageParam (announcementId: Int, from:String, name_from: String, name_to: String, to: String, message: String)
  implicit val sendMessageParam2Reads: Reads[SendMessageParam] = (
    (JsPath \ "announcementId").read[Int] and
    (JsPath \ "from").read[String] and
      (JsPath \ "name_from").read[String] and
      (JsPath \ "name_to").read[String] and
      (JsPath \ "to").read[String] and
      (JsPath \ "message").read[String]
    )(SendMessageParam.apply _)

  def sendMessage() = Action.async(parse.json) { implicit request =>
    request.body.validate[SendMessageParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
        val tz = DateTimeZone.getDefault
        val dt : DateTime = DateTime.now
        val timestamp : Timestamp = new Timestamp(tz.convertLocalToUTC(dt.getMillis, false))

        val str = timestamp+param.from
        val hash = Codecs.md5(str.getBytes)
        val newMsg = new MessagesRow(0, param.announcementId, param.from, param.to, param.name_from, param.name_to, hash, param.message, Option(timestamp))
        val insertQuery = db.run(Messages += newMsg)

        insertQuery.map(
          res =>
            if(res > 0){
              sendEmailMessage(param.to, param.name_from, hash)
              Ok(Json.obj("error"->""))
            }
            else{
              InternalServerError(Json.obj("error"->"empty result"))
            }
        )
      }
    )
  }

  def getMessage() = Action.async(parse.json) { implicit request =>
    request.body.validate[AcParam].fold (
      errors => {
        Future.successful(BadRequest("Invalid json:" + JsError.toJson(errors)))
      },
      param => {
          val message = db.run(Messages.filter(f=>f.hash === param.id).map(m=>(m.emailTo, m.emailFrom, m.nameTo, m.nameFrom, m.message, m.date, m.announcementId)).result.headOption)

          message.map{
            res=>
              if(!res.isEmpty){
                Ok(Json.obj("emailTo"->res.get._1, "emailFrom"->res.get._2, "nameTo"->res.get._3, "nameFrom"->res.get._4, "message"->res.get._5, "timestamp"->res.get._6.get, "announcementId"->res.get._7))
              }
              else{
                InternalServerError(Json.obj("error"->"empty result"))
              }
          }
      }
    )
  }

  def sendEmailMessage(to: String, name: String, hash: String){
    val email = Email(
      "Новое сообщение",
      "Бюро находок Украина <info.znahidka@gmail.com>",
      Seq("<"+to+">"),
      bodyText = Some("Вы получили новое сообщение от "+name+" на сайте поиска потерянных вещей www.znahidka.pp.ua. Чтоб посмотреть сообщение нажмите на ссылку: "+play.Play.application().configuration().getString("application.baseUrl")+"account/showmessage#"+hash),
      bodyHtml = Some("<html><body><p>Вы получили новое сообщение от <b>"+name+"</b> на сайте поиска потерянных вещей <b>www.znahidka.pp.ua</b>. Чтоб посмотреть сообщение нажмите на "+"<a href="+"'"+play.Play.application().configuration().getString("application.baseUrl")+"account/showmessage#"+hash+"'"+">ссылку</a></p></body></html>")
    )
    val id = mailer.send(email)
  }


  def sendRegConfirmation(sendTo: String, hash: String){
    val email = Email(
      "Подтверждение регистрации",
      "Бюро находок Украина <info.znahidka@gmail.com>",
      Seq("<"+sendTo+">"),
      bodyText = Some("Спасибо за регистрацию! Для подтверждения e-mail адреса пройдите по следуйщей ссылке: "+play.Play.application().configuration().getString("application.baseUrl")+"account/register/confirm?email="+sendTo+"&hash="+hash),
      bodyHtml = Some("<html><body><p>Спасибо за регистрацию! Для подтверждения e-mail адреса пройдите по следуйщей ссылке: "+play.Play.application().configuration().getString("application.baseUrl")+"account/register/confirm?email="+sendTo+"&hash="+hash+"</p></body></html>")
    )
    val id = mailer.send(email)
  }

  def sendForgotEmail(sendTo: String, hash: String){
    val email = Email(
      "Восстановление пароля",
      "Бюро находок Украина <info.znahidka@gmail.com>",
      Seq("<"+sendTo+">"),
      bodyText = Some("Ваша ссылка для установки нового пароля: "+play.Play.application().configuration().getString("application.baseUrl")+"account/signin/newpassword?email="+sendTo+"&hash="+hash),
      bodyHtml = Some("<html><body><p>"+"Ваша ссылка для установки нового пароля: "+play.Play.application().configuration().getString("application.baseUrl")+"account/signin/newpassword?email="+sendTo+"&hash="+hash+"</p></body></html>")
    )
    val id = mailer.send(email)
  }

  def showMessage = Action {
    Ok(views.html.account.showmessage())
  }

  def messageNotFound = Action {
    Ok(views.html.account.messagenotfound())
  }



}