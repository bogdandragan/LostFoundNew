
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/bogdan/IdeaProjects/LostFoundNew/conf/routes
// @DATE:Sat Dec 05 20:51:26 EET 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:32
  class ReverseAnnouncement(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def newConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newConfirm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/addconfirm"})
        }
      """
    )
  
    // @LINE:32
    def newAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.newAnnouncement",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:33
    def postAnnouncement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.postAnnouncement",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/new"})
        }
      """
    )
  
    // @LINE:37
    def getLast12: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getLast12",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getrecent"})
        }
      """
    )
  
    // @LINE:36
    def getCategories: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getCategories",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getcategories"})
        }
      """
    )
  
    // @LINE:35
    def getAddress: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Announcement.getAddress",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "announcement/getaddress"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHome(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
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
    def notification: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Home.notification",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "notification"})
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
  
  }

  // @LINE:39
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAccount(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def forgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.forgot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:25
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
  
    // @LINE:19
    def doSignin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doSignin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin"})
        }
      """
    )
  
    // @LINE:24
    def newPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.newPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/newpassword"})
        }
      """
    )
  
    // @LINE:13
    def doRegister: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doRegister",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:28
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/logout"})
        }
      """
    )
  
    // @LINE:18
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
  
    // @LINE:12
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/register"})
        }
      """
    )
  
    // @LINE:27
    def checkSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.checkSession",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/checkSession"})
        }
      """
    )
  
    // @LINE:22
    def doForgot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.doForgot",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "account/signin/forgot"})
        }
      """
    )
  
    // @LINE:30
    def getUserData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Account.getUserData",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/getuser"})
        }
      """
    )
  
    // @LINE:10
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