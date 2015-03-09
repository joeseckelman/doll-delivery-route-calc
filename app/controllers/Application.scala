package controllers

import models.mapdetail
import dolldelivery.DeliverySolver
import dolldelivery.MapSyntax
import dolldelivery.CsvSyntax
import play.api._
import play.api.mvc._
import play.api.mvc.RequestHeader
import play.api.data._
import play.api.data.Forms._


object Application extends Controller {

  def index = Action {
  	val extraMessage: String = "testing new"
    Ok(views.html.index("Your new application is ready.","",0))
  }
  def testPage = Action {
    Ok(views.html.testPage("This is a."))
  }
  def scalaExample = Action {
  	val (distance, path) = DeliverySolver.dijkstra("public/test_data_1.txt", MapSyntax)
    //If this were output on console it would be different but out puting as string.
    val properOutput: String = "Map(Distance => "+distance+" ,Path => " +path+")"
    Ok(views.html.index(properOutput,"Scala",1))
  }
  def csvExample = Action {
    val (distance, path) = DeliverySolver.dijkstra("public/test_data_2.csv", CsvSyntax)
    //If this were output on console it would be different but out puting as string.
    val properOutput: String = "Map(Distance => "+distance+" ,Path => " +path+")"
    Ok(views.html.index(properOutput,"CSV",1))
  }

  val mapdetailForm: Form[mapdetail] = Form{
  	mapping{
  	"maptext"-> text
  	}(mapdetail.apply)(mapdetail.unapply)
  }

  def formprocessing = Action { implicit request =>
  	val mapdata = mapdetailForm.bindFromRequest.get
  	Ok("This is the output: "+mapdata)
  }

  def mapDistance(mapfile: String) = Action {
  	Ok(views.html.testPage(mapfile))
  	// Ok(views.html.testPage("Test message"))
  }
}