
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
                                        <input type="password" placeholder="Пароль" ng-model="password" class="form-control input-lg" required>
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
                    """),format.raw/*95.21*/("""console.log(data);
                 """),format.raw/*96.18*/("""}"""),format.raw/*96.19*/(""");
		    """),format.raw/*97.7*/("""}"""),format.raw/*97.8*/("""
		"""),format.raw/*98.3*/("""}"""),format.raw/*98.4*/(""")
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
                  DATE: Tue Jan 12 00:25:58 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/register.scala.html
                  HASH: 93807bf3ceddba482eab773090d9fe9f8cb4ae2d
                  MATRIX: 623->2|650->21|689->23|724->32|2995->2275|3024->2276|3070->2294|3130->2326|3159->2327|3208->2348|3349->2462|3364->2468|3408->2491|3482->2537|3511->2538|3564->2563|3612->2583|3641->2584|3698->2613|3877->2765|3906->2766|3959->2791|3991->2795|4020->2796|4077->2825|4160->2880|4189->2881|4238->2902|4267->2903|4317->2925|4346->2926|4399->2951|4466->2990|4495->2991|4542->3010|4571->3011|4617->3029|4673->3057|4702->3058|4751->3079|4791->3092|4806->3098|4844->3115|4918->3161|4947->3162|5000->3187|5078->3237|5107->3238|5165->3268|5194->3269|5247->3294|5314->3333|5343->3334|5390->3353|5419->3354|5455->3363|5484->3364|5568->3420|5597->3421|5632->3429|5690->3459|5719->3460|5758->3471|5828->3513|5857->3514|5906->3535|6103->3704|6132->3705|6177->3722|6280->3797|6309->3798|6367->3828|6396->3829|6473->3877|6503->3878|6533->3879|6591->3910|6606->3916|6648->3937|6728->3989|6757->3990|6806->4011|6854->4031|6883->4032|6936->4057|7300->4393|7329->4394|7378->4415|7410->4419|7439->4420|7491->4444|7806->4731|7835->4732|7881->4750|7910->4751|7960->4773|7989->4774|8038->4795|8102->4831|8131->4832|8167->4841|8195->4842|8225->4845|8253->4846
                  LINES: 25->2|25->2|25->2|26->3|65->42|65->42|67->44|67->44|67->44|68->45|70->47|70->47|70->47|71->48|71->48|72->49|72->49|72->49|73->50|75->52|75->52|76->53|76->53|76->53|77->54|78->55|78->55|79->56|79->56|79->56|79->56|80->57|81->58|81->58|82->59|82->59|84->61|84->61|84->61|85->62|85->62|85->62|85->62|86->63|86->63|87->64|88->65|88->65|88->65|88->65|89->66|90->67|90->67|91->68|91->68|92->69|92->69|93->70|93->70|95->72|95->72|95->72|96->73|96->73|96->73|97->74|100->77|100->77|101->78|102->79|102->79|102->79|102->79|102->79|102->79|102->79|103->80|103->80|103->80|104->81|104->81|105->82|105->82|105->82|106->83|110->87|110->87|111->88|111->88|111->88|112->89|116->93|116->93|117->94|117->94|117->94|117->94|118->95|119->96|119->96|120->97|120->97|121->98|121->98
                  -- GENERATED --
              */
          