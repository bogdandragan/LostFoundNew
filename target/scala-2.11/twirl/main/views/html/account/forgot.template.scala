
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forgot_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class forgot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Восстановление пароля")/*1.31*/ {_display_(Seq[Any](format.raw/*1.33*/("""

    """),format.raw/*3.5*/("""<div class="container" style="margin-top: 70px;">
        <div class="well col-md-4">
            <form id="forgot">
                <fieldset>
                    <legend>Восстановление пароля</legend>
                    <div class="form-group">
                        <label for="email">Email-адрес</label>
                        <input type="email" class="form-control" name="email" id="email" placeholder="Email-адрес">
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
        $( "#forgot" ).submit(function(event) """),format.raw/*24.47*/("""{"""),format.raw/*24.48*/("""
    		"""),format.raw/*25.7*/("""event.preventDefault();
    		var request = """),format.raw/*26.21*/("""{"""),format.raw/*26.22*/(""""action":"forgot", "params":"""),format.raw/*26.50*/("""{"""),format.raw/*26.51*/(""""email":$("#email").val()"""),format.raw/*26.76*/("""}"""),format.raw/*26.77*/("""}"""),format.raw/*26.78*/(""";

    		$.ajax("""),format.raw/*28.14*/("""{"""),format.raw/*28.15*/("""
    			"""),format.raw/*29.8*/("""type: "POST",
    			url: """"),_display_(/*30.15*/routes/*30.21*/.Account.doForgot()),format.raw/*30.40*/("""",
    			data: JSON.stringify(request),
    			contentType: "application/json; charset=utf-8",
    			success: function(data)"""),format.raw/*33.31*/("""{"""),format.raw/*33.32*/("""
                    """),format.raw/*34.21*/("""if(data.error == "")"""),format.raw/*34.41*/("""{"""),format.raw/*34.42*/("""
                       """),format.raw/*35.24*/("""$("#error").text("Проверьте Ваш е-mail");
                       $("#error").addClass('alert-success').removeClass('alert-danger').delay(3000).fadeOut("slow");
                       $("#error").css("display","block");
                    """),format.raw/*38.21*/("""}"""),format.raw/*38.22*/("""
                    """),format.raw/*39.21*/("""else"""),format.raw/*39.25*/("""{"""),format.raw/*39.26*/("""
                       """),format.raw/*40.24*/("""$("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*43.21*/("""}"""),format.raw/*43.22*/("""
    				"""),format.raw/*44.9*/("""console.log(data);

    			"""),format.raw/*46.8*/("""}"""),format.raw/*46.9*/("""
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/(""");
		"""),format.raw/*48.3*/("""}"""),format.raw/*48.4*/(""");
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
object forgot extends forgot_Scope0.forgot
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 22:26:20 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/forgot.scala.html
                  HASH: cfbaf2b74494d64033695d91ed8c23f283e2e6d1
                  MATRIX: 619->1|656->30|695->32|727->38|1624->907|1653->908|1687->915|1759->959|1788->960|1844->988|1873->989|1926->1014|1955->1015|1984->1016|2028->1032|2057->1033|2092->1041|2147->1069|2162->1075|2202->1094|2356->1220|2385->1221|2434->1242|2482->1262|2511->1263|2563->1287|2830->1526|2859->1527|2908->1548|2940->1552|2969->1553|3021->1577|3266->1794|3295->1795|3331->1804|3385->1831|3413->1832|3444->1836|3472->1837|3504->1842|3532->1843
                  LINES: 25->1|25->1|25->1|27->3|48->24|48->24|49->25|50->26|50->26|50->26|50->26|50->26|50->26|50->26|52->28|52->28|53->29|54->30|54->30|54->30|57->33|57->33|58->34|58->34|58->34|59->35|62->38|62->38|63->39|63->39|63->39|64->40|67->43|67->43|68->44|70->46|70->46|71->47|71->47|72->48|72->48
                  -- GENERATED --
              */
          