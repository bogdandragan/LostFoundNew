
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*9.103*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.11.1.min.js")),format.raw/*10.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/angular.js")),format.raw/*12.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/js.cookie.js")),format.raw/*13.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/url.min.js")),format.raw/*14.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/ui-bootstrap-custom-tpls-0.13.3.min.js")),format.raw/*15.93*/("""" type="text/javascript"></script>

    </head>
    <body ng-app="lostfoundApp">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">Lost Found</a>
                </div>

                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <a href="/announcement/new" class="btn btn-warning" style="margin-top: 5px;">Подать объявление</a>
                        <li class="dropdown" id="profile-link"><a href="/account/signin"></a></li>
                    </ul>
                </div>
            </div>
        </nav>
        """),_display_(/*33.10*/content),format.raw/*33.17*/("""
    """),format.raw/*34.5*/("""</body>

    <script>
        $(document).on('click', '#signOut', function()"""),format.raw/*37.55*/("""{"""),format.raw/*37.56*/("""

            """),format.raw/*39.13*/("""$.ajax("""),format.raw/*39.20*/("""{"""),format.raw/*39.21*/("""
            """),format.raw/*40.13*/("""type: 'POST',
            url: '/account/logout',
            success: function(data)"""),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
                """),format.raw/*43.17*/("""window.location.replace("/");
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/(""");

        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/(""");
    </script>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 22:10:19 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/main.scala.html
                  HASH: 0add6ab6060547bb0b96b909c88d77ea27436507
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|873->151|887->157|941->191|1023->247|1037->253|1101->296|1153->321|1168->327|1235->373|1319->430|1334->436|1397->478|1481->535|1496->541|1553->577|1637->634|1652->640|1711->678|1795->735|1810->741|1867->777|1951->834|1966->840|2051->904|2822->1648|2850->1655|2882->1660|2986->1736|3015->1737|3057->1751|3092->1758|3121->1759|3162->1772|3275->1857|3304->1858|3349->1875|3419->1917|3448->1918|3484->1927|3513->1928|3552->1940|3581->1941
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|57->33|57->33|58->34|61->37|61->37|63->39|63->39|63->39|64->40|66->42|66->42|67->43|68->44|68->44|69->45|69->45|71->47|71->47
                  -- GENERATED --
              */
          