
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


Seq[Any](_display_(/*2.2*/main("Регистрация - Поиск потерянных вещей. Бюро находок Украина")/*2.68*/ {_display_(Seq[Any](format.raw/*2.70*/("""
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
                                        <button class="btn btn-block btn-custom" id="sendbutton"><i class="fa fa-spinner fa-spin" ng-show="loading"></i>Отправить</button>
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
		.controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*42.73*/("""{"""),format.raw/*42.74*/("""
                """),format.raw/*43.17*/("""$rootScope.title = "Регистрация - ";
                $scope.checkSession = function()"""),format.raw/*44.49*/("""{"""),format.raw/*44.50*/("""
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
                """),format.raw/*71.17*/("""$scope.loading = false;
		    $scope.doRegister = function()"""),format.raw/*72.37*/("""{"""),format.raw/*72.38*/("""
		        """),format.raw/*73.11*/("""if($scope.password != $scope.confpassword)"""),format.raw/*73.53*/("""{"""),format.raw/*73.54*/("""
                    """),format.raw/*74.21*/("""$("#error").text("Пароли не совпадают").delay(3000).fadeOut("slow");
                    $("#error").css("display","block");
                    return;
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/("""
                """),format.raw/*78.17*/("""$scope.loading = true;
                var request = """),format.raw/*79.31*/("""{"""),format.raw/*79.32*/(""""action":"register", "params":"""),format.raw/*79.62*/("""{"""),format.raw/*79.63*/(""""email":$scope.email, "password":$scope.password"""),format.raw/*79.111*/("""}"""),format.raw/*79.112*/("""}"""),format.raw/*79.113*/(""";
                $http.post('"""),_display_(/*80.30*/routes/*80.36*/.Account.doRegister()),format.raw/*80.57*/("""', request)
                 .success(function(data)"""),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
                    """),format.raw/*82.21*/("""if(data.error == "")"""),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""
                        """),format.raw/*83.25*/("""$scope.loading = false;
                        $("#error").text("Проверте Ваш е-mail для завершения регистрации");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""
                    """),format.raw/*88.21*/("""else"""),format.raw/*88.25*/("""{"""),format.raw/*88.26*/("""
                       """),format.raw/*89.24*/("""$scope.loading = false;
                       $("#error").text(data.error);
    				     $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                 """),format.raw/*94.18*/("""}"""),format.raw/*94.19*/(""").error(function(data)"""),format.raw/*94.41*/("""{"""),format.raw/*94.42*/("""
                        """),format.raw/*95.25*/("""$scope.loading = false;
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
                  DATE: Tue Jan 26 20:34:30 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/register.scala.html
                  HASH: fee840c5b41ba99a9d9a0a9bad3590282eeddb03
                  MATRIX: 623->2|697->68|736->70|771->79|1784->1063|1814->1064|1845->1066|1875->1067|3282->2446|3311->2447|3356->2464|3469->2549|3498->2550|3547->2571|3688->2685|3703->2691|3747->2714|3821->2760|3850->2761|3903->2786|3951->2806|3980->2807|4037->2836|4216->2988|4245->2989|4298->3014|4330->3018|4359->3019|4416->3048|4499->3103|4528->3104|4577->3125|4606->3126|4656->3148|4685->3149|4738->3174|4805->3213|4834->3214|4881->3233|4910->3234|4956->3252|5012->3280|5041->3281|5090->3302|5130->3315|5145->3321|5183->3338|5257->3384|5286->3385|5339->3410|5417->3460|5446->3461|5504->3491|5533->3492|5586->3517|5653->3556|5682->3557|5729->3576|5758->3577|5794->3586|5823->3587|5907->3643|5936->3644|5981->3661|6069->3721|6098->3722|6137->3733|6207->3775|6236->3776|6285->3797|6482->3966|6511->3967|6556->3984|6637->4037|6666->4038|6724->4068|6753->4069|6830->4117|6860->4118|6890->4119|6948->4150|6963->4156|7005->4177|7085->4229|7114->4230|7163->4251|7211->4271|7240->4272|7293->4297|7635->4611|7664->4612|7713->4633|7745->4637|7774->4638|7826->4662|8119->4927|8148->4928|8194->4946|8223->4947|8273->4969|8302->4970|8355->4995|8703->5314|8733->5315|8770->5324|8799->5325|8830->5328|8859->5329
                  LINES: 25->2|25->2|25->2|26->3|40->17|40->17|40->17|40->17|65->42|65->42|66->43|67->44|67->44|68->45|70->47|70->47|70->47|71->48|71->48|72->49|72->49|72->49|73->50|75->52|75->52|76->53|76->53|76->53|77->54|78->55|78->55|79->56|79->56|79->56|79->56|80->57|81->58|81->58|82->59|82->59|84->61|84->61|84->61|85->62|85->62|85->62|85->62|86->63|86->63|87->64|88->65|88->65|88->65|88->65|89->66|90->67|90->67|91->68|91->68|92->69|92->69|93->70|93->70|94->71|95->72|95->72|96->73|96->73|96->73|97->74|100->77|100->77|101->78|102->79|102->79|102->79|102->79|102->79|102->79|102->79|103->80|103->80|103->80|104->81|104->81|105->82|105->82|105->82|106->83|110->87|110->87|111->88|111->88|111->88|112->89|116->93|116->93|117->94|117->94|117->94|117->94|118->95|123->100|123->100|124->101|124->101|125->102|125->102
                  -- GENERATED --
              */
          