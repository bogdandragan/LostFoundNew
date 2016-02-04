
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


Seq[Any](_display_(/*1.2*/main("Новое обьявление - Поиск потерянных вещей. Бюро находок Украина")/*1.73*/ {_display_(Seq[Any](format.raw/*1.75*/("""
 """),format.raw/*2.2*/("""<!--   <script src="//vk.com/js/api/openapi.js" type="text/javascript"></script>
    <script language="javascript">
    VK.init("""),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
        """),format.raw/*5.9*/("""apiId: 5251562 // id созданного вами приложения вконтакте
    """),format.raw/*6.5*/("""}"""),format.raw/*6.6*/(""");


    //function sendwallpost(mydata) """),format.raw/*9.37*/("""{"""),format.raw/*9.38*/("""
        """),format.raw/*10.9*/("""VK.api("wall.post", """),format.raw/*10.29*/("""{"""),format.raw/*10.30*/("""
            """),format.raw/*11.13*/("""owner_id: '-112053472',
            access_token: '503ba63b6762154fcab6d03b77e06069eafa717a46a1ede6cbb0b2d9054d32bbec7c11ba4041f39b23e2c',
            message: 'test message',
            from_group: 1
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/(""", function (data) """),format.raw/*15.28*/("""{"""),format.raw/*15.29*/("""
        """),format.raw/*16.9*/("""console.log(data);
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/(""");
    //"""),format.raw/*18.7*/("""}"""),format.raw/*18.8*/("""
"""),format.raw/*19.1*/("""</script>-->
    <section class="main no-padding" style="margin-top: 100px;" ng-controller="newSuccessCtrl">
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-sm-12 alert alert-success" style="font-size: 20px;">
                   <i class="fa fa-check"></i> Обьявление опубликовано!
                       <a ng-href="/announcement/show?id="""),format.raw/*25.58*/("""{"""),format.raw/*25.59*/("""{"""),format.raw/*25.60*/("""newId"""),format.raw/*25.65*/("""}"""),format.raw/*25.66*/("""}"""),format.raw/*25.67*/("""" style="color: #2F99D2;" class="successMessage">посмотреть</a>
                    <p>А также в соцсетях: <br><b>Вконтакте:</b> <a href="http://www.vk.com/znahidkaua">vk.com/znahidkaua</a><br><b>Facebook:</b> <a href="http://www.facebook.com/znahidkaua">facebook.com/znahidkaua</a></p>
                </div>
            </div>
        </div>
    </section>

    <script>
        angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*34.79*/("""{"""),format.raw/*34.80*/("""
                """),format.raw/*35.17*/("""$rootScope.title = "Новое обьявление - ";
                $scope.checkSession = function()"""),format.raw/*36.49*/("""{"""),format.raw/*36.50*/("""
                    """),format.raw/*37.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*39.34*/routes/*39.40*/.Account.checkSession()),format.raw/*39.63*/("""')
                    .success(function(data)"""),format.raw/*40.44*/("""{"""),format.raw/*40.45*/("""
                        """),format.raw/*41.25*/("""if(data.error == "")"""),format.raw/*41.45*/("""{"""),format.raw/*41.46*/("""
                            """),format.raw/*42.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                       """),format.raw/*44.24*/("""}"""),format.raw/*44.25*/("""
                        """),format.raw/*45.25*/("""else"""),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""
                            """),format.raw/*46.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*47.25*/("""}"""),format.raw/*47.26*/("""
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/(""").error(function(data)"""),format.raw/*48.44*/("""{"""),format.raw/*48.45*/("""
                        """),format.raw/*49.25*/("""console.log(data);
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""");
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/("""

                """),format.raw/*53.17*/("""$scope.doLogout = function()"""),format.raw/*53.45*/("""{"""),format.raw/*53.46*/("""
                    """),format.raw/*54.21*/("""$http.post('"""),_display_(/*54.34*/routes/*54.40*/.Account.logout()),format.raw/*54.57*/("""')
                    .success(function(data)"""),format.raw/*55.44*/("""{"""),format.raw/*55.45*/("""
                        """),format.raw/*56.25*/("""window.location.replace("/");
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/(""").error(function(data, status)"""),format.raw/*57.52*/("""{"""),format.raw/*57.53*/("""
                        """),format.raw/*58.25*/("""console.log(data);
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/(""");
                """),format.raw/*60.17*/("""}"""),format.raw/*60.18*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""")

        .controller('newSuccessCtrl', function($scope, $http) """),format.raw/*63.63*/("""{"""),format.raw/*63.64*/("""
            """),format.raw/*64.13*/("""console.log(url('?id'));
            if(url('?id') == "" || url('?id') == null || typeof(url('?id')) == 'undefined' || url('?id') == 'null')"""),format.raw/*65.116*/("""{"""),format.raw/*65.117*/("""
                """),format.raw/*66.17*/("""window.location.replace('/');
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""

            """),format.raw/*69.13*/("""$scope.newId = url('?id');

        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/(""")
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
                  DATE: Sun Jan 31 13:52:05 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newconfirm.scala.html
                  HASH: f0534a6215d2ec80601321d56d922bd60f1ea96f
                  MATRIX: 632->1|711->72|750->74|778->76|933->204|961->205|996->214|1084->276|1111->277|1179->318|1207->319|1243->328|1291->348|1320->349|1361->362|1598->572|1627->573|1673->591|1702->592|1738->601|1792->628|1821->629|1857->638|1885->639|1913->640|2336->1035|2365->1036|2394->1037|2427->1042|2456->1043|2485->1044|3021->1552|3050->1553|3095->1570|3213->1660|3242->1661|3291->1682|3432->1796|3447->1802|3491->1825|3565->1871|3594->1872|3647->1897|3695->1917|3724->1918|3781->1947|3959->2098|3988->2099|4041->2124|4073->2128|4102->2129|4159->2158|4242->2213|4271->2214|4320->2235|4349->2236|4399->2258|4428->2259|4481->2284|4548->2323|4577->2324|4624->2343|4653->2344|4699->2362|4755->2390|4784->2391|4833->2412|4873->2425|4888->2431|4926->2448|5000->2494|5029->2495|5082->2520|5160->2570|5189->2571|5247->2601|5276->2602|5329->2627|5396->2666|5425->2667|5472->2686|5501->2687|5537->2696|5566->2697|5659->2762|5688->2763|5729->2776|5898->2916|5928->2917|5973->2934|6043->2976|6072->2977|6114->2991|6177->3027|6206->3028
                  LINES: 25->1|25->1|25->1|26->2|28->4|28->4|29->5|30->6|30->6|33->9|33->9|34->10|34->10|34->10|35->11|39->15|39->15|39->15|39->15|40->16|41->17|41->17|42->18|42->18|43->19|49->25|49->25|49->25|49->25|49->25|49->25|58->34|58->34|59->35|60->36|60->36|61->37|63->39|63->39|63->39|64->40|64->40|65->41|65->41|65->41|66->42|68->44|68->44|69->45|69->45|69->45|70->46|71->47|71->47|72->48|72->48|72->48|72->48|73->49|74->50|74->50|75->51|75->51|77->53|77->53|77->53|78->54|78->54|78->54|78->54|79->55|79->55|80->56|81->57|81->57|81->57|81->57|82->58|83->59|83->59|84->60|84->60|85->61|85->61|87->63|87->63|88->64|89->65|89->65|90->66|91->67|91->67|93->69|95->71|95->71
                  -- GENERATED --
              */
          