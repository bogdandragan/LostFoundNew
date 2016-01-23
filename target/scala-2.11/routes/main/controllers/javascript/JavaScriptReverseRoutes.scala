
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 23 13:48:00 EET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:72
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseAnnouncement(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def newConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newConfirm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/addconfirm"})
        }
      """
    )
  
    // @LINE:50
    def getUserAnnouncements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getUserAnnouncements",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getUserAnnouncements"})
        }
      """
    )
  
    // @LINE:35
    def newAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newAnnouncement",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:51
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.edit",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/edit"})
        }
      """
    )
  
    // @LINE:41
    def showAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.showAd",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/show" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:46
    def getRegionById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getRegionById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getRegion"})
        }
      """
    )
  
    // @LINE:36
    def postAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.postAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:42
    def loadAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.loadAd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/show"})
        }
      """
    )
  
    // @LINE:40
    def getLast12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getLast12",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getrecent"})
        }
      """
    )
  
    // @LINE:56
    def doFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.doFilter",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "results"})
        }
      """
    )
  
    // @LINE:49
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/notfound"})
        }
      """
    )
  
    // @LINE:39
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getcategories"})
        }
      """
    )
  
    // @LINE:38
    def getAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getaddress"})
        }
      """
    )
  
    // @LINE:45
    def getCityById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCityById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getCity"})
        }
      """
    )
  
    // @LINE:52
    def updateAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.updateAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/edit"})
        }
      """
    )
  
    // @LINE:44
    def deleteAnnouncementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.deleteAnnouncementById",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/deleteById"})
          }
        
        }
      """
    )
  
    // @LINE:43
    def loadMoreAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.loadMoreAd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/showMore"})
        }
      """
    )
  
    // @LINE:47
    def getCategoryById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCategoryById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getCategory"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseAdministration(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def deleteUserById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.deleteUserById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/deleteUserById"})
        }
      """
    )
  
    // @LINE:65
    def doAdminLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.doAdminLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/login"})
        }
      """
    )
  
    // @LINE:66
    def doAdminLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.doAdminLogout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/logout"})
        }
      """
    )
  
    // @LINE:62
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "management/users"})
        }
      """
    )
  
    // @LINE:59
    def getAdminAnnouncements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.getAdminAnnouncements",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/announcements"})
        }
      """
    )
  
    // @LINE:67
    def deleteAnnouncementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.deleteAnnouncementById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/deleteAnnouncementById"})
        }
      """
    )
  
    // @LINE:60
    def getAdminUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.getAdminUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/users"})
        }
      """
    )
  
    // @LINE:63
    def loginAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.loginAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "management"})
        }
      """
    )
  
    // @LINE:64
    def checkAdminRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.checkAdminRole",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/checkRole"})
        }
      """
    )
  
    // @LINE:61
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "management/announcements"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def searchResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.searchResult",
      """
        function(key,regionId,cityId,categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "results" + _qS([(key == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("key", key)), (regionId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("regionId", regionId)), (cityId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("cityId", cityId)), (categoryId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("categoryId", categoryId))])})
        }
      """
    )
  
    // @LINE:7
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:9
    def sendPrivateMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.sendPrivateMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sendprivatemessage"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def sendMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.sendMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/sendmessage"})
        }
      """
    )
  
    // @LINE:19
    def forgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.forgot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:27
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/updateUser"})
        }
      """
    )
  
    // @LINE:28
    def myAnnouncements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.myAnnouncements",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/announcements"})
        }
      """
    )
  
    // @LINE:30
    def showMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.showMessage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/showmessage"})
        }
      """
    )
  
    // @LINE:22
    def doNewPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doNewPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/newpassword"})
        }
      """
    )
  
    // @LINE:16
    def checkRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register/confirm"})
        }
      """
    )
  
    // @LINE:24
    def checkMyAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkMyAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/checkMyAnnouncement"})
        }
      """
    )
  
    // @LINE:18
    def doSignin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doSignin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin"})
        }
      """
    )
  
    // @LINE:21
    def newPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.newPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/newpassword"})
        }
      """
    )
  
    // @LINE:14
    def doRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:25
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/logout"})
        }
      """
    )
  
    // @LINE:17
    def signin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.signin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin"})
        }
      """
    )
  
    // @LINE:15
    def regConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.regConfirm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register/confirm"})
        }
      """
    )
  
    // @LINE:13
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:31
    def messageNotFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.messageNotFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/messagenotfound"})
        }
      """
    )
  
    // @LINE:32
    def getMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.getMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getMessage"})
        }
      """
    )
  
    // @LINE:23
    def checkSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/checkSession"})
        }
      """
    )
  
    // @LINE:20
    def doForgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doForgot",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:26
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.getUserData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getuser"})
        }
      """
    )
  
    // @LINE:12
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account"})
        }
      """
    )
  
  }


}