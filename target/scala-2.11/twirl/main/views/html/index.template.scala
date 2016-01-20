
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
                                                <a ng-href="/announcement/show?id="""),format.raw/*106.83*/("""{"""),format.raw/*106.84*/("""{"""),format.raw/*106.85*/("""announcement.id"""),format.raw/*106.100*/("""}"""),format.raw/*106.101*/("""}"""),format.raw/*106.102*/(""""><img alt="" ng-src="https://www.znahidka.pp.ua:8080/"""),format.raw/*106.156*/("""{"""),format.raw/*106.157*/("""{"""),format.raw/*106.158*/("""announcement.photo"""),format.raw/*106.176*/("""}"""),format.raw/*106.177*/("""}"""),format.raw/*106.178*/("""" class="img-responsive img-center"></a>
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
                            <img src="https://placehold.it/600x275" alt="banner" class="img-responsive">
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
    <script src="https://vk.com/js/api/openapi.js" type="text/javascript"></script>
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
                """),format.raw/*280.17*/("""var t = timestamp// + moment(timestamp).utcOffset()*60000;
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
                  DATE: Wed Jan 20 20:08:17 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/index.scala.html
                  HASH: 53c51c52333f7d5f6651e96c9d7fd322cdd9ff1b
                  MATRIX: 609->2|632->17|671->19|698->20|1947->1241|1976->1242|2031->1269|2060->1270|7741->6922|7771->6923|7801->6924|7846->6939|7877->6940|7908->6941|8204->7208|8234->7209|8264->7210|8309->7225|8340->7226|8371->7227|8619->7446|8649->7447|8679->7448|8724->7463|8755->7464|8786->7465|8870->7519|8901->7520|8932->7521|8980->7539|9011->7540|9042->7541|9314->7784|9344->7785|9374->7786|9419->7801|9450->7802|9481->7803|9517->7809|9548->7810|9579->7811|9640->7842|9671->7843|9702->7844|9733->7845|9764->7846|9837->7889|9868->7890|9899->7891|10215->8177|10246->8178|10277->8179|10349->8221|10380->8222|10411->8223|10604->8386|10635->8387|10666->8388|10719->8411|10750->8412|10781->8413|10814->8416|10845->8417|10876->8418|10927->8439|10958->8440|10989->8441|11151->8573|11182->8574|11213->8575|11260->8592|11291->8593|11322->8594|11354->8596|11385->8597|11416->8598|11465->8617|11496->8618|11527->8619|15636->12699|15666->12700|15731->12736|15761->12737|15929->12876|15959->12877|16006->12895|16067->12927|16097->12928|16147->12949|16289->13063|16305->13069|16350->13092|16425->13138|16455->13139|16509->13164|16558->13184|16588->13185|16646->13214|16826->13366|16856->13367|16910->13392|16943->13396|16973->13397|17031->13426|17115->13481|17145->13482|17195->13503|17225->13504|17276->13526|17306->13527|17360->13552|17428->13591|17458->13592|17506->13611|17536->13612|17583->13630|17640->13658|17670->13659|17720->13680|17761->13693|17777->13699|17816->13716|17891->13762|17921->13763|17975->13788|18054->13838|18084->13839|18143->13869|18173->13870|18227->13895|18295->13934|18325->13935|18373->13954|18403->13955|18440->13964|18470->13965|18569->14035|18599->14036|18645->14053|18696->14075|18726->14076|18800->14121|18830->14122|18922->14186|18938->14192|18989->14221|19061->14264|19091->14265|19141->14286|19275->14391|19305->14392|19361->14419|19391->14420|19460->14460|19490->14461|19562->14504|19592->14505|19649->14532|19680->14533|19711->14534|19811->14605|19841->14606|19892->14628|19922->14629|19972->14650|20037->14686|20067->14687|20128->14720|20144->14726|20191->14751|20263->14794|20293->14795|20343->14816|20480->14924|20510->14925|20564->14950|20628->14985|20658->14986|20716->15015|20959->15229|20989->15230|21041->15253|21071->15254|21126->15280|21156->15281|21207->15303|21237->15304|21287->15325|21352->15361|21382->15362|21470->15421|21500->15422|21545->15438|21592->15457|21608->15463|21656->15489|21688->15492|21718->15493|21764->15510|21801->15518|21831->15519|21877->15536|21947->15577|21977->15578|22023->15595|22053->15596|22123->15637|22153->15638|22203->15659|22324->15751|22354->15752|22398->15767|22428->15768|22499->15810|22529->15811|22575->15828|22683->15907|22713->15908|22763->15929|22814->15951|22844->15952|22918->15997|22948->15998|22995->16016|23025->16017|23071->16034|23155->16089|23185->16090|23235->16111|23340->16187|23370->16188|23416->16205|23636->16396|23666->16397|23709->16411|23767->16440|23797->16441|23843->16458|23911->16497|23941->16498|23984->16512|24060->16559|24090->16560|24136->16577|24371->16783|24401->16784|24440->16795|24470->16796|24519->16814
                  LINES: 25->2|25->2|25->2|26->3|42->19|42->19|42->19|42->19|123->100|123->100|123->100|123->100|123->100|123->100|126->103|126->103|126->103|126->103|126->103|126->103|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|129->106|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|132->109|136->113|136->113|136->113|136->113|136->113|136->113|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|137->114|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|138->115|209->186|209->186|209->186|209->186|212->189|212->189|214->191|214->191|214->191|215->192|217->194|217->194|217->194|218->195|218->195|219->196|219->196|219->196|220->197|222->199|222->199|223->200|223->200|223->200|224->201|225->202|225->202|226->203|226->203|226->203|226->203|227->204|228->205|228->205|229->206|229->206|231->208|231->208|231->208|232->209|232->209|232->209|232->209|233->210|233->210|234->211|235->212|235->212|235->212|235->212|236->213|237->214|237->214|238->215|238->215|239->216|239->216|241->218|241->218|242->219|242->219|242->219|242->219|242->219|245->222|245->222|245->222|246->223|246->223|247->224|249->226|249->226|249->226|249->226|250->227|250->227|250->227|250->227|250->227|250->227|250->227|252->229|252->229|252->229|252->229|253->230|254->231|254->231|257->234|257->234|257->234|258->235|258->235|259->236|261->238|261->238|262->239|262->239|262->239|263->240|268->245|268->245|269->246|269->246|270->247|270->247|270->247|270->247|271->248|272->249|272->249|274->251|274->251|275->252|275->252|275->252|275->252|275->252|275->252|276->253|276->253|276->253|277->254|278->255|278->255|279->256|279->256|280->257|280->257|281->258|283->260|283->260|284->261|284->261|286->263|286->263|287->264|288->265|288->265|289->266|289->266|289->266|289->266|289->266|290->267|290->267|291->268|291->268|291->268|292->269|294->271|294->271|295->272|296->273|296->273|298->275|298->275|298->275|299->276|300->277|300->277|302->279|302->279|302->279|303->280|306->283|306->283|308->285|308->285|311->288
                  -- GENERATED --
              */
          