
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


Seq[Any](_display_(/*1.2*/main("Новое объявление - Поиск потерянных вещей. Бюро находок Украина")/*1.73*/ {_display_(Seq[Any](format.raw/*1.75*/("""

    """),format.raw/*3.5*/("""<section class="main no-padding" style="margin-top: 100px;" ng-controller="newAnnouncementCtrl">
        <div class="container">

            <div class="row">
                <div class="col-md-3 col-sm-3 col-md-push-9 col-sm-push-9">
                    <div class="widget alert alert-warning-custom">
                        <section><i class="fa fa-warning"></i> Для избежания мошенничества,
                            не прикрепляйте фото, на которых видно все детали найденных Вами вещей.</section>
                    </div>
                    <div class="widget alert alert-success">
                        <section><i class="fa fa-globe"></i> Чтобы о Вашем обьявлении узнало больше людей, оно также будет автоматически опубликовано в наших сообществах в соцсетях:<br><a href="http://www.vk.com/znahidkaua">vk.com/znahidkaua</a><br><a href="http://www.facebook.com/znahidkaua">facebook.com/znahidkaua</a></section>
                    </div>
                </div>
                <div class="col-md-9 col-sm-9 col-md-pull-3 col-sm-pull-3">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">Создание нового обьявления</h4>
                        </div>

                        <form accept-charset="utf-8" ng-submit="submit()" class="form-horizontal" name="form">
                            <div class="panel-body">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Заголовок<i class="required-field">*</i></label>
                                    <div class="col-sm-9">
                                        <input ng-model="title1" type="text" name="title1" id="title1" class="form-control" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Тип<i class="required-field">*</i></label>
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
                                     <label class="col-sm-3 control-label">Раздел<i class="required-field">*</i></label>
                                     <div class="col-sm-4">
                                         <select ng-model="category" name="category" id="category" class="form-control" required>
                                             <option value=""></option>
                                             <option ng-repeat="category in categories" value=""""),format.raw/*46.96*/("""{"""),format.raw/*46.97*/("""{"""),format.raw/*46.98*/("""category.id"""),format.raw/*46.109*/("""}"""),format.raw/*46.110*/("""}"""),format.raw/*46.111*/("""">"""),format.raw/*46.113*/("""{"""),format.raw/*46.114*/("""{"""),format.raw/*46.115*/("""category.name"""),format.raw/*46.128*/("""}"""),format.raw/*46.129*/("""}"""),format.raw/*46.130*/("""</option>

                                         </select>
                                     </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Описание<i class="required-field">*</i></label>
                                    <div class="col-sm-9">
                                        <textarea ng-model="description" name="description" id="description" class="form-control" maxlength="999" rows="5" required></textarea>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Адрес<i class="required-field">*</i></label>
                                    <div class="col-sm-5">
                                        <input type="text" ng-model="selectedAddr"
                                        typeahead="address as address.formatted_address for address in locations | limitTo:10"
                                        typeahead-loading="loadingLocations"
                                        typeahead-no-results="noResults"
                                        class="form-control"
                                        autocomplete="off" required/>
                                        <i ng-show="loadingLocations" class="glyphicon glyphicon-refresh" ng-cloak></i>
                                        <div ng-show="noResults" style="color: red;" ng-cloak>
                                            <i class="glyphicon glyphicon-remove"></i> Выберите адрес
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Фото</label>
                                    <div class="col-sm-5">
                                        <input ng-model="photo" type="file" class="filestyle" name="photo" id="photo" maxsize="1024" data-buttonName="btn-default" data-buttonText=""
                                        base-sixty-four-input accept="image/jpeg, image/png"/>
                                        <span class="help-block" ng-show="form.photo.$error.maxsize">Фото должно быть не больше 1024КБ</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Контактное лицо<i class="required-field">*</i></label>
                                    <div class="col-sm-4">
                                        <input ng-model="contact" type="text" name="name" id="name" class="form-control" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Email-адрес<i class="required-field">*</i></label>
                                    <div class="col-sm-4">
                                        <input ng-model="email" type="email" name="email" id="email" class="form-control" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Номер телефона<i class="required-field">*</i></label>
                                    <div class="col-sm-4">
                                        <input ng-model="phone" type="tel" name="phone" id="phone" class="form-control" pattern="\d"""),format.raw/*95.132*/("""{"""),format.raw/*95.133*/("""7,12"""),format.raw/*95.137*/("""}"""),format.raw/*95.138*/("""" title="Номер телефона" required>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer">
                                <div class="row">
                                    <div class="col-sm-offset-3 col-sm-9">
                                        <button type="submit" class="btn btn-success"><i class="fa fa-check" ng-show="!loading"></i><i class="fa fa-spinner fa-spin" ng-show="loading"></i> Опубликовать</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script src="/assets/plugins/filestyle/bootstrap-filestyle.min.js"></script>

    <script>

          angular.module('lostfoundApp', ['ui.bootstrap', 'naif.base64'])
          .controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*118.81*/("""{"""),format.raw/*118.82*/("""
                """),format.raw/*119.17*/("""$rootScope.title = "Новое обьявление - ";
                $scope.checkSession = function()"""),format.raw/*120.49*/("""{"""),format.raw/*120.50*/("""
                    """),format.raw/*121.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*123.34*/routes/*123.40*/.Account.checkSession()),format.raw/*123.63*/("""')
                    .success(function(data)"""),format.raw/*124.44*/("""{"""),format.raw/*124.45*/("""
                        """),format.raw/*125.25*/("""if(data.error == "")"""),format.raw/*125.45*/("""{"""),format.raw/*125.46*/("""
                            """),format.raw/*126.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                            $scope.email = data.email;
                            $scope.phone = data.phone;
                            $scope.contact = data.contact;
                            $('#email').prop('readonly', true);
                        """),format.raw/*132.25*/("""}"""),format.raw/*132.26*/("""
                        """),format.raw/*133.25*/("""else"""),format.raw/*133.29*/("""{"""),format.raw/*133.30*/("""
                            """),format.raw/*134.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*135.25*/("""}"""),format.raw/*135.26*/("""
                    """),format.raw/*136.21*/("""}"""),format.raw/*136.22*/(""").error(function(data)"""),format.raw/*136.44*/("""{"""),format.raw/*136.45*/("""
                        """),format.raw/*137.25*/("""console.log(data);
                    """),format.raw/*138.21*/("""}"""),format.raw/*138.22*/(""");
                """),format.raw/*139.17*/("""}"""),format.raw/*139.18*/("""

                """),format.raw/*141.17*/("""$scope.doLogout = function()"""),format.raw/*141.45*/("""{"""),format.raw/*141.46*/("""
                    """),format.raw/*142.21*/("""$http.post('"""),_display_(/*142.34*/routes/*142.40*/.Account.logout()),format.raw/*142.57*/("""')
                    .success(function(data)"""),format.raw/*143.44*/("""{"""),format.raw/*143.45*/("""
                        """),format.raw/*144.25*/("""window.location.replace("/");
                    """),format.raw/*145.21*/("""}"""),format.raw/*145.22*/(""").error(function(data, status)"""),format.raw/*145.52*/("""{"""),format.raw/*145.53*/("""
                        """),format.raw/*146.25*/("""console.log(data);
                    """),format.raw/*147.21*/("""}"""),format.raw/*147.22*/(""");
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/("""
        """),format.raw/*149.9*/("""}"""),format.raw/*149.10*/(""")

        .controller('newAnnouncementCtrl', function($scope, $http) """),format.raw/*151.68*/("""{"""),format.raw/*151.69*/("""
                """),format.raw/*152.17*/("""$scope.type = "lost";
                $scope.loading = false;
                //get categories
                $http.get('"""),_display_(/*155.29*/routes/*155.35*/.Announcement.getCategories()),format.raw/*155.64*/("""')
                 .success(function(data)"""),format.raw/*156.41*/("""{"""),format.raw/*156.42*/("""
                    """),format.raw/*157.21*/("""console.log(data);
                    $scope.categories = data;
                 """),format.raw/*159.18*/("""}"""),format.raw/*159.19*/(""").error(function(data)"""),format.raw/*159.41*/("""{"""),format.raw/*159.42*/("""
                    """),format.raw/*160.21*/("""console.log(data);
                 """),format.raw/*161.18*/("""}"""),format.raw/*161.19*/(""");


            $scope.$watch('selectedAddr', function() """),format.raw/*164.54*/("""{"""),format.raw/*164.55*/("""
               """),format.raw/*165.16*/("""return $http.get('"""),_display_(/*165.35*/routes/*165.41*/.Announcement.getAddress()),format.raw/*165.67*/("""', """),format.raw/*165.70*/("""{"""),format.raw/*165.71*/("""
                """),format.raw/*166.17*/("""params: """),format.raw/*166.25*/("""{"""),format.raw/*166.26*/("""
                """),format.raw/*167.17*/("""q: $scope.selectedAddr
                  """),format.raw/*168.19*/("""}"""),format.raw/*168.20*/("""
                """),format.raw/*169.17*/("""}"""),format.raw/*169.18*/(""")
               .then(function(response)"""),format.raw/*170.40*/("""{"""),format.raw/*170.41*/("""
                    """),format.raw/*171.21*/("""console.log(response);
                    $scope.locations = response.data;
               """),format.raw/*173.16*/("""}"""),format.raw/*173.17*/(""");
            """),format.raw/*174.13*/("""}"""),format.raw/*174.14*/(""");


            $scope.submit = function()"""),format.raw/*177.39*/("""{"""),format.raw/*177.40*/("""
                """),format.raw/*178.17*/("""console.log($scope.selectedAddr);

                if(typeof($scope.selectedAddr.regionId) == 'undefined')"""),format.raw/*180.72*/("""{"""),format.raw/*180.73*/("""
                    """),format.raw/*181.21*/("""$scope.noResults = true;
                    return;
                """),format.raw/*183.17*/("""}"""),format.raw/*183.18*/("""

                """),format.raw/*185.17*/("""if($scope.photo == null)"""),format.raw/*185.41*/("""{"""),format.raw/*185.42*/("""
                    """),format.raw/*186.21*/("""$scope.photo = """),format.raw/*186.36*/("""{"""),format.raw/*186.37*/(""""base64":"",filetype:"""""),format.raw/*186.60*/("""}"""),format.raw/*186.61*/("""
                """),format.raw/*187.17*/("""}"""),format.raw/*187.18*/("""
                """),format.raw/*188.17*/("""console.log($scope.photo);

                var post_data = """),format.raw/*190.33*/("""{"""),format.raw/*190.34*/(""""_type" : $scope.type,
                                                  "title" : $scope.title1,
                                                  "category" : $scope.category,
                                                  "description" : $scope.description,
                                                  "region" : $scope.selectedAddr.regionId,
                                                  "city" : $scope.selectedAddr.cityId,
                                                  "base64" : $scope.photo.base64,
                                                  "filetype":$scope.photo.filetype,
                                                  "contact" : $scope.contact,
                                                  "email" : $scope.email,
                                                  "phone" : $scope.phone"""),format.raw/*200.73*/("""}"""),format.raw/*200.74*/(""";
                console.log(post_data)
                $scope.loading = true;
                $http.post('"""),_display_(/*203.30*/routes/*203.36*/.Announcement.postAnnouncement()),format.raw/*203.68*/("""', post_data)
                .success(function(data)"""),format.raw/*204.40*/("""{"""),format.raw/*204.41*/("""
                    """),format.raw/*205.21*/("""$scope.loading = false;
                    console.log(data);
                    if(data.error == "")"""),format.raw/*207.41*/("""{"""),format.raw/*207.42*/("""
                       """),format.raw/*208.24*/("""window.location.href = "/announcement/addconfirm?id="+data.id;
                    """),format.raw/*209.21*/("""}"""),format.raw/*209.22*/("""
                """),format.raw/*210.17*/("""}"""),format.raw/*210.18*/(""").error(function(data)"""),format.raw/*210.40*/("""{"""),format.raw/*210.41*/("""
                    """),format.raw/*211.21*/("""console.log(data);
                """),format.raw/*212.17*/("""}"""),format.raw/*212.18*/(""");
            """),format.raw/*213.13*/("""}"""),format.raw/*213.14*/("""

        """),format.raw/*215.9*/("""}"""),format.raw/*215.10*/(""")

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
                  DATE: Sun Jan 31 13:48:52 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newannouncement.scala.html
                  HASH: 4f645edf298b0d561087f31787536c0762911a56
                  MATRIX: 642->1|721->72|760->74|792->80|4060->3320|4089->3321|4118->3322|4158->3333|4188->3334|4218->3335|4249->3337|4279->3338|4309->3339|4351->3352|4381->3353|4411->3354|8245->7159|8275->7160|8308->7164|8338->7165|9408->8206|9438->8207|9484->8224|9603->8314|9633->8315|9683->8336|9825->8450|9841->8456|9886->8479|9961->8525|9991->8526|10045->8551|10094->8571|10124->8572|10182->8601|10595->8986|10625->8987|10679->9012|10712->9016|10742->9017|10800->9046|10884->9101|10914->9102|10964->9123|10994->9124|11045->9146|11075->9147|11129->9172|11197->9211|11227->9212|11275->9231|11305->9232|11352->9250|11409->9278|11439->9279|11489->9300|11530->9313|11546->9319|11585->9336|11660->9382|11690->9383|11744->9408|11823->9458|11853->9459|11912->9489|11942->9490|11996->9515|12064->9554|12094->9555|12142->9574|12172->9575|12209->9584|12239->9585|12338->9655|12368->9656|12414->9673|12565->9796|12581->9802|12632->9831|12704->9874|12734->9875|12784->9896|12895->9978|12925->9979|12976->10001|13006->10002|13056->10023|13121->10059|13151->10060|13238->10118|13268->10119|13313->10135|13360->10154|13376->10160|13424->10186|13456->10189|13486->10190|13532->10207|13569->10215|13599->10216|13645->10233|13715->10274|13745->10275|13791->10292|13821->10293|13891->10334|13921->10335|13971->10356|14092->10448|14122->10449|14166->10464|14196->10465|14268->10508|14298->10509|14344->10526|14479->10632|14509->10633|14559->10654|14657->10723|14687->10724|14734->10742|14787->10766|14817->10767|14867->10788|14911->10803|14941->10804|14993->10827|15023->10828|15069->10845|15099->10846|15145->10863|15234->10923|15264->10924|16125->11756|16155->11757|16292->11866|16308->11872|16362->11904|16444->11957|16474->11958|16524->11979|16656->12082|16686->12083|16739->12107|16851->12190|16881->12191|16927->12208|16957->12209|17008->12231|17038->12232|17088->12253|17152->12288|17182->12289|17226->12304|17256->12305|17294->12315|17324->12316
                  LINES: 25->1|25->1|25->1|27->3|70->46|70->46|70->46|70->46|70->46|70->46|70->46|70->46|70->46|70->46|70->46|70->46|119->95|119->95|119->95|119->95|142->118|142->118|143->119|144->120|144->120|145->121|147->123|147->123|147->123|148->124|148->124|149->125|149->125|149->125|150->126|156->132|156->132|157->133|157->133|157->133|158->134|159->135|159->135|160->136|160->136|160->136|160->136|161->137|162->138|162->138|163->139|163->139|165->141|165->141|165->141|166->142|166->142|166->142|166->142|167->143|167->143|168->144|169->145|169->145|169->145|169->145|170->146|171->147|171->147|172->148|172->148|173->149|173->149|175->151|175->151|176->152|179->155|179->155|179->155|180->156|180->156|181->157|183->159|183->159|183->159|183->159|184->160|185->161|185->161|188->164|188->164|189->165|189->165|189->165|189->165|189->165|189->165|190->166|190->166|190->166|191->167|192->168|192->168|193->169|193->169|194->170|194->170|195->171|197->173|197->173|198->174|198->174|201->177|201->177|202->178|204->180|204->180|205->181|207->183|207->183|209->185|209->185|209->185|210->186|210->186|210->186|210->186|210->186|211->187|211->187|212->188|214->190|214->190|224->200|224->200|227->203|227->203|227->203|228->204|228->204|229->205|231->207|231->207|232->208|233->209|233->209|234->210|234->210|234->210|234->210|235->211|236->212|236->212|237->213|237->213|239->215|239->215
                  -- GENERATED --
              */
          