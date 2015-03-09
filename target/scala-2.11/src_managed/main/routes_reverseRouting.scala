// @SOURCE:/home/muffin/play-scala/conf/routes
// @HASH:8e202b1e1b0e70cb6e0562b40394a1dc4b9439aa
// @DATE:Sun Mar 08 21:17:23 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {


// @LINE:17
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def formprocessing(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "test-page/submit")
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
def testPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test-page")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:14
def mapDistance(mapfile:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "map-distance/" + implicitly[PathBindable[String]].unbind("mapfile", dynamicString(mapfile)))
}
                        

}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:17
class ReverseAssets {


// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def formprocessing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.formprocessing",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test-page/submit"})
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
def testPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.testPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test-page"})
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
                        

// @LINE:14
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
        


// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {


// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:14
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {


// @LINE:12
def formprocessing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.formprocessing(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formprocessing", Seq(), "POST", """""", _prefix + """test-page/submit""")
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
def testPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.testPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "testPage", Seq(), "GET", """ Home page""", _prefix + """test-page""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def mapDistance(mapfile:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mapDistance(mapfile), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mapDistance", Seq(classOf[String]), "GET", """""", _prefix + """map-distance/$mapfile<[^/]+>""")
)
                      

}
                          
}
        
    