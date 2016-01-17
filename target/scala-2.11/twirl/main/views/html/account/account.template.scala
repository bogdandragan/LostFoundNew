
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


Seq[Any](_display_(/*2.2*/main("Профиль")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""
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
                                    <li><a href="/account/announcements">Обьявления</a></li>
                                    <!--<li><a href="account_create_post.html">Сообщения</a></li>-->
                                    <li><a href="account_profile.html">Настройки</a></li>
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
                                            <input type="text" value="" class="form-control" ng-model="contact">                                   </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-3 control-label">Телефон</label>
                                        <div class="col-sm-9">
                                            <input type="tel"  value="" class="form-control" ng-model="phone" pattern="\d"""),format.raw/*43.122*/("""{"""),format.raw/*43.123*/("""7,12"""),format.raw/*43.127*/("""}"""),format.raw/*43.128*/("""" title="Номер телефона">                                  </div>
                                    </div>
                                    <div class="form-group">
                                        <label  class="col-sm-3 control-label">Пароль</label>
                                        <div class="col-sm-9">
                                            <input type="password" class="form-control" ng-model="password" placeholder="Оставьте пустым если не хотите изменять пароль" value="" >                                         <span class="help-block"></span>
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
                                            <button type="submit" class="btn btn-custom"><i class="fa fa-save"></i>Сохранить</button>
                                            <p id="error" style="display: inline-block; color: red; margin-left: 10px;" ng-cloak><i class="fa fa-remove"></i> """),format.raw/*66.159*/("""{"""),format.raw/*66.160*/("""{"""),format.raw/*66.161*/("""error"""),format.raw/*66.166*/("""}"""),format.raw/*66.167*/("""}"""),format.raw/*66.168*/("""</p>
                                            <p id="success" style="display: inline-block; color: green; margin-left: 10px;" ng-cloak><i class="fa fa-check"></i> """),format.raw/*67.162*/("""{"""),format.raw/*67.163*/("""{"""),format.raw/*67.164*/("""success"""),format.raw/*67.171*/("""}"""),format.raw/*67.172*/("""}"""),format.raw/*67.173*/("""</p>
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
        .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*80.67*/("""{"""),format.raw/*80.68*/("""

                """),format.raw/*82.17*/("""$scope.checkSession = function()"""),format.raw/*82.49*/("""{"""),format.raw/*82.50*/("""
                    """),format.raw/*83.21*/("""$scope.showUserMenu = false;
                    $scope.showProfileLink = false;
                    $http.post('"""),_display_(/*85.34*/routes/*85.40*/.Account.checkSession()),format.raw/*85.63*/("""')
                    .success(function(data)"""),format.raw/*86.44*/("""{"""),format.raw/*86.45*/("""
                        """),format.raw/*87.25*/("""if(data.error == "")"""),format.raw/*87.45*/("""{"""),format.raw/*87.46*/("""
                            """),format.raw/*88.29*/("""$scope.showUserMenu = true;
                            $scope.profile = data.email.substring(0, data.email.lastIndexOf("@"));
                        """),format.raw/*90.25*/("""}"""),format.raw/*90.26*/("""
                        """),format.raw/*91.25*/("""else"""),format.raw/*91.29*/("""{"""),format.raw/*91.30*/("""
                            """),format.raw/*92.29*/("""$scope.showProfileLink = true;
                        """),format.raw/*93.25*/("""}"""),format.raw/*93.26*/("""
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/(""").error(function(data)"""),format.raw/*94.44*/("""{"""),format.raw/*94.45*/("""
                        """),format.raw/*95.25*/("""console.log(data);
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/(""");
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""

                """),format.raw/*99.17*/("""$scope.doLogout = function()"""),format.raw/*99.45*/("""{"""),format.raw/*99.46*/("""
                    """),format.raw/*100.21*/("""$http.post('"""),_display_(/*100.34*/routes/*100.40*/.Account.logout()),format.raw/*100.57*/("""')
                    .success(function(data)"""),format.raw/*101.44*/("""{"""),format.raw/*101.45*/("""
                        """),format.raw/*102.25*/("""window.location.replace("/");
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/(""").error(function(data, status)"""),format.raw/*103.52*/("""{"""),format.raw/*103.53*/("""
                        """),format.raw/*104.25*/("""console.log(data);
                    """),format.raw/*105.21*/("""}"""),format.raw/*105.22*/(""");
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/("""
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""")
        .controller('accountCtrl', function($scope, $http) """),format.raw/*108.60*/("""{"""),format.raw/*108.61*/("""
                """),format.raw/*109.17*/("""$scope.phone = "";
                $scope.password = "";
                $scope.сonfpassword = "";
                $("#error").hide();
                $("#success").hide();
                $scope.loadUserData = function()"""),format.raw/*114.49*/("""{"""),format.raw/*114.50*/("""
                    """),format.raw/*115.21*/("""$http.post('"""),_display_(/*115.34*/routes/*115.40*/.Account.checkSession()),format.raw/*115.63*/("""')
                    .success(function(data)"""),format.raw/*116.44*/("""{"""),format.raw/*116.45*/("""
                        """),format.raw/*117.25*/("""if(data.error == "")"""),format.raw/*117.45*/("""{"""),format.raw/*117.46*/("""
                            """),format.raw/*118.29*/("""$scope.email = data.email;
                            $scope.contact = data.contact;
                            $scope.phone = data.phone;
                        """),format.raw/*121.25*/("""}"""),format.raw/*121.26*/("""
                        """),format.raw/*122.25*/("""else"""),format.raw/*122.29*/("""{"""),format.raw/*122.30*/("""
                            """),format.raw/*123.29*/("""window.location.replace("/account/signin");
                        """),format.raw/*124.25*/("""}"""),format.raw/*124.26*/("""
                        """),format.raw/*125.25*/("""}"""),format.raw/*125.26*/(""").error(function(data, status)"""),format.raw/*125.56*/("""{"""),format.raw/*125.57*/("""
                            """),format.raw/*126.29*/("""console.log(data);
                    """),format.raw/*127.21*/("""}"""),format.raw/*127.22*/(""");
                """),format.raw/*128.17*/("""}"""),format.raw/*128.18*/("""
                """),format.raw/*129.17*/("""$scope.loadUserData();

                 $scope.doLogout = function()"""),format.raw/*131.46*/("""{"""),format.raw/*131.47*/("""
                    """),format.raw/*132.21*/("""$http.post('"""),_display_(/*132.34*/routes/*132.40*/.Account.logout()),format.raw/*132.57*/("""')
                    .success(function(data)"""),format.raw/*133.44*/("""{"""),format.raw/*133.45*/("""
                        """),format.raw/*134.25*/("""window.location.replace("/");
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""").error(function(data, status)"""),format.raw/*135.52*/("""{"""),format.raw/*135.53*/("""
                        """),format.raw/*136.25*/("""console.log(data);
                    """),format.raw/*137.21*/("""}"""),format.raw/*137.22*/(""");
                 """),format.raw/*138.18*/("""}"""),format.raw/*138.19*/("""

                 """),format.raw/*140.18*/("""$scope.updateUser = function(email)"""),format.raw/*140.53*/("""{"""),format.raw/*140.54*/("""
                    """),format.raw/*141.21*/("""if($scope.password != "" && $scope.password != $scope.confpassword)"""),format.raw/*141.88*/("""{"""),format.raw/*141.89*/("""
                        """),format.raw/*142.25*/("""$scope.error = "Пароли не совпадают";
                        $("#error").show().delay(3000).fadeOut("slow");
                        return;
                    """),format.raw/*145.21*/("""}"""),format.raw/*145.22*/("""

                    """),format.raw/*147.21*/("""if($scope.contact == null)"""),format.raw/*147.47*/("""{"""),format.raw/*147.48*/("""
                        """),format.raw/*148.25*/("""$scope.contact = "";
                    """),format.raw/*149.21*/("""}"""),format.raw/*149.22*/("""
                    """),format.raw/*150.21*/("""var request =  """),format.raw/*150.36*/("""{"""),format.raw/*150.37*/(""""email":$scope.email,"contact":$scope.contact,"phone":$scope.phone,"password":$scope.password"""),format.raw/*150.130*/("""}"""),format.raw/*150.131*/(""";
                    $http.post('"""),_display_(/*151.34*/routes/*151.40*/.Account.updateUser()),format.raw/*151.61*/("""', request)
                    .success(function(data)"""),format.raw/*152.44*/("""{"""),format.raw/*152.45*/("""
                        """),format.raw/*153.25*/("""if(data.error == "")"""),format.raw/*153.45*/("""{"""),format.raw/*153.46*/("""
                            """),format.raw/*154.29*/("""$scope.loadUserData();
                            $scope.success = "Профиль успешно обновлен";
                            $("#success").show().delay(3000).fadeOut("slow");
                        """),format.raw/*157.25*/("""}"""),format.raw/*157.26*/("""
                        """),format.raw/*158.25*/("""else"""),format.raw/*158.29*/("""{"""),format.raw/*158.30*/("""
                            """),format.raw/*159.29*/("""$scope.error = "Не удалось обновить профиль";
                            $("#error").show().delay(3000).fadeOut("slow");
                        """),format.raw/*161.25*/("""}"""),format.raw/*161.26*/("""
                    """),format.raw/*162.21*/("""}"""),format.raw/*162.22*/(""").error(function(data, status)"""),format.raw/*162.52*/("""{"""),format.raw/*162.53*/("""
                        """),format.raw/*163.25*/("""console.log(data);
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/(""");
                 """),format.raw/*165.18*/("""}"""),format.raw/*165.19*/("""
		"""),format.raw/*166.3*/("""}"""),format.raw/*166.4*/(""")
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
                  DATE: Sat Jan 16 20:38:47 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/account.scala.html
                  HASH: 126d83cb63919887977d8131198d6ed805e914e6
                  MATRIX: 621->2|644->17|683->19|718->28|3474->2755|3504->2756|3537->2760|3567->2761|5414->4579|5444->4580|5474->4581|5508->4586|5538->4587|5568->4588|5763->4754|5793->4755|5823->4756|5859->4763|5889->4764|5919->4765|6373->5191|6402->5192|6448->5210|6508->5242|6537->5243|6586->5264|6727->5378|6742->5384|6786->5407|6860->5453|6889->5454|6942->5479|6990->5499|7019->5500|7076->5529|7255->5681|7284->5682|7337->5707|7369->5711|7398->5712|7455->5741|7538->5796|7567->5797|7616->5818|7645->5819|7695->5841|7724->5842|7777->5867|7844->5906|7873->5907|7920->5926|7949->5927|7995->5945|8051->5973|8080->5974|8130->5995|8171->6008|8187->6014|8226->6031|8301->6077|8331->6078|8385->6103|8464->6153|8494->6154|8553->6184|8583->6185|8637->6210|8705->6249|8735->6250|8783->6269|8813->6270|8850->6279|8880->6280|8970->6341|9000->6342|9046->6359|9296->6580|9326->6581|9376->6602|9417->6615|9433->6621|9478->6644|9553->6690|9583->6691|9637->6716|9686->6736|9716->6737|9774->6766|9968->6931|9998->6932|10052->6957|10085->6961|10115->6962|10173->6991|10270->7059|10300->7060|10354->7085|10384->7086|10443->7116|10473->7117|10531->7146|10599->7185|10629->7186|10677->7205|10707->7206|10753->7223|10851->7292|10881->7293|10931->7314|10972->7327|10988->7333|11027->7350|11102->7396|11132->7397|11186->7422|11265->7472|11295->7473|11354->7503|11384->7504|11438->7529|11506->7568|11536->7569|11585->7589|11615->7590|11663->7609|11727->7644|11757->7645|11807->7666|11903->7733|11933->7734|11987->7759|12178->7921|12208->7922|12259->7944|12314->7970|12344->7971|12398->7996|12468->8037|12498->8038|12548->8059|12592->8074|12622->8075|12745->8168|12776->8169|12839->8204|12855->8210|12898->8231|12982->8286|13012->8287|13066->8312|13115->8332|13145->8333|13203->8362|13430->8560|13460->8561|13514->8586|13547->8590|13577->8591|13635->8620|13810->8766|13840->8767|13890->8788|13920->8789|13979->8819|14009->8820|14063->8845|14131->8884|14161->8885|14210->8905|14240->8906|14271->8909|14300->8910
                  LINES: 25->2|25->2|25->2|26->3|66->43|66->43|66->43|66->43|89->66|89->66|89->66|89->66|89->66|89->66|90->67|90->67|90->67|90->67|90->67|90->67|103->80|103->80|105->82|105->82|105->82|106->83|108->85|108->85|108->85|109->86|109->86|110->87|110->87|110->87|111->88|113->90|113->90|114->91|114->91|114->91|115->92|116->93|116->93|117->94|117->94|117->94|117->94|118->95|119->96|119->96|120->97|120->97|122->99|122->99|122->99|123->100|123->100|123->100|123->100|124->101|124->101|125->102|126->103|126->103|126->103|126->103|127->104|128->105|128->105|129->106|129->106|130->107|130->107|131->108|131->108|132->109|137->114|137->114|138->115|138->115|138->115|138->115|139->116|139->116|140->117|140->117|140->117|141->118|144->121|144->121|145->122|145->122|145->122|146->123|147->124|147->124|148->125|148->125|148->125|148->125|149->126|150->127|150->127|151->128|151->128|152->129|154->131|154->131|155->132|155->132|155->132|155->132|156->133|156->133|157->134|158->135|158->135|158->135|158->135|159->136|160->137|160->137|161->138|161->138|163->140|163->140|163->140|164->141|164->141|164->141|165->142|168->145|168->145|170->147|170->147|170->147|171->148|172->149|172->149|173->150|173->150|173->150|173->150|173->150|174->151|174->151|174->151|175->152|175->152|176->153|176->153|176->153|177->154|180->157|180->157|181->158|181->158|181->158|182->159|184->161|184->161|185->162|185->162|185->162|185->162|186->163|187->164|187->164|188->165|188->165|189->166|189->166
                  -- GENERATED --
              */
          