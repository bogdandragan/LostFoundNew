
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



    """),format.raw/*6.5*/("""<div class="container" style="margin-top: 70px;">
        <div class="well col-md-4">
            <form id="register">
                <fieldset>
                    <legend>Создать учетную запись</legend>
                    <div class="form-group">
                        <input type="text" class="form-control" id="email" placeholder="Email-адрес" required>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" placeholder="Пароль" required>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="confpassword" placeholder="Повторите пароль" required>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary" style="width: 100%;">Отправить</button>
                    </div>
                </fieldset>
            </form>
            <div class="alert alert-danger" id="error" style="display: none;">

            </div>
        </div>
    </div>

    <script>
        $( "#register" ).submit(function(event) """),format.raw/*32.49*/("""{"""),format.raw/*32.50*/("""
    		"""),format.raw/*33.7*/("""event.preventDefault();
    		var request = """),format.raw/*34.21*/("""{"""),format.raw/*34.22*/(""""action":"register", "params":"""),format.raw/*34.52*/("""{"""),format.raw/*34.53*/(""""email":$("#email").val(), "password":$("#password").val()"""),format.raw/*34.111*/("""}"""),format.raw/*34.112*/("""}"""),format.raw/*34.113*/(""";

            if($("#password").val() != $("#confpassword").val())"""),format.raw/*36.65*/("""{"""),format.raw/*36.66*/("""
                """),format.raw/*37.17*/("""$("#error").text("Пароли не совпадают").delay(3000).fadeOut("slow");;
                $("#error").css("display","block");
                return;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
    		"""),format.raw/*41.7*/("""$.ajax("""),format.raw/*41.14*/("""{"""),format.raw/*41.15*/("""
    			"""),format.raw/*42.8*/("""type: "POST",
    			url: """"),_display_(/*43.15*/routes/*43.21*/.Account.doRegister()),format.raw/*43.42*/("""",
    			data: JSON.stringify(request),
    			contentType: "application/json; charset=utf-8",
    			success: function(data)"""),format.raw/*46.31*/("""{"""),format.raw/*46.32*/("""

    				"""),format.raw/*48.9*/("""console.log(data);
    				if(data.error == "")"""),format.raw/*49.29*/("""{"""),format.raw/*49.30*/("""
                       """),format.raw/*50.24*/("""$("#error").text("Проверте Ваш е-mail для завершения регистрации");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
    				"""),format.raw/*53.9*/("""}"""),format.raw/*53.10*/("""
    				"""),format.raw/*54.9*/("""else"""),format.raw/*54.13*/("""{"""),format.raw/*54.14*/("""
    				    """),format.raw/*55.13*/("""$("#error").text(data.error);
    				     $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
    				"""),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""

    			"""),format.raw/*60.8*/("""}"""),format.raw/*60.9*/("""
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/(""");
		"""),format.raw/*62.3*/("""}"""),format.raw/*62.4*/(""");
		angular.module('lostfoundApp', ['ui.bootstrap'])
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
                  DATE: Sat Sep 05 22:33:12 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/register.scala.html
                  HASH: 6c1337db66dc5a4337c6574de2fb6fa353851238
                  MATRIX: 623->2|650->21|689->23|723->31|1941->1221|1970->1222|2004->1229|2076->1273|2105->1274|2163->1304|2192->1305|2279->1363|2309->1364|2339->1365|2434->1432|2463->1433|2508->1450|2694->1608|2723->1609|2757->1616|2792->1623|2821->1624|2856->1632|2911->1660|2926->1666|2968->1687|3122->1813|3151->1814|3188->1824|3263->1871|3292->1872|3344->1896|3625->2150|3654->2151|3690->2160|3722->2164|3751->2165|3792->2178|4025->2384|4054->2385|4090->2394|4118->2395|4149->2399|4177->2400|4209->2405|4237->2406
                  LINES: 25->2|25->2|25->2|29->6|55->32|55->32|56->33|57->34|57->34|57->34|57->34|57->34|57->34|57->34|59->36|59->36|60->37|63->40|63->40|64->41|64->41|64->41|65->42|66->43|66->43|66->43|69->46|69->46|71->48|72->49|72->49|73->50|76->53|76->53|77->54|77->54|77->54|78->55|81->58|81->58|83->60|83->60|84->61|84->61|85->62|85->62
                  -- GENERATED --
              */
          