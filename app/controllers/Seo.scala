package controllers

import java.sql.Timestamp

import models.Tables._
import play.api.Play
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfig}
import play.api.libs.json.{Writes, Json, JsError}
import play.api.mvc.{Action, Controller}
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global


class Seo extends Controller with HasDatabaseConfig[JdbcProfile]{
  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  implicit val announcementWrites = new Writes[(Int, String, String, String, String, String, String, String, Int, String, Int, String, String, Option[Timestamp], Int)] {
    def writes(t: (Int, String, String, String, String, String, String, String, Int, String, Int, String, String, Option[Timestamp], Int)) =
      Json.obj("id" -> t._1, "title" -> t._2, "description"->t._3, "contact"->t._4, "photo"->t._5, "email"->t._6, "phone"->t._7, "category"->t._8, "regionId"->t._9, "region"->t._10, "cityId"->t._11, "city"->t._12, "type"->t._13, "timestamp"->t._14, "categoryId"->t._15)
  }

  def showAnSeo(id: Option[String]) = Action.async {
    val q = db.run(Announcements.filter(_.id === id.get.toInt).join(Categories).on(_.categoryId === _.id)
      .join(Regions).on(_._1.regionId === _.id)
      .join(Cities).on(_._1._1.cityId === _.id)
      .map(m=>(m._1._1._1.id, m._1._1._1.title, m._1._1._1.description, m._1._1._1.contact, m._1._1._1.photo, m._1._1._1.email, m._1._1._1.phone, m._1._1._2.name, m._1._2.id, m._1._2.name, m._2.id, m._2.name, m._1._1._1.`type`, m._1._1._1.date, m._1._1._2.id)).result.head)

    q.map(
      res =>
        Ok(views.html.announcement.showdetailsseo(res._2, res._2.split(" ").mkString(", "), res._3, res._10, res._12, res._5))
    )

  }

  def searchResultSeo(key: Option[String], regionId: Option[Int], cityId: Option[Int], categoryId: Option[Int]) = Action{
    if(categoryId.get == 1){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Животные"))
    }
    else if(categoryId.get == 2){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Документы"))
    }
    else if(categoryId.get == 3){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Электроника"))
    }
    else if(categoryId.get == 4){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Сумки/Кошельки"))
    }
    else if(categoryId.get == 5){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Люди"))
    }
    else if(categoryId.get == 6){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Транспорт"))
    }
    else if(categoryId.get == 7){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Одежда/Обувь"))
    }
    else if(categoryId.get == 8){
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Другое"))
    }
    else
      Ok(views.html.resultsseo(key.get.split(" ").mkString(", "), key.get, "Все рубрики"))
  }
}
