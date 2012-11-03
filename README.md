lift-jquery-module
==================

A Lift JQuery Module currently supporting 


- JQuery v1.8.2
- JQuery v1.7.2
- JQuery v1.7.1
- JQuery v1.6.4

**Current module version:** 2.0-SNAPSHOT

**Latest updates** 
- **2012-11-03** Added JQuery v1.8.2

**Stable releases:** 
- **2012-09-11** Released for Lift 2.5-M1 (Scala 2.9.1, 2.9.1-1, 2.9.1)

As this is a *very simple* and one *purpose only* Lift Module you may wonder why you should use it, so here we go 

**Usage Benefits:** 
- Very Smooth up/down-grade (at most a one-liner change in your project). 
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
