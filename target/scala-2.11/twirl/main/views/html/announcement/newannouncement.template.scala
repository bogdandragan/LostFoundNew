
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

    """),format.raw/*3.5*/("""<section class="main no-padding" style="margin-top: 100px;" ng-controller="newAnnouncementCtrl">
        <div class="container">

            <div class="row">
                <div class="col-md-3 col-sm-3 col-md-push-9 col-sm-push-9">
                    <div class="widget alert alert-warning-custom">
                        <section><i class="fa fa-warning"></i> Для избежания мошенничества,
                            не прикрепляйте фото, на которых видно все детали найденных Вами вещей.</section>
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
                                        <input ng-model="title" type="text" name="title" id="title" class="form-control" required>
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
                                             <option ng-repeat="category in categories" value=""""),format.raw/*43.96*/("""{"""),format.raw/*43.97*/("""{"""),format.raw/*43.98*/("""category.id"""),format.raw/*43.109*/("""}"""),format.raw/*43.110*/("""}"""),format.raw/*43.111*/("""">"""),format.raw/*43.113*/("""{"""),format.raw/*43.114*/("""{"""),format.raw/*43.115*/("""category.name"""),format.raw/*43.128*/("""}"""),format.raw/*43.129*/("""}"""),format.raw/*43.130*/("""</option>

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
                                        <input ng-model="phone" type="tel" name="phone" id="phone" class="form-control" pattern="\d"""),format.raw/*92.132*/("""{"""),format.raw/*92.133*/("""7,12"""),format.raw/*92.137*/("""}"""),format.raw/*92.138*/("""" title="Номер телефона" required>
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
          .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*115.69*/("""{"""),format.raw/*115.70*/("""

                """),format.raw/*117.17*/("""$scope.checkSession = function()"""),format.raw/*117.49*/("""{"""),format.raw/*117.50*/("""
                    """),format.raw/*118.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*120.34*/routes/*120.40*/.Account.checkSession()),format.raw/*120.63*/("""')
                    .success(function(data)"""),format.raw/*121.44*/("""{"""),format.raw/*121.45*/("""
                        """),format.raw/*122.25*/("""if(data.error == "")"""),format.raw/*122.45*/("""{"""),format.raw/*122.46*/("""
                            """),format.raw/*123.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                            $scope.email = data.email;
                            $scope.phone = data.phone;
                            $scope.contact = data.contact;
                            $('#email').prop('readonly', true);
                        """),format.raw/*129.25*/("""}"""),format.raw/*129.26*/("""
                        """),format.raw/*130.25*/("""else"""),format.raw/*130.29*/("""{"""),format.raw/*130.30*/("""
                            """),format.raw/*131.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*132.25*/("""}"""),format.raw/*132.26*/("""
                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/(""").error(function(data)"""),format.raw/*133.44*/("""{"""),format.raw/*133.45*/("""
                        """),format.raw/*134.25*/("""console.log(data);
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""");
                """),format.raw/*136.17*/("""}"""),format.raw/*136.18*/("""

                """),format.raw/*138.17*/("""$scope.doLogout = function()"""),format.raw/*138.45*/("""{"""),format.raw/*138.46*/("""
                    """),format.raw/*139.21*/("""$http.post('"""),_display_(/*139.34*/routes/*139.40*/.Account.logout()),format.raw/*139.57*/("""')
                    .success(function(data)"""),format.raw/*140.44*/("""{"""),format.raw/*140.45*/("""
                        """),format.raw/*141.25*/("""window.location.replace("/");
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/(""").error(function(data, status)"""),format.raw/*142.52*/("""{"""),format.raw/*142.53*/("""
                        """),format.raw/*143.25*/("""console.log(data);
                    """),format.raw/*144.21*/("""}"""),format.raw/*144.22*/(""");
                """),format.raw/*145.17*/("""}"""),format.raw/*145.18*/("""
        """),format.raw/*146.9*/("""}"""),format.raw/*146.10*/(""")

        .controller('newAnnouncementCtrl', function($scope, $http) """),format.raw/*148.68*/("""{"""),format.raw/*148.69*/("""
                """),format.raw/*149.17*/("""$scope.type = "lost";
                $scope.loading = false;
                //get categories
                $http.get('"""),_display_(/*152.29*/routes/*152.35*/.Announcement.getCategories()),format.raw/*152.64*/("""')
                 .success(function(data)"""),format.raw/*153.41*/("""{"""),format.raw/*153.42*/("""
                    """),format.raw/*154.21*/("""console.log(data);
                    $scope.categories = data;
                 """),format.raw/*156.18*/("""}"""),format.raw/*156.19*/(""").error(function(data)"""),format.raw/*156.41*/("""{"""),format.raw/*156.42*/("""
                    """),format.raw/*157.21*/("""console.log(data);
                 """),format.raw/*158.18*/("""}"""),format.raw/*158.19*/(""");


            $scope.$watch('selectedAddr', function() """),format.raw/*161.54*/("""{"""),format.raw/*161.55*/("""
               """),format.raw/*162.16*/("""return $http.get('"""),_display_(/*162.35*/routes/*162.41*/.Announcement.getAddress()),format.raw/*162.67*/("""', """),format.raw/*162.70*/("""{"""),format.raw/*162.71*/("""
                """),format.raw/*163.17*/("""params: """),format.raw/*163.25*/("""{"""),format.raw/*163.26*/("""
                """),format.raw/*164.17*/("""q: $scope.selectedAddr
                  """),format.raw/*165.19*/("""}"""),format.raw/*165.20*/("""
                """),format.raw/*166.17*/("""}"""),format.raw/*166.18*/(""")
               .then(function(response)"""),format.raw/*167.40*/("""{"""),format.raw/*167.41*/("""
                    """),format.raw/*168.21*/("""console.log(response);
                    $scope.locations = response.data;
               """),format.raw/*170.16*/("""}"""),format.raw/*170.17*/(""");
            """),format.raw/*171.13*/("""}"""),format.raw/*171.14*/(""");


            $scope.submit = function()"""),format.raw/*174.39*/("""{"""),format.raw/*174.40*/("""
                """),format.raw/*175.17*/("""console.log($scope.selectedAddr);

                if(typeof($scope.selectedAddr.regionId) == 'undefined')"""),format.raw/*177.72*/("""{"""),format.raw/*177.73*/("""
                    """),format.raw/*178.21*/("""$scope.noResults = true;
                    return;
                """),format.raw/*180.17*/("""}"""),format.raw/*180.18*/("""

                """),format.raw/*182.17*/("""if($scope.photo == null)"""),format.raw/*182.41*/("""{"""),format.raw/*182.42*/("""
                    """),format.raw/*183.21*/("""$scope.photo = """),format.raw/*183.36*/("""{"""),format.raw/*183.37*/(""""base64":"",filetype:"""""),format.raw/*183.60*/("""}"""),format.raw/*183.61*/("""
                """),format.raw/*184.17*/("""}"""),format.raw/*184.18*/("""
                """),format.raw/*185.17*/("""console.log($scope.photo);

                var post_data = """),format.raw/*187.33*/("""{"""),format.raw/*187.34*/(""""_type" : $scope.type,
                                                  "title" : $scope.title,
                                                  "category" : $scope.category,
                                                  "description" : $scope.description,
                                                  "region" : $scope.selectedAddr.regionId,
                                                  "city" : $scope.selectedAddr.cityId,
                                                  "base64" : $scope.photo.base64,
                                                  "filetype":$scope.photo.filetype,
                                                  "contact" : $scope.contact,
                                                  "email" : $scope.email,
                                                  "phone" : $scope.phone"""),format.raw/*197.73*/("""}"""),format.raw/*197.74*/(""";
                console.log(post_data)
                $scope.loading = true;
                $http.post('"""),_display_(/*200.30*/routes/*200.36*/.Announcement.postAnnouncement()),format.raw/*200.68*/("""', post_data)
                .success(function(data)"""),format.raw/*201.40*/("""{"""),format.raw/*201.41*/("""
                    """),format.raw/*202.21*/("""$scope.loading = false;
                    console.log(data);
                    if(data.error == "")"""),format.raw/*204.41*/("""{"""),format.raw/*204.42*/("""
                       """),format.raw/*205.24*/("""window.location.href = "/announcement/addconfirm?id="+data.id;
                    """),format.raw/*206.21*/("""}"""),format.raw/*206.22*/("""
                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/(""").error(function(data)"""),format.raw/*207.40*/("""{"""),format.raw/*207.41*/("""
                    """),format.raw/*208.21*/("""console.log(data);
                """),format.raw/*209.17*/("""}"""),format.raw/*209.18*/(""");
            """),format.raw/*210.13*/("""}"""),format.raw/*210.14*/("""

        """),format.raw/*212.9*/("""}"""),format.raw/*212.10*/(""")

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
                  DATE: Sat Jan 23 12:18:11 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newannouncement.scala.html
                  HASH: 0bb80ab702002f8d856c08b0840c6020523bddc6
                  MATRIX: 642->1|674->25|713->27|745->33|3590->2850|3619->2851|3648->2852|3688->2863|3718->2864|3748->2865|3779->2867|3809->2868|3839->2869|3881->2882|3911->2883|3941->2884|7775->6689|7805->6690|7838->6694|7868->6695|8926->7724|8956->7725|9003->7743|9064->7775|9094->7776|9144->7797|9286->7911|9302->7917|9347->7940|9422->7986|9452->7987|9506->8012|9555->8032|9585->8033|9643->8062|10056->8447|10086->8448|10140->8473|10173->8477|10203->8478|10261->8507|10345->8562|10375->8563|10425->8584|10455->8585|10506->8607|10536->8608|10590->8633|10658->8672|10688->8673|10736->8692|10766->8693|10813->8711|10870->8739|10900->8740|10950->8761|10991->8774|11007->8780|11046->8797|11121->8843|11151->8844|11205->8869|11284->8919|11314->8920|11373->8950|11403->8951|11457->8976|11525->9015|11555->9016|11603->9035|11633->9036|11670->9045|11700->9046|11799->9116|11829->9117|11875->9134|12026->9257|12042->9263|12093->9292|12165->9335|12195->9336|12245->9357|12356->9439|12386->9440|12437->9462|12467->9463|12517->9484|12582->9520|12612->9521|12699->9579|12729->9580|12774->9596|12821->9615|12837->9621|12885->9647|12917->9650|12947->9651|12993->9668|13030->9676|13060->9677|13106->9694|13176->9735|13206->9736|13252->9753|13282->9754|13352->9795|13382->9796|13432->9817|13553->9909|13583->9910|13627->9925|13657->9926|13729->9969|13759->9970|13805->9987|13940->10093|13970->10094|14020->10115|14118->10184|14148->10185|14195->10203|14248->10227|14278->10228|14328->10249|14372->10264|14402->10265|14454->10288|14484->10289|14530->10306|14560->10307|14606->10324|14695->10384|14725->10385|15585->11216|15615->11217|15752->11326|15768->11332|15822->11364|15904->11417|15934->11418|15984->11439|16116->11542|16146->11543|16199->11567|16311->11650|16341->11651|16387->11668|16417->11669|16468->11691|16498->11692|16548->11713|16612->11748|16642->11749|16686->11764|16716->11765|16754->11775|16784->11776
                  LINES: 25->1|25->1|25->1|27->3|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|116->92|116->92|116->92|116->92|139->115|139->115|141->117|141->117|141->117|142->118|144->120|144->120|144->120|145->121|145->121|146->122|146->122|146->122|147->123|153->129|153->129|154->130|154->130|154->130|155->131|156->132|156->132|157->133|157->133|157->133|157->133|158->134|159->135|159->135|160->136|160->136|162->138|162->138|162->138|163->139|163->139|163->139|163->139|164->140|164->140|165->141|166->142|166->142|166->142|166->142|167->143|168->144|168->144|169->145|169->145|170->146|170->146|172->148|172->148|173->149|176->152|176->152|176->152|177->153|177->153|178->154|180->156|180->156|180->156|180->156|181->157|182->158|182->158|185->161|185->161|186->162|186->162|186->162|186->162|186->162|186->162|187->163|187->163|187->163|188->164|189->165|189->165|190->166|190->166|191->167|191->167|192->168|194->170|194->170|195->171|195->171|198->174|198->174|199->175|201->177|201->177|202->178|204->180|204->180|206->182|206->182|206->182|207->183|207->183|207->183|207->183|207->183|208->184|208->184|209->185|211->187|211->187|221->197|221->197|224->200|224->200|224->200|225->201|225->201|226->202|228->204|228->204|229->205|230->206|230->206|231->207|231->207|231->207|231->207|232->208|233->209|233->209|234->210|234->210|236->212|236->212
                  -- GENERATED --
              */
          