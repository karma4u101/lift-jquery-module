package net.liftmodules

import net.liftweb._
import util.{ Props }
import http._
import common._

import org.specs2.mutable.Specification

object JQueryModuleSpec extends Specification  {
  "JQueryModuleSpec Specification".title
  
  sequential

    //JQuery310
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery310 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery310,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/3.1.0/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery310,"jquery.js"::Nil) must_== 
        List("jquery", "3.1.0", "js", "jquery-min.js")
    }        
  } 
  
    //JQuery300
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery300 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery300,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/3.0.0/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery300,"jquery.js"::Nil) must_== 
        List("jquery", "3.0.0", "js", "jquery-min.js")
    }        
  }  
    //JQueryMigrate141
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQueryMigrate141 the ResourceServer" should {
//    "allow jquery-migrate.js" in {
//      allow(JQueryModule.JQueryMigrate141,"jquery-migrate.js"::Nil) must_== true 
//    }
    "rewrit jquery-migrate.js to jquery-migrate/1.4.1/js/jquery-migrate-min.js" in {
      rewrite(JQueryModule.JQueryMigrate141,"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.4.1", "js", "jquery-migrate-min.js")
    }        
  }
  
    //JQueryMigrate300
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQueryMigrate300 the ResourceServer" should {
//    "allow jquery-migrate.js" in {
//      allow(JQueryModule.JQueryMigrate300,"jquery-migrate.js"::Nil) must_== true 
//    }
    "rewrit jquery-migrate.js to jquery-migrate/3.0.0/js/jquery-migrate-min.js" in {
      rewrite(JQueryModule.JQueryMigrate300,"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "3.0.0", "js", "jquery-migrate-min.js")
    }        
  }  
  
    //JQuery224
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery224 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery224,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/2.2.4/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery224,"jquery.js"::Nil) must_== 
        List("jquery", "2.2.4", "js", "jquery-min.js")
    }        
  }
  
    //JQuery214
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery214 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery214,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/2.1.4/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery214,"jquery.js"::Nil) must_== 
        List("jquery", "2.1.4", "js", "jquery-min.js")
    }        
  }   
  
    //JQuery211
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery211 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery211,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/2.1.1/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery211,"jquery.js"::Nil) must_== 
        List("jquery", "2.1.1", "js", "jquery-min.js")
    }        
  }   
    //JQuery1113
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1113 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery1113,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.11.3/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery1113,"jquery.js"::Nil) must_== 
        List("jquery", "1.11.3", "js", "jquery-min.js")
    }        
  }  
 
    //JQuery1111
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1111 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery1111,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.11.1/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery1111,"jquery.js"::Nil) must_== 
        List("jquery", "1.11.1", "js", "jquery-min.js")
    }        
  }
  
    //JQuery1102
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery1102 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery1102,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.10.2/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery1102,"jquery.js"::Nil) must_== 
        List("jquery", "1.10.2", "js", "jquery-min.js")
    }        
  }
  
    //JQuery191
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery191 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery191,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.9.1/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery191,"jquery.js"::Nil) must_== 
        List("jquery", "1.9.1", "js", "jquery-min.js")
    }        
  }
  
    //JQuery182
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery182 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery182,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.8.2/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery182,"jquery.js"::Nil) must_== 
        List("jquery", "1.8.2", "js", "jquery-min.js")
    }        
  }  
  
    //JQuery172
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery172 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery172,"jquery.js"::Nil) must_== true 
    }     
    "rewrit jquery.js to jquery/1.7.2/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery172,"jquery.js"::Nil) must_== 
        List("jquery", "1.7.2", "js", "jquery-min.js")
    }        
  }  
  
    //JQuery164
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQuery164 the ResourceServer" should {
    "allow  jquery.js" in {
      allow(JQueryModule.JQuery164,"jquery.js"::Nil) must_== true 
    } 
    "rewrit jquery.js to jquery/1.6.4/js/jquery-min.js" in {
      rewrite(JQueryModule.JQuery164,"jquery.js"::Nil) must_== 
        List("jquery", "1.6.4", "js", "jquery-min.js")
    }        
  }

    //JQueryMigrate121
  "With JQueryModule.InitParam.JQuery set to JQueryModule.JQueryMigrate121 the ResourceServer" should {
//    "allow jquery-migrate.js" in {
//      allow(JQueryModule.JQueryMigrate121,"jquery-migrate.js"::Nil) must_== true 
//    }
    "rewrit jquery-migrate.js to jquery-migrate/1.2.1/js/jquery-migrate-min.js" in {
      rewrite(JQueryModule.JQueryMigrate121,"jquery-migrate.js"::Nil) must_== 
        List("jquery-migrate", "1.2.1", "js", "jquery-migrate-min.js")
    }        
  }
  
  
  def allow(resource:net.liftmodules.JQueryModule.JQModule,path:List[String]) = {
    JQueryModule.InitParam.JQuery=resource
    ResourceServer.allowedPaths(path)
  }
  def rewrite(resource:net.liftmodules.JQueryModule.JQModule,path:List[String]) = {
    JQueryModule.InitParam.JQuery=resource
    ResourceServer.pathRewriter(path)
  }    
  
}
