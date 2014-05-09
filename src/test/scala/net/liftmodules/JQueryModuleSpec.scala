package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object JQueryModuleSpec extends Specification  {
  "JQueryModuleSpec Specification".title

//  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery21Z the ResourceServer.pathRewriter" should {
//    "rewrit jquery.js to jquery/2.1.1/js/jquery-min.js" in {
//      rewriteJQuery21ZJS must_== List("jquery", "2.1.1", "js", "jquery-min.js")
//    }
//  }
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery211 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewriteJQuery211JS must_== List("jquery", "2.1.1", "js", "jquery-min.js")
    }
  }
  
//  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery111Z the ResourceServer.pathRewriter" should {
//    "rewrit jquery.js to jquery/1.11.1/js/jquery-min.js" in {
//      rewriteJQuery111ZJS must_== List("jquery", "1.11.1", "js", "jquery-min.js")
//    }
//  }
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1111 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.11.1/js/jquery-min.js" in {
      rewriteJQuery1111JS must_== List("jquery", "1.11.1", "js", "jquery-min.js")
    }
  }
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1110 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.11.0/js/jquery-min.js" in {
      rewriteJQuery1110JS must_== List("jquery", "1.11.0", "js", "jquery-min.js")
    }
  }
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1102 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewriteJQuery1102JS must_== List("jquery", "1.10.2", "js", "jquery-min.js")
    }                             
  }   
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery191 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewriteJQuery191JS must_== List("jquery", "1.9.1", "js", "jquery-min.js")
    }                             
  }  
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery182 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewriteJQuery182JS must_== List("jquery", "1.8.2", "js", "jquery-min.js")
    }                             
  } 
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery172 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewriteJQuery172JS must_== List("jquery", "1.7.2", "js", "jquery-min.js")
    }                             
  } 
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery171 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.7.1/js/jquery-min.js" in {
      rewriteJQuery171JS must_== List("jquery", "1.7.1", "js", "jquery-min.js")
    }                             
  }   
  
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery164 the ResourceServer.pathRewriter" should {
    "rewrit jquery.js to jquery/1.6.4/js/jquery-min.js" in {
      rewriteJQuery164JS must_== List("jquery", "1.6.4", "js", "jquery-min.js")
    }                             
  }  
 
//   def rewriteJQuery21ZJS = {
//    JQueryModule.InitParam.JQuery=JQueryModule.JQuery21Z
//    ResourceServer.pathRewriter("jquery.js"::Nil)
//  }
//  
//  def rewriteJQuery111ZJS = {
//    JQueryModule.InitParam.JQuery=JQueryModule.JQuery111Z
//    ResourceServer.pathRewriter("jquery.js"::Nil)
//  }
  
  def rewriteJQuery211JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery211
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }
  
  def rewriteJQuery1111JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery1111
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }
  
  def rewriteJQuery1110JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery1110
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }

  def rewriteJQuery1102JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery1102
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }
  
  def rewriteJQuery191JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery191
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }
  
  def rewriteJQuery182JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery182
    ResourceServer.pathRewriter("jquery.js"::Nil)
  } 
    
  def rewriteJQuery172JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }   
  
  def rewriteJQuery171JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }   
  
  def rewriteJQuery164JS = {
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery164
    ResourceServer.pathRewriter("jquery.js"::Nil)
  }   
  
}
