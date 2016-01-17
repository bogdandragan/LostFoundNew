
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Jan 16 22:34:21 EET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:70
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseAnnouncement(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def newConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newConfirm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/addconfirm"})
        }
      """
    )
  
    // @LINE:41
    def newAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newAnnouncement",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:47
    def showAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.showAd",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/show" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("id", id))])})
        }
      """
    )
  
    // @LINE:51
    def getRegionById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getRegionById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getRegion"})
        }
      """
    )
  
    // @LINE:42
    def postAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.postAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:48
    def loadAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.loadAd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/show"})
        }
      """
    )
  
    // @LINE:46
    def getLast12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getLast12",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getrecent"})
        }
      """
    )
  
    // @LINE:57
    def doFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.doFilter",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "results"})
        }
      """
    )
  
    // @LINE:54
    def notFound: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.notFound",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/notfound"})
        }
      """
    )
  
    // @LINE:45
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getcategories"})
        }
      """
    )
  
    // @LINE:44
    def getAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getaddress"})
        }
      """
    )
  
    // @LINE:50
    def getCityById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCityById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getCity"})
        }
      """
    )
  
    // @LINE:53
    def deleteAnnouncementById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.deleteAnnouncementById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/deleteById"})
        }
      """
    )
  
    // @LINE:49
    def loadMoreAd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.loadMoreAd",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/showMore"})
        }
      """
    )
  
    // @LINE:52
    def getCategoryById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCategoryById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getCategory"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseAdministration(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def doAdminLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.doAdminLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/login"})
        }
      """
    )
  
    // @LINE:67
    def doAdminLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.doAdminLogout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/logout"})
        }
      """
    )
  
    // @LINE:63
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "management/users"})
        }
      """
    )
  
    // @LINE:60
    def getAdminAnnouncements: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.getAdminAnnouncements",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/announcements"})
        }
      """
    )
  
    // @LINE:61
    def getAdminUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.getAdminUsers",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/users"})
        }
      """
    )
  
    // @LINE:64
    def loginAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.loginAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "management"})
        }
      """
    )
  
    // @LINE:65
    def checkAdminRole: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Administration.checkAdminRole",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "management/checkRole"})
        }
      """
    )
  
    // @LINE:62
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

  
    // @LINE:11
    def postAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.postAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:8
    def notification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.notification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notification"})
        }
      """
    )
  
    // @LINE:56
    def searchResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.searchResult",
      """
        function(key,regionId,cityId,categoryId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "results" + _qS([(key == null ? null : (""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("key", key)), (regionId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("regionId", regionId)), (cityId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("cityId", cityId)), (categoryId == null ? null : (""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("categoryId", categoryId))])})
        }
      """
    )
  
    // @LINE:12
    def doFilter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.doFilter",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test2"})
        }
      """
    )
  
    // @LINE:7
    def authorize: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.authorize",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authorize"})
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
  
  }

  // @LINE:15
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def forgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.forgot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:37
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/updateUser"})
        }
      """
    )
  
    // @LINE:30
    def doNewPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doNewPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/newpassword"})
        }
      """
    )
  
    // @LINE:21
    def checkRegistration: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkRegistration",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register/confirm"})
        }
      """
    )
  
    // @LINE:36
    def deleteUserById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.deleteUserById",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/deleteUserById"})
        }
      """
    )
  
    // @LINE:24
    def doSignin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doSignin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin"})
        }
      """
    )
  
    // @LINE:29
    def newPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.newPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/newpassword"})
        }
      """
    )
  
    // @LINE:18
    def doRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:33
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/logout"})
        }
      """
    )
  
    // @LINE:23
    def signin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.signin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin"})
        }
      """
    )
  
    // @LINE:20
    def regConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.regConfirm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register/confirm"})
        }
      """
    )
  
    // @LINE:17
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:32
    def checkSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/checkSession"})
        }
      """
    )
  
    // @LINE:27
    def doForgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doForgot",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:35
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.getUserData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getuser"})
        }
      """
    )
  
    // @LINE:15
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