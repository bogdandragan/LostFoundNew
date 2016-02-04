
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Поиск потерянных вещей. Бюро находок Украина")/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
    """),format.raw/*3.5*/("""<div id="fb-root"></div>
    <script>
    (function(d, s, id) """),format.raw/*5.25*/("""{"""),format.raw/*5.26*/("""
        """),format.raw/*6.9*/("""var js, fjs = d.getElementsByTagName(s)[0];
            if (d.getElementById(id)) return;
            js = d.createElement(s); js.id = id;
            js.src = "//connect.facebook.net/ru_RU/sdk.js#xfbml=1&version=v2.5";
            fjs.parentNode.insertBefore(js, fjs);
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""(document, 'script', 'facebook-jssdk'));
    </script>
<section ng-controller="indexCtrl">
        <section class="hero">
            <div class="container text-center">
                <h2 class="hero-title">Поиск потерянных вещей по всей Украине</h2>
                <p class="hero-description hidden-xs">Онлайн сервис по поиску потерянных и найденных вещей, документов, людей и животных в Украине</p>
                <div class="row hero-search-box">
                    <form ng-submit="search()">
                        <div class="col-md-4 col-sm-4 search-input">
                            <input type="text" ng-model="key" class="form-control input-lg search-first" id="searchkey" placeholder="Ключевое слово">
                        </div>
                        <div class="col-md-3 col-sm-3 search-input">
                            <input id="citysel" ng-model="selectedAddr" ng-change="cityInput()" type="text"
                            typeahead="address as address.formatted_address for address in locations | limitTo:10"
                            typeahead-loading="loadingLocations"
                            typeahead-no-results="noResults"
                            class="form-control input-lg search-first"
                            ng-class=""""),format.raw/*29.39*/("""{"""),format.raw/*29.40*/("""'cityRequired' : isRequired"""),format.raw/*29.67*/("""}"""),format.raw/*29.68*/(""""
                            autocomplete="off"
                            placeholder="Вся Украина">
                            <span class="isRequired" ng-cloak ng-show="isRequired">Выберите город</span>
                        </div>
                        <div class="col-md-3 col-sm-3 search-input">
                            <select class="form-control input-lg search-first"  ng-model="categories.selectedCat" ng-options="option.name for option in categories.availableCat track by option.id" id="searchcategory" placeholder="Выберите рубрику" autocomplete="off">
                            </select>
                        </div>
                        <div class="col-md-2 col-sm-2 search-input">
                            <button type="submit" class="btn btn-custom btn-block btn-lg"><i class="fa fa-search"></i></button>
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <section class="main">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-sm-8">
                        <div class="row">
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=2"><i class="fa fa-book shortcut-icon icon-blue"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=2"><h3>Документы</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=3"><i class="fa fa-mobile shortcut-icon icon-brown"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=3"><h3>Электроника</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=1"><i class="fa fa-paw shortcut-icon icon-dark-blue"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=1"><h3>Животные</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=5"><i class="fa fa-male shortcut-icon icon-violet"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=5"><h3>Люди</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=8"><i class="fa fa-archive shortcut-icon icon-orange"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=8"><h3>Другое</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=6"><i class="fa fa-bicycle shortcut-icon icon-light-green"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=6"><h3>Транспорт</h3></a>
                                </div>
                            </div>

                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=4"><i class="fa fa-briefcase shortcut-icon icon-green"></i></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=4"><h3>Сумки/Кошельки</h3></a>
                                </div>
                            </div>
                            <div class="col-xs-6 col-sm-4 col-md-3">
                                <div class="shortcut">
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=7"><span class="fa fa-female shortcut-icon icon-light-blue"></span></a>
                                    <a href="/results?key=&regionId=0&cityId=0&categoryId=7"><h3>Одежда/Обувь</h3></a>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="section-header">
                                    <h2>Новые обьявления</h2>
                                </div>
                                <div id="new-announcements" class="owl-carousel owl-carousel-new">

                                    <div class="item" ng-repeat="announcement in announcements">
                                        <div class="item-ads-grid">
                                            <div ng-if="announcement.type == 'lost'" class="item-badge-grid lost-ads">
                                                <a ng-href="/announcement/show?id="""),format.raw/*110.83*/("""{"""),format.raw/*110.84*/("""{"""),format.raw/*110.85*/("""announcement.id"""),format.raw/*110.100*/("""}"""),format.raw/*110.101*/("""}"""),format.raw/*110.102*/("""">Потеря</a>
                                            </div>
                                            <div ng-if="announcement.type == 'found'" class="item-badge-grid found-ads">
                                                <a ng-href="/announcement/show?id="""),format.raw/*113.83*/("""{"""),format.raw/*113.84*/("""{"""),format.raw/*113.85*/("""announcement.id"""),format.raw/*113.100*/("""}"""),format.raw/*113.101*/("""}"""),format.raw/*113.102*/("""">Находка</a>
                                            </div>
                                            <div class="item-img-grid">
                                                <a ng-href="/announcement/show?id="""),format.raw/*116.83*/("""{"""),format.raw/*116.84*/("""{"""),format.raw/*116.85*/("""announcement.id"""),format.raw/*116.100*/("""}"""),format.raw/*116.101*/("""}"""),format.raw/*116.102*/(""""><img alt="" ng-src="https://www.znahidka.pp.ua:8080/"""),format.raw/*116.156*/("""{"""),format.raw/*116.157*/("""{"""),format.raw/*116.158*/("""announcement.photo"""),format.raw/*116.176*/("""}"""),format.raw/*116.177*/("""}"""),format.raw/*116.178*/("""" class="img-responsive img-center"></a>
                                            </div>
                                            <div class="item-title">
                                                <a ng-href="/announcement/show?id="""),format.raw/*119.83*/("""{"""),format.raw/*119.84*/("""{"""),format.raw/*119.85*/("""announcement.id"""),format.raw/*119.100*/("""}"""),format.raw/*119.101*/("""}"""),format.raw/*119.102*/(""""><h4>"""),format.raw/*119.108*/("""{"""),format.raw/*119.109*/("""{"""),format.raw/*119.110*/("""announcement.title | limitTo:35"""),format.raw/*119.141*/("""}"""),format.raw/*119.142*/("""}"""),format.raw/*119.143*/("""{"""),format.raw/*119.144*/("""{"""),format.raw/*119.145*/("""announcement.title.length > 35 ? '...' : ''"""),format.raw/*119.188*/("""}"""),format.raw/*119.189*/("""}"""),format.raw/*119.190*/("""</h4></a>
                                            </div>
                                            <div class="item-meta">
                                                <ul>
                                                    <li class="item-date"><i class="fa fa-clock-o"></i> """),format.raw/*123.105*/("""{"""),format.raw/*123.106*/("""{"""),format.raw/*123.107*/("""convertToLocalDate(announcement.timestamp)"""),format.raw/*123.149*/("""}"""),format.raw/*123.150*/("""}"""),format.raw/*123.151*/("""</li>
                                                    <li class="item-cat"><i class="fa fa-bars"></i> <a ng-href="/results?key=&regionId=0&cityId=0&categoryId="""),format.raw/*124.158*/("""{"""),format.raw/*124.159*/("""{"""),format.raw/*124.160*/("""announcement.categoryId"""),format.raw/*124.183*/("""}"""),format.raw/*124.184*/("""}"""),format.raw/*124.185*/(""""> """),format.raw/*124.188*/("""{"""),format.raw/*124.189*/("""{"""),format.raw/*124.190*/("""announcement.category"""),format.raw/*124.211*/("""}"""),format.raw/*124.212*/("""}"""),format.raw/*124.213*/("""</a></li>
                                                    <li class="item-location"><a href=""><i class="fa fa-map-marker"></i> """),format.raw/*125.123*/("""{"""),format.raw/*125.124*/("""{"""),format.raw/*125.125*/("""announcement.city"""),format.raw/*125.142*/("""}"""),format.raw/*125.143*/("""}"""),format.raw/*125.144*/(""", """),format.raw/*125.146*/("""{"""),format.raw/*125.147*/("""{"""),format.raw/*125.148*/("""announcement.region"""),format.raw/*125.167*/("""}"""),format.raw/*125.168*/("""}"""),format.raw/*125.169*/("""</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <div id="vk_groups" style="margin-top: 10px;"></div>
                        <div class="fb-page" data-href="https://www.facebook.com/znahidkaua" data-tabs="timeline" data-small-header="true" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true" data-width="300" data-height="200">
                            <div class="fb-xfbml-parse-ignore"><blockquote cite="https://www.facebook.com/znahidkaua">
                                <a href="https://www.facebook.com/znahidkaua"></a>
                            </blockquote></div>
                        </div>
                        <div class="banner-widget">
                            <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
                                <!-- First ad -->
                            <ins class="adsbygoogle"
                            style="display:block"
                            data-ad-client="ca-pub-9411427569530293"
                            data-ad-slot="4757802363"
                            data-ad-format="auto"></ins>
                            <script>
                           (adsbygoogle = window.adsbygoogle || []).push("""),format.raw/*151.74*/("""{"""),format.raw/*151.75*/("""}"""),format.raw/*151.76*/(""");
                           </script>
                            <!--<img src="https://placehold.it/400x200" alt="banner" class="img-responsive">-->
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <div class="counter">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="item-counter">
                            <span class="item-icon"><i class="fa fa-database"></i></span>
                            <div data-refresh-interval="100" data-speed="3000" data-to="7803" data-from="0" class="item-count">7803</div>
                            <span class="item-info">Объявлений</span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="item-counter">
                            <span class="item-icon"><i class="fa fa-map-marker"></i></span>
                            <div data-refresh-interval="500" data-speed="5000" data-to="2467" data-from="0" class="item-count">2467</div>
                            <span class="item-info">Населенных пункта</span>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="item-counter">
                            <span class="item-icon"><i class="fa fa-users"></i></span>
                            <div data-refresh-interval="80" data-speed="5000" data-to="1548" data-from="0" class="item-count">1548</div>
                            <span class="item-info">Пользователей</span>
                        </div>
                    </div>
                </div>
            </div> <!-- / .counter -->
        </div>
</section>
    <script src="https://vk.com/js/api/openapi.js" type="text/javascript"></script>
    <script src="assets/plugins/owl-carousel/owl.carousel.js"></script>
    <!-- Go to www.addthis.com/dashboard to customize your tools -->
    <script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-56997e9e63975794" async="async"></script>

    <script>

        VK.Widgets.Group("vk_groups", """),format.raw/*194.39*/("""{"""),format.raw/*194.40*/("""mode: 2, width: "300", height: "200""""),format.raw/*194.76*/("""}"""),format.raw/*194.77*/(""", 112053472);

         angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*197.67*/("""{"""),format.raw/*197.68*/("""

                """),format.raw/*199.17*/("""$scope.checkSession = function()"""),format.raw/*199.49*/("""{"""),format.raw/*199.50*/("""
                    """),format.raw/*200.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*202.34*/routes/*202.40*/.Account.checkSession()),format.raw/*202.63*/("""')
                    .success(function(data)"""),format.raw/*203.44*/("""{"""),format.raw/*203.45*/("""
                        """),format.raw/*204.25*/("""if(data.error == "")"""),format.raw/*204.45*/("""{"""),format.raw/*204.46*/("""
                            """),format.raw/*205.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*207.25*/("""}"""),format.raw/*207.26*/("""
                        """),format.raw/*208.25*/("""else"""),format.raw/*208.29*/("""{"""),format.raw/*208.30*/("""
                            """),format.raw/*209.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*210.25*/("""}"""),format.raw/*210.26*/("""
                    """),format.raw/*211.21*/("""}"""),format.raw/*211.22*/(""").error(function(data)"""),format.raw/*211.44*/("""{"""),format.raw/*211.45*/("""
                        """),format.raw/*212.25*/("""console.log(data);
                    """),format.raw/*213.21*/("""}"""),format.raw/*213.22*/(""");
                """),format.raw/*214.17*/("""}"""),format.raw/*214.18*/("""

                """),format.raw/*216.17*/("""$scope.doLogout = function()"""),format.raw/*216.45*/("""{"""),format.raw/*216.46*/("""
                    """),format.raw/*217.21*/("""$http.post('"""),_display_(/*217.34*/routes/*217.40*/.Account.logout()),format.raw/*217.57*/("""')
                    .success(function(data)"""),format.raw/*218.44*/("""{"""),format.raw/*218.45*/("""
                        """),format.raw/*219.25*/("""window.location.replace("/");
                    """),format.raw/*220.21*/("""}"""),format.raw/*220.22*/(""").error(function(data, status)"""),format.raw/*220.52*/("""{"""),format.raw/*220.53*/("""
                        """),format.raw/*221.25*/("""console.log(data);
                    """),format.raw/*222.21*/("""}"""),format.raw/*222.22*/(""");
                """),format.raw/*223.17*/("""}"""),format.raw/*223.18*/("""
        """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/(""")

        .controller('indexCtrl', function($scope, $http, $timeout) """),format.raw/*226.68*/("""{"""),format.raw/*226.69*/("""
                """),format.raw/*227.17*/("""$scope.selectedAddr = """),format.raw/*227.39*/("""{"""),format.raw/*227.40*/(""""regionId":0,"cityId":0, formatted_address:"""""),format.raw/*227.85*/("""}"""),format.raw/*227.86*/(""";
                $scope.key = "";

                $http.get('"""),_display_(/*230.29*/routes/*230.35*/.Announcement.getCategories()),format.raw/*230.64*/("""')
                 .success(function(data)"""),format.raw/*231.41*/("""{"""),format.raw/*231.42*/("""
                    """),format.raw/*232.21*/("""console.log(data);
                    var availableCat = data;
                    availableCat.unshift("""),format.raw/*234.42*/("""{"""),format.raw/*234.43*/(""""id":0,"name":"Все рубрики""""),format.raw/*234.70*/("""}"""),format.raw/*234.71*/(""");
                    var categories = """),format.raw/*235.38*/("""{"""),format.raw/*235.39*/(""""availableCat":availableCat, "selectedCat":"""),format.raw/*235.82*/("""{"""),format.raw/*235.83*/(""""id":0,"name":"Все рубрики""""),format.raw/*235.110*/("""}"""),format.raw/*235.111*/("""}"""),format.raw/*235.112*/(""";
                    $scope.categories = categories;
                 """),format.raw/*237.18*/("""}"""),format.raw/*237.19*/(""").error(function(data)"""),format.raw/*237.41*/("""{"""),format.raw/*237.42*/("""
                    """),format.raw/*238.21*/("""console.log(data);
                 """),format.raw/*239.18*/("""}"""),format.raw/*239.19*/(""");


                $http.get('"""),_display_(/*242.29*/routes/*242.35*/.Announcement.getLast12()),format.raw/*242.60*/("""')
                 .success(function(data)"""),format.raw/*243.41*/("""{"""),format.raw/*243.42*/("""
                    """),format.raw/*244.21*/("""console.log(data);
                    $scope.announcements = data;
                    $timeout(function() """),format.raw/*246.41*/("""{"""),format.raw/*246.42*/("""
                        """),format.raw/*247.25*/("""$(".owl-carousel-new").owlCarousel("""),format.raw/*247.60*/("""{"""),format.raw/*247.61*/("""
                            """),format.raw/*248.29*/("""items: 3,
                            lazyLoad: true,
                            pagination: true,
                            autoPlay: 5000,
                            stopOnHover: true
                        """),format.raw/*253.25*/("""}"""),format.raw/*253.26*/(""");
                    """),format.raw/*254.21*/("""}"""),format.raw/*254.22*/(""", 1000);
                 """),format.raw/*255.18*/("""}"""),format.raw/*255.19*/(""").error(function(data)"""),format.raw/*255.41*/("""{"""),format.raw/*255.42*/("""
                    """),format.raw/*256.21*/("""console.log(data);
                 """),format.raw/*257.18*/("""}"""),format.raw/*257.19*/(""");

              $scope.$watch('selectedAddr', function() """),format.raw/*259.56*/("""{"""),format.raw/*259.57*/("""
               """),format.raw/*260.16*/("""return $http.get('"""),_display_(/*260.35*/routes/*260.41*/.Announcement.getAddress()),format.raw/*260.67*/("""', """),format.raw/*260.70*/("""{"""),format.raw/*260.71*/("""
                """),format.raw/*261.17*/("""params: """),format.raw/*261.25*/("""{"""),format.raw/*261.26*/("""
                """),format.raw/*262.17*/("""q: $scope.selectedAddr
                  """),format.raw/*263.19*/("""}"""),format.raw/*263.20*/("""
                """),format.raw/*264.17*/("""}"""),format.raw/*264.18*/(""")
               .then(function(response)"""),format.raw/*265.40*/("""{"""),format.raw/*265.41*/("""
                    """),format.raw/*266.21*/("""console.log(response);
                    $scope.locations = response.data;
               """),format.raw/*268.16*/("""}"""),format.raw/*268.17*/(""");
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/(""");

            $scope.search = function()"""),format.raw/*271.39*/("""{"""),format.raw/*271.40*/("""
                """),format.raw/*272.17*/("""console.log($scope.selectedAddr);
                if($scope.selectedAddr == "")"""),format.raw/*273.46*/("""{"""),format.raw/*273.47*/("""
                    """),format.raw/*274.21*/("""$scope.selectedAddr = """),format.raw/*274.43*/("""{"""),format.raw/*274.44*/(""""regionId":0,"cityId":0, formatted_address:"""""),format.raw/*274.89*/("""}"""),format.raw/*274.90*/(""";
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/("""
                """),format.raw/*276.17*/("""if(typeof($scope.selectedAddr.regionId) == "undefined")"""),format.raw/*276.72*/("""{"""),format.raw/*276.73*/("""
                    """),format.raw/*277.21*/("""$scope.isRequired = true;
                    return false;
                """),format.raw/*279.17*/("""}"""),format.raw/*279.18*/("""
                """),format.raw/*280.17*/("""window.location.href = "/results?key="+$scope.key+"&regionId="+$scope.selectedAddr.regionId+"&cityId="+$scope.selectedAddr.cityId+"&categoryId="+$scope.categories.selectedCat.id;
            """),format.raw/*281.13*/("""}"""),format.raw/*281.14*/("""

            """),format.raw/*283.13*/("""$scope.cityInput = function()"""),format.raw/*283.42*/("""{"""),format.raw/*283.43*/("""
                """),format.raw/*284.17*/("""$scope.isRequired = false;
            """),format.raw/*285.13*/("""}"""),format.raw/*285.14*/("""

            """),format.raw/*287.13*/("""$scope.convertToLocalDate = function(timestamp)"""),format.raw/*287.60*/("""{"""),format.raw/*287.61*/("""
                """),format.raw/*288.17*/("""var t = timestamp// + moment(timestamp).utcOffset()*60000;
                var current =  moment(moment(t) - moment().utcOffset()).format('DD-MM-YYYY HH:mm:ss');
                return current;
            """),format.raw/*291.13*/("""}"""),format.raw/*291.14*/(""";

        """),format.raw/*293.9*/("""}"""),format.raw/*293.10*/(""")
    </script>

