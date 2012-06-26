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
      case "jqmodule" :: tail => true
    }
  }

  abstract trait JQuery
  /**
   * Enable Toolkit(s)/JQuery options for the FoBo module in your bootstrap liftweb Boot
   *
   * '''Example:''
   *
   * {{{
   *   //init params can be skipped if it sets the current default value
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
   *   JQueryModule.init()
   * }}}
   * This example is explicitly setting the jquery init param
   * Using the default you could alternatively just call JQueryModule.init()
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
   * }}}
   */
  object InitParam extends JQuery {
    var JQuery: JQuery = JQuery171
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
  case object JQuery171 extends JQuery {
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
  case object JQuery164 extends JQuery {
    ModuleResources.jquery164
  }

  /**
   * Object holding internally used module resources.
   */
  private object ModuleResources {

    lazy val jquery171 = {
      ResourceServer.rewrite {
        case "jqmodule" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.7.1", "js", "jquery.js")
        case "jqmodule" :: "jquery.js" :: Nil => List("jquery", "1.7.1", "js", "jquery-min.js")
      }
    }

    lazy val jquery164 = {
      ResourceServer.rewrite {
        case "jqmodule" :: "jquery.js" :: Nil if Props.devMode => List("jquery", "1.6.4", "js", "jquery.js")
        case "jqmodule" :: "jquery.js" :: Nil => List("jquery", "1.6.4", "js", "jquery-min.js")
      }
    }

  }

}

