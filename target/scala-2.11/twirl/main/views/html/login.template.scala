
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title, "")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""	"""),format.raw/*4.67*/("""

    """),format.raw/*6.41*/("""
    """),_display_(/*7.6*/form(action = routes.RecApplication.authenticate(), 'id -> "loginForm")/*7.77*/ {_display_(Seq[Any](format.raw/*7.79*/("""
        
        """),_display_(/*9.10*/inputText(field = loginForm("email"), 'placeholder -> "email",
            '_label -> "Email")),format.raw/*10.32*/("""
        """),_display_(/*11.10*/inputPassword(field = loginForm("password"), 'placeholder -> "password",
            '_label -> "Password")),format.raw/*12.35*/("""
        """),format.raw/*13.9*/("""<input type="submit" class="login" value="Login">         

    """)))}),format.raw/*15.6*/("""
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(title:String,loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(title,loginForm)

  def f:((String,Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (title,loginForm) => apply(title,loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/login.scala.html
                  HASH: fd75536b9a8d11c8ff1de4afd900e1b335650ab9
                  MATRIX: 757->1|906->40|933->58|960->60|983->75|1022->77|1050->125|1083->167|1114->173|1193->244|1232->246|1277->265|1392->359|1429->369|1557->476|1593->485|1688->550|1720->552
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|40->10|41->11|42->12|43->13|45->15|46->16
                  -- GENERATED --
              */
          