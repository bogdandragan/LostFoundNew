
package views.html.account

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newpassword_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class newpassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Новый пароль")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/("""

    """),format.raw/*3.5*/("""<div class="container" style="margin-top: 70px;">
        <div class="well col-md-4">
            <form id="newpassword">
                <fieldset>
                    <legend>Установить новый пароль</legend>
                    <div class="form-group">
                        <input type="password" class="form-control" id="password" placeholder="Пароль">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" id="confpassword" placeholder="Повторите пароль">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary" style="width: 100%;">Изменить</button>
                    </div>
                </fieldset>
            </form>
            <div class="alert alert-danger" id="error" style="display: none;">

            </div>
        </div>
    </div>

    <script>
        $( "#newpassword" ).submit(function(event) """),format.raw/*26.52*/("""{"""),format.raw/*26.53*/("""
    		"""),format.raw/*27.7*/("""event.preventDefault();
    		var email = url('?email');
            var hash = url('?hash');
    		var request = """),format.raw/*30.21*/("""{"""),format.raw/*30.22*/(""""action":"newpassword", "params":"""),format.raw/*30.55*/("""{"""),format.raw/*30.56*/(""""email":email, "hash":hash, "newpassword":$("#password").val()"""),format.raw/*30.118*/("""}"""),format.raw/*30.119*/("""}"""),format.raw/*30.120*/(""";

    		$.ajax("""),format.raw/*32.14*/("""{"""),format.raw/*32.15*/("""
    			"""),format.raw/*33.8*/("""type: "POST",
    			url: """"),_display_(/*34.15*/routes/*34.21*/.Account.doNewPassword()),format.raw/*34.45*/("""",
    			data: JSON.stringify(request),
    			contentType: "application/json; charset=utf-8",
    			success: function(data)"""),format.raw/*37.31*/("""{"""),format.raw/*37.32*/("""
                    """),format.raw/*38.21*/("""if(data.error == "")"""),format.raw/*38.41*/("""{"""),format.raw/*38.42*/("""
                       """),format.raw/*39.24*/("""window.location.replace("/account/signin");
                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/("""
                    """),format.raw/*41.21*/("""else"""),format.raw/*41.25*/("""{"""),format.raw/*41.26*/("""
                       """),format.raw/*42.24*/("""$("#error").text(data.error);
    				    $("#error").addClass('alert-danger').removeClass('alert-success').delay(3000).fadeOut("slow");
                        $("#error").css("display","block");
                    """),format.raw/*45.21*/("""}"""),format.raw/*45.22*/("""
    				"""),format.raw/*46.9*/("""console.log(data);

    			"""),format.raw/*48.8*/("""}"""),format.raw/*48.9*/("""
			"""),format.raw/*49.4*/("""}"""),format.raw/*49.5*/(""");
		"""),format.raw/*50.3*/("""}"""),format.raw/*50.4*/(""");
		angular.module('lostfoundApp', ['ui.bootstrap'])
    </script>
""")))}),format.raw/*53.2*/("""



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
object newpassword extends newpassword_Scope0.newpassword
              /*
                  -- GENERATED --
                  DATE: Sat Sep 05 22:33:12 EEST 2015
                  SOURCE: /home/bogdan/IdeaProjects/LostFoundNew/app/views/account/newpassword.scala.html
                  HASH: 24788d0aee7b58bce5f49d3c3698970ad9a04690
                  MATRIX: 629->1|657->21|696->23|728->29|1751->1024|1780->1025|1814->1032|1956->1146|1985->1147|2046->1180|2075->1181|2166->1243|2196->1244|2226->1245|2270->1261|2299->1262|2334->1270|2389->1298|2404->1304|2449->1328|2603->1454|2632->1455|2681->1476|2729->1496|2758->1497|2810->1521|2902->1585|2931->1586|2980->1607|3012->1611|3041->1612|3093->1636|3338->1853|3367->1854|3403->1863|3457->1890|3485->1891|3516->1895|3544->1896|3576->1901|3604->1902|3703->1971
                  LINES: 25->1|25->1|25->1|27->3|50->26|50->26|51->27|54->30|54->30|54->30|54->30|54->30|54->30|54->30|56->32|56->32|57->33|58->34|58->34|58->34|61->37|61->37|62->38|62->38|62->38|63->39|64->40|64->40|65->41|65->41|65->41|66->42|69->45|69->45|70->46|72->48|72->48|73->49|73->49|74->50|74->50|77->53
                  -- GENERATED --
              */
          