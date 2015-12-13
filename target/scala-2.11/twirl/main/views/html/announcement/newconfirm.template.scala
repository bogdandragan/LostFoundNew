
package views.html.announcement

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newconfirm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Новое обьявление")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""

    """),format.raw/*3.5*/("""<div class="container" style="margin-top: 70px;">
        <h2>Обьявление опубликовано</h2>
        <a href="/">На главную</a>
    </div>

    <script>
       $.ajax("""),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
            """),format.raw/*10.13*/("""type: 'POST',
            url: '"""),_display_(/*11.20*/routes/*11.26*/.Account.checkSession()),format.raw/*11.49*/("""',
            success: function(data)"""),format.raw/*12.36*/("""{"""),format.raw/*12.37*/("""

                """),format.raw/*14.17*/("""if(data.error == "")"""),format.raw/*14.37*/("""{"""),format.raw/*14.38*/("""
                    """),format.raw/*15.21*/("""var name = data.email.substring(0, data.email.lastIndexOf("@"));

                    var menu = "<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>"+name+"<span class='caret'></span></a>"+
                                "<ul class='dropdown-menu' role='menu'>"+
                                "<li><a href='/account'>Профиль</a></li>"+
                                "<li><a href='#'>Another action</a></li>"+
                                "<li class='divider'></li>"+
                                "<li id='signOut'><a href='#'>Выход</a></li>"+
                                "</ul>";
                    $("#profile-link").html(menu);

                """),format.raw/*26.17*/("""}"""),format.raw/*26.18*/("""else"""),format.raw/*26.22*/("""{"""),format.raw/*26.23*/("""
                     """),format.raw/*27.22*/("""$("#profile-link").html("<a href='/account/signin'>Профиль</a></li>");
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""");
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
object newconfirm extends newconfirm_Scope0.newconfirm
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 23:09:06 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newconfirm.scala.html
                  HASH: 7a3c818c6d512a7176b26911924d39bb9d986620
                  MATRIX: 632->1|664->25|703->27|735->33|927->198|955->199|996->212|1056->245|1071->251|1115->274|1181->312|1210->313|1256->331|1304->351|1333->352|1382->373|2118->1082|2147->1083|2179->1087|2208->1088|2258->1110|2373->1197|2402->1198|2443->1211|2472->1212|2508->1221|2537->1222
                  LINES: 25->1|25->1|25->1|27->3|33->9|33->9|34->10|35->11|35->11|35->11|36->12|36->12|38->14|38->14|38->14|39->15|50->26|50->26|50->26|50->26|51->27|52->28|52->28|53->29|53->29|54->30|54->30
                  -- GENERATED --
              */
          