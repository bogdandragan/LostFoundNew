
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object account_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class account extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Профиль")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""

    """),format.raw/*4.5*/("""<div class="container" style="margin-top: 70px;">
        <h1>Профиль</h1>
    </div>

    <script>
        $.ajax("""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
            """),format.raw/*10.13*/("""type: 'POST',
            url: '"""),_display_(/*11.20*/routes/*11.26*/.Account.checkSession()),format.raw/*11.49*/("""',
            success: function(data)"""),format.raw/*12.36*/("""{"""),format.raw/*12.37*/("""
                """),format.raw/*13.17*/("""if(data.error == "")"""),format.raw/*13.37*/("""{"""),format.raw/*13.38*/("""
                    """),format.raw/*14.21*/("""var name = data.email.substring(0, data.email.lastIndexOf("@"));
                    var menu = "<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>"+name+"<span class='caret'></span></a>"+
                                "<ul class='dropdown-menu' role='menu'>"+
                                "<li><a href='/account'>Профиль</a></li>"+
                                "<li><a href='#'>Another action</a></li>"+
                                "<li class='divider'></li>"+
                                "<li id='signOut'><a href='#'>Выход</a></li>"+
                                "</ul>";
                    $("#profile-link").html(menu);

                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""else"""),format.raw/*24.22*/("""{"""),format.raw/*24.23*/("""
                     """),format.raw/*25.22*/("""$("#profile-link").html("<a href='/account/signin'>Профиль</a></li>");
                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");
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
object account extends account_Scope0.account
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 20:11:15 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/account.scala.html
                  HASH: 4251f9aea2372682e7141eaa941de8529486240d
                  MATRIX: 621->2|644->17|683->19|715->25|857->140|885->141|926->154|986->187|1001->193|1045->216|1111->254|1140->255|1185->272|1233->292|1262->293|1311->314|2046->1022|2075->1023|2107->1027|2136->1028|2186->1050|2301->1137|2330->1138|2371->1151|2400->1152|2436->1161|2465->1162
                  LINES: 25->2|25->2|25->2|27->4|32->9|32->9|33->10|34->11|34->11|34->11|35->12|35->12|36->13|36->13|36->13|37->14|47->24|47->24|47->24|47->24|48->25|49->26|49->26|50->27|50->27|51->28|51->28
                  -- GENERATED --
              */
          