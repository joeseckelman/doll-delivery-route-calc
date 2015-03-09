
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/hello.js")),format.raw/*11.63*/("""" type="text/javascript"></script>
    </head>
    <body>
		<div class="container">
			<nav class="navbar navbar-default">
				<div class="container">
				<ul class="nav navbar-nav">
					<li><a href=""""),_display_(/*18.20*/routes/*18.26*/.Application.index()),format.raw/*18.46*/("""">About</a></li>
					<li><a href=""""),_display_(/*19.20*/routes/*19.26*/.Application.scalaExample()),format.raw/*19.53*/("""">Scala Example</a></li>
					<li><a href=""""),_display_(/*20.20*/routes/*20.26*/.Application.csvExample()),format.raw/*20.51*/("""">CSV Example</a></li>
					<li><a href=""""),_display_(/*21.20*/routes/*21.26*/.Application.csvExample2()),format.raw/*21.52*/("""">CSV Example 2</a></li>
				</ul>
				</div>
			</nav>
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
		"""),format.raw/*26.3*/("""</div>
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 09 02:32:42 EDT 2015
                  SOURCE: /home/muffin/play-scala/app/views/main.scala.html
                  HASH: 476856ac37e97a2c8eb46ba9d09a82a3ca282c55
                  MATRIX: 509->1|627->31|655->33|732->84|757->89|845->151|859->157|913->191|1119->370|1134->376|1187->408|1239->433|1254->439|1309->473|1538->675|1553->681|1594->701|1657->737|1672->743|1720->770|1791->814|1806->820|1852->845|1921->887|1936->893|1983->919|2075->984|2103->991|2133->994
                  LINES: 19->1|22->1|24->3|28->7|28->7|29->8|29->8|29->8|31->10|31->10|31->10|32->11|32->11|32->11|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|46->25|46->25|47->26
                  -- GENERATED --
              */
          