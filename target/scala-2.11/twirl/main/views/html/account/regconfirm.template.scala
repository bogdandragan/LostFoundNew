
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object regconfirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class regconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Регистрация")/*1.21*/ {_display_(Seq[Any](format.raw/*1.23*/("""
    """),format.raw/*2.5*/("""<div class="container" style="margin-top: 70px;">
        <h2>Подтверждение email</h2>
    </div>

    <script>
        $(document).ready(function()"""),format.raw/*7.37*/("""{"""),format.raw/*7.38*/("""
            """),format.raw/*8.13*/("""var email = url('?email');
            var hash = url('?hash');

            var request = """),format.raw/*11.27*/("""{"""),format.raw/*11.28*/(""""action":"checkReg", "params":"""),format.raw/*11.58*/("""{"""),format.raw/*11.59*/(""""email":email, "hash":hash"""),format.raw/*11.85*/("""}"""),format.raw/*11.86*/("""}"""),format.raw/*11.87*/(""";

            $.ajax("""),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
    			"""),format.raw/*14.8*/("""type: "POST",
    			url: """"),_display_(/*15.15*/routes/*15.21*/.Account.checkRegistration()),format.raw/*15.49*/("""",
    			data: JSON.stringify(request),
    			contentType: "application/json; charset=utf-8",
    			success: function(data)"""),format.raw/*18.31*/("""{"""),format.raw/*18.32*/("""

    				"""),format.raw/*20.9*/("""console.log(data);

    			"""),format.raw/*22.8*/("""}"""),format.raw/*22.9*/("""
			"""),format.raw/*23.4*/("""}"""),format.raw/*23.5*/(""");

        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");

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
object regconfirm extends regconfirm_Scope0.regconfirm
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 20:11:14 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/regconfirm.scala.html
                  HASH: 8fcd57c4fe1400bf70033f47d7c2d8d61960a3c8
                  MATRIX: 627->1|654->20|693->22|724->27|899->175|927->176|967->189|1086->280|1115->281|1173->311|1202->312|1256->338|1285->339|1314->340|1364->362|1393->363|1428->371|1483->399|1498->405|1547->433|1701->559|1730->560|1767->570|1821->597|1849->598|1880->602|1908->603|1947->615|1976->616
                  LINES: 25->1|25->1|25->1|26->2|31->7|31->7|32->8|35->11|35->11|35->11|35->11|35->11|35->11|35->11|37->13|37->13|38->14|39->15|39->15|39->15|42->18|42->18|44->20|46->22|46->22|47->23|47->23|49->25|49->25
                  -- GENERATED --
              */
          