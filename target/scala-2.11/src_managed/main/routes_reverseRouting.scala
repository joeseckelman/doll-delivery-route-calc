// @SOURCE:/home/muffin/play-scala/conf/routes
// @HASH:bc289d2de967d1218bc96e6419573dcd0621eba1
// @DATE:Mon Mar 09 02:29:51 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:19
class ReverseAssets {


// @LINE:19
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def csvExample2(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "csv-example2")
}
                        

// @LINE:15
def formprocessing(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "initial-page/submit")
}
                        

// @LINE:10
def scalaExample(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "scala-example")
}
                        

// @LINE:11
def csvExample(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "csv-example")
}
                        

// @LINE:9
def initialPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "initial-page")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:16
def mapDistance(mapfile:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "map-distance/" + implicitly[PathBindable[String]].unbind("mapfile", dynamicString(mapfile)))
}
                        

}
                          
}
                  


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:19
class ReverseAssets {


// @LINE:19
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def csvExample2 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.csvExample2",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "csv-example2"})
      }
   """
)
                        

// @LINE:15
def formprocessing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.formprocessing",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "initial-page/submit"})
      }
   """
)
                        

// @LINE:10
def scalaExample : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.scalaExample",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "scala-example"})
      }
   """
)
                        

// @LINE:11
def csvExample : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.csvExample",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "csv-example"})
      }
   """
)
                        

// @LINE:9
def initialPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.initialPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "initial-page"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:16
def mapDistance : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mapDistance",
   """
      function(mapfile) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "map-distance/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mapfile", encodeURIComponent(mapfile))})
      }
   """
)
                        

}
              
}
        


// @LINE:19
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:19
class ReverseAssets {


// @LINE:19
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def csvExample2(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.csvExample2(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "csvExample2", Seq(), "GET", """""", _prefix + """csv-example2""")
)
                      

// @LINE:15
def formprocessing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.formprocessing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formprocessing", Seq(), "POST", """initially attempted to create a db driven map storing method.""", _prefix + """initial-page/submit""")
)
                      

// @LINE:10
def scalaExample(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.scalaExample(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "scalaExample", Seq(), "GET", """""", _prefix + """scala-example""")
)
                      

// @LINE:11
def csvExample(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.csvExample(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "csvExample", Seq(), "GET", """""", _prefix + """csv-example""")
)
                      

// @LINE:9
def initialPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.initialPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "initialPage", Seq(), "GET", """ Home page""", _prefix + """initial-page""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:16
def mapDistance(mapfile:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mapDistance(mapfile), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mapDistance", Seq(classOf[String]), "GET", """""", _prefix + """map-distance/$mapfile<[^/]+>""")
)
                      

}
                          
}
        
    