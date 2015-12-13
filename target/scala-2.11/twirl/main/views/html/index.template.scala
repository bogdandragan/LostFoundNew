
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Главная")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""

    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 70px;" ng-controller="mainCtrl">
        <h3>Новые обьявления</h3>
        <div class="col-sm-4" ng-repeat="announcement in announcements">
            <div class="panel panel-primary" >
                <div class="panel-heading" style="font-weight: bold;">
                    """),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""{"""),format.raw/*9.23*/("""announcement.title | limitTo:30"""),format.raw/*9.54*/("""}"""),format.raw/*9.55*/("""}"""),format.raw/*9.56*/("""
                    """),format.raw/*10.21*/("""<span ng-if="announcement.type == 'found'" class="label label-success" style="float: right;">Найдено</span>
                        <span ng-if="announcement.type == 'lost'" class="label label-danger" style="float: right;">Потеряно</span>
                </div>
                <div class="panel-body">
                    """),format.raw/*14.21*/("""{"""),format.raw/*14.22*/("""{"""),format.raw/*14.23*/("""announcement.description | limitTo:35"""),format.raw/*14.60*/("""}"""),format.raw/*14.61*/("""}"""),format.raw/*14.62*/("""...
                    <br>
                    <span style="color: blue;">"""),format.raw/*16.48*/("""{"""),format.raw/*16.49*/("""{"""),format.raw/*16.50*/("""announcement.city"""),format.raw/*16.67*/("""}"""),format.raw/*16.68*/("""}"""),format.raw/*16.69*/(""", """),format.raw/*16.71*/("""{"""),format.raw/*16.72*/("""{"""),format.raw/*16.73*/("""announcement.region"""),format.raw/*16.92*/("""}"""),format.raw/*16.93*/("""}"""),format.raw/*16.94*/("""</span>
                </div>
            </div>
        </div>

    </div>

    <script>
       $.ajax("""),format.raw/*24.15*/("""{"""),format.raw/*24.16*/("""
            """),format.raw/*25.13*/("""type: 'POST',
            url: '"""),_display_(/*26.20*/routes/*26.26*/.Account.checkSession()),format.raw/*26.49*/("""',
            success: function(data)"""),format.raw/*27.36*/("""{"""),format.raw/*27.37*/("""

                """),format.raw/*29.17*/("""if(data.error == "")"""),format.raw/*29.37*/("""{"""),format.raw/*29.38*/("""
                    """),format.raw/*30.21*/("""var name = data.email.substring(0, data.email.lastIndexOf("@"));

                    var menu = "<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>"+name+"<span class='caret'></span></a>"+
                                "<ul class='dropdown-menu' role='menu'>"+
                                "<li><a href='/account'>Профиль</a></li>"+
                                "<li><a href='#'>Another action</a></li>"+
                                "<li class='divider'></li>"+
                                "<li id='signOut'><a href='#'>Выход</a></li>"+
                                "</ul>";
                    $("#profile-link").html(menu);

                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""else"""),format.raw/*41.22*/("""{"""),format.raw/*41.23*/("""
                     """),format.raw/*42.22*/("""$("#profile-link").html("<a href='/account/signin'>Профиль</a></li>");
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/("""
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");

         angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http) """),format.raw/*48.57*/("""{"""),format.raw/*48.58*/("""

                """),format.raw/*50.17*/("""//get categories
                $http.get('"""),_display_(/*51.29*/routes/*51.35*/.Announcement.getLast12()),format.raw/*51.60*/("""')
                 .success(function(data)"""),format.raw/*52.41*/("""{"""),format.raw/*52.42*/("""
                    """),format.raw/*53.21*/("""console.log(data);
                    $scope.announcements = data;
                 """),format.raw/*55.18*/("""}"""),format.raw/*55.19*/(""").error(function(data)"""),format.raw/*55.41*/("""{"""),format.raw/*55.42*/("""
                    """),format.raw/*56.21*/("""console.log(data);
                 """),format.raw/*57.18*/("""}"""),format.raw/*57.19*/(""");

        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""")
    </script>

""")))}),format.raw/*62.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Sep 06 09:24:45 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/index.scala.html
                  HASH: eb7e3bf6f6f9ce5d7d15ea43e4e7977fd2e9cd54
                  MATRIX: 609->2|632->17|671->19|703->25|1050->345|1078->346|1106->347|1164->378|1192->379|1220->380|1269->401|1620->724|1649->725|1678->726|1743->763|1772->764|1801->765|1905->841|1934->842|1963->843|2008->860|2037->861|2066->862|2096->864|2125->865|2154->866|2201->885|2230->886|2259->887|2392->992|2421->993|2462->1006|2522->1039|2537->1045|2581->1068|2647->1106|2676->1107|2722->1125|2770->1145|2799->1146|2848->1167|3584->1876|3613->1877|3645->1881|3674->1882|3724->1904|3839->1991|3868->1992|3909->2005|3938->2006|3974->2015|4003->2016|4149->2134|4178->2135|4224->2153|4296->2198|4311->2204|4357->2229|4428->2272|4457->2273|4506->2294|4619->2379|4648->2380|4698->2402|4727->2403|4776->2424|4840->2460|4869->2461|4908->2473|4937->2474|4985->2492
                  LINES: 25->2|25->2|25->2|27->4|32->9|32->9|32->9|32->9|32->9|32->9|33->10|37->14|37->14|37->14|37->14|37->14|37->14|39->16|39->16|39->16|39->16|39->16|39->16|39->16|39->16|39->16|39->16|39->16|39->16|47->24|47->24|48->25|49->26|49->26|49->26|50->27|50->27|52->29|52->29|52->29|53->30|64->41|64->41|64->41|64->41|65->42|66->43|66->43|67->44|67->44|68->45|68->45|71->48|71->48|73->50|74->51|74->51|74->51|75->52|75->52|76->53|78->55|78->55|78->55|78->55|79->56|80->57|80->57|82->59|82->59|85->62
                  -- GENERATED --
              */
          