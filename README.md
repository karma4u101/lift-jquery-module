lift-jquery-module [![Build Status](https://secure.travis-ci.org/karma4u101/lift-jquery-module.png)](http://travis-ci.org/karma4u101/lift-jquery-module)
==================

A Lift JQuery Module currently supporting 

- JQuery v2.1.1  (availabilaty - module v2.7 and above) Does not support Internet Explorer 6, 7, or 8
- JQuery v1.11.1 (availabilaty - module v2.7 and above)
- JQuery v1.11.0 (availabilaty - module v2.6 and above) Depricated sins v2.7 will be removed in v2.9 use v1.11.1+
- JQuery v1.10.2 (availabilaty - module v2.5 and above)
- JQuery v1.9.1  (availabilaty - module v2.4 and above)  
- JQuery v1.8.2  (availabilaty - module v2.0 and above)
- JQuery v1.7.2  (availabilaty - module v2.0 and above)
- JQuery v1.7.1  (availabilaty - module v2.0 and above) Depricated sins v2.7 will be removed in v2.9 use v1.7.2+
- JQuery v1.6.4  (availabilaty - module v2.0 and above)

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

**Latest Stable Releases:**
- **2014-05-26** -- Module v2.7 artifact released for Lift 2.5, 2.6
- **2014-03-02** -- Module v2.6 artifact released for Lift 2.5, 2.6, 3.0
- **2013-10-31** -- Module v2.5 artifact released for Lift 2.5, 2.6, 3.0
- **2013-04-27** -- Module v2.4 releas artifact released for Lift 2.5
- **2013-04-06** -- Module v2.3 stable artifact released for Lift 2.5 (new version schema)

**Latest updates**
- **2014-06-21** -- Module v2.8-SNAPSHOT released for Lift v2.5, v2.6 and v3.0 adding jquery-migrate v1.2.1
- **2014-06-07** -- Module v2.7 Scala 2.11 artifact released for Lift v2.6 
- **2014-05-26** -- Module v2.7 artifact released for Lift 2.5, 2.6
- **2014-05-24** -- Module v2.7-M1 artifact released for Lift 3.0-M1
- **2014-05-09** -- Module v2.7-SNAPSHOT Introducing a new init parameter option with automatic incremental numbering see below.
- **2014-05-09** -- Module v2.7-SNAPSHOT Adding JQuery v1.11.1 and v2.1.1
- **2014-03-02** -- Module v2.6 released for Lift 2.5, 2.6, 3.0
- **2014-02-20** -- Module v2.6-SNAPSHOT Adding JQuery v1.11.0 
- **2013-10-31** -- Module v2.5 released for Lift 2.5, 2.6, 3.0 
- **2013-08-31** -- Module v2.5-SNAPSHOT Adding JQuery v1.10.2
- **2013-05-13** -- Module v2.4-SNAPSHOT for Lift 2.6
- **2013-04-27** -- Module v2.4 releas for Lift 2.5
- **2013-04-19** -- Module v2.4-SNAPSHOT Added JQuery v1.9.1

**Latest snapshot Release:**
- **2014-06-21** -- Module v2.8-SNAPSHOT released for Lift v2.5, v2.6 and v3.0
- **2014-06-07** -- Module v2.7 Scala 2.11 artifact released for Lift v2.6 
- **2014-05-24** -- Module v2.7-M1 artifact released for Lift 3.0-M1
- **2014-05-09** -- Module v2.7-SNAPSHOT published for Lift 2.5, 2.6, 3.0
- **2014-02-20** -- Module v2.6-SNAPSHOT published for Lift 2.5, 2.6, 3.0
- **2013-05-13** -- Module v2.5-SNAPSHOT published for Lift 2.6/3.0
- **2013-05-13** -- Module v2.4-SNAPSHOT published for Lift 2.6
- **2013-04-25** -- Module v2.4-SNAPSHOT published for Lift 2.5/3.0 (new version schema)
- **2013-04-06** -- Module v2.3-SNAPSHOT published for Lift 2.5-RC4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 

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

**Update history:**
- **2013-04-06** -- v2.3 build for Lift v2.5 (using Lift RC4). New version schema see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) section for more information
- **2013-04-06** -- v2.3 Stable build for Lift RC4. Classic version schema
- **2013-01-22** -- v2.2 Stable build for Lift RC1
- **2013-02-15** -- v2.2-SNAPSHOT build for Lift 3.0-SNAPSHOT / Scala 2.10
- **2013-01-11** -- v2.1 Stable build for Lift M4
- **2013-01-10** -- v2.1-SNAPSHOT Added Scala version 2.10 build 
- **2012-12-29** -- v2.0 Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-11** -- v2.0-SNAPSHOT Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-10** -- v2.0 artifact releas to oss.sonatype.org with JQuery <= v1.8.2 
- **2012-11-03** -- v2.0-SNAPSHOT - Added JQuery v1.8.2 

**Stable releas history:**
- **2013-04-06** -- v2.3 stable artifact released for Lift 2.5-RC4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 
- **2013-01-22** -- v2.2 stable artifact released for Lift 2.5-RC1 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 
- **2013-01-11** -- v2.1 stable artifact released for Lift 2.5-M4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 )
- **2012-12-29** -- v2.0 stable artifact released for Lift 2.5-SNAPSHOT (Scala 2.9.2, 2.9.1-1, 2.9.1)
- **2012-11-10** -- v2.0 stable artifact released for Lift 2.5-M3 (Scala 2.9.1, 2.9.1-1, 2.9.1)
- **2012-09-11** -- v1.0 stable artifact released for Lift 2.5-M2 (Scala 2.9.1, 2.9.1-1, 2.9.1)


**Snapshot Release history:**
- **2013-02-15** -- v2.2-SNAPSHOT published for Lift 3.0-SNAPSHOT / Scala 2.10
- **2013-01-10** -- v2.1-SNAPSHOT published for Lift 2.5-SNAPSHOT (Scala 2.10, 2.9.1, 2.9.1-1, 2.9.1)
- **2012-11-11** -- v2.0-SNAPSHOT published for Lift-2.5-M3 and Lift 2.5-SNAPSHOT
- **2012-11-03** -- v2.0-SNAPSHOT published for Lift 2.5-M2 (Scala 2.9.1, 2.9.1-1, 2.9.1)


