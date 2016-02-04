
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object regconfirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class regconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Регистрация - Поиск потерянных вещей. Бюро находок Украина")/*1.68*/ {_display_(Seq[Any](format.raw/*1.70*/("""
        """),format.raw/*2.9*/("""<section class="main">
            <div class="container" ng-controller="regConfirmCtrl">
                <div class="row">
                    <div class="alert alert-danger" id="error" style="display: none;">

                    </div>
                </div>
            </div>
        </section>

    <script>

         angular.module('lostfoundApp', ['ui.bootstrap'])
         .controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*15.80*/("""{"""),format.raw/*15.81*/("""
                """),format.raw/*16.17*/("""$rootScope.title = "Регистрация - ";
                $scope.checkSession = function()"""),format.raw/*17.49*/("""{"""),format.raw/*17.50*/("""
                    """),format.raw/*18.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*20.34*/routes/*20.40*/.Account.checkSession()),format.raw/*20.63*/("""')
                    .success(function(data)"""),format.raw/*21.44*/("""{"""),format.raw/*21.45*/("""
                        """),format.raw/*22.25*/("""if(data.error == "")"""),format.raw/*22.45*/("""{"""),format.raw/*22.46*/("""
                            """),format.raw/*23.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*25.25*/("""}"""),format.raw/*25.26*/("""
                        """),format.raw/*26.25*/("""else"""),format.raw/*26.29*/("""{"""),format.raw/*26.30*/("""
                            """),format.raw/*27.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*28.25*/("""}"""),format.raw/*28.26*/("""
                    """),format.raw/*29.21*/("""}"""),format.raw/*29.22*/(""").error(function(data)"""),format.raw/*29.44*/("""{"""),format.raw/*29.45*/("""
                        """),format.raw/*30.25*/("""console.log(data);
                    """),format.raw/*31.21*/("""}"""),format.raw/*31.22*/(""");
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""

                """),format.raw/*34.17*/("""$scope.doLogout = function()"""),format.raw/*34.45*/("""{"""),format.raw/*34.46*/("""
                    """),format.raw/*35.21*/("""$http.post('"""),_display_(/*35.34*/routes/*35.40*/.Account.logout()),format.raw/*35.57*/("""')
                    .success(function(data)"""),format.raw/*36.44*/("""{"""),format.raw/*36.45*/("""
                        """),format.raw/*37.25*/("""window.location.replace("/");
                    """),format.raw/*38.21*/("""}"""),format.raw/*38.22*/(""").error(function(data, status)"""),format.raw/*38.52*/("""{"""),format.raw/*38.53*/("""
                        """),format.raw/*39.25*/("""console.log(data);
                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/(""");
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/(""")
         .controller('regConfirmCtrl', function($scope, $http) """),format.raw/*43.64*/("""{"""),format.raw/*43.65*/("""

                """),format.raw/*45.17*/("""var email = url('?email');
                var hash = url('?hash');
                var request = """),format.raw/*47.31*/("""{"""),format.raw/*47.32*/(""""action":"checkReg", "params":"""),format.raw/*47.62*/("""{"""),format.raw/*47.63*/(""""email":email, "hash":hash"""),format.raw/*47.89*/("""}"""),format.raw/*47.90*/("""}"""),format.raw/*47.91*/(""";

                $http.post('"""),_display_(/*49.30*/routes/*49.36*/.Account.checkRegistration()),format.raw/*49.64*/("""', request)
                 .success(function(data)"""),format.raw/*50.41*/("""{"""),format.raw/*50.42*/("""
                    """),format.raw/*51.21*/("""if(data.error == "")"""),format.raw/*51.41*/("""{"""),format.raw/*51.42*/("""
                        """),format.raw/*52.25*/("""window.location.replace("/account");
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/("""
                    """),format.raw/*54.21*/("""else"""),format.raw/*54.25*/("""{"""),format.raw/*54.26*/("""
                        """),format.raw/*55.25*/("""$("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/("""
                 """),format.raw/*59.18*/("""}"""),format.raw/*59.19*/(""").error(function(data, status)"""),format.raw/*59.49*/("""{"""),format.raw/*59.50*/("""
                    """),format.raw/*60.21*/("""console.log(data);
                    if(status == 500)
                        window.location.replace("/account");
                 """),format.raw/*63.18*/("""}"""),format.raw/*63.19*/(""");
		"""),format.raw/*64.3*/("""}"""),format.raw/*64.4*/(""")
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
object regconfirm extends regconfirm_Scope0.regconfirm
              /*
                  -- GENERATED --
                  DATE: Tue Jan 26 20:34:30 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/regconfirm.scala.html
                  HASH: fed1fc72c1ebf7dcf561dd66c34a66526d4703dd
                  MATRIX: 627->1|701->67|740->69|775->78|1255->530|1284->531|1329->548|1442->633|1471->634|1520->655|1661->769|1676->775|1720->798|1794->844|1823->845|1876->870|1924->890|1953->891|2010->920|2189->1072|2218->1073|2271->1098|2303->1102|2332->1103|2389->1132|2472->1187|2501->1188|2550->1209|2579->1210|2629->1232|2658->1233|2711->1258|2778->1297|2807->1298|2854->1317|2883->1318|2929->1336|2985->1364|3014->1365|3063->1386|3103->1399|3118->1405|3156->1422|3230->1468|3259->1469|3312->1494|3390->1544|3419->1545|3477->1575|3506->1576|3559->1601|3626->1640|3655->1641|3702->1660|3731->1661|3767->1670|3796->1671|3889->1736|3918->1737|3964->1755|4090->1853|4119->1854|4177->1884|4206->1885|4260->1911|4289->1912|4318->1913|4377->1945|4392->1951|4441->1979|4521->2031|4550->2032|4599->2053|4647->2073|4676->2074|4729->2099|4814->2156|4843->2157|4892->2178|4924->2182|4953->2183|5006->2208|5251->2425|5280->2426|5326->2444|5355->2445|5413->2475|5442->2476|5491->2497|5654->2632|5683->2633|5715->2638|5743->2639
                  LINES: 25->1|25->1|25->1|26->2|39->15|39->15|40->16|41->17|41->17|42->18|44->20|44->20|44->20|45->21|45->21|46->22|46->22|46->22|47->23|49->25|49->25|50->26|50->26|50->26|51->27|52->28|52->28|53->29|53->29|53->29|53->29|54->30|55->31|55->31|56->32|56->32|58->34|58->34|58->34|59->35|59->35|59->35|59->35|60->36|60->36|61->37|62->38|62->38|62->38|62->38|63->39|64->40|64->40|65->41|65->41|66->42|66->42|67->43|67->43|69->45|71->47|71->47|71->47|71->47|71->47|71->47|71->47|73->49|73->49|73->49|74->50|74->50|75->51|75->51|75->51|76->52|77->53|77->53|78->54|78->54|78->54|79->55|82->58|82->58|83->59|83->59|83->59|83->59|84->60|87->63|87->63|88->64|88->64
                  -- GENERATED --
              */
          