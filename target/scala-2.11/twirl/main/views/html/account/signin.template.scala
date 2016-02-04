
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


Seq[Any](_display_(/*2.2*/main("Вход - Поиск потерянных вещей. Бюро находок Украина")/*2.61*/ {_display_(Seq[Any](format.raw/*2.63*/("""
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
          .controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*41.81*/("""{"""),format.raw/*41.82*/("""
                """),format.raw/*42.17*/("""$rootScope.title = "Вход - ";
                $scope.checkSession = function()"""),format.raw/*43.49*/("""{"""),format.raw/*43.50*/("""
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
                  DATE: Tue Jan 26 20:24:18 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/signin.scala.html
                  HASH: 3ea4859c6d5e5f875ca22dca3432f31cf5175c9f
                  MATRIX: 619->2|686->61|725->63|760->72|2921->2205|2950->2206|2995->2223|3101->2301|3130->2302|3179->2323|3320->2437|3335->2443|3379->2466|3453->2512|3482->2513|3535->2538|3583->2558|3612->2559|3669->2588|3848->2740|3877->2741|3930->2766|3962->2770|3991->2771|4048->2800|4131->2855|4160->2856|4209->2877|4238->2878|4288->2900|4317->2901|4370->2926|4437->2965|4466->2966|4513->2985|4542->2986|4588->3004|4644->3032|4673->3033|4722->3054|4762->3067|4777->3073|4815->3090|4889->3136|4918->3137|4971->3162|5049->3212|5078->3213|5136->3243|5165->3244|5218->3269|5285->3308|5314->3309|5361->3328|5390->3329|5426->3338|5455->3339|5544->3400|5573->3401|5615->3415|5670->3442|5699->3443|5744->3460|5786->3474|5815->3475|5870->3502|5899->3503|5976->3551|6006->3552|6036->3553|6094->3584|6109->3590|6149->3609|6229->3661|6258->3662|6307->3683|6355->3703|6384->3704|6437->3729|6522->3786|6551->3787|6600->3808|6632->3812|6661->3813|6713->3837|6913->4009|6942->4010|7013->4053|7042->4054|7093->4077|7122->4078|7168->4096|7197->4097|7247->4119|7276->4120|7325->4141|7389->4177|7418->4178|7461->4193|7490->4194|7529->4205|7558->4206
                  LINES: 25->2|25->2|25->2|26->3|64->41|64->41|65->42|66->43|66->43|67->44|69->46|69->46|69->46|70->47|70->47|71->48|71->48|71->48|72->49|74->51|74->51|75->52|75->52|75->52|76->53|77->54|77->54|78->55|78->55|78->55|78->55|79->56|80->57|80->57|81->58|81->58|83->60|83->60|83->60|84->61|84->61|84->61|84->61|85->62|85->62|86->63|87->64|87->64|87->64|87->64|88->65|89->66|89->66|90->67|90->67|91->68|91->68|92->69|92->69|94->71|94->71|94->71|95->72|95->72|95->72|95->72|95->72|95->72|95->72|95->72|96->73|96->73|96->73|97->74|97->74|98->75|98->75|98->75|99->76|100->77|100->77|101->78|101->78|101->78|102->79|104->81|104->81|104->81|104->81|105->82|105->82|106->83|106->83|106->83|106->83|107->84|108->85|108->85|109->86|109->86|110->87|110->87
                  -- GENERATED --
              */
          