
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


Seq[Any](_display_(/*2.2*/main("Главная")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""
"""),format.raw/*3.1*/("""<section ng-controller="indexCtrl">
        <section class="hero">
            <div class="container text-center">
                <h2 class="hero-title">Поиск потерянных вещей по всей Украине</h2>
                <p class="hero-description hidden-xs">Онлайн сервис по поиску потерянных и найденных вещей, людей и животных в Украине</p>
                <div class="row hero-search-box">
                    <form ng-submit="search()">
                        <div class="col-md-4 col-sm-4 search-input">
                            <input type="text" ng-model="key" class="form-control input-lg search-first" id="searchkey" placeholder="Введите колючевое слово">
                        </div>
                        <div class="col-md-3 col-sm-3 search-input">
                            <input id="citysel" ng-model="selectedAddr" ng-change="cityInput()" type="text"
                            typeahead="address as address.formatted_address for address in locations | limitTo:10"
                            typeahead-loading="loadingLocations"
                            typeahead-no-results="noResults"
                            class="form-control input-lg search-first"
                            ng-class=""""),format.raw/*19.39*/("""{"""),format.raw/*19.40*/("""'cityRequired' : isRequired"""),format.raw/*19.67*/("""}"""),format.raw/*19.68*/(""""
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
                                                <a ng-href="/announcement/show?id="""),format.raw/*100.83*/("""{"""),format.raw/*100.84*/("""{"""),format.raw/*100.85*/("""announcement.id"""),format.raw/*100.100*/("""}"""),format.raw/*100.101*/("""}"""),format.raw/*100.102*/("""">Потеря</a>
                                            </div>
                                            <div ng-if="announcement.type == 'found'" class="item-badge-grid found-ads">
                                                <a ng-href="/announcement/show?id="""),format.raw/*103.83*/("""{"""),format.raw/*103.84*/("""{"""),format.raw/*103.85*/("""announcement.id"""),format.raw/*103.100*/("""}"""),format.raw/*103.101*/("""}"""),format.raw/*103.102*/("""">Находка</a>
                                            </div>
                                            <div class="item-img-grid">
                                                <a ng-href="/announcement/show?id="""),format.raw/*106.83*/("""{"""),format.raw/*106.84*/("""{"""),format.raw/*106.85*/("""announcement.id"""),format.raw/*106.100*/("""}"""),format.raw/*106.101*/("""}"""),format.raw/*106.102*/(""""><img alt="" ng-src="/assets/"""),format.raw/*106.132*/("""{"""),format.raw/*106.133*/("""{"""),format.raw/*106.134*/("""announcement.photo"""),format.raw/*106.152*/("""}"""),format.raw/*106.153*/("""}"""),format.raw/*106.154*/("""" class="img-responsive img-center"></a>
                                            </div>
                                            <div class="item-title">
                                                <a ng-href="/announcement/show?id="""),format.raw/*109.83*/("""{"""),format.raw/*109.84*/("""{"""),format.raw/*109.85*/("""announcement.id"""),format.raw/*109.100*/("""}"""),format.raw/*109.101*/("""}"""),format.raw/*109.102*/(""""><h4>"""),format.raw/*109.108*/("""{"""),format.raw/*109.109*/("""{"""),format.raw/*109.110*/("""announcement.title | limitTo:35"""),format.raw/*109.141*/("""}"""),format.raw/*109.142*/("""}"""),format.raw/*109.143*/("""{"""),format.raw/*109.144*/("""{"""),format.raw/*109.145*/("""announcement.title.length > 35 ? '...' : ''"""),format.raw/*109.188*/("""}"""),format.raw/*109.189*/("""}"""),format.raw/*109.190*/("""</h4></a>
                                            </div>
                                            <div class="item-meta">
                                                <ul>
                                                    <li class="item-date"><i class="fa fa-clock-o"></i> """),format.raw/*113.105*/("""{"""),format.raw/*113.106*/("""{"""),format.raw/*113.107*/("""convertToLocalDate(announcement.timestamp)"""),format.raw/*113.149*/("""}"""),format.raw/*113.150*/("""}"""),format.raw/*113.151*/("""</li>
                                                    <li class="item-cat"><i class="fa fa-bars"></i> <a ng-href="/results?key=&regionId=0&cityId=0&categoryId="""),format.raw/*114.158*/("""{"""),format.raw/*114.159*/("""{"""),format.raw/*114.160*/("""announcement.categoryId"""),format.raw/*114.183*/("""}"""),format.raw/*114.184*/("""}"""),format.raw/*114.185*/(""""> """),format.raw/*114.188*/("""{"""),format.raw/*114.189*/("""{"""),format.raw/*114.190*/("""announcement.category"""),format.raw/*114.211*/("""}"""),format.raw/*114.212*/("""}"""),format.raw/*114.213*/("""</a></li>
                                                    <li class="item-location"><a href=""><i class="fa fa-map-marker"></i> """),format.raw/*115.123*/("""{"""),format.raw/*115.124*/("""{"""),format.raw/*115.125*/("""announcement.city"""),format.raw/*115.142*/("""}"""),format.raw/*115.143*/("""}"""),format.raw/*115.144*/(""", """),format.raw/*115.146*/("""{"""),format.raw/*115.147*/("""{"""),format.raw/*115.148*/("""announcement.region"""),format.raw/*115.167*/("""}"""),format.raw/*115.168*/("""}"""),format.raw/*115.169*/("""</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-4">
                        <div class="banner-widget">
                            <img src="http://placehold.it/600x275" alt="banner" class="img-responsive">
                        </div>
                        <div id="vk_groups" style="margin-top: 10px;" class="col-md-12"></div>
                       <!-- <div class="widget">
                            <div class="widget-header">
                                <h3>Trends</h3>
                            </div>
                            <div class="widget-body">
                                <ul class="trends">
                                    <li><a href="#">Smartphone &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Watch &amp; Jewelry &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Clothes &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Shoes &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Music &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Furniture &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                    <li><a href="#">Photography &nbsp;<span class="item-numbers">(242)</span></a></li>
                                    <li><a href="#">Web Development &nbsp;<span class="item-numbers">(2,342)</span></a></li>
                                </ul>
                            </div>
                        </div>-->
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
                            <span class="item-info">Наименований</span>
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
    <script src="http://vk.com/js/api/openapi.js" type="text/javascript"></script>
    <script src="assets/plugins/owl-carousel/owl.carousel.js"></script>
    <!-- Go to www.addthis.com/dashboard to customize your tools -->
    <script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-56997e9e63975794" async="async"></script>

    <script>

        VK.Widgets.Group("vk_groups", """),format.raw/*186.39*/("""{"""),format.raw/*186.40*/("""mode: 0, width: "300", height: "200""""),format.raw/*186.76*/("""}"""),format.raw/*186.77*/(""", 112053472);

         angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*189.67*/("""{"""),format.raw/*189.68*/("""

                """),format.raw/*191.17*/("""$scope.checkSession = function()"""),format.raw/*191.49*/("""{"""),format.raw/*191.50*/("""
                    """),format.raw/*192.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*194.34*/routes/*194.40*/.Account.checkSession()),format.raw/*194.63*/("""')
                    .success(function(data)"""),format.raw/*195.44*/("""{"""),format.raw/*195.45*/("""
                        """),format.raw/*196.25*/("""if(data.error == "")"""),format.raw/*196.45*/("""{"""),format.raw/*196.46*/("""
                            """),format.raw/*197.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*199.25*/("""}"""),format.raw/*199.26*/("""
                        """),format.raw/*200.25*/("""else"""),format.raw/*200.29*/("""{"""),format.raw/*200.30*/("""
                            """),format.raw/*201.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*202.25*/("""}"""),format.raw/*202.26*/("""
                    """),format.raw/*203.21*/("""}"""),format.raw/*203.22*/(""").error(function(data)"""),format.raw/*203.44*/("""{"""),format.raw/*203.45*/("""
                        """),format.raw/*204.25*/("""console.log(data);
                    """),format.raw/*205.21*/("""}"""),format.raw/*205.22*/(""");
                """),format.raw/*206.17*/("""}"""),format.raw/*206.18*/("""

                """),format.raw/*208.17*/("""$scope.doLogout = function()"""),format.raw/*208.45*/("""{"""),format.raw/*208.46*/("""
                    """),format.raw/*209.21*/("""$http.post('"""),_display_(/*209.34*/routes/*209.40*/.Account.logout()),format.raw/*209.57*/("""')
                    .success(function(data)"""),format.raw/*210.44*/("""{"""),format.raw/*210.45*/("""
                        """),format.raw/*211.25*/("""window.location.replace("/");
                    """),format.raw/*212.21*/("""}"""),format.raw/*212.22*/(""").error(function(data, status)"""),format.raw/*212.52*/("""{"""),format.raw/*212.53*/("""
                        """),format.raw/*213.25*/("""console.log(data);
                    """),format.raw/*214.21*/("""}"""),format.raw/*214.22*/(""");
                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/("""
        """),format.raw/*216.9*/("""}"""),format.raw/*216.10*/(""")

        .controller('indexCtrl', function($scope, $http, $timeout) """),format.raw/*218.68*/("""{"""),format.raw/*218.69*/("""
                """),format.raw/*219.17*/("""$scope.selectedAddr = """),format.raw/*219.39*/("""{"""),format.raw/*219.40*/(""""regionId":0,"cityId":0, formatted_address:"""""),format.raw/*219.85*/("""}"""),format.raw/*219.86*/(""";
                $scope.key = "";

                $http.get('"""),_display_(/*222.29*/routes/*222.35*/.Announcement.getCategories()),format.raw/*222.64*/("""')
                 .success(function(data)"""),format.raw/*223.41*/("""{"""),format.raw/*223.42*/("""
                    """),format.raw/*224.21*/("""console.log(data);
                    var availableCat = data;
                    availableCat.unshift("""),format.raw/*226.42*/("""{"""),format.raw/*226.43*/(""""id":0,"name":"Все рубрики""""),format.raw/*226.70*/("""}"""),format.raw/*226.71*/(""");
                    var categories = """),format.raw/*227.38*/("""{"""),format.raw/*227.39*/(""""availableCat":availableCat, "selectedCat":"""),format.raw/*227.82*/("""{"""),format.raw/*227.83*/(""""id":0,"name":"Все рубрики""""),format.raw/*227.110*/("""}"""),format.raw/*227.111*/("""}"""),format.raw/*227.112*/(""";
                    $scope.categories = categories;
                 """),format.raw/*229.18*/("""}"""),format.raw/*229.19*/(""").error(function(data)"""),format.raw/*229.41*/("""{"""),format.raw/*229.42*/("""
                    """),format.raw/*230.21*/("""console.log(data);
                 """),format.raw/*231.18*/("""}"""),format.raw/*231.19*/(""");


                $http.get('"""),_display_(/*234.29*/routes/*234.35*/.Announcement.getLast12()),format.raw/*234.60*/("""')
                 .success(function(data)"""),format.raw/*235.41*/("""{"""),format.raw/*235.42*/("""
                    """),format.raw/*236.21*/("""console.log(data);
                    $scope.announcements = data;
                    $timeout(function() """),format.raw/*238.41*/("""{"""),format.raw/*238.42*/("""
                        """),format.raw/*239.25*/("""$(".owl-carousel-new").owlCarousel("""),format.raw/*239.60*/("""{"""),format.raw/*239.61*/("""
                            """),format.raw/*240.29*/("""items: 3,
                            lazyLoad: true,
                            pagination: true,
                            autoPlay: 5000,
                            stopOnHover: true
                        """),format.raw/*245.25*/("""}"""),format.raw/*245.26*/(""");
                    """),format.raw/*246.21*/("""}"""),format.raw/*246.22*/(""", 1000);
                 """),format.raw/*247.18*/("""}"""),format.raw/*247.19*/(""").error(function(data)"""),format.raw/*247.41*/("""{"""),format.raw/*247.42*/("""
                    """),format.raw/*248.21*/("""console.log(data);
                 """),format.raw/*249.18*/("""}"""),format.raw/*249.19*/(""");

              $scope.$watch('selectedAddr', function() """),format.raw/*251.56*/("""{"""),format.raw/*251.57*/("""
               """),format.raw/*252.16*/("""return $http.get('"""),_display_(/*252.35*/routes/*252.41*/.Announcement.getAddress()),format.raw/*252.67*/("""', """),format.raw/*252.70*/("""{"""),format.raw/*252.71*/("""
                """),format.raw/*253.17*/("""params: """),format.raw/*253.25*/("""{"""),format.raw/*253.26*/("""
                """),format.raw/*254.17*/("""q: $scope.selectedAddr
                  """),format.raw/*255.19*/("""}"""),format.raw/*255.20*/("""
                """),format.raw/*256.17*/("""}"""),format.raw/*256.18*/(""")
               .then(function(response)"""),format.raw/*257.40*/("""{"""),format.raw/*257.41*/("""
                    """),format.raw/*258.21*/("""console.log(response);
                    $scope.locations = response.data;
               """),format.raw/*260.16*/("""}"""),format.raw/*260.17*/(""");
            """),format.raw/*261.13*/("""}"""),format.raw/*261.14*/(""");

            $scope.search = function()"""),format.raw/*263.39*/("""{"""),format.raw/*263.40*/("""
                """),format.raw/*264.17*/("""console.log($scope.selectedAddr);
                if($scope.selectedAddr == "")"""),format.raw/*265.46*/("""{"""),format.raw/*265.47*/("""
                    """),format.raw/*266.21*/("""$scope.selectedAddr = """),format.raw/*266.43*/("""{"""),format.raw/*266.44*/(""""regionId":0,"cityId":0, formatted_address:"""""),format.raw/*266.89*/("""}"""),format.raw/*266.90*/(""";
                """),format.raw/*267.17*/("""}"""),format.raw/*267.18*/("""
                """),format.raw/*268.17*/("""if(typeof($scope.selectedAddr.regionId) == "undefined")"""),format.raw/*268.72*/("""{"""),format.raw/*268.73*/("""
                    """),format.raw/*269.21*/("""$scope.isRequired = true;
                    return false;
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/("""
                """),format.raw/*272.17*/("""window.location.href = "/results?key="+$scope.key+"&regionId="+$scope.selectedAddr.regionId+"&cityId="+$scope.selectedAddr.cityId+"&categoryId="+$scope.categories.selectedCat.id;
            """),format.raw/*273.13*/("""}"""),format.raw/*273.14*/("""

            """),format.raw/*275.13*/("""$scope.cityInput = function()"""),format.raw/*275.42*/("""{"""),format.raw/*275.43*/("""
                """),format.raw/*276.17*/("""$scope.isRequired = false;
            """),format.raw/*277.13*/("""}"""),format.raw/*277.14*/("""

            """),format.raw/*279.13*/("""$scope.convertToLocalDate = function(timestamp)"""),format.raw/*279.60*/("""{"""),format.raw/*279.61*/("""
                """),format.raw/*280.17*/("""var t = timestamp + moment(timestamp).utcOffset()*60000;
                var current =  moment(moment(t) - moment().utcOffset()).format('DD-MM-YYYY HH:mm:ss');
                return current;
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/(""";

        """),format.raw/*285.9*/("""}"""),format.raw/*285.10*/(""")
    </script>

""")))}),format.raw/*288.2*/("""
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
                  DATE: Sat Jan 16 23:11:02 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/index.scala.html
                  HASH: 1b466e677bb7a33502ec3ab4702717a6231dfc39
                  MATRIX: 609->2|632->17|671->19|698->20|1947->1241|1976->1242|2031->1269|2060->1270|7741->6922|7771->6923|7801->6924|7846->6939|7877->6940|7908->6941|8204->7208|8234->7209|8264->7210|8309->7225|8340->7226|8371->7227|8619->7446|8649->7447|8679->7448|8724->7463|8755->7464|8786->7465|8846->7495|8877->7496|8908->7497|8956->7515|8987->7516|9018->7517|9290->7760|9320->7761|9350->7762|9395->7777|9426->7778|9457->7779|9493->7785|9524->7786|9555->7787|9616->7818|9647->7819|9678->7820|9709->7821|9740->7822|9813->7865|9844->7866|9875->7867|10191->8153|10222->8154|10253->8155|10325->8197|10356->8198|10387->8199|10580->8362|10611->8363|10642->8364|10695->8387|10726->8388|10757->8389|10790->8392|10821->8393|10852->8394|10903->8415|10934->8416|10965->8417|11127->8549|11158->8550|11189->8551|11236->8568|11267->8569|11298->8570|11330->8572|11361->8573|11392->8574|11441->8593|11472->8594|11503->8595|15610->12673|15640->12674|15705->12710|15735->12711|15903->12850|15933->12851|15980->12869|16041->12901|16071->12902|16121->12923|16263->13037|16279->13043|16324->13066|16399->13112|16429->13113|16483->13138|16532->13158|16562->13159|16620->13188|16800->13340|16830->13341|16884->13366|16917->13370|16947->13371|17005->13400|17089->13455|17119->13456|17169->13477|17199->13478|17250->13500|17280->13501|17334->13526|17402->13565|17432->13566|17480->13585|17510->13586|17557->13604|17614->13632|17644->13633|17694->13654|17735->13667|17751->13673|17790->13690|17865->13736|17895->13737|17949->13762|18028->13812|18058->13813|18117->13843|18147->13844|18201->13869|18269->13908|18299->13909|18347->13928|18377->13929|18414->13938|18444->13939|18543->14009|18573->14010|18619->14027|18670->14049|18700->14050|18774->14095|18804->14096|18896->14160|18912->14166|18963->14195|19035->14238|19065->14239|19115->14260|19249->14365|19279->14366|19335->14393|19365->14394|19434->14434|19464->14435|19536->14478|19566->14479|19623->14506|19654->14507|19685->14508|19785->14579|19815->14580|19866->14602|19896->14603|19946->14624|20011->14660|20041->14661|20102->14694|20118->14700|20165->14725|20237->14768|20267->14769|20317->14790|20454->14898|20484->14899|20538->14924|20602->14959|20632->14960|20690->14989|20933->15203|20963->15204|21015->15227|21045->15228|21100->15254|21130->15255|21181->15277|21211->15278|21261->15299|21326->15335|21356->15336|21444->15395|21474->15396|21519->15412|21566->15431|21582->15437|21630->15463|21662->15466|21692->15467|21738->15484|21775->15492|21805->15493|21851->15510|21921->15551|21951->15552|21997->15569|22027->15570|22097->15611|22127->15612|22177->15633|22298->15725|22328->15726|22372->15741|22402->15742|22473->15784|22503->15785|22549->15802|22657->15881|22687->15882|22737->15903|22788->15925|22818->15926|22892->15971|22922->15972|22969->15990|22999->15991|23045->16008|23129->16063|23159->16064|23209->16085|23314->16161|23344->16162|23390->16179|23610->16370|23640->16371|23683->16385|23741->16414|23771->16415|23817->16432|23885->16471|23915->16472|23958->16486|24034->16533|24064->16534|24110->16551|24343->16755|24373->16756|24412->16767|24442->16768|24491->16786
                  LINES: 25->2|25->2|25->2|26->3|42->19|42->19|42->19|42->19|123->100|123->100|123->100|123->100|123->100|123->100|126->103|126->103|126->103|126->103|126->103|126->103|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|136->113|136->113|136->113|136->113|136->113|136->113|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|209->186|209->186|209->186|209->186|212->189|212->189|214->191|214->191|214->191|215->192|217->194|217->194|217->194|218->195|218->195|219->196|219->196|219->196|220->197|222->199|222->199|223->200|223->200|223->200|224->201|225->202|225->202|226->203|226->203|226->203|226->203|227->204|228->205|228->205|229->206|229->206|231->208|231->208|231->208|232->209|232->209|232->209|232->209|233->210|233->210|234->211|235->212|235->212|235->212|235->212|236->213|237->214|237->214|238->215|238->215|239->216|239->216|241->218|241->218|242->219|242->219|242->219|242->219|242->219|245->222|245->222|245->222|246->223|246->223|247->224|249->226|249->226|249->226|249->226|250->227|250->227|250->227|250->227|250->227|250->227|250->227|252->229|252->229|252->229|252->229|253->230|254->231|254->231|257->234|257->234|257->234|258->235|258->235|259->236|261->238|261->238|262->239|262->239|262->239|263->240|268->245|268->245|269->246|269->246|270->247|270->247|270->247|270->247|271->248|272->249|272->249|274->251|274->251|275->252|275->252|275->252|275->252|275->252|275->252|276->253|276->253|276->253|277->254|278->255|278->255|279->256|279->256|280->257|280->257|281->258|283->260|283->260|284->261|284->261|286->263|286->263|287->264|288->265|288->265|289->266|289->266|289->266|289->266|289->266|290->267|290->267|291->268|291->268|291->268|292->269|294->271|294->271|295->272|296->273|296->273|298->275|298->275|298->275|299->276|300->277|300->277|302->279|302->279|302->279|303->280|306->283|306->283|308->285|308->285|311->288
                  -- GENERATED --
              */
          