
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Thu Jan 21 00:21:22 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:71
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class ReverseAnnouncement(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def newConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/addconfirm")
    }
  
    // @LINE:49
    def getUserAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getUserAnnouncements")
    }
  
    // @LINE:34
    def newAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:50
    def edit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/edit")
    }
  
    // @LINE:40
    def showAd(id:Option[String] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/show" + queryString(List(if(id == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("id", id)))))
    }
  
    // @LINE:45
    def getRegionById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getRegion")
    }
  
    // @LINE:35
    def postAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:41
    def loadAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/show")
    }
  
    // @LINE:39
    def getLast12(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getrecent")
    }
  
    // @LINE:55
    def doFilter(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:48
    def notFound(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/notfound")
    }
  
    // @LINE:38
    def getCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getcategories")
    }
  
    // @LINE:37
    def getAddress(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getaddress")
    }
  
    // @LINE:44
    def getCityById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCity")
    }
  
    // @LINE:51
    def updateAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/edit")
    }
  
    // @LINE:43
    def deleteAnnouncementById(): Call = {
    
      () match {
      
        // @LINE:43
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "announcement/deleteById")
      
      }
    
    }
  
    // @LINE:42
    def loadMoreAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/showMore")
    }
  
    // @LINE:46
    def getCategoryById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCategory")
    }
  
  }

  // @LINE:58
  class ReverseAdministration(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def deleteUserById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/deleteUserById")
    }
  
    // @LINE:64
    def doAdminLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/login")
    }
  
    // @LINE:65
    def doAdminLogout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/logout")
    }
  
    // @LINE:61
    def users(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:58
    def getAdminAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/announcements")
    }
  
    // @LINE:66
    def deleteAnnouncementById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/deleteAnnouncementById")
    }
  
    // @LINE:59
    def getAdminUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:62
    def loginAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management")
    }
  
    // @LINE:63
    def checkAdminRole(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/checkRole")
    }
  
    // @LINE:60
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
  
    // @LINE:54
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

  
    // @LINE:22
    def forgot(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:30
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/updateUser")
    }
  
    // @LINE:31
    def myAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/announcements")
    }
  
    // @LINE:25
    def doNewPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:19
    def checkRegistration(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:27
    def checkMyAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/checkMyAnnouncement")
    }
  
    // @LINE:21
    def doSignin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:24
    def newPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:17
    def doRegister(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:28
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/logout")
    }
  
    // @LINE:20
    def signin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:18
    def regConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:16
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:26
    def checkSession(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/checkSession")
    }
  
    // @LINE:23
    def doForgot(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:29
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