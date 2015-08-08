moduleName := "lift-jquery-module"

organization := "net.liftmodules"

version in ThisBuild := "2.9"

liftVersion in ThisBuild <<= liftVersion ?? "2.6.2"

liftEdition in ThisBuild <<= liftVersion apply { _.substring(0,3) }

moduleName <<= (name, liftEdition) { (n, e) =>  n + "_" + e }

scalaVersion  in ThisBuild := "2.10.4"

scalacOptions ++= Seq("-unchecked", "-deprecation")

crossScalaVersions := Seq("2.11.6", "2.10.4", "2.9.2", "2.9.1-1", "2.9.1")

logLevel := Level.Info  

resolvers ++= Seq(
  "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"
)

libraryDependencies <++= liftVersion { v =>
    "net.liftweb" %% "lift-webkit"  % v % "provided" ::
    "net.liftweb" %% "lift-testkit" % v % "provided" ::
    Nil
}

libraryDependencies <++= scalaVersion { sv => 
  (sv match {
      case "2.9.2" | "2.9.1" | "2.9.1-1" => "org.specs2" %% "specs2" % "1.12.3" % "test"
      case "2.10.4" => "org.specs2" %% "specs2" % "1.13" % "test"
      case _ => "org.specs2" %% "specs2" % "2.3.11" % "test"
 }) ::
    (sv match {
      case "2.10.4" | "2.9.2" | "2.9.1" | "2.9.1-1" => "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
      case _ => "org.scalacheck" %% "scalacheck" % "1.11.4" % "test"
      }) ::
  Nil
}

libraryDependencies ++= { 
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "provided" ::
  "log4j" % "log4j" % "1.2.16" % "provided" ::
  Nil
}

//################################################################
//#### THE YUI COMPRESSION BUILD
//##  2014-05-09 Turning of yui compression and switching to use 
//##  provided compressed files as this plugin has not been updated
//##  for use with sbt 0.13 
//################################################################
//seq(yuiSettings: _*)

//excludeFilter in (Compile, YuiCompressorKeys.jsResources) := "*-debug.js" | "*-min.js" 

//excludeFilter in (Compile, YuiCompressorKeys.cssResources) := "*-debug.css" | "*-min.css"

//YuiCompressorKeys.minSuffix := "-min"

//################################################################
//#### Publish to sonatype org
//## 
//##  
//## 
//################################################################
credentials += Credentials(Path.userHome / ".sbt" / "liftmodules" /".credentials" )

credentials += Credentials( file("/private/liftmodules/sonatype.credentials") )

//pgpPublicRing := file(Path.userHome / ".gnupg" / "mykey.asc")

publishTo <<= version { v: String =>
   val sonatype = "https://oss.sonatype.org/"
   if (v.trim.endsWith("SNAPSHOT"))
	 Some("snapshots" at sonatype + "content/repositories/snapshots")
   else
     Some("releases" at sonatype + "service/local/staging/deploy/maven2")
   }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/karma4u101/lift-jquery-module</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://maven.apache.org/ref/2.1.0/maven-profile/license.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:karma4u101/lift-jquery-module.git</url>
    <connection>scm:git:git@github.com:karma4u101/lift-jquery-module.git</connection>
  </scm>
  <developers>
    <developer>
      <id>karma4u101</id>
      <name>Peter Petersson</name>
      <url>http://www.media4u101.se</url>
    </developer>
  </developers>
)






