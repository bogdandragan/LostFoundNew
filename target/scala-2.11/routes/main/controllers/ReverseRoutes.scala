
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 23 13:48:00 EET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:72
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:35
  class ReverseAnnouncement(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def newConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/addconfirm")
    }
  
    // @LINE:50
    def getUserAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getUserAnnouncements")
    }
  
    // @LINE:35
    def newAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:51
    def edit(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/edit")
    }
  
    // @LINE:41
    def showAd(id:Option[String] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/show" + queryString(List(if(id == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("id", id)))))
    }
  
    // @LINE:46
    def getRegionById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getRegion")
    }
  
    // @LINE:36
    def postAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/new")
    }
  
    // @LINE:42
    def loadAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/show")
    }
  
    // @LINE:40
    def getLast12(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getrecent")
    }
  
    // @LINE:56
    def doFilter(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:49
    def notFound(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/notfound")
    }
  
    // @LINE:39
    def getCategories(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getcategories")
    }
  
    // @LINE:38
    def getAddress(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "announcement/getaddress")
    }
  
    // @LINE:45
    def getCityById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCity")
    }
  
    // @LINE:52
    def updateAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/edit")
    }
  
    // @LINE:44
    def deleteAnnouncementById(): Call = {
    
      () match {
      
        // @LINE:44
        case ()  =>
          import ReverseRouteContext.empty
          Call("POST", _prefix + { _defaultPrefix } + "announcement/deleteById")
      
      }
    
    }
  
    // @LINE:43
    def loadMoreAd(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/showMore")
    }
  
    // @LINE:47
    def getCategoryById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "announcement/getCategory")
    }
  
  }

  // @LINE:59
  class ReverseAdministration(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def deleteUserById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/deleteUserById")
    }
  
    // @LINE:65
    def doAdminLogin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/login")
    }
  
    // @LINE:66
    def doAdminLogout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/logout")
    }
  
    // @LINE:62
    def users(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:59
    def getAdminAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/announcements")
    }
  
    // @LINE:67
    def deleteAnnouncementById(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/deleteAnnouncementById")
    }
  
    // @LINE:60
    def getAdminUsers(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/users")
    }
  
    // @LINE:63
    def loginAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "management")
    }
  
    // @LINE:64
    def checkAdminRole(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "management/checkRole")
    }
  
    // @LINE:61
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

  
    // @LINE:55
    def searchResult(key:Option[String] = None, regionId:Option[Int] = None, cityId:Option[Int] = None, categoryId:Option[Int] = None): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "results" + queryString(List(if(key == None) None else Some(implicitly[QueryStringBindable[Option[String]]].unbind("key", key)), if(regionId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("regionId", regionId)), if(cityId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("cityId", cityId)), if(categoryId == None) None else Some(implicitly[QueryStringBindable[Option[Int]]].unbind("categoryId", categoryId)))))
    }
  
    // @LINE:7
    def about(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:9
    def sendPrivateMessage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "sendprivatemessage")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def contact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
  }

  // @LINE:12
  class ReverseAccount(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def sendMessage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/sendmessage")
    }
  
    // @LINE:19
    def forgot(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:27
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/updateUser")
    }
  
    // @LINE:28
    def myAnnouncements(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/announcements")
    }
  
    // @LINE:30
    def showMessage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/showmessage")
    }
  
    // @LINE:22
    def doNewPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:16
    def checkRegistration(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:24
    def checkMyAnnouncement(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/checkMyAnnouncement")
    }
  
    // @LINE:18
    def doSignin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:21
    def newPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin/newpassword")
    }
  
    // @LINE:14
    def doRegister(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:25
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/logout")
    }
  
    // @LINE:17
    def signin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/signin")
    }
  
    // @LINE:15
    def regConfirm(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register/confirm")
    }
  
    // @LINE:13
    def register(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/register")
    }
  
    // @LINE:31
    def messageNotFound(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/messagenotfound")
    }
  
    // @LINE:32
    def getMessage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/getMessage")
    }
  
    // @LINE:23
    def checkSession(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/checkSession")
    }
  
    // @LINE:20
    def doForgot(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "account/signin/forgot")
    }
  
    // @LINE:26
    def getUserData(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account/getuser")
    }
  
    // @LINE:12
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "account")
    }
  
  }


}