""")))}),format.raw/*296.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Feb 02 21:11:52 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/index.scala.html
                  HASH: 7555b3358a544ede320651db7695efbb3119d07d
                  MATRIX: 609->2|669->54|708->56|739->61|828->123|856->124|891->133|1196->411|1225->412|2532->1691|2561->1692|2616->1719|2645->1720|8326->7372|8356->7373|8386->7374|8431->7389|8462->7390|8493->7391|8789->7658|8819->7659|8849->7660|8894->7675|8925->7676|8956->7677|9204->7896|9234->7897|9264->7898|9309->7913|9340->7914|9371->7915|9455->7969|9486->7970|9517->7971|9565->7989|9596->7990|9627->7991|9899->8234|9929->8235|9959->8236|10004->8251|10035->8252|10066->8253|10102->8259|10133->8260|10164->8261|10225->8292|10256->8293|10287->8294|10318->8295|10349->8296|10422->8339|10453->8340|10484->8341|10800->8627|10831->8628|10862->8629|10934->8671|10965->8672|10996->8673|11189->8836|11220->8837|11251->8838|11304->8861|11335->8862|11366->8863|11399->8866|11430->8867|11461->8868|11512->8889|11543->8890|11574->8891|11736->9023|11767->9024|11798->9025|11845->9042|11876->9043|11907->9044|11939->9046|11970->9047|12001->9048|12050->9067|12081->9068|12112->9069|13758->10686|13788->10687|13818->10688|16075->12916|16105->12917|16170->12953|16200->12954|16368->13093|16398->13094|16445->13112|16506->13144|16536->13145|16586->13166|16728->13280|16744->13286|16789->13309|16864->13355|16894->13356|16948->13381|16997->13401|17027->13402|17085->13431|17265->13583|17295->13584|17349->13609|17382->13613|17412->13614|17470->13643|17554->13698|17584->13699|17634->13720|17664->13721|17715->13743|17745->13744|17799->13769|17867->13808|17897->13809|17945->13828|17975->13829|18022->13847|18079->13875|18109->13876|18159->13897|18200->13910|18216->13916|18255->13933|18330->13979|18360->13980|18414->14005|18493->14055|18523->14056|18582->14086|18612->14087|18666->14112|18734->14151|18764->14152|18812->14171|18842->14172|18879->14181|18909->14182|19008->14252|19038->14253|19084->14270|19135->14292|19165->14293|19239->14338|19269->14339|19361->14403|19377->14409|19428->14438|19500->14481|19530->14482|19580->14503|19714->14608|19744->14609|19800->14636|19830->14637|19899->14677|19929->14678|20001->14721|20031->14722|20088->14749|20119->14750|20150->14751|20250->14822|20280->14823|20331->14845|20361->14846|20411->14867|20476->14903|20506->14904|20567->14937|20583->14943|20630->14968|20702->15011|20732->15012|20782->15033|20919->15141|20949->15142|21003->15167|21067->15202|21097->15203|21155->15232|21398->15446|21428->15447|21480->15470|21510->15471|21565->15497|21595->15498|21646->15520|21676->15521|21726->15542|21791->15578|21821->15579|21909->15638|21939->15639|21984->15655|22031->15674|22047->15680|22095->15706|22127->15709|22157->15710|22203->15727|22240->15735|22270->15736|22316->15753|22386->15794|22416->15795|22462->15812|22492->15813|22562->15854|22592->15855|22642->15876|22763->15968|22793->15969|22837->15984|22867->15985|22938->16027|22968->16028|23014->16045|23122->16124|23152->16125|23202->16146|23253->16168|23283->16169|23357->16214|23387->16215|23434->16233|23464->16234|23510->16251|23594->16306|23624->16307|23674->16328|23779->16404|23809->16405|23855->16422|24075->16613|24105->16614|24148->16628|24206->16657|24236->16658|24282->16675|24350->16714|24380->16715|24423->16729|24499->16776|24529->16777|24575->16794|24810->17000|24840->17001|24879->17012|24909->17013|24958->17031
                  LINES: 25->2|25->2|25->2|26->3|28->5|28->5|29->6|34->11|34->11|52->29|52->29|52->29|52->29|133->110|133->110|133->110|133->110|133->110|133->110|136->113|136->113|136->113|136->113|136->113|136->113|139->116|139->116|139->116|139->116|139->116|139->116|139->116|139->116|139->116|139->116|139->116|139->116|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|142->119|146->123|146->123|146->123|146->123|146->123|146->123|147->124|147->124|147->124|147->124|147->124|147->124|147->124|147->124|147->124|147->124|147->124|147->124|148->125|148->125|148->125|148->125|148->125|148->125|148->125|148->125|148->125|148->125|148->125|148->125|174->151|174->151|174->151|217->194|217->194|217->194|217->194|220->197|220->197|222->199|222->199|222->199|223->200|225->202|225->202|225->202|226->203|226->203|227->204|227->204|227->204|228->205|230->207|230->207|231->208|231->208|231->208|232->209|233->210|233->210|234->211|234->211|234->211|234->211|235->212|236->213|236->213|237->214|237->214|239->216|239->216|239->216|240->217|240->217|240->217|240->217|241->218|241->218|242->219|243->220|243->220|243->220|243->220|244->221|245->222|245->222|246->223|246->223|247->224|247->224|249->226|249->226|250->227|250->227|250->227|250->227|250->227|253->230|253->230|253->230|254->231|254->231|255->232|257->234|257->234|257->234|257->234|258->235|258->235|258->235|258->235|258->235|258->235|258->235|260->237|260->237|260->237|260->237|261->238|262->239|262->239|265->242|265->242|265->242|266->243|266->243|267->244|269->246|269->246|270->247|270->247|270->247|271->248|276->253|276->253|277->254|277->254|278->255|278->255|278->255|278->255|279->256|280->257|280->257|282->259|282->259|283->260|283->260|283->260|283->260|283->260|283->260|284->261|284->261|284->261|285->262|286->263|286->263|287->264|287->264|288->265|288->265|289->266|291->268|291->268|292->269|292->269|294->271|294->271|295->272|296->273|296->273|297->274|297->274|297->274|297->274|297->274|298->275|298->275|299->276|299->276|299->276|300->277|302->279|302->279|303->280|304->281|304->281|306->283|306->283|306->283|307->284|308->285|308->285|310->287|310->287|310->287|311->288|314->291|314->291|316->293|316->293|319->296
                  -- GENERATED --
              */
          