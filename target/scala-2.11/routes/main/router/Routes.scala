
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 16 22:34:21 EET 2016

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
  // @LINE:15
  Account_0: javax.inject.Provider[controllers.Account],
  // @LINE:41
  Announcement_1: javax.inject.Provider[controllers.Announcement],
  // @LINE:60
  Administration_2: javax.inject.Provider[controllers.Administration],
  // @LINE:70
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Home_3: javax.inject.Provider[controllers.Home],
    // @LINE:15
    Account_0: javax.inject.Provider[controllers.Account],
    // @LINE:41
    Announcement_1: javax.inject.Provider[controllers.Announcement],
    // @LINE:60
    Administration_2: javax.inject.Provider[controllers.Administration],
    // @LINE:70
    Assets_4: controllers.Assets
  ) = this(errorHandler, Home_3, Account_0, Announcement_1, Administration_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Home_3, Account_0, Announcement_1, Administration_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Home@.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authorize""", """@controllers.Home@.authorize()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notification""", """@controllers.Home@.notification()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """@controllers.Home@.postAnnouncement()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test2""", """@controllers.Home@.doFilter()"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/logout""", """@controllers.Account@.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/getuser""", """@controllers.Account@.getUserData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/deleteUserById""", """@controllers.Account@.deleteUserById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/updateUser""", """@controllers.Account@.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.newAnnouncement"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.postAnnouncement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/addconfirm""", """@controllers.Announcement@.newConfirm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getaddress""", """@controllers.Announcement@.getAddress"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getcategories""", """@controllers.Announcement@.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getrecent""", """@controllers.Announcement@.getLast12"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/show""", """@controllers.Announcement@.showAd(id:Option[String] ?= None)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/show""", """@controllers.Announcement@.loadAd()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/showMore""", """@controllers.Announcement@.loadMoreAd()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getCity""", """@controllers.Announcement@.getCityById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getRegion""", """@controllers.Announcement@.getRegionById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getCategory""", """@controllers.Announcement@.getCategoryById()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/deleteById""", """@controllers.Announcement@.deleteAnnouncementById()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/notfound""", """@controllers.Announcement@.notFound()"""),
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
  private[this] lazy val controllers_Home_authorize1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authorize")))
  )
  private[this] lazy val controllers_Home_authorize1_invoker = createInvoker(
    Home_3.get.authorize(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "authorize",
      Nil,
      "POST",
      """""",
      this.prefix + """authorize"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Home_notification2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("notification")))
  )
  private[this] lazy val controllers_Home_notification2_invoker = createInvoker(
    Home_3.get.notification(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "notification",
      Nil,
      "POST",
      """""",
      this.prefix + """notification"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Home_postAnnouncement3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_Home_postAnnouncement3_invoker = createInvoker(
    Home_3.get.postAnnouncement(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "postAnnouncement",
      Nil,
      "POST",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Home_doFilter4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test2")))
  )
  private[this] lazy val controllers_Home_doFilter4_invoker = createInvoker(
    Home_3.get.doFilter(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Home",
      "doFilter",
      Nil,
      "POST",
      """""",
      this.prefix + """test2"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Account_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_Account_index5_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Account_register6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_register6_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_Account_doRegister7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_doRegister7_invoker = createInvoker(
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

  // @LINE:20
  private[this] lazy val controllers_Account_regConfirm8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_regConfirm8_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_Account_checkRegistration9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_checkRegistration9_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Account_signin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_signin10_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Account_doSignin11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_doSignin11_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Account_forgot12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_forgot12_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Account_doForgot13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_doForgot13_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Account_newPassword14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_newPassword14_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Account_doNewPassword15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_doNewPassword15_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Account_checkSession16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/checkSession")))
  )
  private[this] lazy val controllers_Account_checkSession16_invoker = createInvoker(
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

  // @LINE:33
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

  // @LINE:35
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

  // @LINE:36
  private[this] lazy val controllers_Account_deleteUserById19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/deleteUserById")))
  )
  private[this] lazy val controllers_Account_deleteUserById19_invoker = createInvoker(
    Account_0.get.deleteUserById(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Account",
      "deleteUserById",
      Nil,
      "POST",
      """""",
      this.prefix + """account/deleteUserById"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Account_updateUser20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/updateUser")))
  )
  private[this] lazy val controllers_Account_updateUser20_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_Announcement_newAnnouncement21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_newAnnouncement21_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_Announcement_postAnnouncement22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_postAnnouncement22_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_Announcement_newConfirm23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/addconfirm")))
  )
  private[this] lazy val controllers_Announcement_newConfirm23_invoker = createInvoker(
    Announcement_1.get.newConfirm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "newConfirm",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/addconfirm"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Announcement_getAddress24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getaddress")))
  )
  private[this] lazy val controllers_Announcement_getAddress24_invoker = createInvoker(
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

  // @LINE:45
  private[this] lazy val controllers_Announcement_getCategories25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getcategories")))
  )
  private[this] lazy val controllers_Announcement_getCategories25_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_Announcement_getLast1226_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getrecent")))
  )
  private[this] lazy val controllers_Announcement_getLast1226_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_Announcement_showAd27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/show")))
  )
  private[this] lazy val controllers_Announcement_showAd27_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_Announcement_loadAd28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/show")))
  )
  private[this] lazy val controllers_Announcement_loadAd28_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_Announcement_loadMoreAd29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/showMore")))
  )
  private[this] lazy val controllers_Announcement_loadMoreAd29_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_Announcement_getCityById30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getCity")))
  )
  private[this] lazy val controllers_Announcement_getCityById30_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_Announcement_getRegionById31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getRegion")))
  )
  private[this] lazy val controllers_Announcement_getRegionById31_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_Announcement_getCategoryById32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getCategory")))
  )
  private[this] lazy val controllers_Announcement_getCategoryById32_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_Announcement_deleteAnnouncementById33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/deleteById")))
  )
  private[this] lazy val controllers_Announcement_deleteAnnouncementById33_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_Announcement_notFound34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/notfound")))
  )
  private[this] lazy val controllers_Announcement_notFound34_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_Home_searchResult35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Home_searchResult35_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_Announcement_doFilter36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Announcement_doFilter36_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_Administration_getAdminAnnouncements37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/announcements")))
  )
  private[this] lazy val controllers_Administration_getAdminAnnouncements37_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_Administration_getAdminUsers38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/users")))
  )
  private[this] lazy val controllers_Administration_getAdminUsers38_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_Administration_index39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/announcements")))
  )
  private[this] lazy val controllers_Administration_index39_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_Administration_users40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/users")))
  )
  private[this] lazy val controllers_Administration_users40_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_Administration_loginAdmin41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management")))
  )
  private[this] lazy val controllers_Administration_loginAdmin41_invoker = createInvoker(
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

  // @LINE:65
  private[this] lazy val controllers_Administration_checkAdminRole42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/checkRole")))
  )
  private[this] lazy val controllers_Administration_checkAdminRole42_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_Administration_doAdminLogin43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/login")))
  )
  private[this] lazy val controllers_Administration_doAdminLogin43_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_Administration_doAdminLogout44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("management/logout")))
  )
  private[this] lazy val controllers_Administration_doAdminLogout44_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_Assets_at45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at45_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
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
    case controllers_Home_authorize1_route(params) =>
      call { 
        controllers_Home_authorize1_invoker.call(Home_3.get.authorize())
      }
  
    // @LINE:8
    case controllers_Home_notification2_route(params) =>
      call { 
        controllers_Home_notification2_invoker.call(Home_3.get.notification())
      }
  
    // @LINE:11
    case controllers_Home_postAnnouncement3_route(params) =>
      call { 
        controllers_Home_postAnnouncement3_invoker.call(Home_3.get.postAnnouncement())
      }
  
    // @LINE:12
    case controllers_Home_doFilter4_route(params) =>
      call { 
        controllers_Home_doFilter4_invoker.call(Home_3.get.doFilter())
      }
  
    // @LINE:15
    case controllers_Account_index5_route(params) =>
      call { 
        controllers_Account_index5_invoker.call(Account_0.get.index)
      }
  
    // @LINE:17
    case controllers_Account_register6_route(params) =>
      call { 
        controllers_Account_register6_invoker.call(Account_0.get.register)
      }
  
    // @LINE:18
    case controllers_Account_doRegister7_route(params) =>
      call { 
        controllers_Account_doRegister7_invoker.call(Account_0.get.doRegister)
      }
  
    // @LINE:20
    case controllers_Account_regConfirm8_route(params) =>
      call { 
        controllers_Account_regConfirm8_invoker.call(Account_0.get.regConfirm)
      }
  
    // @LINE:21
    case controllers_Account_checkRegistration9_route(params) =>
      call { 
        controllers_Account_checkRegistration9_invoker.call(Account_0.get.checkRegistration)
      }
  
    // @LINE:23
    case controllers_Account_signin10_route(params) =>
      call { 
        controllers_Account_signin10_invoker.call(Account_0.get.signin)
      }
  
    // @LINE:24
    case controllers_Account_doSignin11_route(params) =>
      call { 
        controllers_Account_doSignin11_invoker.call(Account_0.get.doSignin)
      }
  
    // @LINE:26
    case controllers_Account_forgot12_route(params) =>
      call { 
        controllers_Account_forgot12_invoker.call(Account_0.get.forgot)
      }
  
    // @LINE:27
    case controllers_Account_doForgot13_route(params) =>
      call { 
        controllers_Account_doForgot13_invoker.call(Account_0.get.doForgot)
      }
  
    // @LINE:29
    case controllers_Account_newPassword14_route(params) =>
      call { 
        controllers_Account_newPassword14_invoker.call(Account_0.get.newPassword)
      }
  
    // @LINE:30
    case controllers_Account_doNewPassword15_route(params) =>
      call { 
        controllers_Account_doNewPassword15_invoker.call(Account_0.get.doNewPassword)
      }
  
    // @LINE:32
    case controllers_Account_checkSession16_route(params) =>
      call { 
        controllers_Account_checkSession16_invoker.call(Account_0.get.checkSession)
      }
  
    // @LINE:33
    case controllers_Account_logout17_route(params) =>
      call { 
        controllers_Account_logout17_invoker.call(Account_0.get.logout)
      }
  
    // @LINE:35
    case controllers_Account_getUserData18_route(params) =>
      call { 
        controllers_Account_getUserData18_invoker.call(Account_0.get.getUserData)
      }
  
    // @LINE:36
    case controllers_Account_deleteUserById19_route(params) =>
      call { 
        controllers_Account_deleteUserById19_invoker.call(Account_0.get.deleteUserById())
      }
  
    // @LINE:37
    case controllers_Account_updateUser20_route(params) =>
      call { 
        controllers_Account_updateUser20_invoker.call(Account_0.get.updateUser())
      }
  
    // @LINE:41
    case controllers_Announcement_newAnnouncement21_route(params) =>
      call { 
        controllers_Announcement_newAnnouncement21_invoker.call(Announcement_1.get.newAnnouncement)
      }
  
    // @LINE:42
    case controllers_Announcement_postAnnouncement22_route(params) =>
      call { 
        controllers_Announcement_postAnnouncement22_invoker.call(Announcement_1.get.postAnnouncement)
      }
  
    // @LINE:43
    case controllers_Announcement_newConfirm23_route(params) =>
      call { 
        controllers_Announcement_newConfirm23_invoker.call(Announcement_1.get.newConfirm)
      }
  
    // @LINE:44
    case controllers_Announcement_getAddress24_route(params) =>
      call { 
        controllers_Announcement_getAddress24_invoker.call(Announcement_1.get.getAddress)
      }
  
    // @LINE:45
    case controllers_Announcement_getCategories25_route(params) =>
      call { 
        controllers_Announcement_getCategories25_invoker.call(Announcement_1.get.getCategories)
      }
  
    // @LINE:46
    case controllers_Announcement_getLast1226_route(params) =>
      call { 
        controllers_Announcement_getLast1226_invoker.call(Announcement_1.get.getLast12)
      }
  
    // @LINE:47
    case controllers_Announcement_showAd27_route(params) =>
      call(params.fromQuery[Option[String]]("id", Some(None))) { (id) =>
        controllers_Announcement_showAd27_invoker.call(Announcement_1.get.showAd(id))
      }
  
    // @LINE:48
    case controllers_Announcement_loadAd28_route(params) =>
      call { 
        controllers_Announcement_loadAd28_invoker.call(Announcement_1.get.loadAd())
      }
  
    // @LINE:49
    case controllers_Announcement_loadMoreAd29_route(params) =>
      call { 
        controllers_Announcement_loadMoreAd29_invoker.call(Announcement_1.get.loadMoreAd())
      }
  
    // @LINE:50
    case controllers_Announcement_getCityById30_route(params) =>
      call { 
        controllers_Announcement_getCityById30_invoker.call(Announcement_1.get.getCityById())
      }
  
    // @LINE:51
    case controllers_Announcement_getRegionById31_route(params) =>
      call { 
        controllers_Announcement_getRegionById31_invoker.call(Announcement_1.get.getRegionById())
      }
  
    // @LINE:52
    case controllers_Announcement_getCategoryById32_route(params) =>
      call { 
        controllers_Announcement_getCategoryById32_invoker.call(Announcement_1.get.getCategoryById())
      }
  
    // @LINE:53
    case controllers_Announcement_deleteAnnouncementById33_route(params) =>
      call { 
        controllers_Announcement_deleteAnnouncementById33_invoker.call(Announcement_1.get.deleteAnnouncementById())
      }
  
    // @LINE:54
    case controllers_Announcement_notFound34_route(params) =>
      call { 
        controllers_Announcement_notFound34_invoker.call(Announcement_1.get.notFound())
      }
  
    // @LINE:56
    case controllers_Home_searchResult35_route(params) =>
      call(params.fromQuery[Option[String]]("key", Some(None)), params.fromQuery[Option[Int]]("regionId", Some(None)), params.fromQuery[Option[Int]]("cityId", Some(None)), params.fromQuery[Option[Int]]("categoryId", Some(None))) { (key, regionId, cityId, categoryId) =>
        controllers_Home_searchResult35_invoker.call(Home_3.get.searchResult(key, regionId, cityId, categoryId))
      }
  
    // @LINE:57
    case controllers_Announcement_doFilter36_route(params) =>
      call { 
        controllers_Announcement_doFilter36_invoker.call(Announcement_1.get.doFilter())
      }
  
    // @LINE:60
    case controllers_Administration_getAdminAnnouncements37_route(params) =>
      call { 
        controllers_Administration_getAdminAnnouncements37_invoker.call(Administration_2.get.getAdminAnnouncements())
      }
  
    // @LINE:61
    case controllers_Administration_getAdminUsers38_route(params) =>
      call { 
        controllers_Administration_getAdminUsers38_invoker.call(Administration_2.get.getAdminUsers())
      }
  
    // @LINE:62
    case controllers_Administration_index39_route(params) =>
      call { 
        controllers_Administration_index39_invoker.call(Administration_2.get.index())
      }
  
    // @LINE:63
    case controllers_Administration_users40_route(params) =>
      call { 
        controllers_Administration_users40_invoker.call(Administration_2.get.users())
      }
  
    // @LINE:64
    case controllers_Administration_loginAdmin41_route(params) =>
      call { 
        controllers_Administration_loginAdmin41_invoker.call(Administration_2.get.loginAdmin())
      }
  
    // @LINE:65
    case controllers_Administration_checkAdminRole42_route(params) =>
      call { 
        controllers_Administration_checkAdminRole42_invoker.call(Administration_2.get.checkAdminRole)
      }
  
    // @LINE:66
    case controllers_Administration_doAdminLogin43_route(params) =>
      call { 
        controllers_Administration_doAdminLogin43_invoker.call(Administration_2.get.doAdminLogin())
      }
  
    // @LINE:67
    case controllers_Administration_doAdminLogout44_route(params) =>
      call { 
        controllers_Administration_doAdminLogout44_invoker.call(Administration_2.get.doAdminLogout())
      }
  
    // @LINE:70
    case controllers_Assets_at45_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at45_invoker.call(Assets_4.at(path, file))
      }
  }
}