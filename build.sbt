name := "Lift-JQuery-Module"

organization := "net.liftmodules"

liftVersion <<= liftVersion ?? "2.5-SNAPSHOT"

version <<= liftVersion apply { _ + "-2.0" }

scalaVersion  := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation")

crossScalaVersions := Seq("2.9.2", "2.9.1-1", "2.9.1")

logLevel := Level.Info  

resolvers ++= Seq(
  "CB Central Mirror" at "http://repo.cloudbees.com/content/groups/public",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
)

libraryDependencies <++= liftVersion { v =>
    "net.liftweb" %% "lift-webkit"  % v % "compile" ::
    "net.liftweb" %% "lift-testkit" % v % "compile" ::
    Nil
}

//################################################################
//#### THE YUI COMPRESSION BUILD
//## 
//##  
//## 
//################################################################
seq(yuiSettings: _*)

excludeFilter in (Compile, YuiCompressorKeys.jsResources) := "*-debug.js" | "*-min.js" 

excludeFilter in (Compile, YuiCompressorKeys.cssResources) := "*-debug.css" | "*-min.css"

YuiCompressorKeys.minSuffix := "-min"

//################################################################
//#### Publish to sonatype org
//## 
//##  
//## 
//################################################################
credentials += Credentials(Path.userHome / ".sbt" / "liftmodules" /".credentials" )
//credentials += Credentials( file("/private/liftmodules/sonatype.credentials") )

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






