
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


Seq[Any](_display_(/*1.2*/main("Новый пароль - Поиск потерянных вещей. Бюро находок Украина")/*1.69*/ {_display_(Seq[Any](format.raw/*1.71*/("""
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
		.controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*38.73*/("""{"""),format.raw/*38.74*/("""
                """),format.raw/*39.17*/("""$rootScope.title = "Новый пароль - ";
                $scope.checkSession = function()"""),format.raw/*40.49*/("""{"""),format.raw/*40.50*/("""
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
                  DATE: Tue Jan 26 20:34:30 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/newpassword.scala.html
                  HASH: 5775532f4832efd41bc2e78797a6b31ab267bd24
                  MATRIX: 629->1|704->68|743->70|778->79|1557->829|1587->830|1618->832|1648->833|2981->2138|3010->2139|3055->2156|3169->2242|3198->2243|3247->2264|3388->2378|3403->2384|3447->2407|3521->2453|3550->2454|3603->2479|3651->2499|3680->2500|3737->2529|3916->2681|3945->2682|3998->2707|4030->2711|4059->2712|4116->2741|4199->2796|4228->2797|4277->2818|4306->2819|4356->2841|4385->2842|4438->2867|4505->2906|4534->2907|4581->2926|4610->2927|4656->2945|4712->2973|4741->2974|4790->2995|4830->3008|4845->3014|4883->3031|4957->3077|4986->3078|5039->3103|5117->3153|5146->3154|5204->3184|5233->3185|5286->3210|5353->3249|5382->3250|5429->3269|5458->3270|5494->3279|5523->3280|5610->3339|5639->3340|5674->3348|5735->3381|5764->3382|5803->3393|5873->3435|5902->3436|5951->3457|6148->3626|6177->3627|6223->3645|6343->3737|6372->3738|6433->3771|6462->3772|6548->3829|6578->3830|6608->3831|6667->3863|6682->3869|6727->3893|6807->3945|6836->3946|6885->3967|6933->3987|6962->3988|7015->4013|7107->4077|7136->4078|7185->4099|7217->4103|7246->4104|7298->4128|7543->4345|7572->4346|7618->4364|7647->4365|7697->4387|7726->4388|7775->4409|7839->4445|7868->4446|7904->4455|7932->4456|7962->4459|7990->4460|8037->4477
                  LINES: 25->1|25->1|25->1|26->2|37->13|37->13|37->13|37->13|62->38|62->38|63->39|64->40|64->40|65->41|67->43|67->43|67->43|68->44|68->44|69->45|69->45|69->45|70->46|72->48|72->48|73->49|73->49|73->49|74->50|75->51|75->51|76->52|76->52|76->52|76->52|77->53|78->54|78->54|79->55|79->55|81->57|81->57|81->57|82->58|82->58|82->58|82->58|83->59|83->59|84->60|85->61|85->61|85->61|85->61|86->62|87->63|87->63|88->64|88->64|89->65|89->65|90->66|90->66|92->68|92->68|92->68|93->69|93->69|93->69|94->70|97->73|97->73|99->75|101->77|101->77|101->77|101->77|101->77|101->77|101->77|103->79|103->79|103->79|104->80|104->80|105->81|105->81|105->81|106->82|107->83|107->83|108->84|108->84|108->84|109->85|112->88|112->88|113->89|113->89|113->89|113->89|114->90|115->91|115->91|116->92|116->92|117->93|117->93|119->95
                  -- GENERATED --
              */
          