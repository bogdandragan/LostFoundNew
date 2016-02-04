
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

<html ng-app="lostfoundApp">
    <head>
        <title ng-bind="$root.title + 'Поиск потерянных вещей. Онлайн бюро находок Украина'">"""),_display_(/*7.95*/title),format.raw/*7.100*/("""</title>
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
        <meta property="og:image" content="https://www.znahidka.pp.ua/assets/images/fblogo.png"/>
        <meta property="og:title" content="Поиск потерянных вещей. Бюро находок Украина" />
        <meta property="og:description"  content="Онлайн сервис по поиску потерянных и найденных вещей, людей и животных в Украине" />
        <meta name="google-site-verification" content="g3DQLjKy2t65TG7ujtHnszA8HOOyRGSsHKujp23K6qg" />
        <meta name='yandex-verification' content='4688f59d7850b7e0' />
        <meta name="description" content="Онлайн сервис по поиску потерянных и найденных вещей, документов, людей и животных в Украине" />
        <meta name="keywords" content="пропала собака, сайт находок, бюро находок, сайт потерянных вещей, бюро находок Украина, сайт потерянных вещей Украина, потерял паспорт, потерял ключи, потерянные документы, потерял документы что делать, найдена собака, пропала кошка, пропал кот, пропала найдена кошка, пропал человек, пропал подросток, пропал ребенок, пропала девушка, пропал мужчина, пропали документы, жди меня, нашлась кошка, найдена кошка, нашлась собака, найдена собака, найдены документы, найден человек, утеряны документы на машину, сайт пошуку людей, стол находок, объявления о пропаже собак, объявления о пропаже кошек, объявления о пропаже людей, объявления о пропаже документов, объявления о пропаже животных, объявления о найденных животных, объявления о найденных людях, объявления о найденных вещах, объявления о найденных документах, потерял документы" />
    </head>
    <body>
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
                                <a class="dropdown-toggle" href="#" data-toggle="dropdown"><strong class="caret"></strong>&nbsp;<b>"""),format.raw/*50.132*/("""{"""),format.raw/*50.133*/("""{"""),format.raw/*50.134*/("""this.profile"""),format.raw/*50.146*/("""}"""),format.raw/*50.147*/("""}"""),format.raw/*50.148*/("""</b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="/account">Мой профиль</a></li>
                                    <li><a href="/account/announcements">Обьявления</a></li>
                                    <li><a href="" ng-click="doLogout()">Выход</a></li>
                                </ul>
                            </li>
                            <li class="new-ads"><a href="/announcement/new" class="btn btn-ads btn-block"><i class="fa fa-plus"></i> Подать обьявление</a></li>
                        </ul>
                    </div>
                </div>
            </header>
                """),_display_(/*62.18*/content),format.raw/*62.25*/("""
            """),format.raw/*63.13*/("""<div class="footer">
                <div class="container">
                    <ul class="pull-left footer-menu">
                        <li>
                            <!--<a href="/"> Главная </a>-->
                            <a href="/about"> О проекте </a>
                            <a href="/contact"> Контакты </a>
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
          (function(i,s,o,g,r,a,m)"""),format.raw/*81.35*/("""{"""),format.raw/*81.36*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*81.86*/("""{"""),format.raw/*81.87*/("""
  """),format.raw/*82.3*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*82.38*/("""}"""),format.raw/*82.39*/(""",i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  """),format.raw/*84.3*/("""}"""),format.raw/*84.4*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-72921718-1', 'auto');
  ga('send', 'pageview');
    </script>

        <!-- Yandex.Metrika counter -->
    <script type="text/javascript">
    (function (d, w, c) """),format.raw/*92.25*/("""{"""),format.raw/*92.26*/(""" """),format.raw/*92.27*/("""(w[c] = w[c] || []).push(function()
    """),format.raw/*93.5*/("""{"""),format.raw/*93.6*/(""" """),format.raw/*93.7*/("""try """),format.raw/*93.11*/("""{"""),format.raw/*93.12*/(""" """),format.raw/*93.13*/("""w.yaCounter35041265 = new Ya.Metrika("""),format.raw/*93.50*/("""{"""),format.raw/*93.51*/(""" """),format.raw/*93.52*/("""id:35041265, clickmap:true, trackLinks:true, accurateTrackBounce:true """),format.raw/*93.122*/("""}"""),format.raw/*93.123*/("""); """),format.raw/*93.126*/("""}"""),format.raw/*93.127*/("""
     """),format.raw/*94.6*/("""catch(e) """),format.raw/*94.15*/("""{"""),format.raw/*94.16*/(""" """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/(""" """),format.raw/*94.19*/("""}"""),format.raw/*94.20*/("""); var n = d.getElementsByTagName("script")[0], s = d.createElement("script"), f = function ()
     """),format.raw/*95.6*/("""{"""),format.raw/*95.7*/(""" """),format.raw/*95.8*/("""n.parentNode.insertBefore(s, n); """),format.raw/*95.41*/("""}"""),format.raw/*95.42*/("""; s.type = "text/javascript"; s.async = true; s.src = "https://mc.yandex.ru/metrika/watch.js";
     if (w.opera == "[object Opera]") """),format.raw/*96.39*/("""{"""),format.raw/*96.40*/(""" """),format.raw/*96.41*/("""d.addEventListener("DOMContentLoaded", f, false); """),format.raw/*96.91*/("""}"""),format.raw/*96.92*/("""
     """),format.raw/*97.6*/("""else """),format.raw/*97.11*/("""{"""),format.raw/*97.12*/(""" """),format.raw/*97.13*/("""f(); """),format.raw/*97.18*/("""}"""),format.raw/*97.19*/(""" """),format.raw/*97.20*/("""}"""),format.raw/*97.21*/(""")(document, window, "yandex_metrika_callbacks"); </script>
    <noscript>
        <div>
            <img src="https://mc.yandex.ru/watch/35041265" style="position:absolute; left:-9999px;" alt="" />
        </div>
    </noscript>
        <!-- /Yandex.Metrika counter -->
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
                  DATE: Tue Feb 02 21:11:51 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/main.scala.html
                  HASH: 58089826bdf04141b5f5d51d494533bc0202624d
                  MATRIX: 530->1|655->31|683->33|860->184|886->189|974->251|988->257|1068->316|1150->372|1164->378|1228->421|1311->477|1326->483|1383->519|1451->560|1466->566|1538->617|1606->658|1621->664|1690->712|1761->756|1776->762|1830->795|1883->821|1898->827|1971->879|2055->936|2070->942|2137->988|2221->1045|2236->1051|2299->1093|2383->1150|2398->1156|2455->1192|2543->1253|2558->1259|2617->1297|2705->1358|2720->1364|2777->1400|2861->1457|2876->1463|2961->1527|3045->1584|3060->1590|3135->1644|6081->4561|6111->4562|6141->4563|6182->4575|6212->4576|6242->4577|6949->5257|6977->5264|7018->5277|7692->5923|7721->5924|7799->5974|7828->5975|7858->5978|7921->6013|7950->6014|8104->6141|8132->6142|8419->6401|8448->6402|8477->6403|8544->6443|8572->6444|8600->6445|8632->6449|8661->6450|8690->6451|8755->6488|8784->6489|8813->6490|8912->6560|8942->6561|8974->6564|9004->6565|9037->6571|9074->6580|9103->6581|9132->6582|9161->6583|9190->6584|9219->6585|9346->6685|9374->6686|9402->6687|9463->6720|9492->6721|9653->6854|9682->6855|9711->6856|9789->6906|9818->6907|9851->6913|9884->6918|9913->6919|9942->6920|9975->6925|10004->6926|10033->6927|10062->6928
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|74->50|74->50|74->50|74->50|74->50|74->50|86->62|86->62|87->63|105->81|105->81|105->81|105->81|106->82|106->82|106->82|108->84|108->84|116->92|116->92|116->92|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|117->93|118->94|118->94|118->94|118->94|118->94|118->94|118->94|119->95|119->95|119->95|119->95|119->95|120->96|120->96|120->96|120->96|120->96|121->97|121->97|121->97|121->97|121->97|121->97|121->97|121->97
                  -- GENERATED --
              */
          