// @SOURCE:/home/swapna/git/ElanIndulgence/conf/routes
// @HASH:75e9909800c0177cd50dc8ef21972dc416ee7f9b
// @DATE:Sun Dec 21 20:24:47 EST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def loginValidation(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:9
def registerUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:15
def saveUserPreferences(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "savepref")
}
                                                

// @LINE:6
def loadMain(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

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
              

// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def loginValidation : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loginValidation",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:9
def registerUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:15
def saveUserPreferences : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveUserPreferences",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savepref"})
      }
   """
)
                        

// @LINE:6
def loadMain : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadMain",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:17
class ReverseAssets {
    

// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def loginValidation(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loginValidation(), HandlerDef(this, "controllers.Application", "loginValidation", Seq(), "POST", """ Login validation""", _prefix + """login""")
)
                      

// @LINE:9
def registerUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerUser(), HandlerDef(this, "controllers.Application", "registerUser", Seq(), "POST", """ User registration""", _prefix + """register""")
)
                      

// @LINE:15
def saveUserPreferences(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveUserPreferences(), HandlerDef(this, "controllers.Application", "saveUserPreferences", Seq(), "POST", """ Add user preferences""", _prefix + """savepref""")
)
                      

// @LINE:6
def loadMain(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadMain(), HandlerDef(this, "controllers.Application", "loadMain", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    