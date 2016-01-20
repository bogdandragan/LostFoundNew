
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
                                        <input type="password" placeholder="Новый пароль" ng-model="password" class="form-control input-lg" pattern="."""),format.raw/*13.151*/("""{"""),format.raw/*13.152*/("""6,"""),format.raw/*13.154*/("""}"""),format.raw/*13.155*/("""" required title="Минимальная длина - 6 символов">
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
                  DATE: Wed Jan 20 23:48:16 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/newpassword.scala.html
                  HASH: 79285e2d7f6879568e4fd094266293eb608f7456
                  MATRIX: 629->1|657->21|696->23|731->32|1510->782|1540->783|1571->785|1601->786|2922->2079|2951->2080|2997->2098|3057->2130|3086->2131|3135->2152|3276->2266|3291->2272|3335->2295|3409->2341|3438->2342|3491->2367|3539->2387|3568->2388|3625->2417|3804->2569|3833->2570|3886->2595|3918->2599|3947->2600|4004->2629|4087->2684|4116->2685|4165->2706|4194->2707|4244->2729|4273->2730|4326->2755|4393->2794|4422->2795|4469->2814|4498->2815|4544->2833|4600->2861|4629->2862|4678->2883|4718->2896|4733->2902|4771->2919|4845->2965|4874->2966|4927->2991|5005->3041|5034->3042|5092->3072|5121->3073|5174->3098|5241->3137|5270->3138|5317->3157|5346->3158|5382->3167|5411->3168|5498->3227|5527->3228|5562->3236|5623->3269|5652->3270|5691->3281|5761->3323|5790->3324|5839->3345|6036->3514|6065->3515|6111->3533|6231->3625|6260->3626|6321->3659|6350->3660|6436->3717|6466->3718|6496->3719|6555->3751|6570->3757|6615->3781|6695->3833|6724->3834|6773->3855|6821->3875|6850->3876|6903->3901|6995->3965|7024->3966|7073->3987|7105->3991|7134->3992|7186->4016|7431->4233|7460->4234|7506->4252|7535->4253|7585->4275|7614->4276|7663->4297|7727->4333|7756->4334|7792->4343|7820->4344|7850->4347|7878->4348|7925->4365
                  LINES: 25->1|25->1|25->1|26->2|37->13|37->13|37->13|37->13|62->38|62->38|64->40|64->40|64->40|65->41|67->43|67->43|67->43|68->44|68->44|69->45|69->45|69->45|70->46|72->48|72->48|73->49|73->49|73->49|74->50|75->51|75->51|76->52|76->52|76->52|76->52|77->53|78->54|78->54|79->55|79->55|81->57|81->57|81->57|82->58|82->58|82->58|82->58|83->59|83->59|84->60|85->61|85->61|85->61|85->61|86->62|87->63|87->63|88->64|88->64|89->65|89->65|90->66|90->66|92->68|92->68|92->68|93->69|93->69|93->69|94->70|97->73|97->73|99->75|101->77|101->77|101->77|101->77|101->77|101->77|101->77|103->79|103->79|103->79|104->80|104->80|105->81|105->81|105->81|106->82|107->83|107->83|108->84|108->84|108->84|109->85|112->88|112->88|113->89|113->89|113->89|113->89|114->90|115->91|115->91|116->92|116->92|117->93|117->93|119->95
                  -- GENERATED --
              */
          