
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newpassword_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newpassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Новый пароль")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""
        """),format.raw/*2.9*/("""<section class="main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 login-form">
                        <div class="panel panel-default" ng-controller="newPasswordCtrl">
                            <div class="panel-intro text-center">
                                <h1 class="logo">Новый пароль</h1>
                            </div>
                            <div class="panel-body">
                                <form id="register" ng-submit="doNewPassword()">
                                    <div class="form-group">
                                        <input type="password" placeholder="Новый пароль" ng-model="password" class="form-control input-lg" required>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" placeholder="Повторите пароль" ng-model="confpassword" class="form-control input-lg" required>
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-block btn-custom">Изменить</button>
                                    </div>
                                </form>
                                <div class="alert alert-danger" id="error" style="display: none;">

                                </div>
                            </div>
                            <div class="panel-footer">
                                <p class="text-center pull-right"> <a href="/account/signin"> Уже есть аккаунт? </a> </p>
                                <div style=" clear:both"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

    <script>
		angular.module('lostfoundApp', ['ui.bootstrap'])
		.controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*38.61*/("""{"""),format.raw/*38.62*/("""

                """),format.raw/*40.17*/("""$scope.checkSession = function()"""),format.raw/*40.49*/("""{"""),format.raw/*40.50*/("""
                    """),format.raw/*41.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*43.34*/routes/*43.40*/.Account.checkSession()),format.raw/*43.63*/("""')
                    .success(function(data)"""),format.raw/*44.44*/("""{"""),format.raw/*44.45*/("""
                        """),format.raw/*45.25*/("""if(data.error == "")"""),format.raw/*45.45*/("""{"""),format.raw/*45.46*/("""
                            """),format.raw/*46.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*48.25*/("""}"""),format.raw/*48.26*/("""
                        """),format.raw/*49.25*/("""else"""),format.raw/*49.29*/("""{"""),format.raw/*49.30*/("""
                            """),format.raw/*50.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*51.25*/("""}"""),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""}"""),format.raw/*52.22*/(""").error(function(data)"""),format.raw/*52.44*/("""{"""),format.raw/*52.45*/("""
                        """),format.raw/*53.25*/("""console.log(data);
                    """),format.raw/*54.21*/("""}"""),format.raw/*54.22*/(""");
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/("""

                """),format.raw/*57.17*/("""$scope.doLogout = function()"""),format.raw/*57.45*/("""{"""),format.raw/*57.46*/("""
                    """),format.raw/*58.21*/("""$http.post('"""),_display_(/*58.34*/routes/*58.40*/.Account.logout()),format.raw/*58.57*/("""')
                    .success(function(data)"""),format.raw/*59.44*/("""{"""),format.raw/*59.45*/("""
                        """),format.raw/*60.25*/("""window.location.replace("/");
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/(""").error(function(data, status)"""),format.raw/*61.52*/("""{"""),format.raw/*61.53*/("""
                        """),format.raw/*62.25*/("""console.log(data);
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/(""");
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/("""
        """),format.raw/*65.9*/("""}"""),format.raw/*65.10*/(""")
		.controller('newPasswordCtrl', function($scope, $http) """),format.raw/*66.58*/("""{"""),format.raw/*66.59*/("""

		    """),format.raw/*68.7*/("""$scope.doNewPassword = function()"""),format.raw/*68.40*/("""{"""),format.raw/*68.41*/("""
		        """),format.raw/*69.11*/("""if($scope.password != $scope.confpassword)"""),format.raw/*69.53*/("""{"""),format.raw/*69.54*/("""
                    """),format.raw/*70.21*/("""$("#error").text("Пароли не совпадают").delay(3000).fadeOut("slow");
                    $("#error").css("display","block");
                    return;
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""

                """),format.raw/*75.17*/("""var email = url('?email');
                var hash = url('?hash');
    		    var request = """),format.raw/*77.25*/("""{"""),format.raw/*77.26*/(""""action":"newpassword", "params":"""),format.raw/*77.59*/("""{"""),format.raw/*77.60*/(""""email":email, "hash":hash, "newpassword":$scope.password"""),format.raw/*77.117*/("""}"""),format.raw/*77.118*/("""}"""),format.raw/*77.119*/(""";

                $http.post('"""),_display_(/*79.30*/routes/*79.36*/.Account.doNewPassword()),format.raw/*79.60*/("""', request)
                 .success(function(data)"""),format.raw/*80.41*/("""{"""),format.raw/*80.42*/("""
                    """),format.raw/*81.21*/("""if(data.error == "")"""),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
                        """),format.raw/*82.25*/("""window.location.replace("/account/signin");
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""
                    """),format.raw/*84.21*/("""else"""),format.raw/*84.25*/("""{"""),format.raw/*84.26*/("""
                       """),format.raw/*85.24*/("""$("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                 """),format.raw/*89.18*/("""}"""),format.raw/*89.19*/(""").error(function(data)"""),format.raw/*89.41*/("""{"""),format.raw/*89.42*/("""
                    """),format.raw/*90.21*/("""console.log(data);
                 """),format.raw/*91.18*/("""}"""),format.raw/*91.19*/(""");
		    """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
		"""),format.raw/*93.3*/("""}"""),format.raw/*93.4*/(""")
    </script>
""")))}),format.raw/*95.2*/("""



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
object newpassword extends newpassword_Scope0.newpassword
              /*
                  -- GENERATED --
                  DATE: Fri Jan 15 22:40:35 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/newpassword.scala.html
                  HASH: 5aaa744e120c2d5fa06dac4c8e520ebe21ddb010
                  MATRIX: 629->1|657->21|696->23|731->32|2751->2024|2780->2025|2826->2043|2886->2075|2915->2076|2964->2097|3105->2211|3120->2217|3164->2240|3238->2286|3267->2287|3320->2312|3368->2332|3397->2333|3454->2362|3633->2514|3662->2515|3715->2540|3747->2544|3776->2545|3833->2574|3916->2629|3945->2630|3994->2651|4023->2652|4073->2674|4102->2675|4155->2700|4222->2739|4251->2740|4298->2759|4327->2760|4373->2778|4429->2806|4458->2807|4507->2828|4547->2841|4562->2847|4600->2864|4674->2910|4703->2911|4756->2936|4834->2986|4863->2987|4921->3017|4950->3018|5003->3043|5070->3082|5099->3083|5146->3102|5175->3103|5211->3112|5240->3113|5327->3172|5356->3173|5391->3181|5452->3214|5481->3215|5520->3226|5590->3268|5619->3269|5668->3290|5865->3459|5894->3460|5940->3478|6060->3570|6089->3571|6150->3604|6179->3605|6265->3662|6295->3663|6325->3664|6384->3696|6399->3702|6444->3726|6524->3778|6553->3779|6602->3800|6650->3820|6679->3821|6732->3846|6824->3910|6853->3911|6902->3932|6934->3936|6963->3937|7015->3961|7260->4178|7289->4179|7335->4197|7364->4198|7414->4220|7443->4221|7492->4242|7556->4278|7585->4279|7621->4288|7649->4289|7679->4292|7707->4293|7754->4310
                  LINES: 25->1|25->1|25->1|26->2|62->38|62->38|64->40|64->40|64->40|65->41|67->43|67->43|67->43|68->44|68->44|69->45|69->45|69->45|70->46|72->48|72->48|73->49|73->49|73->49|74->50|75->51|75->51|76->52|76->52|76->52|76->52|77->53|78->54|78->54|79->55|79->55|81->57|81->57|81->57|82->58|82->58|82->58|82->58|83->59|83->59|84->60|85->61|85->61|85->61|85->61|86->62|87->63|87->63|88->64|88->64|89->65|89->65|90->66|90->66|92->68|92->68|92->68|93->69|93->69|93->69|94->70|97->73|97->73|99->75|101->77|101->77|101->77|101->77|101->77|101->77|101->77|103->79|103->79|103->79|104->80|104->80|105->81|105->81|105->81|106->82|107->83|107->83|108->84|108->84|108->84|109->85|112->88|112->88|113->89|113->89|113->89|113->89|114->90|115->91|115->91|116->92|116->92|117->93|117->93|119->95
                  -- GENERATED --
              */
          