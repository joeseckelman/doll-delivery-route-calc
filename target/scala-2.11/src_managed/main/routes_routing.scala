// @SOURCE:/home/muffin/play-scala/conf/routes
// @HASH:bc289d2de967d1218bc96e6419573dcd0621eba1
// @DATE:Mon Mar 09 02:29:51 EDT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_initialPage1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("initial-page"))))
private[this] lazy val controllers_Application_initialPage1_invoker = createInvoker(
controllers.Application.initialPage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "initialPage", Nil,"GET", """ Home page""", Routes.prefix + """initial-page"""))
        

// @LINE:10
private[this] lazy val controllers_Application_scalaExample2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("scala-example"))))
private[this] lazy val controllers_Application_scalaExample2_invoker = createInvoker(
controllers.Application.scalaExample,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "scalaExample", Nil,"GET", """""", Routes.prefix + """scala-example"""))
        

// @LINE:11
private[this] lazy val controllers_Application_csvExample3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("csv-example"))))
private[this] lazy val controllers_Application_csvExample3_invoker = createInvoker(
controllers.Application.csvExample,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "csvExample", Nil,"GET", """""", Routes.prefix + """csv-example"""))
        

// @LINE:12
private[this] lazy val controllers_Application_csvExample24_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("csv-example2"))))
private[this] lazy val controllers_Application_csvExample24_invoker = createInvoker(
controllers.Application.csvExample2,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "csvExample2", Nil,"GET", """""", Routes.prefix + """csv-example2"""))
        

// @LINE:15
private[this] lazy val controllers_Application_formprocessing5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("initial-page/submit"))))
private[this] lazy val controllers_Application_formprocessing5_invoker = createInvoker(
controllers.Application.formprocessing,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formprocessing", Nil,"POST", """initially attempted to create a db driven map storing method.""", Routes.prefix + """initial-page/submit"""))
        

// @LINE:16
private[this] lazy val controllers_Application_mapDistance6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("map-distance/"),DynamicPart("mapfile", """[^/]+""",true))))
private[this] lazy val controllers_Application_mapDistance6_invoker = createInvoker(
controllers.Application.mapDistance(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mapDistance", Seq(classOf[String]),"GET", """""", Routes.prefix + """map-distance/$mapfile<[^/]+>"""))
        

// @LINE:19
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """initial-page""","""controllers.Application.initialPage"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """scala-example""","""controllers.Application.scalaExample"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """csv-example""","""controllers.Application.csvExample"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """csv-example2""","""controllers.Application.csvExample2"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """initial-page/submit""","""controllers.Application.formprocessing"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """map-distance/$mapfile<[^/]+>""","""controllers.Application.mapDistance(mapfile:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Application_initialPage1_route(params) => {
   call { 
        controllers_Application_initialPage1_invoker.call(controllers.Application.initialPage)
   }
}
        

// @LINE:10
case controllers_Application_scalaExample2_route(params) => {
   call { 
        controllers_Application_scalaExample2_invoker.call(controllers.Application.scalaExample)
   }
}
        

// @LINE:11
case controllers_Application_csvExample3_route(params) => {
   call { 
        controllers_Application_csvExample3_invoker.call(controllers.Application.csvExample)
   }
}
        

// @LINE:12
case controllers_Application_csvExample24_route(params) => {
   call { 
        controllers_Application_csvExample24_invoker.call(controllers.Application.csvExample2)
   }
}
        

// @LINE:15
case controllers_Application_formprocessing5_route(params) => {
   call { 
        controllers_Application_formprocessing5_invoker.call(controllers.Application.formprocessing)
   }
}
        

// @LINE:16
case controllers_Application_mapDistance6_route(params) => {
   call(params.fromPath[String]("mapfile", None)) { (mapfile) =>
        controllers_Application_mapDistance6_invoker.call(controllers.Application.mapDistance(mapfile))
   }
}
        

// @LINE:19
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     