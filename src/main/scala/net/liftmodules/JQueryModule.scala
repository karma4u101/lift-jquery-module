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
   * Enable JQuery options in your bootstrap liftweb Boot
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
    var JQuery: JQModule = _
  }

  /**
   * Enable usage of JQuery-migrate version 1.2.1 in your bootstrap liftweb Boot.
   * @version 1.2.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQueryMigrate121
   * }}}
   * @since v2.7
   */
  case object JQueryMigrate121 extends JQModule {
    ModuleResources.jqueryMigrate121
  }  
  
  /**
   * Enable usage of JQuery version 2.1.z in your bootstrap liftweb Boot.
   * @version 2.1.z
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery21Z
   * }}}
   * @since v2.7
   */
  case object JQuery21Z extends JQModule {
    ModuleResources.jquery214
  }
  
  /**
   * Enable usage of JQuery version 2.1.4 in your bootstrap liftweb Boot.
   * @version 2.1.4
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery214
   * }}}
   * @since v2.9
   */
  case object JQuery214 extends JQModule {
    ModuleResources.jquery214
  }
  
   /**
   * Enable usage of JQuery version 2.1.1 in your bootstrap liftweb Boot.
   * @version 2.1.1
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
   * }}}
   * @since v2.7
   */
  @deprecated("Use v2.1.4 or later","Sins v2.9")
  case object JQuery211 extends JQModule {
    ModuleResources.jquery211
  }
   /**
   * Enable usage of JQuery version 1.11.z in your bootstrap liftweb Boot.
   * @version 1.11.z
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery111Z
   * }}}
   * @since v2.7
   */
  case object JQuery111Z extends JQModule {
    ModuleResources.jquery1113
  } 

  /**
   * Enable usage of JQuery version 1.11.3 in your bootstrap liftweb Boot.
   * @version 1.11.3
   * OBS! JQuery 2.x dose not support Internet Explorer 6, 7, or 8.
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery2113
   * }}}
   * @since v2.9
   */
  case object JQuery1113 extends JQModule {
    ModuleResources.jquery1113
  }
  
  
  /**
   * Enable usage of JQuery version 1.11.1 in your bootstrap liftweb Boot.
   * @version 1.11.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery1111
   * }}}
   * @since v2.7
   */
  @deprecated("Use v1.11.3 or later","Sins v2.9")
  case object JQuery1111 extends JQModule {
    ModuleResources.jquery1111
  }
  
  /**
   * Enable usage of JQuery version 1.11.0 in your bootstrap liftweb Boot.
   * @version 1.11.0
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery1110
   * }}}
   */
  @deprecated("Use v1.11.1 or later","Sins v2.7")
  case object JQuery1110 extends JQModule {
    ModuleResources.jquery1110
  }
  /**
   * Enable usage of JQuery version 1.10.2 in your bootstrap liftweb Boot.
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
   * Enable usage of JQuery version 1.9.1 in your bootstrap liftweb Boot.
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
   * Enable usage of JQuery version 1.8.2 in your bootstrap liftweb Boot.
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
   * Enable usage of JQuery version 1.7.2 in your bootstrap liftweb Boot.
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
   * Enable usage of JQuery version 1.7.1 in your bootstrap liftweb Boot.
   * @version 1.7.1
   *
   * '''Example:'''
   *
   * {{{
   *   JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
   * }}}
   */
  @deprecated("Use v1.7.2 or later","Sins v2.7")
  case object JQuery171 extends JQModule {
    ModuleResources.jquery171
  }

  /**
   * Enable usage of JQuery version 1.6.4 in your bootstrap liftweb Boot.
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

    lazy val jquery214 = {
      ResourceServer.rewrite {
       case "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.4", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "2.1.4", "js", "jquery-min.js")
        case "jquery-min.map" :: Nil => List("jquery", "2.1.4", "js", "jquery-min.map")
      }
    }
    
    lazy val jquery1113 = {
      ResourceServer.rewrite {
       case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.3", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.11.3", "js", "jquery-min.js")
        case "jquery-min.map" :: Nil => List("jquery", "1.11.3", "js", "jquery-min.map")
      }
    }
    
    lazy val jqueryMigrate121 = {
      ResourceServer.rewrite {
        case "jquery-migrate.js" :: Nil if Props.devMode => List("jquery-migrate", "1.2.1", "js", "jquery-migrate.js")
        case "jquery-migrate.js" :: Nil => List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
      }
    }
    
    lazy val jquery211 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "2.1.1", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "2.1.1", "js", "jquery-min.js")
      }
    }
    
    lazy val jquery1111 = {
      ResourceServer.rewrite {
        case "jquery.js" :: Nil if Props.devMode => List("jquery", "1.11.1", "js", "jquery.js")
        case "jquery.js" :: Nil => List("jquery", "1.11.1", "js", "jquery-min.js")
      }
    }
    
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

