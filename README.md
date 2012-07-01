jquery-lift-module
==================

A JQuery Lift Module currently supporting 

- JQurey v1.7.2 (default)
- JQurey v1.7.1 
- JQuery v1.6.4

**Currnet module version:** 0.0.3-SNAPSHOT 

The intention of this module is to closely follow the upstream releases. 
If you have a update request you can either make a pull request or make a update request in a issue report. 

Usage
=====

In your build system
--------------------

For example in build.sbt add dependancy on 

    "net.liftmodules" %% "lift-jquery-module" % (liftVersion+"-X.Y.Z-SNAPSHOT")

Wher *X.Y.Z-SNAPSHOT* is the module version.

In bootstrap.liftweb.Boot
-------------------------  

Add

    net.liftmodules.JQueryModule.init() 

or if you like to set the version explicitly use 

    import net.liftmodules.JQueryModule
    :
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
    JQueryModule.init()

In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jqmodule/jquery.js" type="text/javascript"></script>


