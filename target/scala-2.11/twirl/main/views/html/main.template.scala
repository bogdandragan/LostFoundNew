
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
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("plugins/font-awesome/css/font-awesome.min.css")),format.raw/*8.119*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*9.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("stylesheets/style1.css")),format.raw/*10.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*11.39*/routes/*11.45*/.Assets.at("plugins/owl-carousel/owl.carousel.css")),format.raw/*11.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("plugins/owl-carousel/owl.theme.css")),format.raw/*12.93*/("""">
        <link rel="shortcut icon" href=""""),_display_(/*13.42*/routes/*13.48*/.Assets.at("images/mainlogo.png")),format.raw/*13.81*/("""">

        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("javascripts/moment-with-locales.min.js")),format.raw/*15.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/jquery-1.11.1.min.js")),format.raw/*16.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*17.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/angular.js")),format.raw/*18.65*/("""" type="text/javascript"></script>
       <!-- <script src=""""),_display_(/*19.27*/routes/*19.33*/.Assets.at("javascripts/js.cookie.js")),format.raw/*19.71*/("""" type="text/javascript"></script> -->
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.at("javascripts/url.min.js")),format.raw/*20.65*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.at("javascripts/ui-bootstrap-custom-tpls-0.13.3.min.js")),format.raw/*21.93*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("javascripts/angular-base64-upload.min.js")),format.raw/*22.83*/("""" type="text/javascript"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    </head>
    <body ng-app="lostfoundApp">
        <div class="wrapper" ng-controller="mainCtrl" ng-init="checkSession()">
            <header  class="navbar navbar-default navbar-fixed-top navbar-top">
                <div class="container">
                    <div class="navbar-header">
                        <button data-target=".navbar-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="/" class="navbar-brand main-logo"></a>
                    </div>

                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right" ng-cloak>
                            <li ng-show="showProfileLink" style="margin-top: 5px;"><a href="/account" style="font-weight: 600;">Профиль</a></li>
                            <li ng-show="showUserMenu" class="dropdown" style="margin-top: 5px;">
                                <a class="dropdown-toggle" href="#" data-toggle="dropdown"><strong class="caret"></strong>&nbsp;<b>"""),format.raw/*44.132*/("""{"""),format.raw/*44.133*/("""{"""),format.raw/*44.134*/("""this.profile"""),format.raw/*44.146*/("""}"""),format.raw/*44.147*/("""}"""),format.raw/*44.148*/("""</b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="/account/announcements">Обьявления</a></li>
                                    <li><a href="/account">Настройки</a></li>
                                    <li><a href="" ng-click="doLogout()">Выход</a></li>
                                </ul>
                            </li>
                            <li class="new-ads"><a href="/announcement/new" class="btn btn-ads btn-block"><i class="fa fa-plus"></i> Подать обьявление</a></li>
                        </ul>
                    </div>
                </div>
            </header>
                """),_display_(/*56.18*/content),format.raw/*56.25*/("""
            """),format.raw/*57.13*/("""<div class="footer">
                <div class="container">
                    <ul class="pull-left footer-menu">
                        <li>
                            <a href="/"> Главная </a>
                            <a href="/about"> О нас </a>
                            <a href="/contact"> Связаться </a>
                        </li>
                    </ul>
                    <ul class="pull-right footer-menu">
                        <li> &copy; 2016 ZNAHIDKA.PP.UA </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>

    <script>

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
                  DATE: Sat Jan 16 20:41:58 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/main.scala.html
                  HASH: 62afe9198bbcac72e42fbe03b5d75623965a9e11
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|873->151|887->157|967->216|1049->272|1063->278|1127->321|1210->377|1225->383|1282->419|1350->460|1365->466|1437->517|1505->558|1520->564|1589->612|1660->656|1675->662|1729->695|1782->721|1797->727|1870->779|1954->836|1969->842|2036->888|2120->945|2135->951|2198->993|2282->1050|2297->1056|2354->1092|2442->1153|2457->1159|2516->1197|2604->1258|2619->1264|2676->1300|2760->1357|2775->1363|2860->1427|2944->1484|2959->1490|3034->1544|4487->2968|4517->2969|4547->2970|4588->2982|4618->2983|4648->2984|5353->3662|5381->3669|5422->3682
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|68->44|68->44|68->44|68->44|68->44|68->44|80->56|80->56|81->57
                  -- GENERATED --
              */
          