lift-jquery-module
==================

A Lift JQuery Module currently supporting 

- JQuery v1.8.2
- JQuery v1.7.2
- JQuery v1.7.1
- JQuery v1.6.4


**Latest updates**
- **2013-01-11** -- v2.1 Stable build for Lift M4
- **2013-01-10** -- v2.1-SNAPSHOT Added Scala version 2.10 build 
- **2012-12-29** -- v2.0 Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-11** -- v2.0-SNAPSHOT Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-10** -- v2.0 artifact releas to oss.sonatype.org with JQuery <= v1.8.2 
- **2012-11-03** -- v2.0-SNAPSHOT - Added JQuery v1.8.2 

**Latest Stable Releases:** 
- **2013-01-11** -- v2.1 stable artifact released for Lift 2.5-M4 (Scala 2.10.0, 2.9.2, 2.9.1-1,2.9.1 )
- **2012-12-29** -- v2.0 stable artifact released for Lift 2.5-SNAPSHOT (Scala 2.9.2, 2.9.1-1, 2.9.1)
- **2012-11-10** -- v2.0 stable artifact released for Lift 2.5-M3 (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2012-09-11** -- v1.0 stable artifact released for Lift 2.5-M2 (Scala 2.9.1, 2.9.1-1, 2.9.1)

**Latest snapshot Release:**
- **2013-01-10** -- v2.1-SNAPSHOT published for  Lift 2.5-SNAPSHOT (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.1)
- **2012-11-11** -- v2.0-SNAPSHOT published for Lift-2.5-M3 and Lift 2.5-SNAPSHOT
- **2012-11-03** -- v2.0-SNAPSHOT release for Lift 2.5-M2 (Scala 2.9.1, 2.9.1-1, 2.9.1)


As this is a *very simple* and one *purpose only* Lift Module you may wonder why you should use it, so here we go 

**Usage Benefits:** 
- Very Smooth up/down-grade (a one-liner change in your Boot.scala and module version bump in your build file). 
- The intention of this module is to closely follow the upstream releases.
- Compile from same source the module will automatically give you minified files in production.
 
If you have a update request you can either make a pull request or make a update request in a issue report. 

Usage
=====

In your build system
--------------------

For example in build.sbt add dependency on 

    "net.liftmodules" %% "lift-jquery-module" % (liftVersion+"-X.Y.Z-SNAPSHOT")

Where *X.Y.Z-SNAPSHOT* is the module version.

In bootstrap.liftweb.Boot
-------------------------  

Add

    import net.liftmodules.JQueryModule
    :
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
    JQueryModule.init()


In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jquery.js" type="text/javascript"></script>

Usage example
-------------

For a usage example take a look att my [Templating-With-Twitter-Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap)
