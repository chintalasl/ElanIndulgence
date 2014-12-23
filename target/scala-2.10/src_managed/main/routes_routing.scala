// @SOURCE:/home/swapna/git/ElanIndulgence/conf/routes
// @HASH:75e9909800c0177cd50dc8ef21972dc416ee7f9b
// @DATE:Sun Dec 21 20:24:47 EST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_loadMain0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_registerUser1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
        

// @LINE:12
private[this] lazy val controllers_Application_loginValidation2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:15
private[this] lazy val controllers_Application_saveUserPreferences3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("savepref"))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.loadMain()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.registerUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.loginValidation()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """savepref""","""controllers.Application.saveUserPreferences()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_loadMain0(params) => {
   call { 
        invokeHandler(controllers.Application.loadMain(), HandlerDef(this, "controllers.Application", "loadMain", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_registerUser1(params) => {
   call { 
        invokeHandler(controllers.Application.registerUser(), HandlerDef(this, "controllers.Application", "registerUser", Nil,"POST", """ User registration""", Routes.prefix + """register"""))
   }
}
        

// @LINE:12
case controllers_Application_loginValidation2(params) => {
   call { 
        invokeHandler(controllers.Application.loginValidation(), HandlerDef(this, "controllers.Application", "loginValidation", Nil,"POST", """ Login validation""", Routes.prefix + """login"""))
   }
}
        

// @LINE:15
case controllers_Application_saveUserPreferences3(params) => {
   call { 
        invokeHandler(controllers.Application.saveUserPreferences(), HandlerDef(this, "controllers.Application", "saveUserPreferences", Nil,"POST", """ Add user preferences""", Routes.prefix + """savepref"""))
   }
}
        

// @LINE:17
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     