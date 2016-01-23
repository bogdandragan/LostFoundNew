
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
        .controller('mainCtrl', function($scope, $http, $timeout) """),format.raw/*83.67*/("""{"""),format.raw/*83.68*/("""

                """),format.raw/*85.17*/("""$scope.checkSession = function()"""),format.raw/*85.49*/("""{"""),format.raw/*85.50*/("""
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
                  DATE: Sat Jan 23 14:19:02 EET 2016
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/account.scala.html
                  HASH: 10b2c0a3ca3e54c12e68dc7003834d855d5974b1
                  MATRIX: 621->2|644->17|683->19|718->28|3470->2751|3500->2752|3533->2756|3563->2757|5496->4661|5526->4662|5556->4663|5590->4668|5620->4669|5650->4670|5845->4836|5875->4837|5905->4838|5941->4845|5971->4846|6001->4847|6455->5273|6484->5274|6530->5292|6590->5324|6619->5325|6668->5346|6809->5460|6824->5466|6868->5489|6942->5535|6971->5536|7024->5561|7072->5581|7101->5582|7158->5611|7337->5763|7366->5764|7419->5789|7451->5793|7480->5794|7537->5823|7620->5878|7649->5879|7698->5900|7727->5901|7777->5923|7806->5924|7859->5949|7926->5988|7955->5989|8003->6008|8033->6009|8080->6027|8137->6055|8167->6056|8217->6077|8258->6090|8274->6096|8313->6113|8388->6159|8418->6160|8472->6185|8551->6235|8581->6236|8640->6266|8670->6267|8724->6292|8792->6331|8822->6332|8870->6351|8900->6352|8937->6361|8967->6362|9057->6423|9087->6424|9133->6441|9383->6662|9413->6663|9463->6684|9504->6697|9520->6703|9565->6726|9640->6772|9670->6773|9724->6798|9773->6818|9803->6819|9861->6848|10199->7157|10229->7158|10283->7183|10316->7187|10346->7188|10404->7217|10501->7285|10531->7286|10585->7311|10615->7312|10674->7342|10704->7343|10762->7372|10830->7411|10860->7412|10908->7431|10938->7432|10984->7449|11082->7518|11112->7519|11162->7540|11203->7553|11219->7559|11258->7576|11333->7622|11363->7623|11417->7648|11496->7698|11526->7699|11585->7729|11615->7730|11669->7755|11737->7794|11767->7795|11816->7815|11846->7816|11894->7835|11999->7911|12029->7912|12079->7933|12175->8000|12205->8001|12259->8026|12450->8188|12480->8189|12531->8211|12615->8266|12645->8267|12699->8292|12908->8472|12938->8473|12989->8495|13044->8521|13074->8522|13128->8547|13198->8588|13228->8589|13278->8610|13322->8625|13352->8626|13475->8719|13506->8720|13612->8798|13628->8804|13671->8825|13755->8880|13785->8881|13839->8906|13936->8974|13966->8975|14024->9004|14251->9202|14281->9203|14335->9228|14368->9232|14398->9233|14456->9262|14631->9408|14661->9409|14711->9430|14741->9431|14800->9461|14830->9462|14884->9487|15142->9716|15172->9717|15221->9737|15251->9738|15282->9741|15311->9742
                  LINES: 25->2|25->2|25->2|26->3|67->44|67->44|67->44|67->44|92->69|92->69|92->69|92->69|92->69|92->69|93->70|93->70|93->70|93->70|93->70|93->70|106->83|106->83|108->85|108->85|108->85|109->86|111->88|111->88|111->88|112->89|112->89|113->90|113->90|113->90|114->91|116->93|116->93|117->94|117->94|117->94|118->95|119->96|119->96|120->97|120->97|120->97|120->97|121->98|122->99|122->99|123->100|123->100|125->102|125->102|125->102|126->103|126->103|126->103|126->103|127->104|127->104|128->105|129->106|129->106|129->106|129->106|130->107|131->108|131->108|132->109|132->109|133->110|133->110|134->111|134->111|135->112|140->117|140->117|141->118|141->118|141->118|141->118|142->119|142->119|143->120|143->120|143->120|144->121|149->126|149->126|150->127|150->127|150->127|151->128|152->129|152->129|153->130|153->130|153->130|153->130|154->131|155->132|155->132|156->133|156->133|157->134|159->136|159->136|160->137|160->137|160->137|160->137|161->138|161->138|162->139|163->140|163->140|163->140|163->140|164->141|165->142|165->142|166->143|166->143|168->145|169->146|169->146|170->147|170->147|170->147|171->148|174->151|174->151|176->153|176->153|176->153|177->154|180->157|180->157|182->159|182->159|182->159|183->160|184->161|184->161|185->162|185->162|185->162|185->162|185->162|187->164|187->164|187->164|188->165|188->165|189->166|190->167|190->167|191->168|194->171|194->171|195->172|195->172|195->172|196->173|198->175|198->175|199->176|199->176|199->176|199->176|200->177|204->181|204->181|205->182|205->182|206->183|206->183
                  -- GENERATED --
              */
          