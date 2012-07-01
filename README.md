jquery-lift-module
==================

A JQuery Lift Module currntly supporting 

- JQurey v1.7.1 (default)
- JQuery v1.6.4

**Currnet module version:** 0.0.2-SNAPSHOT 

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
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery171
    JQueryModule.init()

In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jqmodule/jquery.js" type="text/javascript"></script>


