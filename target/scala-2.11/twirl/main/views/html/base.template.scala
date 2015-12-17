
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, email : String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <!-- This file is the menu at the top of every page. -->
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*13.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*14.98*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*15.93*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/animate.css")),format.raw/*16.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.86*/("""">

        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="public/images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*24.73*/routes/*24.79*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*24.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*25.73*/routes/*25.79*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*25.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href=""""),_display_(/*26.71*/routes/*26.77*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*26.144*/("""">
        <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*27.57*/routes/*27.63*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*27.130*/("""">
    </head><!--/head-->
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top wet-asphalt" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="view"><img src=""""),_display_(/*39.68*/routes/*39.74*/.Assets.versioned("images/logo.png")),format.raw/*39.110*/("""" alt="logo"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(/*43.26*/if(email != "")/*43.41*/{_display_(Seq[Any](format.raw/*43.42*/("""
                            """),format.raw/*44.29*/("""<font color="white">
                                <li>Welcome """),_display_(/*45.46*/email),format.raw/*45.51*/("""!</li>
                            </font>
                        """)))}),format.raw/*47.26*/("""
                        """),format.raw/*48.25*/("""<li><a href="search">Search</a></li>
                        <li><a href="view">View Movies</a></li>
                        <!--<li><a href="users">View Users</a></li>-->
                        """),_display_(/*51.26*/if(email != "")/*51.41*/{_display_(Seq[Any](format.raw/*51.42*/("""
                          """),format.raw/*52.27*/("""<li><a href="recommended">Recommended</a></li>
                          <li><a href="rate">Rate Movies</a></li>
                          <li><a href="history">Rating History</a></li>
                          <li><a href="logout">Logout</a></li>
                        """)))}/*56.27*/else/*56.31*/{_display_(Seq[Any](format.raw/*56.32*/("""
                          """),format.raw/*57.27*/("""<li><a href="login">Login</a></li>
                          <li><a href="register">Register</a></li>
                        """)))}),format.raw/*59.26*/("""
                    """),format.raw/*60.21*/("""</ul>
                </div>
            </div>
        </header>
        <div id="theContent" class = "main-body">
        """),_display_(/*65.10*/content),format.raw/*65.17*/("""
        """),format.raw/*66.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,email:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,email)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,email) => (content) => apply(title,email)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Wed Dec 16 22:39:32 PST 2015
                  SOURCE: /home/agauyeung/cs490/newMovieRec/app/views/base.scala.html
                  HASH: 7991f601265559f768e2cf0bc5a1e5dbf8a1c675
                  MATRIX: 755->1|896->47|924->49|1268->366|1294->371|1368->418|1383->424|1454->474|1522->515|1537->521|1611->574|1679->615|1694->621|1763->669|1831->710|1846->716|1911->760|1979->801|1994->807|2056->848|2383->1148|2398->1154|2488->1222|2590->1297|2605->1303|2695->1371|2795->1444|2810->1450|2899->1517|2985->1576|3000->1582|3089->1649|3776->2309|3791->2315|3849->2351|4058->2533|4082->2548|4121->2549|4178->2578|4271->2644|4297->2649|4396->2717|4449->2742|4673->2939|4697->2954|4736->2955|4791->2982|5083->3256|5096->3260|5135->3261|5190->3288|5348->3415|5397->3436|5549->3561|5577->3568|5613->3577
                  LINES: 27->1|32->1|34->3|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|70->39|70->39|70->39|74->43|74->43|74->43|75->44|76->45|76->45|78->47|79->48|82->51|82->51|82->51|83->52|87->56|87->56|87->56|88->57|90->59|91->60|96->65|96->65|97->66
                  -- GENERATED --
              */
          