
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


Seq[Any](_display_(/*1.2*/main("Восстановление пароля")/*1.31*/ {_display_(Seq[Any](format.raw/*1.33*/("""
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
                                        <button class="btn btn-block btn-custom" id="submitbutton">Отправить</button>
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
		.controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*32.61*/("""{"""),format.raw/*32.62*/("""

                """),format.raw/*34.17*/("""$scope.checkSession = function()"""),format.raw/*34.49*/("""{"""),format.raw/*34.50*/("""
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

		    """),format.raw/*62.7*/("""$scope.doForgot = function()"""),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
		        """),format.raw/*63.11*/("""var request = """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/(""""action":"forgot", "params":"""),format.raw/*63.54*/("""{"""),format.raw/*63.55*/(""""email":$scope.email"""),format.raw/*63.75*/("""}"""),format.raw/*63.76*/("""}"""),format.raw/*63.77*/(""";
                $( "#submitbutton" ).prop( "disabled", true );
                $http.post('"""),_display_(/*65.30*/routes/*65.36*/.Account.doForgot()),format.raw/*65.55*/("""', request)
                 .success(function(data)"""),format.raw/*66.41*/("""{"""),format.raw/*66.42*/("""
                    """),format.raw/*67.21*/("""if(data.error == "")"""),format.raw/*67.41*/("""{"""),format.raw/*67.42*/("""
                       """),format.raw/*68.24*/("""$( "#submitbutton" ).prop( "disabled", false );
                        $("#error").text("Проверьте Ваш е-mail");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                       $("#error").css("display","block");
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                    """),format.raw/*73.21*/("""else"""),format.raw/*73.25*/("""{"""),format.raw/*73.26*/("""
                       """),format.raw/*74.24*/("""$( "#submitbutton" ).prop( "disabled", false );
                       $("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                 """),format.raw/*79.18*/("""}"""),format.raw/*79.19*/(""").error(function(data)"""),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""
                    """),format.raw/*80.21*/("""$( "#submitbutton" ).prop( "disabled", false );
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
                  DATE: Mon Jan 18 21:52:50 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/forgot.scala.html
                  HASH: 23ea17e0038902392f30df2e57f27ce517c23c61
                  MATRIX: 619->1|656->30|695->32|730->41|2350->1633|2379->1634|2425->1652|2485->1684|2514->1685|2563->1706|2704->1820|2719->1826|2763->1849|2837->1895|2866->1896|2919->1921|2967->1941|2996->1942|3053->1971|3232->2123|3261->2124|3314->2149|3346->2153|3375->2154|3432->2183|3515->2238|3544->2239|3593->2260|3622->2261|3672->2283|3701->2284|3754->2309|3821->2348|3850->2349|3897->2368|3926->2369|3972->2387|4028->2415|4057->2416|4106->2437|4146->2450|4161->2456|4199->2473|4273->2519|4302->2520|4355->2545|4433->2595|4462->2596|4520->2626|4549->2627|4602->2652|4669->2691|4698->2692|4745->2711|4774->2712|4810->2721|4839->2722|4921->2776|4950->2777|4985->2785|5041->2813|5070->2814|5109->2825|5151->2839|5180->2840|5236->2868|5265->2869|5313->2889|5342->2890|5371->2891|5492->2985|5507->2991|5547->3010|5627->3062|5656->3063|5705->3084|5753->3104|5782->3105|5834->3129|6173->3440|6202->3441|6251->3462|6283->3466|6312->3467|6364->3491|6680->3779|6709->3780|6755->3798|6784->3799|6834->3821|6863->3822|6912->3843|7283->4186|7312->4187|7348->4196|7376->4197|7406->4200|7434->4201
                  LINES: 25->1|25->1|25->1|26->2|56->32|56->32|58->34|58->34|58->34|59->35|61->37|61->37|61->37|62->38|62->38|63->39|63->39|63->39|64->40|66->42|66->42|67->43|67->43|67->43|68->44|69->45|69->45|70->46|70->46|70->46|70->46|71->47|72->48|72->48|73->49|73->49|75->51|75->51|75->51|76->52|76->52|76->52|76->52|77->53|77->53|78->54|79->55|79->55|79->55|79->55|80->56|81->57|81->57|82->58|82->58|83->59|83->59|84->60|84->60|86->62|86->62|86->62|87->63|87->63|87->63|87->63|87->63|87->63|87->63|87->63|89->65|89->65|89->65|90->66|90->66|91->67|91->67|91->67|92->68|96->72|96->72|97->73|97->73|97->73|98->74|102->78|102->78|103->79|103->79|103->79|103->79|104->80|109->85|109->85|110->86|110->86|111->87|111->87
                  -- GENERATED --
              */
          