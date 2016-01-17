
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 16 22:34:21 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:70
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:41
  class ReverseAnnouncement(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def newConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/addconfirm")
    }
  
    // @LINE:41
    def newAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:47
    def showAd(id:Option[String] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/show" + queryString(List(if(id == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("id", id)))))
    }
  
    // @LINE:51
    def getRegionById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getRegion")
    }
  
    // @LINE:42
    def postAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:48
    def loadAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/show")
    }
  
    // @LINE:46
    def getLast12(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getrecent")
    }
  
    // @LINE:57
    def doFilter(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:54
    def notFound(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/notfound")
    }
  
    // @LINE:45
    def getCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getcategories")
    }
  
    // @LINE:44
    def getAddress(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getaddress")
    }
  
    // @LINE:50
    def getCityById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCity")
    }
  
    // @LINE:53
    def deleteAnnouncementById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/deleteById")
    }
  
    // @LINE:49
    def loadMoreAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/showMore")
    }
  
    // @LINE:52
    def getCategoryById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCategory")
    }
  
  }

  // @LINE:60
  class ReverseAdministration(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def doAdminLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/login")
    }
  
    // @LINE:67
    def doAdminLogout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/logout")
    }
  
    // @LINE:63
    def users(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:60
    def getAdminAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/announcements")
    }
  
    // @LINE:61
    def getAdminUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:64
    def loginAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management")
    }
  
    // @LINE:65
    def checkAdminRole(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/checkRole")
    }
  
    // @LINE:62
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management/announcements")
    }
  
  }

  // @LINE:6
  class ReverseHome(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def postAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "test")
    }
  
    // @LINE:8
    def notification(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "notification")
    }
  
    // @LINE:56
    def searchResult(key:Option[String] = None, regionId:Option[Int] = None, cityId:Option[Int] = None, categoryId:Option[Int] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "results" + queryString(List(if(key == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("key", key)), if(regionId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("regionId", regionId)), if(cityId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("cityId", cityId)), if(categoryId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("categoryId", categoryId)))))
    }
  
    // @LINE:12
    def doFilter(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "test2")
    }
  
    // @LINE:7
    def authorize(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "authorize")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAccount(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def forgot(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:37
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/updateUser")
    }
  
    // @LINE:30
    def doNewPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:21
    def checkRegistration(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:36
    def deleteUserById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/deleteUserById")
    }
  
    // @LINE:24
    def doSignin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:29
    def newPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:18
    def doRegister(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:33
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/logout")
    }
  
    // @LINE:23
    def signin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:20
    def regConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:17
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:32
    def checkSession(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/checkSession")
    }
  
    // @LINE:27
    def doForgot(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:35
    def getUserData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/getuser")
    }
  
    // @LINE:15
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account")
    }
  
  }


}