
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
    """),format.raw/*8.5*/("""<div>
      <p>"""),_display_(/*9.11*/users/*9.16*/.userID),format.raw/*9.23*/("""</->
      <p>"""),_display_(/*10.11*/users/*10.16*/.username),format.raw/*10.25*/("""</->
      <li>"""),_display_(/*11.12*/users/*11.17*/.email),format.raw/*11.23*/("""
        """),format.raw/*12.9*/("""<ul>
            """),_display_(/*13.14*/users/*13.19*/.password),format.raw/*13.28*/("""
        """),format.raw/*14.9*/("""</ul>
      </li>
      </->
    """)))}),format.raw/*17.6*/("""
    """),format.raw/*18.5*/("""</ul>
""")))}),format.raw/*19.2*/("""
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
                  DATE: Thu Nov 26 03:26:58 PST 2015
                  SOURCE: /Users/alphaneo1/new/newMovieRec/app/views/users.scala.html
                  HASH: a114db81696d84f71ab48b22032cc95e644e26dd
                  MATRIX: 757->1|887->36|915->39|934->50|973->52|1004->57|1067->95|1101->114|1140->116|1171->121|1213->137|1226->142|1253->149|1295->164|1309->169|1339->178|1382->194|1396->199|1423->205|1459->214|1504->232|1518->237|1548->246|1584->255|1648->289|1680->294|1717->301
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|48->17|49->18|50->19
                  -- GENERATED --
              */
          