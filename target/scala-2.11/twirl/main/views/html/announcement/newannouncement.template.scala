
package views.html.announcement

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newannouncement_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newannouncement extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Новое объявление")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""

    """),format.raw/*3.5*/("""<div class="container" style="margin-top: 70px;" ng-controller="newAnnouncementCtrl">
        <h4>Добавление объявления</h4>
        <hr>
        <form class="form-horizontal" ng-submit="submit()">
            <div class="form-group">
                <label for="title" class="col-sm-2 control-label">Заголовок</label>
                <div class="col-sm-8">
                    <input ng-model="title" type="text" name="title" id="title" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label for="category" class="col-sm-2 control-label">Раздел</label>
                <div class="col-sm-4">
                    <select ng-model="category" name="category" id="category" class="form-control" required>
                        <option value=""></option>
                        <option ng-repeat="category in categories" value=""""),format.raw/*18.75*/("""{"""),format.raw/*18.76*/("""{"""),format.raw/*18.77*/("""category.id"""),format.raw/*18.88*/("""}"""),format.raw/*18.89*/("""}"""),format.raw/*18.90*/("""">"""),format.raw/*18.92*/("""{"""),format.raw/*18.93*/("""{"""),format.raw/*18.94*/("""category.name"""),format.raw/*18.107*/("""}"""),format.raw/*18.108*/("""}"""),format.raw/*18.109*/("""</option>

                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="type" class="col-sm-2 control-label">Тип</label>
                <div class="col-sm-4">
                    <label class="radio-inline">
                        <input ng-model="type" type="radio" name="type" id="lostRadio" value="lost"> Потеряно
                    </label>
                    <label class="radio-inline">
                        <input ng-model="type" type="radio" name="type" id="foundRadio" value="found"> Найдено
                    </label>
                </div>
            </div>
            <div class="form-group">
                <label for="description" class="col-sm-2 control-label">Описание</label>
                <div class="col-sm-8">
                    <textarea ng-model="description" name="description" id="description" class="form-control" rows="5" required></textarea>
                </div>
            </div>
            <div class="form-group">
                <label for="address" class="col-sm-2 control-label">Адрес</label>
                <div class="col-sm-4">
                    <input ng-model="address" type="text" ng-model="asyncSelected" typeahead="address.formatted_address for address in locations | limitTo:10" typeahead-loading="loadingLocations" typeahead-no-results="noResults" class="form-control" required>
                    <i ng-show="loadingLocations" class="glyphicon glyphicon-refresh"></i>
                    <div ng-show="noResults">
                        <i class="glyphicon glyphicon-remove"></i> No Results Found
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">Контактное лицо</label>
                <div class="col-sm-4">
                    <input ng-model="name" type="text" name="name" id="name" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <label for="email" class="col-sm-2 control-label">Email-адрес</label>
                <div class="col-sm-4">
                    <input ng-model="email" type="email" name="email" id="email" class="form-control" required>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Отправить</button>
                </div>
            </div>
        </form>
    </div>

    <script>


        angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('newAnnouncementCtrl', function($scope, $http) """),format.raw/*74.68*/("""{"""),format.raw/*74.69*/("""

                 """),format.raw/*76.18*/("""$.ajax("""),format.raw/*76.25*/("""{"""),format.raw/*76.26*/("""
            """),format.raw/*77.13*/("""type: 'POST',
            url: '"""),_display_(/*78.20*/routes/*78.26*/.Account.checkSession()),format.raw/*78.49*/("""',
            success: function(data)"""),format.raw/*79.36*/("""{"""),format.raw/*79.37*/("""

                """),format.raw/*81.17*/("""if(data.error == "")"""),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""
                    """),format.raw/*82.21*/("""var name = data.email.substring(0, data.email.lastIndexOf("@"));

                    var menu = "<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>"+name+"<span class='caret'></span></a>"+
                                "<ul class='dropdown-menu' role='menu'>"+
                                "<li><a href='/account'>Профиль</a></li>"+
                                "<li><a href='#'>Another action</a></li>"+
                                "<li class='divider'></li>"+
                                "<li id='signOut'><a href='#'>Выход</a></li>"+
                                "</ul>";
                    $("#profile-link").html(menu);
                    $scope.email = data.email;
                    $("#email").prop('disabled', true);

                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/("""else"""),format.raw/*95.22*/("""{"""),format.raw/*95.23*/("""
                     """),format.raw/*96.22*/("""$("#profile-link").html("<a href='/account/signin'>Профиль</a></li>");
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/(""");

                //get categories
                $http.get('"""),_display_(/*102.29*/routes/*102.35*/.Announcement.getCategories()),format.raw/*102.64*/("""')
                 .success(function(data)"""),format.raw/*103.41*/("""{"""),format.raw/*103.42*/("""
                    """),format.raw/*104.21*/("""console.log(data);
                    $scope.categories = data;
                 """),format.raw/*106.18*/("""}"""),format.raw/*106.19*/(""").error(function(data)"""),format.raw/*106.41*/("""{"""),format.raw/*106.42*/("""
                    """),format.raw/*107.21*/("""console.log(data);
                 """),format.raw/*108.18*/("""}"""),format.raw/*108.19*/(""");


            $scope.$watch('address', function() """),format.raw/*111.49*/("""{"""),format.raw/*111.50*/("""
               """),format.raw/*112.16*/("""return $http.get('"""),_display_(/*112.35*/routes/*112.41*/.Announcement.getAddress()),format.raw/*112.67*/("""', """),format.raw/*112.70*/("""{"""),format.raw/*112.71*/("""
                """),format.raw/*113.17*/("""params: """),format.raw/*113.25*/("""{"""),format.raw/*113.26*/("""
                """),format.raw/*114.17*/("""q: $scope.address
                  """),format.raw/*115.19*/("""}"""),format.raw/*115.20*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/(""")
               .then(function(response)"""),format.raw/*117.40*/("""{"""),format.raw/*117.41*/("""
                    """),format.raw/*118.21*/("""console.log(response);
                    //return response.data;
                       $scope.locations = response.data;
                      // сщтыщдуюдщп()
               """),format.raw/*122.16*/("""}"""),format.raw/*122.17*/(""");
            """),format.raw/*123.13*/("""}"""),format.raw/*123.14*/(""");

            $scope.submit = function()"""),format.raw/*125.39*/("""{"""),format.raw/*125.40*/("""

                """),format.raw/*127.17*/("""var city = $scope.address.substring(0, $scope.address.indexOf(","));
                var region = $scope.address.substring($scope.address.indexOf(",")+2, $scope.address.length);

                var post_data = """),format.raw/*130.33*/("""{"""),format.raw/*130.34*/(""""action" : "postAd", "params" :
                                                  """),format.raw/*131.51*/("""{"""),format.raw/*131.52*/(""""type" : $scope.type,
                                                  "title" : $scope.title,
                                                  "category" : $scope.category,
                                                  "description" : $scope.description,
                                                  "region" : region,
                                                  "city" : city,
                                                  "contact" : $scope.name,
                                                  "email" : $scope.email"""),format.raw/*138.73*/("""}"""),format.raw/*138.74*/("""}"""),format.raw/*138.75*/(""";
                console.log(post_data);
                $http.post('"""),_display_(/*140.30*/routes/*140.36*/.Announcement.postAnnouncement()),format.raw/*140.68*/("""', post_data)
                .success(function(data)"""),format.raw/*141.40*/("""{"""),format.raw/*141.41*/("""
                    """),format.raw/*142.21*/("""console.log(data.error);
                    if(data.error == "")"""),format.raw/*143.41*/("""{"""),format.raw/*143.42*/("""
                        """),format.raw/*144.25*/("""window.location.replace("/announcement/addconfirm");
                    """),format.raw/*145.21*/("""}"""),format.raw/*145.22*/("""
                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/(""").error(function(data)"""),format.raw/*146.40*/("""{"""),format.raw/*146.41*/("""
                    """),format.raw/*147.21*/("""console.log(data);
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/(""");
            """),format.raw/*149.13*/("""}"""),format.raw/*149.14*/("""

        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""")

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
object newannouncement extends newannouncement_Scope0.newannouncement
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 21:30:28 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newannouncement.scala.html
                  HASH: ca35fdf68a761f952cf9d5c5942c8b1cda180ee2
                  MATRIX: 642->1|674->25|713->27|745->33|1678->938|1707->939|1736->940|1775->951|1804->952|1833->953|1863->955|1892->956|1921->957|1963->970|1993->971|2023->972|4779->3700|4808->3701|4855->3720|4890->3727|4919->3728|4960->3741|5020->3774|5035->3780|5079->3803|5145->3841|5174->3842|5220->3860|5268->3880|5297->3881|5346->3902|6185->4714|6214->4715|6246->4719|6275->4720|6325->4742|6440->4829|6469->4830|6510->4843|6539->4844|6575->4853|6604->4854|6697->4919|6713->4925|6764->4954|6836->4997|6866->4998|6916->5019|7027->5101|7057->5102|7108->5124|7138->5125|7188->5146|7253->5182|7283->5183|7365->5236|7395->5237|7440->5253|7487->5272|7503->5278|7551->5304|7583->5307|7613->5308|7659->5325|7696->5333|7726->5334|7772->5351|7837->5387|7867->5388|7913->5405|7943->5406|8013->5447|8043->5448|8093->5469|8300->5647|8330->5648|8374->5663|8404->5664|8475->5706|8505->5707|8552->5725|8792->5936|8822->5937|8933->6019|8963->6020|9535->6563|9565->6564|9595->6565|9694->6636|9710->6642|9764->6674|9846->6727|9876->6728|9926->6749|10020->6814|10050->6815|10104->6840|10206->6913|10236->6914|10282->6931|10312->6932|10363->6954|10393->6955|10443->6976|10507->7011|10537->7012|10581->7027|10611->7028|10649->7038|10679->7039
                  LINES: 25->1|25->1|25->1|27->3|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|98->74|98->74|100->76|100->76|100->76|101->77|102->78|102->78|102->78|103->79|103->79|105->81|105->81|105->81|106->82|119->95|119->95|119->95|119->95|120->96|121->97|121->97|122->98|122->98|123->99|123->99|126->102|126->102|126->102|127->103|127->103|128->104|130->106|130->106|130->106|130->106|131->107|132->108|132->108|135->111|135->111|136->112|136->112|136->112|136->112|136->112|136->112|137->113|137->113|137->113|138->114|139->115|139->115|140->116|140->116|141->117|141->117|142->118|146->122|146->122|147->123|147->123|149->125|149->125|151->127|154->130|154->130|155->131|155->131|162->138|162->138|162->138|164->140|164->140|164->140|165->141|165->141|166->142|167->143|167->143|168->144|169->145|169->145|170->146|170->146|170->146|170->146|171->147|172->148|172->148|173->149|173->149|175->151|175->151
                  -- GENERATED --
              */
          