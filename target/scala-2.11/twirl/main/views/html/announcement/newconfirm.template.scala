
package views.html.announcement

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newconfirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Новое обьявление")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""

    """),format.raw/*3.5*/("""<section class="main no-padding" style="margin-top: 100px;" ng-controller="newSuccessCtrl">
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-sm-12 alert alert-success" style="font-size: 20px;">
                   <i class="fa fa-check"></i> Обьявление опубликовано!
                       <a ng-href="/announcement/show?id="""),format.raw/*8.58*/("""{"""),format.raw/*8.59*/("""{"""),format.raw/*8.60*/("""newId"""),format.raw/*8.65*/("""}"""),format.raw/*8.66*/("""}"""),format.raw/*8.67*/("""" style="color: #2F99D2;" class="successMessage">посмотреть</a>
                </div>
            </div>
        </div>
    </section>

    <script>
        angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*16.67*/("""{"""),format.raw/*16.68*/("""

                """),format.raw/*18.17*/("""$scope.checkSession = function()"""),format.raw/*18.49*/("""{"""),format.raw/*18.50*/("""
                    """),format.raw/*19.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*21.34*/routes/*21.40*/.Account.checkSession()),format.raw/*21.63*/("""')
                    .success(function(data)"""),format.raw/*22.44*/("""{"""),format.raw/*22.45*/("""
                        """),format.raw/*23.25*/("""if(data.error == "")"""),format.raw/*23.45*/("""{"""),format.raw/*23.46*/("""
                            """),format.raw/*24.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                       """),format.raw/*26.24*/("""}"""),format.raw/*26.25*/("""
                        """),format.raw/*27.25*/("""else"""),format.raw/*27.29*/("""{"""),format.raw/*27.30*/("""
                            """),format.raw/*28.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/(""").error(function(data)"""),format.raw/*30.44*/("""{"""),format.raw/*30.45*/("""
                        """),format.raw/*31.25*/("""console.log(data);
                    """),format.raw/*32.21*/("""}"""),format.raw/*32.22*/(""");
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/("""

                """),format.raw/*35.17*/("""$scope.doLogout = function()"""),format.raw/*35.45*/("""{"""),format.raw/*35.46*/("""
                    """),format.raw/*36.21*/("""$http.post('"""),_display_(/*36.34*/routes/*36.40*/.Account.logout()),format.raw/*36.57*/("""')
                    .success(function(data)"""),format.raw/*37.44*/("""{"""),format.raw/*37.45*/("""
                        """),format.raw/*38.25*/("""window.location.replace("/");
                    """),format.raw/*39.21*/("""}"""),format.raw/*39.22*/(""").error(function(data, status)"""),format.raw/*39.52*/("""{"""),format.raw/*39.53*/("""
                        """),format.raw/*40.25*/("""console.log(data);
                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/(""");
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
        """),format.raw/*43.9*/("""}"""),format.raw/*43.10*/(""")

        .controller('newSuccessCtrl', function($scope, $http) """),format.raw/*45.63*/("""{"""),format.raw/*45.64*/("""
            """),format.raw/*46.13*/("""console.log(url('?id'));
            if(url('?id') == "" || url('?id') == null || typeof(url('?id')) == 'undefined' || url('?id') == 'null')"""),format.raw/*47.116*/("""{"""),format.raw/*47.117*/("""
                """),format.raw/*48.17*/("""window.location.replace('/');
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""

            """),format.raw/*51.13*/("""$scope.newId = url('?id');

        """),format.raw/*53.9*/("""}"""),format.raw/*53.10*/(""")
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
object newconfirm extends newconfirm_Scope0.newconfirm
              /*
                  -- GENERATED --
                  DATE: Sun Jan 10 21:40:00 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newconfirm.scala.html
                  HASH: e48b2c99d9bc4c28903ac42ae705523cc82fa57b
                  MATRIX: 632->1|664->25|703->27|735->33|1140->411|1168->412|1196->413|1228->418|1256->419|1284->420|1585->693|1614->694|1660->712|1720->744|1749->745|1798->766|1939->880|1954->886|1998->909|2072->955|2101->956|2154->981|2202->1001|2231->1002|2288->1031|2466->1182|2495->1183|2548->1208|2580->1212|2609->1213|2666->1242|2749->1297|2778->1298|2827->1319|2856->1320|2906->1342|2935->1343|2988->1368|3055->1407|3084->1408|3131->1427|3160->1428|3206->1446|3262->1474|3291->1475|3340->1496|3380->1509|3395->1515|3433->1532|3507->1578|3536->1579|3589->1604|3667->1654|3696->1655|3754->1685|3783->1686|3836->1711|3903->1750|3932->1751|3979->1770|4008->1771|4044->1780|4073->1781|4166->1846|4195->1847|4236->1860|4405->2000|4435->2001|4480->2018|4550->2060|4579->2061|4621->2075|4684->2111|4713->2112
                  LINES: 25->1|25->1|25->1|27->3|32->8|32->8|32->8|32->8|32->8|32->8|40->16|40->16|42->18|42->18|42->18|43->19|45->21|45->21|45->21|46->22|46->22|47->23|47->23|47->23|48->24|50->26|50->26|51->27|51->27|51->27|52->28|53->29|53->29|54->30|54->30|54->30|54->30|55->31|56->32|56->32|57->33|57->33|59->35|59->35|59->35|60->36|60->36|60->36|60->36|61->37|61->37|62->38|63->39|63->39|63->39|63->39|64->40|65->41|65->41|66->42|66->42|67->43|67->43|69->45|69->45|70->46|71->47|71->47|72->48|73->49|73->49|75->51|77->53|77->53
                  -- GENERATED --
              */
          