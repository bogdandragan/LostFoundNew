
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Вход")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
        """),format.raw/*3.9*/("""<section class="main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 login-form">
                        <div class="panel panel-default" ng-controller="loginCtrl">
                            <div class="panel-intro text-center">
                                <h1 class="logo">Вход</h1>
                            </div>
                            <div class="panel-body">
                                <form id="login" ng-submit="doLogin()">
                                    <div class="form-group">
                                        <input type="email" placeholder="Email-адрес" class="form-control input-lg" ng-model="email" required>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" placeholder="Пароль" class="form-control input-lg" ng-model="password" required>
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-block btn-custom">Войти</button>
                                    </div>
                                </form>
                                <div class="alert alert-danger" id="error" style="display: none;">

                                </div>
                            </div>
                            <div class="panel-footer">
                                <p class="text-center pull-right"> <a href="/account/signin/forgot"> Забыли пароль? </a> </p>
                                <div style=" clear:both"></div>
                            </div>
                        </div>
                        <p class="text-center">Еще нет аккаунта? <a href="/account/register"><strong>Регистрация</strong></a></p>
                    </div>
                </div>
            </div>
        </section>

    <script>

          angular.module('lostfoundApp', ['ui.bootstrap'])
          .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*41.69*/("""{"""),format.raw/*41.70*/("""

                """),format.raw/*43.17*/("""$scope.checkSession = function()"""),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
                    """),format.raw/*44.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*46.34*/routes/*46.40*/.Account.checkSession()),format.raw/*46.63*/("""')
                    .success(function(data)"""),format.raw/*47.44*/("""{"""),format.raw/*47.45*/("""
                        """),format.raw/*48.25*/("""if(data.error == "")"""),format.raw/*48.45*/("""{"""),format.raw/*48.46*/("""
                            """),format.raw/*49.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*51.25*/("""}"""),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""else"""),format.raw/*52.29*/("""{"""),format.raw/*52.30*/("""
                            """),format.raw/*53.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*54.25*/("""}"""),format.raw/*54.26*/("""
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""").error(function(data)"""),format.raw/*55.44*/("""{"""),format.raw/*55.45*/("""
                        """),format.raw/*56.25*/("""console.log(data);
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/(""");
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/("""

                """),format.raw/*60.17*/("""$scope.doLogout = function()"""),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""
                    """),format.raw/*61.21*/("""$http.post('"""),_display_(/*61.34*/routes/*61.40*/.Account.logout()),format.raw/*61.57*/("""')
                    .success(function(data)"""),format.raw/*62.44*/("""{"""),format.raw/*62.45*/("""
                        """),format.raw/*63.25*/("""window.location.replace("/");
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""").error(function(data, status)"""),format.raw/*64.52*/("""{"""),format.raw/*64.53*/("""
                        """),format.raw/*65.25*/("""console.log(data);
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/(""");
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""")
          .controller('loginCtrl', function($scope, $http) """),format.raw/*69.60*/("""{"""),format.raw/*69.61*/("""

            """),format.raw/*71.13*/("""$scope.doLogin = function()"""),format.raw/*71.40*/("""{"""),format.raw/*71.41*/("""
                """),format.raw/*72.17*/("""var request = """),format.raw/*72.31*/("""{"""),format.raw/*72.32*/(""""action":"login", "params":"""),format.raw/*72.59*/("""{"""),format.raw/*72.60*/(""""email":$scope.email, "password":$scope.password"""),format.raw/*72.108*/("""}"""),format.raw/*72.109*/("""}"""),format.raw/*72.110*/(""";
                $http.post('"""),_display_(/*73.30*/routes/*73.36*/.Account.doSignin()),format.raw/*73.55*/("""', request)
                 .success(function(data)"""),format.raw/*74.41*/("""{"""),format.raw/*74.42*/("""
                    """),format.raw/*75.21*/("""if(data.error == "")"""),format.raw/*75.41*/("""{"""),format.raw/*75.42*/("""
                        """),format.raw/*76.25*/("""window.location.replace("/account");
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""
                    """),format.raw/*78.21*/("""else"""),format.raw/*78.25*/("""{"""),format.raw/*78.26*/("""
                       """),format.raw/*79.24*/("""$("#error").text("Пользователь не найден");
                       $("#error").addClass('alert-danger').delay(3000).fadeOut("slow");
                       $("#error").css("""),format.raw/*81.40*/("""{"""),format.raw/*81.41*/(""""display": "block", "text-align": "center" """),format.raw/*81.84*/("""}"""),format.raw/*81.85*/(""");
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/("""
                 """),format.raw/*83.18*/("""}"""),format.raw/*83.19*/(""").error(function(data)"""),format.raw/*83.41*/("""{"""),format.raw/*83.42*/("""
                    """),format.raw/*84.21*/("""console.log(data);
                 """),format.raw/*85.18*/("""}"""),format.raw/*85.19*/(""");
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""
          """),format.raw/*87.11*/("""}"""),format.raw/*87.12*/(""")
    </script>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Fri Jan 15 22:40:35 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/signin.scala.html
                  HASH: 008b695c26befa4eb070a4f19f236dfffc955d8b
                  MATRIX: 619->2|639->14|678->16|713->25|2837->2121|2866->2122|2912->2140|2972->2172|3001->2173|3050->2194|3191->2308|3206->2314|3250->2337|3324->2383|3353->2384|3406->2409|3454->2429|3483->2430|3540->2459|3719->2611|3748->2612|3801->2637|3833->2641|3862->2642|3919->2671|4002->2726|4031->2727|4080->2748|4109->2749|4159->2771|4188->2772|4241->2797|4308->2836|4337->2837|4384->2856|4413->2857|4459->2875|4515->2903|4544->2904|4593->2925|4633->2938|4648->2944|4686->2961|4760->3007|4789->3008|4842->3033|4920->3083|4949->3084|5007->3114|5036->3115|5089->3140|5156->3179|5185->3180|5232->3199|5261->3200|5297->3209|5326->3210|5415->3271|5444->3272|5486->3286|5541->3313|5570->3314|5615->3331|5657->3345|5686->3346|5741->3373|5770->3374|5847->3422|5877->3423|5907->3424|5965->3455|5980->3461|6020->3480|6100->3532|6129->3533|6178->3554|6226->3574|6255->3575|6308->3600|6393->3657|6422->3658|6471->3679|6503->3683|6532->3684|6584->3708|6784->3880|6813->3881|6884->3924|6913->3925|6964->3948|6993->3949|7039->3967|7068->3968|7118->3990|7147->3991|7196->4012|7260->4048|7289->4049|7332->4064|7361->4065|7400->4076|7429->4077
                  LINES: 25->2|25->2|25->2|26->3|64->41|64->41|66->43|66->43|66->43|67->44|69->46|69->46|69->46|70->47|70->47|71->48|71->48|71->48|72->49|74->51|74->51|75->52|75->52|75->52|76->53|77->54|77->54|78->55|78->55|78->55|78->55|79->56|80->57|80->57|81->58|81->58|83->60|83->60|83->60|84->61|84->61|84->61|84->61|85->62|85->62|86->63|87->64|87->64|87->64|87->64|88->65|89->66|89->66|90->67|90->67|91->68|91->68|92->69|92->69|94->71|94->71|94->71|95->72|95->72|95->72|95->72|95->72|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|98->75|98->75|98->75|99->76|100->77|100->77|101->78|101->78|101->78|102->79|104->81|104->81|104->81|104->81|105->82|105->82|106->83|106->83|106->83|106->83|107->84|108->85|108->85|109->86|109->86|110->87|110->87
                  -- GENERATED --
              */
          