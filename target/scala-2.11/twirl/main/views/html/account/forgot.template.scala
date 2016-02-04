
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forgot_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Восстановление пароля - Поиск потерянных вещей. Бюро находок Украина")/*1.78*/ {_display_(Seq[Any](format.raw/*1.80*/("""
        """),format.raw/*2.9*/("""<section class="main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 login-form">
                        <div class="panel panel-default" ng-controller="forgotCtrl">
                            <div class="panel-intro text-center">
                                <h1 class="logo">Восстановление пароля</h1>
                            </div>
                            <div class="panel-body">
                                <form ng-submit="doForgot()">
                                    <div class="form-group">
                                        <input id="email" type="email" placeholder="Email-адрес" ng-model="email" class="form-control input-lg" required>
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-block btn-custom" id="submitbutton"><i class="fa fa-spinner fa-spin" ng-show="loading"></i>Отправить</button>
                                    </div>
                                </form>
                                <div class="alert alert-danger" id="error" style="display: none;">

                                </div>
                            </div>
                        </div>
                        <p class="text-center">Еще нет аккаунта? <a href="/account/register"><strong>Регистрация</strong></a></p>
                    </div>
                </div>
            </div>
        </section>

    <script>
		angular.module('lostfoundApp', ['ui.bootstrap'])
		.controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*32.73*/("""{"""),format.raw/*32.74*/("""
                """),format.raw/*33.17*/("""$rootScope.title = "Восстановление пароля - ";
                $scope.checkSession = function()"""),format.raw/*34.49*/("""{"""),format.raw/*34.50*/("""
                    """),format.raw/*35.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*37.34*/routes/*37.40*/.Account.checkSession()),format.raw/*37.63*/("""')
                    .success(function(data)"""),format.raw/*38.44*/("""{"""),format.raw/*38.45*/("""
                        """),format.raw/*39.25*/("""if(data.error == "")"""),format.raw/*39.45*/("""{"""),format.raw/*39.46*/("""
                            """),format.raw/*40.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*42.25*/("""}"""),format.raw/*42.26*/("""
                        """),format.raw/*43.25*/("""else"""),format.raw/*43.29*/("""{"""),format.raw/*43.30*/("""
                            """),format.raw/*44.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*45.25*/("""}"""),format.raw/*45.26*/("""
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/(""").error(function(data)"""),format.raw/*46.44*/("""{"""),format.raw/*46.45*/("""
                        """),format.raw/*47.25*/("""console.log(data);
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/(""");
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""

                """),format.raw/*51.17*/("""$scope.doLogout = function()"""),format.raw/*51.45*/("""{"""),format.raw/*51.46*/("""
                    """),format.raw/*52.21*/("""$http.post('"""),_display_(/*52.34*/routes/*52.40*/.Account.logout()),format.raw/*52.57*/("""')
                    .success(function(data)"""),format.raw/*53.44*/("""{"""),format.raw/*53.45*/("""
                        """),format.raw/*54.25*/("""window.location.replace("/");
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""").error(function(data, status)"""),format.raw/*55.52*/("""{"""),format.raw/*55.53*/("""
                        """),format.raw/*56.25*/("""console.log(data);
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/(""");
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/("""
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""")
		.controller('forgotCtrl', function($scope, $http) """),format.raw/*60.53*/("""{"""),format.raw/*60.54*/("""
            """),format.raw/*61.13*/("""$scope.loading = false;
		    $scope.doForgot = function()"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
		        """),format.raw/*63.11*/("""var request = """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/(""""action":"forgot", "params":"""),format.raw/*63.54*/("""{"""),format.raw/*63.55*/(""""email":$scope.email"""),format.raw/*63.75*/("""}"""),format.raw/*63.76*/("""}"""),format.raw/*63.77*/(""";
                $scope.loading = true;
                $http.post('"""),_display_(/*65.30*/routes/*65.36*/.Account.doForgot()),format.raw/*65.55*/("""', request)
                 .success(function(data)"""),format.raw/*66.41*/("""{"""),format.raw/*66.42*/("""
                    """),format.raw/*67.21*/("""if(data.error == "")"""),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
                       """),format.raw/*68.24*/("""$scope.loading = false;
                        $("#error").text("Проверьте Ваш е-mail");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                       $("#error").css("display","block");
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""else"""),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
                       """),format.raw/*74.24*/("""$scope.loading = false;
                       $("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                 """),format.raw/*79.18*/("""}"""),format.raw/*79.19*/(""").error(function(data)"""),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
                    """),format.raw/*80.21*/("""$scope.loading = false;
                       $("#error").text("Не удалось отправить e-mail");
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    console.log(data);
                 """),format.raw/*85.18*/("""}"""),format.raw/*85.19*/(""");
		    """),format.raw/*86.7*/("""}"""),format.raw/*86.8*/("""
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/(""")
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
object forgot extends forgot_Scope0.forgot
              /*
                  -- GENERATED --
                  DATE: Tue Jan 26 20:34:30 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/forgot.scala.html
                  HASH: 99328ac42c5af602cf64b5decdaa457536973955
                  MATRIX: 619->1|703->77|742->79|777->88|2464->1747|2493->1748|2538->1765|2661->1860|2690->1861|2739->1882|2880->1996|2895->2002|2939->2025|3013->2071|3042->2072|3095->2097|3143->2117|3172->2118|3229->2147|3408->2299|3437->2300|3490->2325|3522->2329|3551->2330|3608->2359|3691->2414|3720->2415|3769->2436|3798->2437|3848->2459|3877->2460|3930->2485|3997->2524|4026->2525|4073->2544|4102->2545|4148->2563|4204->2591|4233->2592|4282->2613|4322->2626|4337->2632|4375->2649|4449->2695|4478->2696|4531->2721|4609->2771|4638->2772|4696->2802|4725->2803|4778->2828|4845->2867|4874->2868|4921->2887|4950->2888|4986->2897|5015->2898|5097->2952|5126->2953|5167->2966|5253->3024|5282->3025|5321->3036|5363->3050|5392->3051|5448->3079|5477->3080|5525->3100|5554->3101|5583->3102|5680->3172|5695->3178|5735->3197|5815->3249|5844->3250|5893->3271|5941->3291|5970->3292|6022->3316|6337->3603|6366->3604|6415->3625|6447->3629|6476->3630|6528->3654|6820->3918|6849->3919|6895->3937|6924->3938|6974->3960|7003->3961|7052->3982|7399->4301|7428->4302|7464->4311|7492->4312|7522->4315|7550->4316
                  LINES: 25->1|25->1|25->1|26->2|56->32|56->32|57->33|58->34|58->34|59->35|61->37|61->37|61->37|62->38|62->38|63->39|63->39|63->39|64->40|66->42|66->42|67->43|67->43|67->43|68->44|69->45|69->45|70->46|70->46|70->46|70->46|71->47|72->48|72->48|73->49|73->49|75->51|75->51|75->51|76->52|76->52|76->52|76->52|77->53|77->53|78->54|79->55|79->55|79->55|79->55|80->56|81->57|81->57|82->58|82->58|83->59|83->59|84->60|84->60|85->61|86->62|86->62|87->63|87->63|87->63|87->63|87->63|87->63|87->63|87->63|89->65|89->65|89->65|90->66|90->66|91->67|91->67|91->67|92->68|96->72|96->72|97->73|97->73|97->73|98->74|102->78|102->78|103->79|103->79|103->79|103->79|104->80|109->85|109->85|110->86|110->86|111->87|111->87
                  -- GENERATED --
              */
          