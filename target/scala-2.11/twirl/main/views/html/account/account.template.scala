
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object account_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class account extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Профиль - Поиск потерянных вещей. Бюро находок Украина")/*2.64*/ {_display_(Seq[Any](format.raw/*2.66*/("""
        """),format.raw/*3.9*/("""<section class="main no-padding" style="margin-top: 100px;" ng-controller="accountCtrl">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-3">
                        <div class="widget">
                            <div class="widget-header">
                                <h3>Меню</h3>
                            </div>
                            <div class="widget-body" ng-controller="mainCtrl">
                                <ul class="author-menus">
                                    <!--<li><a href="account_create_post.html">Сообщения</a></li>-->
                                    <li><a href="/account">Мой профиль</a></li>
                                    <li><a href="/account/announcements">Обьявления</a></li>
                                    <li><a href="" ng-click="doLogout()">Выход</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-9 col-sm-9">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h4 class="panel-title">Мой профиль</h4>
                            </div>

                            <form accept-charset="utf-8" id="UserProfileForm" class="form-horizontal" ng-submit="updateUser(this.email)">
                                <div class="panel-body">
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Email-адрес</label>
                                        <div class="col-sm-9">
                                            <input type="email" required="required"  ng-model="email" maxlength="100" class="form-control" readonly >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Контактное лицо</label>
                                        <div class="col-sm-9">
                                            <input type="text" value="" class="form-control" ng-model="contact">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Телефон</label>
                                        <div class="col-sm-9">
                                            <input type="tel"  value="" class="form-control" ng-model="phone" pattern="\d"""),format.raw/*44.122*/("""{"""),format.raw/*44.123*/("""7,12"""),format.raw/*44.127*/("""}"""),format.raw/*44.128*/("""" title="Номер телефона">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label  class="col-sm-3 control-label">Пароль</label>
                                        <div class="col-sm-9">
                                            <input type="password" class="form-control" ng-model="password" placeholder="Оставьте пустым если не хотите изменять пароль" value="">
                                            <span class="help-block"></span>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label  class="col-sm-3 control-label">Подтвердите пароль</label>
                                        <div class="col-sm-9">
                                            <input type="password" ng-model="confpassword" class="form-control" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-9"> </div>
                                    </div>

                                </div>
                                <div class="panel-footer">
                                    <div class="row">
                                        <div class="col-sm-offset-3 col-sm-9">
                                            <button type="submit" class="btn btn-success"><i class="fa fa-save" ng-show="!loading"></i><i class="fa fa-spinner fa-spin" ng-show="loading"></i> Сохранить</button>
                                            <p id="error" style="display: inline-block; color: red; margin-left: 10px;" ng-cloak><i class="fa fa-remove"></i> """),format.raw/*69.159*/("""{"""),format.raw/*69.160*/("""{"""),format.raw/*69.161*/("""error"""),format.raw/*69.166*/("""}"""),format.raw/*69.167*/("""}"""),format.raw/*69.168*/("""</p>
                                            <p id="success" style="display: inline-block; color: green; margin-left: 10px;" ng-cloak><i class="fa fa-check"></i> """),format.raw/*70.162*/("""{"""),format.raw/*70.163*/("""{"""),format.raw/*70.164*/("""success"""),format.raw/*70.171*/("""}"""),format.raw/*70.172*/("""}"""),format.raw/*70.173*/("""</p>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>

    <script>
        angular.module('lostfoundApp', ['ui.bootstrap'])
        .controller('mainCtrl', function($scope, $http, $timeout, $rootScope) """),format.raw/*83.79*/("""{"""),format.raw/*83.80*/("""
                """),format.raw/*84.17*/("""$rootScope.title = "Профиль - ";
                $scope.checkSession = function()"""),format.raw/*85.49*/("""{"""),format.raw/*85.50*/("""
                    """),format.raw/*86.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*88.34*/routes/*88.40*/.Account.checkSession()),format.raw/*88.63*/("""')
                    .success(function(data)"""),format.raw/*89.44*/("""{"""),format.raw/*89.45*/("""
                        """),format.raw/*90.25*/("""if(data.error == "")"""),format.raw/*90.45*/("""{"""),format.raw/*90.46*/("""
                            """),format.raw/*91.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*93.25*/("""}"""),format.raw/*93.26*/("""
                        """),format.raw/*94.25*/("""else"""),format.raw/*94.29*/("""{"""),format.raw/*94.30*/("""
                            """),format.raw/*95.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*96.25*/("""}"""),format.raw/*96.26*/("""
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/(""").error(function(data)"""),format.raw/*97.44*/("""{"""),format.raw/*97.45*/("""
                        """),format.raw/*98.25*/("""console.log(data);
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/(""");
                """),format.raw/*100.17*/("""}"""),format.raw/*100.18*/("""

                """),format.raw/*102.17*/("""$scope.doLogout = function()"""),format.raw/*102.45*/("""{"""),format.raw/*102.46*/("""
                    """),format.raw/*103.21*/("""$http.post('"""),_display_(/*103.34*/routes/*103.40*/.Account.logout()),format.raw/*103.57*/("""')
                    .success(function(data)"""),format.raw/*104.44*/("""{"""),format.raw/*104.45*/("""
                        """),format.raw/*105.25*/("""window.location.replace("/");
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/(""").error(function(data, status)"""),format.raw/*106.52*/("""{"""),format.raw/*106.53*/("""
                        """),format.raw/*107.25*/("""console.log(data);
                    """),format.raw/*108.21*/("""}"""),format.raw/*108.22*/(""");
                """),format.raw/*109.17*/("""}"""),format.raw/*109.18*/("""
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/(""")
        .controller('accountCtrl', function($scope, $http) """),format.raw/*111.60*/("""{"""),format.raw/*111.61*/("""
                """),format.raw/*112.17*/("""$scope.phone = "";
                $scope.password = "";
                $scope.сonfpassword = "";
                $("#error").hide();
                $("#success").hide();
                $scope.loadUserData = function()"""),format.raw/*117.49*/("""{"""),format.raw/*117.50*/("""
                    """),format.raw/*118.21*/("""$http.post('"""),_display_(/*118.34*/routes/*118.40*/.Account.checkSession()),format.raw/*118.63*/("""')
                    .success(function(data)"""),format.raw/*119.44*/("""{"""),format.raw/*119.45*/("""
                        """),format.raw/*120.25*/("""if(data.error == "")"""),format.raw/*120.45*/("""{"""),format.raw/*120.46*/("""
                            """),format.raw/*121.29*/("""$scope.email = data.email;
                            localStorage.setItem("EMAIL",data.email);
                            localStorage.setItem("CONTACT",data.contact);
                            $scope.contact = data.contact;
                            $scope.phone = data.phone;
                        """),format.raw/*126.25*/("""}"""),format.raw/*126.26*/("""
                        """),format.raw/*127.25*/("""else"""),format.raw/*127.29*/("""{"""),format.raw/*127.30*/("""
                            """),format.raw/*128.29*/("""window.location.replace("/account/signin");
                        """),format.raw/*129.25*/("""}"""),format.raw/*129.26*/("""
                        """),format.raw/*130.25*/("""}"""),format.raw/*130.26*/(""").error(function(data, status)"""),format.raw/*130.56*/("""{"""),format.raw/*130.57*/("""
                            """),format.raw/*131.29*/("""console.log(data);
                    """),format.raw/*132.21*/("""}"""),format.raw/*132.22*/(""");
                """),format.raw/*133.17*/("""}"""),format.raw/*133.18*/("""
                """),format.raw/*134.17*/("""$scope.loadUserData();

                 $scope.doLogout = function()"""),format.raw/*136.46*/("""{"""),format.raw/*136.47*/("""
                    """),format.raw/*137.21*/("""$http.post('"""),_display_(/*137.34*/routes/*137.40*/.Account.logout()),format.raw/*137.57*/("""')
                    .success(function(data)"""),format.raw/*138.44*/("""{"""),format.raw/*138.45*/("""
                        """),format.raw/*139.25*/("""window.location.replace("/");
                    """),format.raw/*140.21*/("""}"""),format.raw/*140.22*/(""").error(function(data, status)"""),format.raw/*140.52*/("""{"""),format.raw/*140.53*/("""
                        """),format.raw/*141.25*/("""console.log(data);
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/(""");
                 """),format.raw/*143.18*/("""}"""),format.raw/*143.19*/("""

                 """),format.raw/*145.18*/("""$scope.loading = false;
                 $scope.updateUser = function(email)"""),format.raw/*146.53*/("""{"""),format.raw/*146.54*/("""
                    """),format.raw/*147.21*/("""if($scope.password != "" && $scope.password != $scope.confpassword)"""),format.raw/*147.88*/("""{"""),format.raw/*147.89*/("""
                        """),format.raw/*148.25*/("""$scope.error = "Пароли не совпадают";
                        $("#error").show().delay(3000).fadeOut("slow");
                        return;
                    """),format.raw/*151.21*/("""}"""),format.raw/*151.22*/("""

                    """),format.raw/*153.21*/("""if($scope.password != "" && $scope.password.length < 6)"""),format.raw/*153.76*/("""{"""),format.raw/*153.77*/("""
                        """),format.raw/*154.25*/("""$scope.error = "Минимальная длина пароля - 6 символов";
                        $("#error").show().delay(3000).fadeOut("slow");
                        return;
                    """),format.raw/*157.21*/("""}"""),format.raw/*157.22*/("""

                    """),format.raw/*159.21*/("""if($scope.contact == null)"""),format.raw/*159.47*/("""{"""),format.raw/*159.48*/("""
                        """),format.raw/*160.25*/("""$scope.contact = "";
                    """),format.raw/*161.21*/("""}"""),format.raw/*161.22*/("""
                    """),format.raw/*162.21*/("""var request =  """),format.raw/*162.36*/("""{"""),format.raw/*162.37*/(""""email":$scope.email,"contact":$scope.contact,"phone":$scope.phone,"password":$scope.password"""),format.raw/*162.130*/("""}"""),format.raw/*162.131*/(""";
                    $scope.loading = true;
                    $http.post('"""),_display_(/*164.34*/routes/*164.40*/.Account.updateUser()),format.raw/*164.61*/("""', request)
                    .success(function(data)"""),format.raw/*165.44*/("""{"""),format.raw/*165.45*/("""
                        """),format.raw/*166.25*/("""$scope.loading = false;
                        if(data.error == "")"""),format.raw/*167.45*/("""{"""),format.raw/*167.46*/("""
                            """),format.raw/*168.29*/("""$scope.loadUserData();
                            $scope.success = "Профиль успешно обновлен";
                            $("#success").show().delay(3000).fadeOut("slow");
                        """),format.raw/*171.25*/("""}"""),format.raw/*171.26*/("""
                        """),format.raw/*172.25*/("""else"""),format.raw/*172.29*/("""{"""),format.raw/*172.30*/("""
                            """),format.raw/*173.29*/("""$scope.error = "Не удалось обновить профиль";
                            $("#error").show().delay(3000).fadeOut("slow");
                        """),format.raw/*175.25*/("""}"""),format.raw/*175.26*/("""
                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/(""").error(function(data, status)"""),format.raw/*176.52*/("""{"""),format.raw/*176.53*/("""
                        """),format.raw/*177.25*/("""$scope.loading = false;
                        $scope.error = "Не удалось обновить профиль";
                        $("#error").show().delay(3000).fadeOut("slow");
                        console.log(data);
                    """),format.raw/*181.21*/("""}"""),format.raw/*181.22*/(""");
                 """),format.raw/*182.18*/("""}"""),format.raw/*182.19*/("""
		"""),format.raw/*183.3*/("""}"""),format.raw/*183.4*/(""")
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
object account extends account_Scope0.account
              /*
                  -- GENERATED --
                  DATE: Tue Jan 26 20:23:22 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/account.scala.html
                  HASH: 304d5244c5d8d3643ea8fdf5353c3941b275d7b3
                  MATRIX: 621->2|691->64|730->66|765->75|3517->2798|3547->2799|3580->2803|3610->2804|5543->4708|5573->4709|5603->4710|5637->4715|5667->4716|5697->4717|5892->4883|5922->4884|5952->4885|5988->4892|6018->4893|6048->4894|6514->5332|6543->5333|6588->5350|6697->5431|6726->5432|6775->5453|6916->5567|6931->5573|6975->5596|7049->5642|7078->5643|7131->5668|7179->5688|7208->5689|7265->5718|7444->5870|7473->5871|7526->5896|7558->5900|7587->5901|7644->5930|7727->5985|7756->5986|7805->6007|7834->6008|7884->6030|7913->6031|7966->6056|8033->6095|8062->6096|8110->6115|8140->6116|8187->6134|8244->6162|8274->6163|8324->6184|8365->6197|8381->6203|8420->6220|8495->6266|8525->6267|8579->6292|8658->6342|8688->6343|8747->6373|8777->6374|8831->6399|8899->6438|8929->6439|8977->6458|9007->6459|9044->6468|9074->6469|9164->6530|9194->6531|9240->6548|9490->6769|9520->6770|9570->6791|9611->6804|9627->6810|9672->6833|9747->6879|9777->6880|9831->6905|9880->6925|9910->6926|9968->6955|10306->7264|10336->7265|10390->7290|10423->7294|10453->7295|10511->7324|10608->7392|10638->7393|10692->7418|10722->7419|10781->7449|10811->7450|10869->7479|10937->7518|10967->7519|11015->7538|11045->7539|11091->7556|11189->7625|11219->7626|11269->7647|11310->7660|11326->7666|11365->7683|11440->7729|11470->7730|11524->7755|11603->7805|11633->7806|11692->7836|11722->7837|11776->7862|11844->7901|11874->7902|11923->7922|11953->7923|12001->7942|12106->8018|12136->8019|12186->8040|12282->8107|12312->8108|12366->8133|12557->8295|12587->8296|12638->8318|12722->8373|12752->8374|12806->8399|13015->8579|13045->8580|13096->8602|13151->8628|13181->8629|13235->8654|13305->8695|13335->8696|13385->8717|13429->8732|13459->8733|13582->8826|13613->8827|13719->8905|13735->8911|13778->8932|13862->8987|13892->8988|13946->9013|14043->9081|14073->9082|14131->9111|14358->9309|14388->9310|14442->9335|14475->9339|14505->9340|14563->9369|14738->9515|14768->9516|14818->9537|14848->9538|14907->9568|14937->9569|14991->9594|15249->9823|15279->9824|15328->9844|15358->9845|15389->9848|15418->9849
                  LINES: 25->2|25->2|25->2|26->3|67->44|67->44|67->44|67->44|92->69|92->69|92->69|92->69|92->69|92->69|93->70|93->70|93->70|93->70|93->70|93->70|106->83|106->83|107->84|108->85|108->85|109->86|111->88|111->88|111->88|112->89|112->89|113->90|113->90|113->90|114->91|116->93|116->93|117->94|117->94|117->94|118->95|119->96|119->96|120->97|120->97|120->97|120->97|121->98|122->99|122->99|123->100|123->100|125->102|125->102|125->102|126->103|126->103|126->103|126->103|127->104|127->104|128->105|129->106|129->106|129->106|129->106|130->107|131->108|131->108|132->109|132->109|133->110|133->110|134->111|134->111|135->112|140->117|140->117|141->118|141->118|141->118|141->118|142->119|142->119|143->120|143->120|143->120|144->121|149->126|149->126|150->127|150->127|150->127|151->128|152->129|152->129|153->130|153->130|153->130|153->130|154->131|155->132|155->132|156->133|156->133|157->134|159->136|159->136|160->137|160->137|160->137|160->137|161->138|161->138|162->139|163->140|163->140|163->140|163->140|164->141|165->142|165->142|166->143|166->143|168->145|169->146|169->146|170->147|170->147|170->147|171->148|174->151|174->151|176->153|176->153|176->153|177->154|180->157|180->157|182->159|182->159|182->159|183->160|184->161|184->161|185->162|185->162|185->162|185->162|185->162|187->164|187->164|187->164|188->165|188->165|189->166|190->167|190->167|191->168|194->171|194->171|195->172|195->172|195->172|196->173|198->175|198->175|199->176|199->176|199->176|199->176|200->177|204->181|204->181|205->182|205->182|206->183|206->183
                  -- GENERATED --
              */
          