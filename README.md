# lift-jquery-module 
[![Build Status](https://secure.travis-ci.org/karma4u101/lift-jquery-module.png)](http://travis-ci.org/karma4u101/lift-jquery-module)
[![Stories in Ready](https://badge.waffle.io/karma4u101/lift-jquery-module.svg?label=ready&title=Ready)](http://waffle.io/karma4u101/lift-jquery-module) 


A Lift JQuery Module currently supporting 

- JQuery v3.1.0  (availability - module v2.10 and above)
- JQuery v3.0.0  (availability - module v2.10 and above)
- JQuery v2.2.4  (availability - module v2.10 and above)
- JQuery v1.11.3 (availability - module v2.9 and above)
- JQuery v2.1.4  (availability - module v2.9 and above)
- JQuery v2.1.1  (availability - module v2.7 and above) Does not support Internet Explorer 6, 7, or 8
- JQuery v1.11.1 (availability - module v2.7 and above)
- JQuery v1.10.2 (availability - module v2.5 and above)
- JQuery v1.9.1  (availability - module v2.4 and above) 
- JQuery v1.8.2  (availability - module v2.0 and above)
- JQuery v1.7.2  (availability - module v2.0 and above)
- JQuery v1.6.4  (availability - module v2.0 and above)

Also supporting 

- JQuery-Migrate v3.0.0 (availability - module v2.10 and above) see [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)
- JQuery-Migrate v1.4.1 (availability - module v2.10 and above) see [JQuery-Migrate](https://github.com/jquery/jquery-migrate/tree/1.x-stable#readme)
- JQuery-Migrate v1.2.1 (availability - module v2.8 and above) see [JQuery-Migrate](https://github.com/jquery/jquery-migrate/tree/1.x-stable#readme)

JQuery-Migrate is useful for migrating older jQuery code to jQuery 1.9+ it can be used for detecting and restoring 
APIs or features that have been deprecated in jQuery see the documentation at [JQuery-Migrate](https://github.com/jquery/jquery-migrate/)

Usage Benefits
--------------

As this is a *very simple* and one *purpose only* Lift Module you may wonder why you should use it, so here we go 

**Usage Benefits:** 
- Very Smooth up/down-grade (a one-liner change in your Boot.scala and module version bump in your build file). 
- The intention of this module is to closely follow the upstream releases.
- Compile from same source the module will automatically give you minified files in production.
 
If you have a update request you can either make a pull request or make a update request in a issue report. 

Update log
----------

For update history see the [History log](https://github.com/karma4u101/lift-jquery-module#history-log) section

**Latest Releases:**
- **2017-09-24** -- Module v2.10 artifact released for Lift 3.2 (Scala 2.11, 2.12)
- **2017-06-30** -- Module v2.10 artifact released for Lift 3.1 (Scala 2.11, 2.12)
- **2016-12-14** -- Module v2.10 artifact released for Lift 3.0.1 (Scala 2.12)
- **2016-06-31** -- Module v2.10 artifact released for Lift 2.6.2 (Scala 2.11,2.10,2.9.2,2.9.1-1,2.9.1), 3.0 (Scala 2.11)
- **2015-08-08** -- Module v2.9 artifact released for Lift 2.6.2 (Scala 2.11,2.10,2.9.2,2.9.1-1,2.9.1), 3.0-M6 (Scala 2.11)
- **2014-06-27** -- Module v2.8 artifact released for Lift 2.5, 2.6, 3.0-M1

Integration into your project 
-------------------------------

### Dependency settings
	
For versions >= 2.3

    "net.liftmodules" %% "moduleName_x1.y1 % "x2.y2[.z2][-SNAPSHOT/rcx/mx]"

or if you are using Maven

    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>moduleName_x1.y1_a.b.c</artifactId>
      <version>x2.y2[.z2][-SNAPSHOT/rcx/mx]</version>
    </dependency>

Where x1.y1 is Lift major and minor version numbers and a.b.c is Scala
version number and x2.y2.[z2] is the module's major x2, minor y2 and
eventual incremental numbers z2 followed by a eventual SNAPSHOT 
release candidate (rcX) or milestone (mX) version part.

For example:

    "net.liftmodules" %% "lift-jquery-module_2.5 % "2.3"
      :
    <dependency>
      <groupId>net.liftmodules</groupId>
      <artifactId>lift-jquery-module_2.5_2.9.2</artifactId>
      <version>2.3</version>
    </dependency>

The example will include a module built for lift 2.5. If you are using maven observe that the artifact id also needs the Scala version.

For older versions <= 2.3 put the following in your project build.sbt files lift libraryDependencies section 

    "net.liftmodules" %% "lift-jquery-module" % (liftVersion+"-[module version]") 

In bootstrap.liftweb.Boot
-------------------------  

Add

    import net.liftmodules.JQueryModule
    :
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery1111 
    JQueryModule.init()

or 

    import net.liftmodules.JQueryModule
    :
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery111Z 
    JQueryModule.init()

The first one will initiate jquery version 1.11.1 the second one JQuery111Z will initiate version 1.11.z where z=[0,1,2,....] that automatical will give you the latest bugfix (incremental number) updates in the same major, minor series i.e gerneraly specifying JQuery[major][minor]Z can be used to point to the latest included bugfix release of a selected serie.  


In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jquery.js" type="text/javascript"></script>

### History log
----------------

**Stable releas history:**
- **2014-05-26** -- Module v2.7 artifact released for Lift 2.5, 2.6
- **2014-03-02** -- Module v2.6 artifact released for Lift 2.5, 2.6, 3.0
- **2013-10-31** -- Module v2.5 artifact released for Lift 2.5, 2.6, 3.0
- **2013-04-27** -- Module v2.4 releas artifact released for Lift 2.5
- **2013-04-06** -- Module v2.3 stable artifact released for Lift 2.5 (new version schema)
- **2013-04-06** -- v2.3 stable artifact released for Lift 2.5-RC4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 
- **2013-01-22** -- v2.2 stable artifact released for Lift 2.5-RC1 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 
- **2013-01-11** -- v2.1 stable artifact released for Lift 2.5-M4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 )
- **2012-12-29** -- v2.0 stable artifact released for Lift 2.5-SNAPSHOT (Scala 2.9.2, 2.9.1-1, 2.9.1)
- **2012-11-10** -- v2.0 stable artifact released for Lift 2.5-M3 (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2012-09-11** -- v1.0 stable artifact released for Lift 2.5-M2 (Scala 2.9.1, 2.9.1-1, 2.9.1)


