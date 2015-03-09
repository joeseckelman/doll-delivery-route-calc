package controllers

import dolldelivery.mapdetail
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
    Ok(views.html.index("Your new application is ready.","",0))
  }
  def initialPage = Action {
    Ok(views.html.initialPage("This is a."))
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
  def csvExample2 = Action {
    val (distance, path) = DeliverySolver.dijkstra("public/test_data_3.csv", CsvSyntax)
    //If this were output on console it would be different but out puting as string.
    val properOutput: String = "Map(Distance => "+distance+" ,Path => " +path+")"
    Ok(views.html.index(properOutput,"CSV",1))
  }

  def formprocessing = Action { implicit request =>
  	Ok("This is the output: ")
  }

  def mapDistance(mapfile: String) = Action {
  	Ok(views.html.initialPage(mapfile))
  }
}