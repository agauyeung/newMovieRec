
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
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

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, users: List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<h1>All Users<h1>
    
    <ul> 
    """),_display_(/*7.6*/for(users <- users) yield /*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/("""
      """),format.raw/*8.7*/("""<p>"""),_display_(/*8.11*/users/*8.16*/.userID),format.raw/*8.23*/("""</->
      <li>"""),_display_(/*9.12*/users/*9.17*/.email),format.raw/*9.23*/("""
        """),format.raw/*10.9*/("""<ul>
            """),_display_(/*11.14*/users/*11.19*/.password),format.raw/*11.28*/("""
        """),format.raw/*12.9*/("""</ul>
      </li>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""</ul>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(title:String,users:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(title,users)

  def f:((String,List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (title,users) => apply(title,users)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 03:06:01 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/users.scala.html
                  HASH: 83602b6b63c150a52e7c3e79a9c3790d0a3f4a20
                  MATRIX: 757->1|887->36|915->39|934->50|973->52|1004->57|1067->95|1101->114|1140->116|1173->123|1203->127|1216->132|1243->139|1285->155|1298->160|1324->166|1360->175|1405->193|1419->198|1449->207|1485->216|1538->239|1570->244|1607->251
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|45->14|46->15|47->16
                  -- GENERATED --
              */
          