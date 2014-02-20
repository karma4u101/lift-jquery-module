package net.liftmodules

import _root_.net.liftweb._
import util.{ Props }
import http._
import common._

/**
 *
 */
package object JQueryModule {

  /**
   * @example In bootstrap liftweb Boot set
   * {{{
   *   JQueryModule.init()
   * }}}
   * The above example just calls init without specifying init
   * params so the default JQuery version will be used.
   */
  def init() {
    LiftRules.addToPackages("net.liftmodules.JQueryModule")
    ResourceServer.allow {
      case "jquery.js" :: nil => true
    }
  }

  abstract trait JQModule
  /**
   * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
   *
   * '''Example:''
   *
   * {{{
   *   //init params can be skipped if it sets the current default value
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
   *   JQueryModule.init()
   * }}}
   * This example is explicitly setting the jquery init param
   * Using the default you could alternatively just call JQueryModule.init()
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
   * }}}
   */
  object InitParam extends JQModule {
    var JQuery: JQModule = JQuery182
  }

  /**
   * Enable usage of JQuery version 1_11_0 in your bootstrap liftweb Boot.
   * @version 1.11.0
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery1102
   * }}}
   */
  case object JQuery1110 extends JQModule {
    ModuleResources.jquery1110
  }
  /**
   * Enable usage of JQuery version 1_10_2 in your bootstrap liftweb Boot.
   * @version 1.10.2
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery1102
   * }}}
   */
  case object JQuery1102 extends JQModule {
    ModuleResources.jquery1102
  }
  
  /**
   * Enable usage of JQuery version 1_9_1 in your bootstrap liftweb Boot.
   * @version 1.9.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery191
   * }}}
   */
  case object JQuery191 extends JQModule {
    ModuleResources.jquery191
  }

  /**
   * Enable usage of JQuery version 1_8_2 in your bootstrap liftweb Boot.
   * @version 1.8.2
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery182
   * }}}
   */
  case object JQuery182 extends JQModule {
    ModuleResources.jquery182
  }

  /**
   * Enable usage of JQuery version 1_7_2 in your bootstrap liftweb Boot.
   * @version 1.7.2
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
   * }}}
   */
  case object JQuery172 extends JQModule {
    ModuleResources.jquery172
  }

  /**
   * Enable usage of JQuery version 1_7_1 in your bootstrap liftweb Boot.
   * @version 1.7.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
   * }}}
   */
  case object JQuery171 extends JQModule {
    ModuleResources.jquery171
  }

  /**
   * Enable usage of JQuery version 1_6_4 in your bootstrap liftweb Boot.
   *
   * @version 1.6.4
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery164
   * }}}
   */
  case object JQuery164 extends JQModule {
    ModuleResources.jquery164
  }

  /**
   * Object holding internally used module resources.
   */
  private object ModuleResources {

    lazy val jquery1110 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.0", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.11.0", "js", "jquery-min.js")
      }
    }

    lazy val jquery1102 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.10.2", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.10.2", "js", "jquery-min.js")
      }
    }
    
    lazy val jquery191 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.9.1", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.9.1", "js", "jquery-min.js")
      }
    }

    lazy val jquery182 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.8.2", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.8.2", "js", "jquery-min.js")
      }
    }

    lazy val jquery172 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.2", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.7.2", "js", "jquery-min.js")
      }
    }

    lazy val jquery171 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.1", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.7.1", "js", "jquery-min.js")
      }
    }

    lazy val jquery164 = {
      ResourceServer.rewrite {
        case  "jquery.js" :: Nil if Props.devMode => List("jquery", "1.6.4", "js", "jquery.js")
        case  "jquery.js" :: Nil => List("jquery", "1.6.4", "js", "jquery-min.js")
      }
    }

  }

}

