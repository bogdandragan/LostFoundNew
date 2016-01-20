
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
                                        <input id="email" type="email" placeholder="Email-адрес" class="form-control input-lg" ng-model="email" required>
                                    </div>
                                    <div class="form-group">
                                        <input id="password" type="password" placeholder="Пароль" class="form-control input-lg" ng-model="password" required>
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
                  DATE: Mon Jan 18 22:04:58 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/signin.scala.html
                  HASH: 1c5664ad632840d158a60e7be851a2f19107f687
                  MATRIX: 619->2|639->14|678->16|713->25|2862->2146|2891->2147|2937->2165|2997->2197|3026->2198|3075->2219|3216->2333|3231->2339|3275->2362|3349->2408|3378->2409|3431->2434|3479->2454|3508->2455|3565->2484|3744->2636|3773->2637|3826->2662|3858->2666|3887->2667|3944->2696|4027->2751|4056->2752|4105->2773|4134->2774|4184->2796|4213->2797|4266->2822|4333->2861|4362->2862|4409->2881|4438->2882|4484->2900|4540->2928|4569->2929|4618->2950|4658->2963|4673->2969|4711->2986|4785->3032|4814->3033|4867->3058|4945->3108|4974->3109|5032->3139|5061->3140|5114->3165|5181->3204|5210->3205|5257->3224|5286->3225|5322->3234|5351->3235|5440->3296|5469->3297|5511->3311|5566->3338|5595->3339|5640->3356|5682->3370|5711->3371|5766->3398|5795->3399|5872->3447|5902->3448|5932->3449|5990->3480|6005->3486|6045->3505|6125->3557|6154->3558|6203->3579|6251->3599|6280->3600|6333->3625|6418->3682|6447->3683|6496->3704|6528->3708|6557->3709|6609->3733|6809->3905|6838->3906|6909->3949|6938->3950|6989->3973|7018->3974|7064->3992|7093->3993|7143->4015|7172->4016|7221->4037|7285->4073|7314->4074|7357->4089|7386->4090|7425->4101|7454->4102
                  LINES: 25->2|25->2|25->2|26->3|64->41|64->41|66->43|66->43|66->43|67->44|69->46|69->46|69->46|70->47|70->47|71->48|71->48|71->48|72->49|74->51|74->51|75->52|75->52|75->52|76->53|77->54|77->54|78->55|78->55|78->55|78->55|79->56|80->57|80->57|81->58|81->58|83->60|83->60|83->60|84->61|84->61|84->61|84->61|85->62|85->62|86->63|87->64|87->64|87->64|87->64|88->65|89->66|89->66|90->67|90->67|91->68|91->68|92->69|92->69|94->71|94->71|94->71|95->72|95->72|95->72|95->72|95->72|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|98->75|98->75|98->75|99->76|100->77|100->77|101->78|101->78|101->78|102->79|104->81|104->81|104->81|104->81|105->82|105->82|106->83|106->83|106->83|106->83|107->84|108->85|108->85|109->86|109->86|110->87|110->87
                  -- GENERATED --
              */
          