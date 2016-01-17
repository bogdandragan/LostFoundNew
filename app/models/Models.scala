package models

import play.api.libs.json.Json

// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.MySQLDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema = Array(Admins.schema, Announcements.schema, Categories.schema, Cities.schema, Regions.schema, Users.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Admins
    *  @param id Database column ID SqlType(INT)
    *  @param email Database column email SqlType(VARCHAR), Length(50,true)
    *  @param password Database column password SqlType(VARCHAR), Length(20,true)
    *  @param token Database column token SqlType(VARCHAR), Length(250,true) */
  case class AdminsRow(id: Int, email: String, password: String, token: String)
  /** GetResult implicit for fetching AdminsRow objects using plain SQL queries */
  implicit def GetResultAdminsRow(implicit e0: GR[Int], e1: GR[String]): GR[AdminsRow] = GR{
    prs => import prs._
      AdminsRow.tupled((<<[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table admins. Objects of this class serve as prototypes for rows in queries. */
  class Admins(_tableTag: Tag) extends Table[AdminsRow](_tableTag, "admins") {
    def * = (id, email, password, token) <> (AdminsRow.tupled, AdminsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(email), Rep.Some(password), Rep.Some(token)).shaped.<>({r=>import r._; _1.map(_=> AdminsRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column ID SqlType(INT) */
    val id: Rep[Int] = column[Int]("ID")
    /** Database column email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[String] = column[String]("email", O.Length(50,varying=true))
    /** Database column password SqlType(VARCHAR), Length(20,true) */
    val password: Rep[String] = column[String]("password", O.Length(20,varying=true))
    /** Database column token SqlType(VARCHAR), Length(250,true) */
    val token: Rep[String] = column[String]("token", O.Length(250,varying=true))
  }
  /** Collection-like TableQuery object for table Admins */
  lazy val Admins = new TableQuery(tag => new Admins(tag))

  /** Entity class storing rows of table Announcements
    *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
    *  @param title Database column title SqlType(VARCHAR), Length(80,true)
    *  @param `type` Database column type SqlType(VARCHAR), Length(10,true)
    *  @param categoryId Database column category_id SqlType(INT)
    *  @param description Database column description SqlType(VARCHAR), Length(1000,true)
    *  @param regionId Database column region_id SqlType(INT)
    *  @param cityId Database column city_id SqlType(INT)
    *  @param contact Database column contact SqlType(VARCHAR), Length(50,true)
    *  @param email Database column email SqlType(VARCHAR), Length(50,true)
    *  @param photo Database column photo SqlType(VARCHAR), Length(250,true)
    *  @param date Database column date SqlType(TIMESTAMP), Default(None)
    *  @param phone Database column phone SqlType(VARCHAR), Length(20,true)
    *  @param userId Database column user_id SqlType(INT), Default(None) */
  case class AnnouncementsRow(id: Int, title: String, `type`: String, categoryId: Int, description: String, regionId: Int, cityId: Int, contact: String, email: String, photo: String, date: Option[java.sql.Timestamp] = None, phone: String, userId: Option[Int] = None)
  /** GetResult implicit for fetching AnnouncementsRow objects using plain SQL queries */
  implicit def GetResultAnnouncementsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[java.sql.Timestamp]], e3: GR[Option[Int]]): GR[AnnouncementsRow] = GR{
    prs => import prs._
      AnnouncementsRow.tupled((<<[Int], <<[String], <<[String], <<[Int], <<[String], <<[Int], <<[Int], <<[String], <<[String], <<[String], <<?[java.sql.Timestamp], <<[String], <<?[Int]))
  }
  /** Table description of table announcements. Objects of this class serve as prototypes for rows in queries.
    *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class Announcements(_tableTag: Tag) extends Table[AnnouncementsRow](_tableTag, "announcements") {
    def * = (id, title, `type`, categoryId, description, regionId, cityId, contact, email, photo, date, phone, userId) <> (AnnouncementsRow.tupled, AnnouncementsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(title), Rep.Some(`type`), Rep.Some(categoryId), Rep.Some(description), Rep.Some(regionId), Rep.Some(cityId), Rep.Some(contact), Rep.Some(email), Rep.Some(photo), date, Rep.Some(phone), userId).shaped.<>({r=>import r._; _1.map(_=> AnnouncementsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11, _12.get, _13)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title SqlType(VARCHAR), Length(80,true) */
    val title: Rep[String] = column[String]("title", O.Length(80,varying=true))
    /** Database column type SqlType(VARCHAR), Length(10,true)
      *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(10,varying=true))
    /** Database column category_id SqlType(INT) */
    val categoryId: Rep[Int] = column[Int]("category_id")
    /** Database column description SqlType(VARCHAR), Length(1000,true) */
    val description: Rep[String] = column[String]("description", O.Length(1000,varying=true))
    /** Database column region_id SqlType(INT) */
    val regionId: Rep[Int] = column[Int]("region_id")
    /** Database column city_id SqlType(INT) */
    val cityId: Rep[Int] = column[Int]("city_id")
    /** Database column contact SqlType(VARCHAR), Length(50,true) */
    val contact: Rep[String] = column[String]("contact", O.Length(50,varying=true))
    /** Database column email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[String] = column[String]("email", O.Length(50,varying=true))
    /** Database column photo SqlType(VARCHAR), Length(250,true) */
    val photo: Rep[String] = column[String]("photo", O.Length(250,varying=true))
    /** Database column date SqlType(TIMESTAMP), Default(None) */
    val date: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("date", O.Default(None))
    /** Database column phone SqlType(VARCHAR), Length(20,true) */
    val phone: Rep[String] = column[String]("phone", O.Length(20,varying=true))
    /** Database column user_id SqlType(INT), Default(None) */
    val userId: Rep[Option[Int]] = column[Option[Int]]("user_id", O.Default(None))
  }
  /** Collection-like TableQuery object for table Announcements */
  lazy val Announcements = new TableQuery(tag => new Announcements(tag))

  /** Entity class storing rows of table Categories
    *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
    *  @param name Database column name SqlType(VARCHAR), Length(100,true) */
  case class CategoriesRow(id: Int, name: String)
  /** GetResult implicit for fetching CategoriesRow objects using plain SQL queries */
  implicit def GetResultCategoriesRow(implicit e0: GR[Int], e1: GR[String]): GR[CategoriesRow] = GR{
    prs => import prs._
      CategoriesRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table categories. Objects of this class serve as prototypes for rows in queries. */
  class Categories(_tableTag: Tag) extends Table[CategoriesRow](_tableTag, "categories") {
    def * = (id, name) <> (CategoriesRow.tupled, CategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> CategoriesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
  }
  /** Collection-like TableQuery object for table Categories */
  lazy val Categories = new TableQuery(tag => new Categories(tag))

  /** Entity class storing rows of table Cities
    *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
    *  @param regionId Database column region_id SqlType(INT)
    *  @param name Database column name SqlType(VARCHAR), Length(50,true)
    *  @param phoneCode Database column phone_code SqlType(VARCHAR), Length(7,true), Default(None) */
  case class CitiesRow(id: Int, regionId: Int, name: String, phoneCode: Option[String] = None)
  /** GetResult implicit for fetching CitiesRow objects using plain SQL queries */
  implicit def GetResultCitiesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]]): GR[CitiesRow] = GR{
    prs => import prs._
      CitiesRow.tupled((<<[Int], <<[Int], <<[String], <<?[String]))
  }
  /** Table description of table cities. Objects of this class serve as prototypes for rows in queries. */
  class Cities(_tableTag: Tag) extends Table[CitiesRow](_tableTag, "cities") {
    def * = (id, regionId, name, phoneCode) <> (CitiesRow.tupled, CitiesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(regionId), Rep.Some(name), phoneCode).shaped.<>({r=>import r._; _1.map(_=> CitiesRow.tupled((_1.get, _2.get, _3.get, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column region_id SqlType(INT) */
    val regionId: Rep[Int] = column[Int]("region_id")
    /** Database column name SqlType(VARCHAR), Length(50,true) */
    val name: Rep[String] = column[String]("name", O.Length(50,varying=true))
    /** Database column phone_code SqlType(VARCHAR), Length(7,true), Default(None) */
    val phoneCode: Rep[Option[String]] = column[Option[String]]("phone_code", O.Length(7,varying=true), O.Default(None))

    /** Index over (name) (database name name) */
    val index1 = index("name", name)
  }
  /** Collection-like TableQuery object for table Cities */
  lazy val Cities = new TableQuery(tag => new Cities(tag))

  /** Entity class storing rows of table Regions
    *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
    *  @param name Database column name SqlType(VARCHAR), Length(50,true) */
  case class RegionsRow(id: Int, name: String)
  /** GetResult implicit for fetching RegionsRow objects using plain SQL queries */
  implicit def GetResultRegionsRow(implicit e0: GR[Int], e1: GR[String]): GR[RegionsRow] = GR{
    prs => import prs._
      RegionsRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table regions. Objects of this class serve as prototypes for rows in queries. */
  class Regions(_tableTag: Tag) extends Table[RegionsRow](_tableTag, "regions") {
    def * = (id, name) <> (RegionsRow.tupled, RegionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> RegionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(50,true) */
    val name: Rep[String] = column[String]("name", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table Regions */
  lazy val Regions = new TableQuery(tag => new Regions(tag))

  /** Entity class storing rows of table Users
    *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
    *  @param email Database column email SqlType(VARCHAR), Length(50,true)
    *  @param password Database column password SqlType(VARCHAR), Length(255,true)
    *  @param sessionId Database column session_id SqlType(VARCHAR), Length(255,true), Default(None)
    *  @param newUser Database column new_user SqlType(TINYINT)
    *  @param newPassword Database column new_password SqlType(VARCHAR), Length(255,true), Default(None)
    *  @param phone Database column phone SqlType(VARCHAR), Length(20,true), Default(None)
    *  @param contact Database column contact SqlType(VARCHAR), Length(50,true), Default(None) */
  case class UsersRow(id: Int, email: String, password: String, sessionId: Option[String] = None, newUser: Byte, newPassword: Option[String] = None, phone: Option[String] = None, contact: Option[String] = None)
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Byte]): GR[UsersRow] = GR{
    prs => import prs._
      UsersRow.tupled((<<[Int], <<[String], <<[String], <<?[String], <<[Byte], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends Table[UsersRow](_tableTag, "users") {
    def * = (id, email, password, sessionId, newUser, newPassword, phone, contact) <> (UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(email), Rep.Some(password), sessionId, Rep.Some(newUser), newPassword, phone, contact).shaped.<>({r=>import r._; _1.map(_=> UsersRow.tupled((_1.get, _2.get, _3.get, _4, _5.get, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column email SqlType(VARCHAR), Length(50,true) */
    val email: Rep[String] = column[String]("email", O.Length(50,varying=true))
    /** Database column password SqlType(VARCHAR), Length(255,true) */
    val password: Rep[String] = column[String]("password", O.Length(255,varying=true))
    /** Database column session_id SqlType(VARCHAR), Length(255,true), Default(None) */
    val sessionId: Rep[Option[String]] = column[Option[String]]("session_id", O.Length(255,varying=true), O.Default(None))
    /** Database column new_user SqlType(TINYINT) */
    val newUser: Rep[Byte] = column[Byte]("new_user")
    /** Database column new_password SqlType(VARCHAR), Length(255,true), Default(None) */
    val newPassword: Rep[Option[String]] = column[Option[String]]("new_password", O.Length(255,varying=true), O.Default(None))
    /** Database column phone SqlType(VARCHAR), Length(20,true), Default(None) */
    val phone: Rep[Option[String]] = column[Option[String]]("phone", O.Length(20,varying=true), O.Default(None))
    /** Database column contact SqlType(VARCHAR), Length(50,true), Default(None) */
    val contact: Rep[Option[String]] = column[Option[String]]("contact", O.Length(50,varying=true), O.Default(None))
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
}
