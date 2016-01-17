
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
                                        <input type="email" placeholder="Email-адрес" ng-model="email" class="form-control input-lg" required>
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
                    """),format.raw/*80.21*/("""console.log(data);
                 """),format.raw/*81.18*/("""}"""),format.raw/*81.19*/(""");
		    """),format.raw/*82.7*/("""}"""),format.raw/*82.8*/("""
		"""),format.raw/*83.3*/("""}"""),format.raw/*83.4*/(""")
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
                  DATE: Fri Jan 15 22:40:35 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/forgot.scala.html
                  HASH: 81b690e3e17d285e2b56a8284531fd0c9f457e62
                  MATRIX: 619->1|656->30|695->32|730->41|2339->1622|2368->1623|2414->1641|2474->1673|2503->1674|2552->1695|2693->1809|2708->1815|2752->1838|2826->1884|2855->1885|2908->1910|2956->1930|2985->1931|3042->1960|3221->2112|3250->2113|3303->2138|3335->2142|3364->2143|3421->2172|3504->2227|3533->2228|3582->2249|3611->2250|3661->2272|3690->2273|3743->2298|3810->2337|3839->2338|3886->2357|3915->2358|3961->2376|4017->2404|4046->2405|4095->2426|4135->2439|4150->2445|4188->2462|4262->2508|4291->2509|4344->2534|4422->2584|4451->2585|4509->2615|4538->2616|4591->2641|4658->2680|4687->2681|4734->2700|4763->2701|4799->2710|4828->2711|4910->2765|4939->2766|4974->2774|5030->2802|5059->2803|5098->2814|5140->2828|5169->2829|5225->2857|5254->2858|5302->2878|5331->2879|5360->2880|5481->2974|5496->2980|5536->2999|5616->3051|5645->3052|5694->3073|5742->3093|5771->3094|5823->3118|6162->3429|6191->3430|6240->3451|6272->3455|6301->3456|6353->3480|6669->3768|6698->3769|6744->3787|6773->3788|6823->3810|6852->3811|6901->3832|6965->3868|6994->3869|7030->3878|7058->3879|7088->3882|7116->3883
                  LINES: 25->1|25->1|25->1|26->2|56->32|56->32|58->34|58->34|58->34|59->35|61->37|61->37|61->37|62->38|62->38|63->39|63->39|63->39|64->40|66->42|66->42|67->43|67->43|67->43|68->44|69->45|69->45|70->46|70->46|70->46|70->46|71->47|72->48|72->48|73->49|73->49|75->51|75->51|75->51|76->52|76->52|76->52|76->52|77->53|77->53|78->54|79->55|79->55|79->55|79->55|80->56|81->57|81->57|82->58|82->58|83->59|83->59|84->60|84->60|86->62|86->62|86->62|87->63|87->63|87->63|87->63|87->63|87->63|87->63|87->63|89->65|89->65|89->65|90->66|90->66|91->67|91->67|91->67|92->68|96->72|96->72|97->73|97->73|97->73|98->74|102->78|102->78|103->79|103->79|103->79|103->79|104->80|105->81|105->81|106->82|106->82|107->83|107->83
                  -- GENERATED --
              */
          