
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Регистрация")/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""
        """),format.raw/*3.9*/("""<section class="main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-5 login-form">
                        <div class="panel panel-default" ng-controller="registerCtrl">
                            <div class="panel-intro text-center">
                                <h1 class="logo">Регистрация</h1>
                            </div>
                            <div class="panel-body">
                                <form id="register" ng-submit="doRegister()">
                                    <div class="form-group">
                                        <input type="email" placeholder="Email-адрес" ng-model="email" class="form-control input-lg" required>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" placeholder="Пароль" ng-model="password" class="form-control input-lg" pattern="."""),format.raw/*17.145*/("""{"""),format.raw/*17.146*/("""6,"""),format.raw/*17.148*/("""}"""),format.raw/*17.149*/(""""   required title="Минимальная длина - 6 символов">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" placeholder="Повторите пароль" ng-model="confpassword" class="form-control input-lg" required>
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-block btn-custom" id="sendbutton">Отправить</button>
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
		.controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*42.61*/("""{"""),format.raw/*42.62*/("""

                """),format.raw/*44.17*/("""$scope.checkSession = function()"""),format.raw/*44.49*/("""{"""),format.raw/*44.50*/("""
                    """),format.raw/*45.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*47.34*/routes/*47.40*/.Account.checkSession()),format.raw/*47.63*/("""')
                    .success(function(data)"""),format.raw/*48.44*/("""{"""),format.raw/*48.45*/("""
                        """),format.raw/*49.25*/("""if(data.error == "")"""),format.raw/*49.45*/("""{"""),format.raw/*49.46*/("""
                            """),format.raw/*50.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*52.25*/("""}"""),format.raw/*52.26*/("""
                        """),format.raw/*53.25*/("""else"""),format.raw/*53.29*/("""{"""),format.raw/*53.30*/("""
                            """),format.raw/*54.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*55.25*/("""}"""),format.raw/*55.26*/("""
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/(""").error(function(data)"""),format.raw/*56.44*/("""{"""),format.raw/*56.45*/("""
                        """),format.raw/*57.25*/("""console.log(data);
                    """),format.raw/*58.21*/("""}"""),format.raw/*58.22*/(""");
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

                """),format.raw/*61.17*/("""$scope.doLogout = function()"""),format.raw/*61.45*/("""{"""),format.raw/*61.46*/("""
                    """),format.raw/*62.21*/("""$http.post('"""),_display_(/*62.34*/routes/*62.40*/.Account.logout()),format.raw/*62.57*/("""')
                    .success(function(data)"""),format.raw/*63.44*/("""{"""),format.raw/*63.45*/("""
                        """),format.raw/*64.25*/("""window.location.replace("/");
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/(""").error(function(data, status)"""),format.raw/*65.52*/("""{"""),format.raw/*65.53*/("""
                        """),format.raw/*66.25*/("""console.log(data);
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/(""");
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/("""
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""")
		.controller('registerCtrl', function($scope, $http) """),format.raw/*70.55*/("""{"""),format.raw/*70.56*/("""

		    """),format.raw/*72.7*/("""$scope.doRegister = function()"""),format.raw/*72.37*/("""{"""),format.raw/*72.38*/("""
		        """),format.raw/*73.11*/("""if($scope.password != $scope.confpassword)"""),format.raw/*73.53*/("""{"""),format.raw/*73.54*/("""
                    """),format.raw/*74.21*/("""$("#error").text("Пароли не совпадают").delay(3000).fadeOut("slow");
                    $("#error").css("display","block");
                    return;
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""
                """),format.raw/*78.17*/("""$( "#sendbutton" ).prop( "disabled", true );
                var request = """),format.raw/*79.31*/("""{"""),format.raw/*79.32*/(""""action":"register", "params":"""),format.raw/*79.62*/("""{"""),format.raw/*79.63*/(""""email":$scope.email, "password":$scope.password"""),format.raw/*79.111*/("""}"""),format.raw/*79.112*/("""}"""),format.raw/*79.113*/(""";
                $http.post('"""),_display_(/*80.30*/routes/*80.36*/.Account.doRegister()),format.raw/*80.57*/("""', request)
                 .success(function(data)"""),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
                    """),format.raw/*82.21*/("""if(data.error == "")"""),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""
                        """),format.raw/*83.25*/("""$( "#sendbutton" ).prop( "disabled", false );
                        $("#error").text("Проверте Ваш е-mail для завершения регистрации");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""
                    """),format.raw/*88.21*/("""else"""),format.raw/*88.25*/("""{"""),format.raw/*88.26*/("""
                       """),format.raw/*89.24*/("""$( "#sendbutton" ).prop( "disabled", false );
                       $("#error").text(data.error);
    				     $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                 """),format.raw/*94.18*/("""}"""),format.raw/*94.19*/(""").error(function(data)"""),format.raw/*94.41*/("""{"""),format.raw/*94.42*/("""
                    """),format.raw/*95.21*/("""$( "#sendbutton" ).prop( "disabled", false );
                       $("#error").text("Не удалось отправить e-mail");
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    console.log(data);
                 """),format.raw/*100.18*/("""}"""),format.raw/*100.19*/(""");
		    """),format.raw/*101.7*/("""}"""),format.raw/*101.8*/("""
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/(""")
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Tue Jan 19 00:29:16 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/register.scala.html
                  HASH: 8277539a404855962cb1a8a3a528b8044944343e
                  MATRIX: 623->2|650->21|689->23|724->32|1737->1016|1767->1017|1798->1019|1828->1020|3168->2332|3197->2333|3243->2351|3303->2383|3332->2384|3381->2405|3522->2519|3537->2525|3581->2548|3655->2594|3684->2595|3737->2620|3785->2640|3814->2641|3871->2670|4050->2822|4079->2823|4132->2848|4164->2852|4193->2853|4250->2882|4333->2937|4362->2938|4411->2959|4440->2960|4490->2982|4519->2983|4572->3008|4639->3047|4668->3048|4715->3067|4744->3068|4790->3086|4846->3114|4875->3115|4924->3136|4964->3149|4979->3155|5017->3172|5091->3218|5120->3219|5173->3244|5251->3294|5280->3295|5338->3325|5367->3326|5420->3351|5487->3390|5516->3391|5563->3410|5592->3411|5628->3420|5657->3421|5741->3477|5770->3478|5805->3486|5863->3516|5892->3517|5931->3528|6001->3570|6030->3571|6079->3592|6276->3761|6305->3762|6350->3779|6453->3854|6482->3855|6540->3885|6569->3886|6646->3934|6676->3935|6706->3936|6764->3967|6779->3973|6821->3994|6901->4046|6930->4047|6979->4068|7027->4088|7056->4089|7109->4114|7473->4450|7502->4451|7551->4472|7583->4476|7612->4477|7664->4501|7979->4788|8008->4789|8054->4807|8083->4808|8133->4830|8162->4831|8211->4852|8581->5193|8611->5194|8648->5203|8677->5204|8708->5207|8737->5208
                  LINES: 25->2|25->2|25->2|26->3|40->17|40->17|40->17|40->17|65->42|65->42|67->44|67->44|67->44|68->45|70->47|70->47|70->47|71->48|71->48|72->49|72->49|72->49|73->50|75->52|75->52|76->53|76->53|76->53|77->54|78->55|78->55|79->56|79->56|79->56|79->56|80->57|81->58|81->58|82->59|82->59|84->61|84->61|84->61|85->62|85->62|85->62|85->62|86->63|86->63|87->64|88->65|88->65|88->65|88->65|89->66|90->67|90->67|91->68|91->68|92->69|92->69|93->70|93->70|95->72|95->72|95->72|96->73|96->73|96->73|97->74|100->77|100->77|101->78|102->79|102->79|102->79|102->79|102->79|102->79|102->79|103->80|103->80|103->80|104->81|104->81|105->82|105->82|105->82|106->83|110->87|110->87|111->88|111->88|111->88|112->89|116->93|116->93|117->94|117->94|117->94|117->94|118->95|123->100|123->100|124->101|124->101|125->102|125->102
                  -- GENERATED --
              */
          