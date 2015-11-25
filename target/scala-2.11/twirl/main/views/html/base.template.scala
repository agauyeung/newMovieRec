
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.95*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.98*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.93*/("""">
        <link rel="stylesheet" href=""""),_display_(/*15.39*/routes/*15.45*/.Assets.versioned("stylesheets/animate.css")),format.raw/*15.89*/("""">
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.86*/("""">

        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="public/images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*23.73*/routes/*23.79*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*23.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(/*24.73*/routes/*24.79*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*24.147*/("""">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href=""""),_display_(/*25.71*/routes/*25.77*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*25.144*/("""">
        <link rel="apple-touch-icon-precomposed" href=""""),_display_(/*26.57*/routes/*26.63*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*26.130*/("""">
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
                    <a class="navbar-brand" href="view"><img src=""""),_display_(/*38.68*/routes/*38.74*/.Assets.versioned("images/logo.png")),format.raw/*38.110*/("""" alt="logo"></a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="recommended">Recommended For You</a></li>
                        <li><a href="rate">Rate Movies</a></li> 
                        <li><a href="history">Rating History</a></li>
                        <li><a href="register_user">User Registration</a></li>
                        <li><a href="view">View Movies</a></li>
                        <li><a href="users">View Users</a></li>
                        <li><a href="login">Login</a></li>
                    </ul>
                </div>
            </div>
        </header><!--/header-->
        """),_display_(/*53.10*/content),format.raw/*53.17*/("""
    """),format.raw/*54.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 04:55:53 PST 2015
                  SOURCE: /Users/alphaneo1/newMovieRec/app/views/base.scala.html
                  HASH: 8103f809a9ac852c1196f0e5584c38aeec98d411
                  MATRIX: 748->1|873->31|901->33|1184->289|1210->294|1284->341|1299->347|1370->397|1438->438|1453->444|1527->497|1595->538|1610->544|1679->592|1747->633|1762->639|1827->683|1895->724|1910->730|1972->771|2299->1071|2314->1077|2404->1145|2506->1220|2521->1226|2611->1294|2711->1367|2726->1373|2815->1440|2901->1499|2916->1505|3005->1572|3692->2232|3707->2238|3765->2274|4538->3020|4566->3027|4598->3032
                  LINES: 27->1|32->1|34->3|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|69->38|69->38|69->38|84->53|84->53|85->54
                  -- GENERATED --
              */
          