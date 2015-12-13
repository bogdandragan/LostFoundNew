
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Вход")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""

    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 70px;">
        <div class="well col-md-4" style="margin: 0 auto; float: none;">
            <form id="login">
                <fieldset>
                    <legend>Войти</legend>
                    <div class="form-group">
                        <input type="email" class="form-control" id="email" placeholder="Email-адрес" required>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" placeholder="Пароль" required>
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary" style="width: 100%">Войти</button>
                    </div>
                    <div style="float: left;">
                        <a href="/account/signin/forgot">Забыли пароль?</a>
                    </div>
                    <div style="float : right;">
                        <a href="/account/register">Регистрация</a>
                    </div>
                </fieldset>
            </form>
            <div class="alert alert-danger" id="error" style="display: none;">

            </div>
        </div>
    </div>

    <script>
        $( "#login" ).submit(function(event) """),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""
    		"""),format.raw/*34.7*/("""event.preventDefault();
    		var request = """),format.raw/*35.21*/("""{"""),format.raw/*35.22*/(""""action":"login", "params":"""),format.raw/*35.49*/("""{"""),format.raw/*35.50*/(""""email":$("#email").val(), "password":$("#password").val()"""),format.raw/*35.108*/("""}"""),format.raw/*35.109*/("""}"""),format.raw/*35.110*/(""";

    		$.ajax("""),format.raw/*37.14*/("""{"""),format.raw/*37.15*/("""
    			"""),format.raw/*38.8*/("""type: "POST",
    			url: """"),_display_(/*39.15*/routes/*39.21*/.Account.doSignin()),format.raw/*39.40*/("""",
    			data: JSON.stringify(request),
    			contentType: "application/json; charset=utf-8",
    			success: function(data)"""),format.raw/*42.31*/("""{"""),format.raw/*42.32*/("""
    			    """),format.raw/*43.12*/("""if(data.error == "")"""),format.raw/*43.32*/("""{"""),format.raw/*43.33*/("""
    			        """),format.raw/*44.16*/("""window.location.replace("/account");
    			    """),format.raw/*45.12*/("""}"""),format.raw/*45.13*/("""
    			    """),format.raw/*46.12*/("""else"""),format.raw/*46.16*/("""{"""),format.raw/*46.17*/("""
    			       """),format.raw/*47.15*/("""$("#error").text("Пользователь не найден");
                       $("#error").addClass('alert-danger').delay(3000).fadeOut("slow");
                       $("#error").css("""),format.raw/*49.40*/("""{"""),format.raw/*49.41*/(""""display": "block", "text-align": "center" """),format.raw/*49.84*/("""}"""),format.raw/*49.85*/(""");
    			    """),format.raw/*50.12*/("""}"""),format.raw/*50.13*/("""
    				"""),format.raw/*51.9*/("""console.log(data);
    			"""),format.raw/*52.8*/("""}"""),format.raw/*52.9*/("""
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""");
		"""),format.raw/*54.3*/("""}"""),format.raw/*54.4*/(""");

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
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 14:50:46 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/signin.scala.html
                  HASH: c90e29ad72ee5597fcb37c118d4ba9b9a974fd7f
                  MATRIX: 619->2|639->14|678->16|710->22|2033->1317|2062->1318|2096->1325|2168->1369|2197->1370|2252->1397|2281->1398|2368->1456|2398->1457|2428->1458|2472->1474|2501->1475|2536->1483|2591->1511|2606->1517|2646->1536|2800->1662|2829->1663|2869->1675|2917->1695|2946->1696|2990->1712|3066->1760|3095->1761|3135->1773|3167->1777|3196->1778|3239->1793|3439->1965|3468->1966|3539->2009|3568->2010|3610->2024|3639->2025|3675->2034|3728->2060|3756->2061|3787->2065|3815->2066|3847->2071|3875->2072
                  LINES: 25->2|25->2|25->2|27->4|56->33|56->33|57->34|58->35|58->35|58->35|58->35|58->35|58->35|58->35|60->37|60->37|61->38|62->39|62->39|62->39|65->42|65->42|66->43|66->43|66->43|67->44|68->45|68->45|69->46|69->46|69->46|70->47|72->49|72->49|72->49|72->49|73->50|73->50|74->51|75->52|75->52|76->53|76->53|77->54|77->54
                  -- GENERATED --
              */
          