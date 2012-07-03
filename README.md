lift-jquery-module
==================

A Lift JQuery Module currently supporting 

- JQurey v1.7.2 (default)
- JQurey v1.7.1 
- JQuery v1.6.4

**Current module version:** 0.0.4-SNAPSHOT 

As this is a *very simple* and one *purpose only* Lift Module you may wonder why you should use it, so here we go 

**Usage Benefits:** 
- Very Smoth upgrade/downgrade (at most a one-liner change in your project). 
- The intention of this module is to closely follow the upstream releases.
- Compile from same source the module will automaticaly give you minified files in production.
 
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

With the second setup option you chose when and what version to use.

In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jquery.js" type="text/javascript"></script>

Usage example
-------------

For a usage example take a look att my [Templating-With-Twitter-Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap)
