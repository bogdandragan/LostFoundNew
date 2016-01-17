
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


Seq[Any](_display_(/*1.2*/main("Регистрация")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
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
         .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*15.68*/("""{"""),format.raw/*15.69*/("""

                """),format.raw/*17.17*/("""$scope.checkSession = function()"""),format.raw/*17.49*/("""{"""),format.raw/*17.50*/("""
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
                  DATE: Thu Jan 07 14:14:36 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/regconfirm.scala.html
                  HASH: b958edc6dd9a4d35badcfa1b596ac5ae33eedb84
                  MATRIX: 627->1|654->20|693->22|728->31|1196->471|1225->472|1271->490|1331->522|1360->523|1409->544|1550->658|1565->664|1609->687|1683->733|1712->734|1765->759|1813->779|1842->780|1899->809|2078->961|2107->962|2160->987|2192->991|2221->992|2278->1021|2361->1076|2390->1077|2439->1098|2468->1099|2518->1121|2547->1122|2600->1147|2667->1186|2696->1187|2743->1206|2772->1207|2818->1225|2874->1253|2903->1254|2952->1275|2992->1288|3007->1294|3045->1311|3119->1357|3148->1358|3201->1383|3279->1433|3308->1434|3366->1464|3395->1465|3448->1490|3515->1529|3544->1530|3591->1549|3620->1550|3656->1559|3685->1560|3778->1625|3807->1626|3853->1644|3979->1742|4008->1743|4066->1773|4095->1774|4149->1800|4178->1801|4207->1802|4266->1834|4281->1840|4330->1868|4410->1920|4439->1921|4488->1942|4536->1962|4565->1963|4618->1988|4703->2045|4732->2046|4781->2067|4813->2071|4842->2072|4895->2097|5140->2314|5169->2315|5215->2333|5244->2334|5302->2364|5331->2365|5380->2386|5543->2521|5572->2522|5604->2527|5632->2528
                  LINES: 25->1|25->1|25->1|26->2|39->15|39->15|41->17|41->17|41->17|42->18|44->20|44->20|44->20|45->21|45->21|46->22|46->22|46->22|47->23|49->25|49->25|50->26|50->26|50->26|51->27|52->28|52->28|53->29|53->29|53->29|53->29|54->30|55->31|55->31|56->32|56->32|58->34|58->34|58->34|59->35|59->35|59->35|59->35|60->36|60->36|61->37|62->38|62->38|62->38|62->38|63->39|64->40|64->40|65->41|65->41|66->42|66->42|67->43|67->43|69->45|71->47|71->47|71->47|71->47|71->47|71->47|71->47|73->49|73->49|73->49|74->50|74->50|75->51|75->51|75->51|76->52|77->53|77->53|78->54|78->54|78->54|79->55|82->58|82->58|83->59|83->59|83->59|83->59|84->60|87->63|87->63|88->64|88->64
                  -- GENERATED --
              */
          