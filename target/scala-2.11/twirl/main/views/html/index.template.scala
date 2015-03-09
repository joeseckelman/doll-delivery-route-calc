
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(output: String,syntaxtype: String,notHome: Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.50*/("""


"""),_display_(/*4.2*/main("Welcome to Play heres a new message")/*4.45*/ {_display_(Seq[Any](format.raw/*4.47*/("""

	"""),_display_(/*6.3*/if(notHome == 1)/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
	"""),format.raw/*7.2*/("""<h1>Map Output From: """),_display_(/*7.24*/syntaxtype),format.raw/*7.34*/("""</h1>
	<pre>
    """),_display_(/*9.6*/output),format.raw/*9.12*/("""
    """),format.raw/*10.5*/("""</pre>
	""")))}/*11.4*/else/*11.9*/{_display_(Seq[Any](format.raw/*11.10*/("""
		"""),format.raw/*12.3*/("""<h1>Doll Delivery Challenge</h1>
		<div class="col-lg-4">
		<img class="img-thumbnail" src="https://camo.githubusercontent.com/a95581e610c790a0b9197d4fed86b4e4438ae6ba/68747470733a2f2f7261772e6769746875622e636f6d2f706f73746e6174692f646f6c6c2d64656c69766572792f6d61737465722f6e65696768626f72686f6f642d6d61702e706e67" />
		</div>
		<div class="col-lg-8">
		<div>
		<h2>Initial Details:</h2>
		<ul class="dl-horizontal">
		<dt>Languages/Tools Used:</dt>
		<dd>Scala(of course), Play Framework, HTML, CSS, Typesafe, and a few others.</dd>
		<dt>Initial Goals:</dt>
		<dd>
			<ul class="list-unstyled">
				<li>Create a means for client to test map files</li>
				<li>Store and manage them dynamically(almost)</li>
				<li>And test files on the server</li>
			</ul>
		</dd>
		</ul>
		<h2>More about what is here:</h2>
		<p>I have set up a way to run a Java based server that is running Play Framework with Scala. On this site I set up means to test three files which use Scala based backend to check which route on the map would be the shortest. In learning Scala I utilized Typesafe because it allowed me the best teaching opportunities with a few tutorials. I also heavily followed the <a href="http://twitter.github.io/scala_school/index.html" target="_blank">Twitter Scala lessons</a>. Each of the links above represent the demo data that does calculate the shortest route. 
		</p>
		<h3>Some definite improvements with version 2</h3>
		<ul class="list-unstyled">
				<li>Adding the database driven aspect</li>
				<li>Allowing for more types of syntaxs/file formats</li>
				<li>Adding to the display by listing out what each of the files actually say so that users could get a better visual if needed</li>
				<li>And Alot more but so far Scala is brand new so could only do so much with it so far.</li>
		</ul>
		</ul>
		</div>
		</div>
	""")))}),format.raw/*44.3*/("""
""")))}),format.raw/*45.2*/("""
"""))}
  }

  def render(output:String,syntaxtype:String,notHome:Int): play.twirl.api.HtmlFormat.Appendable = apply(output,syntaxtype,notHome)

  def f:((String,String,Int) => play.twirl.api.HtmlFormat.Appendable) = (output,syntaxtype,notHome) => apply(output,syntaxtype,notHome)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 09 03:04:05 EDT 2015
                  SOURCE: /home/muffin/play-scala/app/views/index.scala.html
                  HASH: 1170c621034f08f8cefdb6d5317fb48fe77e590f
                  MATRIX: 516->1|652->49|681->53|732->96|771->98|800->102|824->118|862->119|890->121|938->143|968->153|1011->171|1037->177|1069->182|1096->192|1108->197|1147->198|1177->201|3048->2042|3080->2044
                  LINES: 19->1|22->1|25->4|25->4|25->4|27->6|27->6|27->6|28->7|28->7|28->7|30->9|30->9|31->10|32->11|32->11|32->11|33->12|65->44|66->45
                  -- GENERATED --
              */
          