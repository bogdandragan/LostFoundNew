
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Dec 05 20:51:26 EET 2015

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
  // @LINE:10
  Account_2: javax.inject.Provider[controllers.Account],
  // @LINE:32
  Announcement_1: javax.inject.Provider[controllers.Announcement],
  // @LINE:39
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Home_3: javax.inject.Provider[controllers.Home],
    // @LINE:10
    Account_2: javax.inject.Provider[controllers.Account],
    // @LINE:32
    Announcement_1: javax.inject.Provider[controllers.Announcement],
    // @LINE:39
    Assets_0: controllers.Assets
  ) = this(errorHandler, Home_3, Account_2, Announcement_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Home_3, Account_2, Announcement_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Home@.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authorize""", """@controllers.Home@.authorize()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """notification""", """@controllers.Home@.notification()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.newAnnouncement"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/new""", """@controllers.Announcement@.postAnnouncement"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/addconfirm""", """@controllers.Announcement@.newConfirm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getaddress""", """@controllers.Announcement@.getAddress"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getcategories""", """@controllers.Announcement@.getCategories"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """announcement/getrecent""", """@controllers.Announcement@.getLast12"""),
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

  // @LINE:10
  private[this] lazy val controllers_Account_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account")))
  )
  private[this] lazy val controllers_Account_index3_invoker = createInvoker(
    Account_2.get.index,
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

  // @LINE:12
  private[this] lazy val controllers_Account_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_register4_invoker = createInvoker(
    Account_2.get.register,
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

  // @LINE:13
  private[this] lazy val controllers_Account_doRegister5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register")))
  )
  private[this] lazy val controllers_Account_doRegister5_invoker = createInvoker(
    Account_2.get.doRegister,
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
  private[this] lazy val controllers_Account_regConfirm6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_regConfirm6_invoker = createInvoker(
    Account_2.get.regConfirm,
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
  private[this] lazy val controllers_Account_checkRegistration7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/register/confirm")))
  )
  private[this] lazy val controllers_Account_checkRegistration7_invoker = createInvoker(
    Account_2.get.checkRegistration,
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

  // @LINE:18
  private[this] lazy val controllers_Account_signin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_signin8_invoker = createInvoker(
    Account_2.get.signin,
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

  // @LINE:19
  private[this] lazy val controllers_Account_doSignin9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin")))
  )
  private[this] lazy val controllers_Account_doSignin9_invoker = createInvoker(
    Account_2.get.doSignin,
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

  // @LINE:21
  private[this] lazy val controllers_Account_forgot10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_forgot10_invoker = createInvoker(
    Account_2.get.forgot,
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

  // @LINE:22
  private[this] lazy val controllers_Account_doForgot11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/forgot")))
  )
  private[this] lazy val controllers_Account_doForgot11_invoker = createInvoker(
    Account_2.get.doForgot,
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

  // @LINE:24
  private[this] lazy val controllers_Account_newPassword12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_newPassword12_invoker = createInvoker(
    Account_2.get.newPassword,
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

  // @LINE:25
  private[this] lazy val controllers_Account_doNewPassword13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/signin/newpassword")))
  )
  private[this] lazy val controllers_Account_doNewPassword13_invoker = createInvoker(
    Account_2.get.doNewPassword,
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

  // @LINE:27
  private[this] lazy val controllers_Account_checkSession14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/checkSession")))
  )
  private[this] lazy val controllers_Account_checkSession14_invoker = createInvoker(
    Account_2.get.checkSession,
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

  // @LINE:28
  private[this] lazy val controllers_Account_logout15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/logout")))
  )
  private[this] lazy val controllers_Account_logout15_invoker = createInvoker(
    Account_2.get.logout,
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

  // @LINE:30
  private[this] lazy val controllers_Account_getUserData16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/getuser")))
  )
  private[this] lazy val controllers_Account_getUserData16_invoker = createInvoker(
    Account_2.get.getUserData,
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

  // @LINE:32
  private[this] lazy val controllers_Announcement_newAnnouncement17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_newAnnouncement17_invoker = createInvoker(
    Announcement_1.get.newAnnouncement,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Announcement",
      "newAnnouncement",
      Nil,
      "GET",
      """""",
      this.prefix + """announcement/new"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Announcement_postAnnouncement18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/new")))
  )
  private[this] lazy val controllers_Announcement_postAnnouncement18_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Announcement_newConfirm19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/addconfirm")))
  )
  private[this] lazy val controllers_Announcement_newConfirm19_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_Announcement_getAddress20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getaddress")))
  )
  private[this] lazy val controllers_Announcement_getAddress20_invoker = createInvoker(
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

  // @LINE:36
  private[this] lazy val controllers_Announcement_getCategories21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getcategories")))
  )
  private[this] lazy val controllers_Announcement_getCategories21_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_Announcement_getLast1222_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("announcement/getrecent")))
  )
  private[this] lazy val controllers_Announcement_getLast1222_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_Assets_at23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at23_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
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
  
    // @LINE:10
    case controllers_Account_index3_route(params) =>
      call { 
        controllers_Account_index3_invoker.call(Account_2.get.index)
      }
  
    // @LINE:12
    case controllers_Account_register4_route(params) =>
      call { 
        controllers_Account_register4_invoker.call(Account_2.get.register)
      }
  
    // @LINE:13
    case controllers_Account_doRegister5_route(params) =>
      call { 
        controllers_Account_doRegister5_invoker.call(Account_2.get.doRegister)
      }
  
    // @LINE:15
    case controllers_Account_regConfirm6_route(params) =>
      call { 
        controllers_Account_regConfirm6_invoker.call(Account_2.get.regConfirm)
      }
  
    // @LINE:16
    case controllers_Account_checkRegistration7_route(params) =>
      call { 
        controllers_Account_checkRegistration7_invoker.call(Account_2.get.checkRegistration)
      }
  
    // @LINE:18
    case controllers_Account_signin8_route(params) =>
      call { 
        controllers_Account_signin8_invoker.call(Account_2.get.signin)
      }
  
    // @LINE:19
    case controllers_Account_doSignin9_route(params) =>
      call { 
        controllers_Account_doSignin9_invoker.call(Account_2.get.doSignin)
      }
  
    // @LINE:21
    case controllers_Account_forgot10_route(params) =>
      call { 
        controllers_Account_forgot10_invoker.call(Account_2.get.forgot)
      }
  
    // @LINE:22
    case controllers_Account_doForgot11_route(params) =>
      call { 
        controllers_Account_doForgot11_invoker.call(Account_2.get.doForgot)
      }
  
    // @LINE:24
    case controllers_Account_newPassword12_route(params) =>
      call { 
        controllers_Account_newPassword12_invoker.call(Account_2.get.newPassword)
      }
  
    // @LINE:25
    case controllers_Account_doNewPassword13_route(params) =>
      call { 
        controllers_Account_doNewPassword13_invoker.call(Account_2.get.doNewPassword)
      }
  
    // @LINE:27
    case controllers_Account_checkSession14_route(params) =>
      call { 
        controllers_Account_checkSession14_invoker.call(Account_2.get.checkSession)
      }
  
    // @LINE:28
    case controllers_Account_logout15_route(params) =>
      call { 
        controllers_Account_logout15_invoker.call(Account_2.get.logout)
      }
  
    // @LINE:30
    case controllers_Account_getUserData16_route(params) =>
      call { 
        controllers_Account_getUserData16_invoker.call(Account_2.get.getUserData)
      }
  
    // @LINE:32
    case controllers_Announcement_newAnnouncement17_route(params) =>
      call { 
        controllers_Announcement_newAnnouncement17_invoker.call(Announcement_1.get.newAnnouncement)
      }
  
    // @LINE:33
    case controllers_Announcement_postAnnouncement18_route(params) =>
      call { 
        controllers_Announcement_postAnnouncement18_invoker.call(Announcement_1.get.postAnnouncement)
      }
  
    // @LINE:34
    case controllers_Announcement_newConfirm19_route(params) =>
      call { 
        controllers_Announcement_newConfirm19_invoker.call(Announcement_1.get.newConfirm)
      }
  
    // @LINE:35
    case controllers_Announcement_getAddress20_route(params) =>
      call { 
        controllers_Announcement_getAddress20_invoker.call(Announcement_1.get.getAddress)
      }
  
    // @LINE:36
    case controllers_Announcement_getCategories21_route(params) =>
      call { 
        controllers_Announcement_getCategories21_invoker.call(Announcement_1.get.getCategories)
      }
  
    // @LINE:37
    case controllers_Announcement_getLast1222_route(params) =>
      call { 
        controllers_Announcement_getLast1222_invoker.call(Announcement_1.get.getLast12)
      }
  
    // @LINE:39
    case controllers_Assets_at23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at23_invoker.call(Assets_0.at(path, file))
      }
  }
}