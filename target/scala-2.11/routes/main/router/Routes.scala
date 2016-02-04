
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sun Jan 31 16:44:15 EET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Home_3: javax.inject.Provider[controllers.Home],
  // @LINE:12
  Account_0: javax.inject.Provider[controllers.Account],
  // @LINE:35
  Announcement_1: javax.inject.Provider[controllers.Announcement],
  // @LINE:59
  Administration_2: javax.inject.Provider[controllers.Administration],
  // @LINE:71
  Seo_4: javax.inject.Provider[controllers.Seo],
  // @LINE:75
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Home_3: javax.inject.Provider[controllers.Home],
    // @LINE:12
    Account_0: javax.inject.Provider[controllers.Account],
    // @LINE:35
    Announcement_1: javax.inject.Provider[controllers.Announcement],
    // @LINE:59
    Administration_2: javax.inject.Provider[controllers.Administration],
    // @LINE:71
    Seo_4: javax.inject.Provider[controllers.Seo],
    // @LINE:75
    Assets_5: controllers.Assets
  ) = this(errorHandler, Home_3, Account_0, Announcement_1, Administration_2, Seo_4, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Home_3, Account_0, Announcement_1, Administration_2, Seo_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Home@.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """@controllers.Home@.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """@controllers.Home@.contact"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sendprivatemessage""", """@controllers.Home@.sendPrivateMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account""", """@controllers.Account@.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/register""", """@controllers.Account@.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/register""", """@controllers.Account@.doRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/register/confirm""", """@controllers.Account@.regConfirm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/register/confirm""", """@controllers.Account@.checkRegistration"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin""", """@controllers.Account@.signin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin""", """@controllers.Account@.doSignin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin/forgot""", """@controllers.Account@.forgot"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin/forgot""", """@controllers.Account@.doForgot"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin/newpassword""", """@controllers.Account@.newPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/signin/newpassword""", """@controllers.Account@.doNewPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/checkSession""", """@controllers.Account@.checkSession"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/checkMyAnnouncement""", """@controllers.Account@.checkMyAnnouncement"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/logout""", """@controllers.Account@.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/getuser""", """@controllers.Account@.getUserData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/updateUser""", """@controllers.Account@.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/announcements""", """@controllers.Account@.myAnnouncements()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/sendmessage""", """@controllers.Account@.sendMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/showmessage""", """@controllers.Account@.showMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/messagenotfound""", """@controllers.Account@.messageNotFound()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/getMessage""", """@controllers.Account@.getMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.newAnnouncement"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.postAnnouncement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/addconfirm""", """@controllers.Announcement@.newConfirm(id:Option[String] ?= None)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getaddress""", """@controllers.Announcement@.getAddress"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getcategories""", """@controllers.Announcement@.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getrecent""", """@controllers.Announcement@.getLast12"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/show""", """@controllers.Announcement@.showAd(id:Option[String] ?= None)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/show""", """@controllers.Announcement@.loadAd()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/showMore""", """@controllers.Announcement@.loadMoreAd()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/deleteById""", """@controllers.Announcement@.deleteAnnouncementById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getCity""", """@controllers.Announcement@.getCityById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getRegion""", """@controllers.Announcement@.getRegionById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getCategory""", """@controllers.Announcement@.getCategoryById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/deleteById""", """@controllers.Announcement@.deleteAnnouncementById()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/notfound""", """@controllers.Announcement@.notFound()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getUserAnnouncements""", """@controllers.Announcement@.getUserAnnouncements()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/edit""", """@controllers.Announcement@.edit()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/edit""", """@controllers.Announcement@.updateAnnouncement()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """results""", """@controllers.Home@.searchResult(key:Option[String] ?= None, regionId:Option[Int] ?= None, cityId:Option[Int] ?= None, categoryId:Option[Int] ?= None)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """results""", """@controllers.Announcement@.doFilter()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/announcements""", """@controllers.Administration@.getAdminAnnouncements()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/users""", """@controllers.Administration@.getAdminUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/announcements""", """@controllers.Administration@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/users""", """@controllers.Administration@.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management""", """@controllers.Administration@.loginAdmin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/checkRole""", """@controllers.Administration@.checkAdminRole"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/login""", """@controllers.Administration@.doAdminLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/logout""", """@controllers.Administration@.doAdminLogout()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/deleteAnnouncementById""", """@controllers.Administration@.deleteAnnouncementById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """management/deleteUserById""", """@controllers.Administration@.deleteUserById()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/showseo""", """@controllers.Seo@.showAnSeo(id:Option[String] ?= None)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resultsseo""", """@controllers.Seo@.searchResultSeo(key:Option[String] ?= None, regionId:Option[Int] ?= None, cityId:Option[Int] ?= None, categoryId:Option[Int] ?= None)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Home_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Home_index0_invoker = createInvoker(
    Home_3.get.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Home_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_Home_about1_invoker = createInvoker(
    Home_3.get.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Home_contact2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Home_contact2_invoker = createInvoker(
    Home_3.get.contact,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Home_sendPrivateMessage3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sendprivatemessage")))
  )
  private[this] lazy val controllers_Home_sendPrivateMessage3_invoker = createInvoker(
    Home_3.get.sendPrivateMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "sendPrivateMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """sendprivatemessage"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Account_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_Account_index4_invoker = createInvoker(
    Account_0.get.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "index",
      Nil,
      "GET",
      """Account""",
      this.prefix + """account"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Account_register5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_register5_invoker = createInvoker(
    Account_0.get.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """account/register"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Account_doRegister6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_doRegister6_invoker = createInvoker(
    Account_0.get.doRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doRegister",
      Nil,
      "POST",
      """""",
      this.prefix + """account/register"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Account_regConfirm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_regConfirm7_invoker = createInvoker(
    Account_0.get.regConfirm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "regConfirm",
      Nil,
      "GET",
      """""",
      this.prefix + """account/register/confirm"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Account_checkRegistration8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_checkRegistration8_invoker = createInvoker(
    Account_0.get.checkRegistration,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "checkRegistration",
      Nil,
      "POST",
      """""",
      this.prefix + """account/register/confirm"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Account_signin9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_signin9_invoker = createInvoker(
    Account_0.get.signin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "signin",
      Nil,
      "GET",
      """""",
      this.prefix + """account/signin"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Account_doSignin10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_doSignin10_invoker = createInvoker(
    Account_0.get.doSignin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doSignin",
      Nil,
      "POST",
      """""",
      this.prefix + """account/signin"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Account_forgot11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_forgot11_invoker = createInvoker(
    Account_0.get.forgot,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "forgot",
      Nil,
      "GET",
      """""",
      this.prefix + """account/signin/forgot"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Account_doForgot12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_doForgot12_invoker = createInvoker(
    Account_0.get.doForgot,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doForgot",
      Nil,
      "POST",
      """""",
      this.prefix + """account/signin/forgot"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Account_newPassword13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_newPassword13_invoker = createInvoker(
    Account_0.get.newPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "newPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """account/signin/newpassword"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Account_doNewPassword14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_doNewPassword14_invoker = createInvoker(
    Account_0.get.doNewPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "doNewPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """account/signin/newpassword"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Account_checkSession15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/checkSession")))
  )
  private[this] lazy val controllers_Account_checkSession15_invoker = createInvoker(
    Account_0.get.checkSession,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "checkSession",
      Nil,
      "POST",
      """""",
      this.prefix + """account/checkSession"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Account_checkMyAnnouncement16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/checkMyAnnouncement")))
  )
  private[this] lazy val controllers_Account_checkMyAnnouncement16_invoker = createInvoker(
    Account_0.get.checkMyAnnouncement,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "checkMyAnnouncement",
      Nil,
      "POST",
      """""",
      this.prefix + """account/checkMyAnnouncement"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Account_logout17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/logout")))
  )
  private[this] lazy val controllers_Account_logout17_invoker = createInvoker(
    Account_0.get.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "logout",
      Nil,
      "POST",
      """""",
      this.prefix + """account/logout"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Account_getUserData18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/getuser")))
  )
  private[this] lazy val controllers_Account_getUserData18_invoker = createInvoker(
    Account_0.get.getUserData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "getUserData",
      Nil,
      "GET",
      """""",
      this.prefix + """account/getuser"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Account_updateUser19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/updateUser")))
  )
  private[this] lazy val controllers_Account_updateUser19_invoker = createInvoker(
    Account_0.get.updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """account/updateUser"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Account_myAnnouncements20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/announcements")))
  )
  private[this] lazy val controllers_Account_myAnnouncements20_invoker = createInvoker(
    Account_0.get.myAnnouncements(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "myAnnouncements",
      Nil,
      "GET",
      """""",
      this.prefix + """account/announcements"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Account_sendMessage21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/sendmessage")))
  )
  private[this] lazy val controllers_Account_sendMessage21_invoker = createInvoker(
    Account_0.get.sendMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "sendMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """account/sendmessage"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Account_showMessage22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/showmessage")))
  )
  private[this] lazy val controllers_Account_showMessage22_invoker = createInvoker(
    Account_0.get.showMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "showMessage",
      Nil,
      "GET",
      """""",
      this.prefix + """account/showmessage"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Account_messageNotFound23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/messagenotfound")))
  )
  private[this] lazy val controllers_Account_messageNotFound23_invoker = createInvoker(
    Account_0.get.messageNotFound(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "messageNotFound",
      Nil,
      "GET",
      """""",
      this.prefix + """account/messagenotfound"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Account_getMessage24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/getMessage")))
  )
  private[this] lazy val controllers_Account_getMessage24_invoker = createInvoker(
    Account_0.get.getMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "getMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """account/getMessage"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Announcement_newAnnouncement25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_newAnnouncement25_invoker = createInvoker(
    Announcement_1.get.newAnnouncement,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "newAnnouncement",
      Nil,
      "GET",
      """Announcement""",
      this.prefix + """announcement/new"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Announcement_postAnnouncement26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_postAnnouncement26_invoker = createInvoker(
    Announcement_1.get.postAnnouncement,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "postAnnouncement",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/new"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Announcement_newConfirm27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/addconfirm")))
  )
  private[this] lazy val controllers_Announcement_newConfirm27_invoker = createInvoker(
    Announcement_1.get.newConfirm(fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "newConfirm",
      Seq(classOf[Option[String]]),
      "GET",
      """""",
      this.prefix + """announcement/addconfirm"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Announcement_getAddress28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getaddress")))
  )
  private[this] lazy val controllers_Announcement_getAddress28_invoker = createInvoker(
    Announcement_1.get.getAddress,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getAddress",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/getaddress"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Announcement_getCategories29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getcategories")))
  )
  private[this] lazy val controllers_Announcement_getCategories29_invoker = createInvoker(
    Announcement_1.get.getCategories,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getCategories",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/getcategories"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Announcement_getLast1230_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getrecent")))
  )
  private[this] lazy val controllers_Announcement_getLast1230_invoker = createInvoker(
    Announcement_1.get.getLast12,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getLast12",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/getrecent"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Announcement_showAd31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/show")))
  )
  private[this] lazy val controllers_Announcement_showAd31_invoker = createInvoker(
    Announcement_1.get.showAd(fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "showAd",
      Seq(classOf[Option[String]]),
      "GET",
      """""",
      this.prefix + """announcement/show"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Announcement_loadAd32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/show")))
  )
  private[this] lazy val controllers_Announcement_loadAd32_invoker = createInvoker(
    Announcement_1.get.loadAd(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "loadAd",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/show"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Announcement_loadMoreAd33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/showMore")))
  )
  private[this] lazy val controllers_Announcement_loadMoreAd33_invoker = createInvoker(
    Announcement_1.get.loadMoreAd(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "loadMoreAd",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/showMore"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Announcement_deleteAnnouncementById34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/deleteById")))
  )
  private[this] lazy val controllers_Announcement_deleteAnnouncementById34_invoker = createInvoker(
    Announcement_1.get.deleteAnnouncementById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "deleteAnnouncementById",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/deleteById"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Announcement_getCityById35_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getCity")))
  )
  private[this] lazy val controllers_Announcement_getCityById35_invoker = createInvoker(
    Announcement_1.get.getCityById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getCityById",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/getCity"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Announcement_getRegionById36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getRegion")))
  )
  private[this] lazy val controllers_Announcement_getRegionById36_invoker = createInvoker(
    Announcement_1.get.getRegionById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getRegionById",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/getRegion"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Announcement_getCategoryById37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getCategory")))
  )
  private[this] lazy val controllers_Announcement_getCategoryById37_invoker = createInvoker(
    Announcement_1.get.getCategoryById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getCategoryById",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/getCategory"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Announcement_deleteAnnouncementById38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/deleteById")))
  )
  private[this] lazy val controllers_Announcement_deleteAnnouncementById38_invoker = createInvoker(
    Announcement_1.get.deleteAnnouncementById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "deleteAnnouncementById",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/deleteById"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Announcement_notFound39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/notfound")))
  )
  private[this] lazy val controllers_Announcement_notFound39_invoker = createInvoker(
    Announcement_1.get.notFound(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "notFound",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/notfound"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Announcement_getUserAnnouncements40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getUserAnnouncements")))
  )
  private[this] lazy val controllers_Announcement_getUserAnnouncements40_invoker = createInvoker(
    Announcement_1.get.getUserAnnouncements(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "getUserAnnouncements",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/getUserAnnouncements"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Announcement_edit41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/edit")))
  )
  private[this] lazy val controllers_Announcement_edit41_invoker = createInvoker(
    Announcement_1.get.edit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "edit",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/edit"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Announcement_updateAnnouncement42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/edit")))
  )
  private[this] lazy val controllers_Announcement_updateAnnouncement42_invoker = createInvoker(
    Announcement_1.get.updateAnnouncement(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "updateAnnouncement",
      Nil,
      "POST",
      """""",
      this.prefix + """announcement/edit"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Home_searchResult43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Home_searchResult43_invoker = createInvoker(
    Home_3.get.searchResult(fakeValue[Option[String]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "searchResult",
      Seq(classOf[Option[String]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Int]]),
      "GET",
      """Search""",
      this.prefix + """results"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Announcement_doFilter44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Announcement_doFilter44_invoker = createInvoker(
    Announcement_1.get.doFilter(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "doFilter",
      Nil,
      "POST",
      """""",
      this.prefix + """results"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_Administration_getAdminAnnouncements45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/announcements")))
  )
  private[this] lazy val controllers_Administration_getAdminAnnouncements45_invoker = createInvoker(
    Administration_2.get.getAdminAnnouncements(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "getAdminAnnouncements",
      Nil,
      "POST",
      """Management""",
      this.prefix + """management/announcements"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Administration_getAdminUsers46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/users")))
  )
  private[this] lazy val controllers_Administration_getAdminUsers46_invoker = createInvoker(
    Administration_2.get.getAdminUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "getAdminUsers",
      Nil,
      "POST",
      """""",
      this.prefix + """management/users"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Administration_index47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/announcements")))
  )
  private[this] lazy val controllers_Administration_index47_invoker = createInvoker(
    Administration_2.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """management/announcements"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Administration_users48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/users")))
  )
  private[this] lazy val controllers_Administration_users48_invoker = createInvoker(
    Administration_2.get.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "users",
      Nil,
      "GET",
      """""",
      this.prefix + """management/users"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Administration_loginAdmin49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management")))
  )
  private[this] lazy val controllers_Administration_loginAdmin49_invoker = createInvoker(
    Administration_2.get.loginAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "loginAdmin",
      Nil,
      "GET",
      """""",
      this.prefix + """management"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Administration_checkAdminRole50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/checkRole")))
  )
  private[this] lazy val controllers_Administration_checkAdminRole50_invoker = createInvoker(
    Administration_2.get.checkAdminRole,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "checkAdminRole",
      Nil,
      "POST",
      """""",
      this.prefix + """management/checkRole"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Administration_doAdminLogin51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/login")))
  )
  private[this] lazy val controllers_Administration_doAdminLogin51_invoker = createInvoker(
    Administration_2.get.doAdminLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "doAdminLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """management/login"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Administration_doAdminLogout52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/logout")))
  )
  private[this] lazy val controllers_Administration_doAdminLogout52_invoker = createInvoker(
    Administration_2.get.doAdminLogout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "doAdminLogout",
      Nil,
      "POST",
      """""",
      this.prefix + """management/logout"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Administration_deleteAnnouncementById53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/deleteAnnouncementById")))
  )
  private[this] lazy val controllers_Administration_deleteAnnouncementById53_invoker = createInvoker(
    Administration_2.get.deleteAnnouncementById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "deleteAnnouncementById",
      Nil,
      "POST",
      """""",
      this.prefix + """management/deleteAnnouncementById"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Administration_deleteUserById54_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/deleteUserById")))
  )
  private[this] lazy val controllers_Administration_deleteUserById54_invoker = createInvoker(
    Administration_2.get.deleteUserById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Administration",
      "deleteUserById",
      Nil,
      "POST",
      """""",
      this.prefix + """management/deleteUserById"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Seo_showAnSeo55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/showseo")))
  )
  private[this] lazy val controllers_Seo_showAnSeo55_invoker = createInvoker(
    Seo_4.get.showAnSeo(fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Seo",
      "showAnSeo",
      Seq(classOf[Option[String]]),
      "GET",
      """Seo""",
      this.prefix + """announcement/showseo"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_Seo_searchResultSeo56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resultsseo")))
  )
  private[this] lazy val controllers_Seo_searchResultSeo56_invoker = createInvoker(
    Seo_4.get.searchResultSeo(fakeValue[Option[String]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Seo",
      "searchResultSeo",
      Seq(classOf[Option[String]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """resultsseo"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Assets_at57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at57_invoker = createInvoker(
    Assets_5.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Home_index0_route(params) =>
      call { 
        controllers_Home_index0_invoker.call(Home_3.get.index)
      }
  
    // @LINE:7
    case controllers_Home_about1_route(params) =>
      call { 
        controllers_Home_about1_invoker.call(Home_3.get.about)
      }
  
    // @LINE:8
    case controllers_Home_contact2_route(params) =>
      call { 
        controllers_Home_contact2_invoker.call(Home_3.get.contact)
      }
  
    // @LINE:9
    case controllers_Home_sendPrivateMessage3_route(params) =>
      call { 
        controllers_Home_sendPrivateMessage3_invoker.call(Home_3.get.sendPrivateMessage())
      }
  
    // @LINE:12
    case controllers_Account_index4_route(params) =>
      call { 
        controllers_Account_index4_invoker.call(Account_0.get.index)
      }
  
    // @LINE:13
    case controllers_Account_register5_route(params) =>
      call { 
        controllers_Account_register5_invoker.call(Account_0.get.register)
      }
  
    // @LINE:14
    case controllers_Account_doRegister6_route(params) =>
      call { 
        controllers_Account_doRegister6_invoker.call(Account_0.get.doRegister)
      }
  
    // @LINE:15
    case controllers_Account_regConfirm7_route(params) =>
      call { 
        controllers_Account_regConfirm7_invoker.call(Account_0.get.regConfirm)
      }
  
    // @LINE:16
    case controllers_Account_checkRegistration8_route(params) =>
      call { 
        controllers_Account_checkRegistration8_invoker.call(Account_0.get.checkRegistration)
      }
  
    // @LINE:17
    case controllers_Account_signin9_route(params) =>
      call { 
        controllers_Account_signin9_invoker.call(Account_0.get.signin)
      }
  
    // @LINE:18
    case controllers_Account_doSignin10_route(params) =>
      call { 
        controllers_Account_doSignin10_invoker.call(Account_0.get.doSignin)
      }
  
    // @LINE:19
    case controllers_Account_forgot11_route(params) =>
      call { 
        controllers_Account_forgot11_invoker.call(Account_0.get.forgot)
      }
  
    // @LINE:20
    case controllers_Account_doForgot12_route(params) =>
      call { 
        controllers_Account_doForgot12_invoker.call(Account_0.get.doForgot)
      }
  
    // @LINE:21
    case controllers_Account_newPassword13_route(params) =>
      call { 
        controllers_Account_newPassword13_invoker.call(Account_0.get.newPassword)
      }
  
    // @LINE:22
    case controllers_Account_doNewPassword14_route(params) =>
      call { 
        controllers_Account_doNewPassword14_invoker.call(Account_0.get.doNewPassword)
      }
  
    // @LINE:23
    case controllers_Account_checkSession15_route(params) =>
      call { 
        controllers_Account_checkSession15_invoker.call(Account_0.get.checkSession)
      }
  
    // @LINE:24
    case controllers_Account_checkMyAnnouncement16_route(params) =>
      call { 
        controllers_Account_checkMyAnnouncement16_invoker.call(Account_0.get.checkMyAnnouncement)
      }
  
    // @LINE:25
    case controllers_Account_logout17_route(params) =>
      call { 
        controllers_Account_logout17_invoker.call(Account_0.get.logout)
      }
  
    // @LINE:26
    case controllers_Account_getUserData18_route(params) =>
      call { 
        controllers_Account_getUserData18_invoker.call(Account_0.get.getUserData)
      }
  
    // @LINE:27
    case controllers_Account_updateUser19_route(params) =>
      call { 
        controllers_Account_updateUser19_invoker.call(Account_0.get.updateUser())
      }
  
    // @LINE:28
    case controllers_Account_myAnnouncements20_route(params) =>
      call { 
        controllers_Account_myAnnouncements20_invoker.call(Account_0.get.myAnnouncements())
      }
  
    // @LINE:29
    case controllers_Account_sendMessage21_route(params) =>
      call { 
        controllers_Account_sendMessage21_invoker.call(Account_0.get.sendMessage())
      }
  
    // @LINE:30
    case controllers_Account_showMessage22_route(params) =>
      call { 
        controllers_Account_showMessage22_invoker.call(Account_0.get.showMessage())
      }
  
    // @LINE:31
    case controllers_Account_messageNotFound23_route(params) =>
      call { 
        controllers_Account_messageNotFound23_invoker.call(Account_0.get.messageNotFound())
      }
  
    // @LINE:32
    case controllers_Account_getMessage24_route(params) =>
      call { 
        controllers_Account_getMessage24_invoker.call(Account_0.get.getMessage())
      }
  
    // @LINE:35
    case controllers_Announcement_newAnnouncement25_route(params) =>
      call { 
        controllers_Announcement_newAnnouncement25_invoker.call(Announcement_1.get.newAnnouncement)
      }
  
    // @LINE:36
    case controllers_Announcement_postAnnouncement26_route(params) =>
      call { 
        controllers_Announcement_postAnnouncement26_invoker.call(Announcement_1.get.postAnnouncement)
      }
  
    // @LINE:37
    case controllers_Announcement_newConfirm27_route(params) =>
      call(params.fromQuery[Option[String]]("id", Some(None))) { (id) =>
        controllers_Announcement_newConfirm27_invoker.call(Announcement_1.get.newConfirm(id))
      }
  
    // @LINE:38
    case controllers_Announcement_getAddress28_route(params) =>
      call { 
        controllers_Announcement_getAddress28_invoker.call(Announcement_1.get.getAddress)
      }
  
    // @LINE:39
    case controllers_Announcement_getCategories29_route(params) =>
      call { 
        controllers_Announcement_getCategories29_invoker.call(Announcement_1.get.getCategories)
      }
  
    // @LINE:40
    case controllers_Announcement_getLast1230_route(params) =>
      call { 
        controllers_Announcement_getLast1230_invoker.call(Announcement_1.get.getLast12)
      }
  
    // @LINE:41
    case controllers_Announcement_showAd31_route(params) =>
      call(params.fromQuery[Option[String]]("id", Some(None))) { (id) =>
        controllers_Announcement_showAd31_invoker.call(Announcement_1.get.showAd(id))
      }
  
    // @LINE:42
    case controllers_Announcement_loadAd32_route(params) =>
      call { 
        controllers_Announcement_loadAd32_invoker.call(Announcement_1.get.loadAd())
      }
  
    // @LINE:43
    case controllers_Announcement_loadMoreAd33_route(params) =>
      call { 
        controllers_Announcement_loadMoreAd33_invoker.call(Announcement_1.get.loadMoreAd())
      }
  
    // @LINE:44
    case controllers_Announcement_deleteAnnouncementById34_route(params) =>
      call { 
        controllers_Announcement_deleteAnnouncementById34_invoker.call(Announcement_1.get.deleteAnnouncementById())
      }
  
    // @LINE:45
    case controllers_Announcement_getCityById35_route(params) =>
      call { 
        controllers_Announcement_getCityById35_invoker.call(Announcement_1.get.getCityById())
      }
  
    // @LINE:46
    case controllers_Announcement_getRegionById36_route(params) =>
      call { 
        controllers_Announcement_getRegionById36_invoker.call(Announcement_1.get.getRegionById())
      }
  
    // @LINE:47
    case controllers_Announcement_getCategoryById37_route(params) =>
      call { 
        controllers_Announcement_getCategoryById37_invoker.call(Announcement_1.get.getCategoryById())
      }
  
    // @LINE:48
    case controllers_Announcement_deleteAnnouncementById38_route(params) =>
      call { 
        controllers_Announcement_deleteAnnouncementById38_invoker.call(Announcement_1.get.deleteAnnouncementById())
      }
  
    // @LINE:49
    case controllers_Announcement_notFound39_route(params) =>
      call { 
        controllers_Announcement_notFound39_invoker.call(Announcement_1.get.notFound())
      }
  
    // @LINE:50
    case controllers_Announcement_getUserAnnouncements40_route(params) =>
      call { 
        controllers_Announcement_getUserAnnouncements40_invoker.call(Announcement_1.get.getUserAnnouncements())
      }
  
    // @LINE:51
    case controllers_Announcement_edit41_route(params) =>
      call { 
        controllers_Announcement_edit41_invoker.call(Announcement_1.get.edit())
      }
  
    // @LINE:52
    case controllers_Announcement_updateAnnouncement42_route(params) =>
      call { 
        controllers_Announcement_updateAnnouncement42_invoker.call(Announcement_1.get.updateAnnouncement())
      }
  
    // @LINE:55
    case controllers_Home_searchResult43_route(params) =>
      call(params.fromQuery[Option[String]]("key", Some(None)), params.fromQuery[Option[Int]]("regionId", Some(None)), params.fromQuery[Option[Int]]("cityId", Some(None)), params.fromQuery[Option[Int]]("categoryId", Some(None))) { (key, regionId, cityId, categoryId) =>
        controllers_Home_searchResult43_invoker.call(Home_3.get.searchResult(key, regionId, cityId, categoryId))
      }
  
    // @LINE:56
    case controllers_Announcement_doFilter44_route(params) =>
      call { 
        controllers_Announcement_doFilter44_invoker.call(Announcement_1.get.doFilter())
      }
  
    // @LINE:59
    case controllers_Administration_getAdminAnnouncements45_route(params) =>
      call { 
        controllers_Administration_getAdminAnnouncements45_invoker.call(Administration_2.get.getAdminAnnouncements())
      }
  
    // @LINE:60
    case controllers_Administration_getAdminUsers46_route(params) =>
      call { 
        controllers_Administration_getAdminUsers46_invoker.call(Administration_2.get.getAdminUsers())
      }
  
    // @LINE:61
    case controllers_Administration_index47_route(params) =>
      call { 
        controllers_Administration_index47_invoker.call(Administration_2.get.index())
      }
  
    // @LINE:62
    case controllers_Administration_users48_route(params) =>
      call { 
        controllers_Administration_users48_invoker.call(Administration_2.get.users())
      }
  
    // @LINE:63
    case controllers_Administration_loginAdmin49_route(params) =>
      call { 
        controllers_Administration_loginAdmin49_invoker.call(Administration_2.get.loginAdmin())
      }
  
    // @LINE:64
    case controllers_Administration_checkAdminRole50_route(params) =>
      call { 
        controllers_Administration_checkAdminRole50_invoker.call(Administration_2.get.checkAdminRole)
      }
  
    // @LINE:65
    case controllers_Administration_doAdminLogin51_route(params) =>
      call { 
        controllers_Administration_doAdminLogin51_invoker.call(Administration_2.get.doAdminLogin())
      }
  
    // @LINE:66
    case controllers_Administration_doAdminLogout52_route(params) =>
      call { 
        controllers_Administration_doAdminLogout52_invoker.call(Administration_2.get.doAdminLogout())
      }
  
    // @LINE:67
    case controllers_Administration_deleteAnnouncementById53_route(params) =>
      call { 
        controllers_Administration_deleteAnnouncementById53_invoker.call(Administration_2.get.deleteAnnouncementById())
      }
  
    // @LINE:68
    case controllers_Administration_deleteUserById54_route(params) =>
      call { 
        controllers_Administration_deleteUserById54_invoker.call(Administration_2.get.deleteUserById())
      }
  
    // @LINE:71
    case controllers_Seo_showAnSeo55_route(params) =>
      call(params.fromQuery[Option[String]]("id", Some(None))) { (id) =>
        controllers_Seo_showAnSeo55_invoker.call(Seo_4.get.showAnSeo(id))
      }
  
    // @LINE:72
    case controllers_Seo_searchResultSeo56_route(params) =>
      call(params.fromQuery[Option[String]]("key", Some(None)), params.fromQuery[Option[Int]]("regionId", Some(None)), params.fromQuery[Option[Int]]("cityId", Some(None)), params.fromQuery[Option[Int]]("categoryId", Some(None))) { (key, regionId, cityId, categoryId) =>
        controllers_Seo_searchResultSeo56_invoker.call(Seo_4.get.searchResultSeo(key, regionId, cityId, categoryId))
      }
  
    // @LINE:75
    case controllers_Assets_at57_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at57_invoker.call(Assets_5.at(path, file))
      }
  }
}