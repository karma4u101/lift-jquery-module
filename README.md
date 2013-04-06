lift-jquery-module
==================

A Lift JQuery Module currently supporting 

- JQuery v1.8.2
- JQuery v1.7.2
- JQuery v1.7.1
- JQuery v1.6.4


Update log
----------

For update history see the [History log](https://github.com/karma4u101/lift-jquery-module#history-log) section

**Latest updates**

- **2013-04-06** -- v2.3 build for Lift v2.5 (using Lift RC4). New version schema see [Dependency settings](https://github.com/karma4u101/FoBo/blob/master/README.md#dependency-settings) section for more information
- **2013-04-06** -- v2.3 Stable build for Lift RC4. Classic version schema

**Latest Stable Releases:**
- **2013-04-06** -- v2.3 stable artifact released for Lift 2.5 (new version schema)
- **2013-04-06** -- v2.3 stable artifact released for Lift 2.5-RC4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 

**Latest snapshot Release:**
- **2013-04-06** -- v2.3-SNAPSHOT published for Lift 2.5-RC4 (Scala 2.10.0, 2.9.2, 2.9.1-1, 2.9.1 ) 

As this is a *very simple* and one *purpose only* Lift Module you may wonder why you should use it, so here we go 

**Usage Benefits:** 
- Very Smooth up/down-grade (a one-liner change in your Boot.scala and module version bump in your build file). 
- The intention of this module is to closely follow the upstream releases.
- Compile from same source the module will automatically give you minified files in production.
 
If you have a update request you can either make a pull request or make a update request in a issue report. 

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
    JQueryModule.InitParam.JQuery=JQueryModule.JQuery172
    JQueryModule.init()


In Lift template
----------------

Add 

    <script id="jquery" src="/classpath/jquery.js" type="text/javascript"></script>

Usage example
-------------

For a usage example take a look att my [Templating-With-Twitter-Bootstrap](https://github.com/karma4u101/Templating-With-Twitter-Bootstrap)

### History log
----------------

**Module Version history:**
- **2013-01-22** -- v2.2 Stable build for Lift RC1
- **2013-02-15** -- v2.2-SNAPSHOT build for Lift 3.0-SNAPSHOT / Scala 2.10
- **2013-01-11** -- v2.1 Stable build for Lift M4
- **2013-01-10** -- v2.1-SNAPSHOT Added Scala version 2.10 build 
- **2012-12-29** -- v2.0 Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-11** -- v2.0-SNAPSHOT Lift 2.5-SNAPSHOT artifacts (for the inpatient) published to oss.sonatype.org
- **2012-11-10** -- v2.0 artifact releas to oss.sonatype.org with JQuery <= v1.8.2 
- **2012-11-03** -- v2.0-SNAPSHOT - Added JQuery v1.8.2 


**Updates history:**
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


