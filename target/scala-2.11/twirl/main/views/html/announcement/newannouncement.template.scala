
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
                            не прикрепляете фото, на которых видно все детали найденных Вами вещей.</section>
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
                                        <textarea ng-model="description" name="description" id="description" class="form-control" rows="5" required></textarea>
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
                                        <button type="submit" class="btn btn-success"><i class="fa fa-save"></i> Опубликовать</button>
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
                console.log(post_data);
                $http.post('"""),_display_(/*199.30*/routes/*199.36*/.Announcement.postAnnouncement()),format.raw/*199.68*/("""', post_data)
                .success(function(data)"""),format.raw/*200.40*/("""{"""),format.raw/*200.41*/("""
                    """),format.raw/*201.21*/("""console.log(data);
                    if(data.error == "")"""),format.raw/*202.41*/("""{"""),format.raw/*202.42*/("""
                       """),format.raw/*203.24*/("""window.location.href = "/announcement/addconfirm?id="+data.id;
                    """),format.raw/*204.21*/("""}"""),format.raw/*204.22*/("""
                """),format.raw/*205.17*/("""}"""),format.raw/*205.18*/(""").error(function(data)"""),format.raw/*205.40*/("""{"""),format.raw/*205.41*/("""
                    """),format.raw/*206.21*/("""console.log(data);
                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/(""");
            """),format.raw/*208.13*/("""}"""),format.raw/*208.14*/("""

        """),format.raw/*210.9*/("""}"""),format.raw/*210.10*/(""")

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
                  DATE: Sat Jan 16 22:08:37 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/announcement/newannouncement.scala.html
                  HASH: e55e13c8b8b5bc57786e0565a4af24303e4dc2bc
                  MATRIX: 642->1|674->25|713->27|745->33|3590->2850|3619->2851|3648->2852|3688->2863|3718->2864|3748->2865|3779->2867|3809->2868|3839->2869|3881->2882|3911->2883|3941->2884|7759->6673|7789->6674|7822->6678|7852->6679|8835->7633|8865->7634|8912->7652|8973->7684|9003->7685|9053->7706|9195->7820|9211->7826|9256->7849|9331->7895|9361->7896|9415->7921|9464->7941|9494->7942|9552->7971|9965->8356|9995->8357|10049->8382|10082->8386|10112->8387|10170->8416|10254->8471|10284->8472|10334->8493|10364->8494|10415->8516|10445->8517|10499->8542|10567->8581|10597->8582|10645->8601|10675->8602|10722->8620|10779->8648|10809->8649|10859->8670|10900->8683|10916->8689|10955->8706|11030->8752|11060->8753|11114->8778|11193->8828|11223->8829|11282->8859|11312->8860|11366->8885|11434->8924|11464->8925|11512->8944|11542->8945|11579->8954|11609->8955|11708->9025|11738->9026|11784->9043|11896->9127|11912->9133|11963->9162|12035->9205|12065->9206|12115->9227|12226->9309|12256->9310|12307->9332|12337->9333|12387->9354|12452->9390|12482->9391|12569->9449|12599->9450|12644->9466|12691->9485|12707->9491|12755->9517|12787->9520|12817->9521|12863->9538|12900->9546|12930->9547|12976->9564|13046->9605|13076->9606|13122->9623|13152->9624|13222->9665|13252->9666|13302->9687|13423->9779|13453->9780|13497->9795|13527->9796|13599->9839|13629->9840|13675->9857|13810->9963|13840->9964|13890->9985|13988->10054|14018->10055|14065->10073|14118->10097|14148->10098|14198->10119|14242->10134|14272->10135|14324->10158|14354->10159|14400->10176|14430->10177|14476->10194|14565->10254|14595->10255|15455->11086|15485->11087|15584->11158|15600->11164|15654->11196|15736->11249|15766->11250|15816->11271|15904->11330|15934->11331|15987->11355|16099->11438|16129->11439|16175->11456|16205->11457|16256->11479|16286->11480|16336->11501|16400->11536|16430->11537|16474->11552|16504->11553|16542->11563|16572->11564
                  LINES: 25->1|25->1|25->1|27->3|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|67->43|116->92|116->92|116->92|116->92|139->115|139->115|141->117|141->117|141->117|142->118|144->120|144->120|144->120|145->121|145->121|146->122|146->122|146->122|147->123|153->129|153->129|154->130|154->130|154->130|155->131|156->132|156->132|157->133|157->133|157->133|157->133|158->134|159->135|159->135|160->136|160->136|162->138|162->138|162->138|163->139|163->139|163->139|163->139|164->140|164->140|165->141|166->142|166->142|166->142|166->142|167->143|168->144|168->144|169->145|169->145|170->146|170->146|172->148|172->148|173->149|176->152|176->152|176->152|177->153|177->153|178->154|180->156|180->156|180->156|180->156|181->157|182->158|182->158|185->161|185->161|186->162|186->162|186->162|186->162|186->162|186->162|187->163|187->163|187->163|188->164|189->165|189->165|190->166|190->166|191->167|191->167|192->168|194->170|194->170|195->171|195->171|198->174|198->174|199->175|201->177|201->177|202->178|204->180|204->180|206->182|206->182|206->182|207->183|207->183|207->183|207->183|207->183|208->184|208->184|209->185|211->187|211->187|221->197|221->197|223->199|223->199|223->199|224->200|224->200|225->201|226->202|226->202|227->203|228->204|228->204|229->205|229->205|229->205|229->205|230->206|231->207|231->207|232->208|232->208|234->210|234->210
                  -- GENERATED --
              */
          