import LiftModuleKeys.{liftVersion, liftEdition}

moduleName := "lift-jquery-module"
organization := "net.liftmodules"
version in ThisBuild := "2.11-SNAPSHOT"
liftVersion in ThisBuild := { liftVersion ?? "3.3.0" }.value
liftEdition in ThisBuild := { liftVersion apply { _.substring(0,3) } }.value
moduleName := { name.value + "_" + liftEdition.value }
scalaVersion  in ThisBuild := "2.12.6"
scalacOptions ++= Seq("-unchecked", "-deprecation")
crossScalaVersions := Seq("2.12.6", "2.11.11")

logLevel := Level.Info  

resolvers ++= Seq(
  "Scala Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Scala" at "https://oss.sonatype.org/content/groups/scala-tools/"
)

libraryDependencies in ThisBuild ++= {
  "net.liftweb" %% "lift-webkit"  % liftVersion.value % "provided" ::
    "net.liftweb" %% "lift-testkit" % liftVersion.value % "provided" ::
    Nil
}
//libraryDependencies <++= liftVersion { v =>
//    "net.liftweb" %% "lift-webkit"  % v % "provided" ::
//    "net.liftweb" %% "lift-testkit" % v % "provided" ::
//    Nil
//}

//libraryDependencies <++= (scalaVersion,liftVersion) { (sv,lv) =>
//  ((sv,lv) match {
//      case ("2.9.2",_) | ("2.9.1",_) | ("2.9.1-1",_) => "org.specs2" %% "specs2" % "1.12.3" % "test"
//      case ("2.10.4",_) => "org.specs2" %% "specs2" % "1.13" % "test"
//      case (_,"2.6.2") => "org.specs2" %% "specs2" % "2.3.11" % "test"
//      case (_,_) => "org.specs2" %% "specs2-core" % "3.8.6" % "test"
//      // case (_,_) => "org.specs2" %% "specs2" % "3.7" % "test"
// }) ::
//    ((sv,lv) match {
//      case ("2.10.4",_) | ("2.9.2",_) | ("2.9.1",_) | ("2.9.1-1",_) => "org.scalacheck" %% "scalacheck" % "1.10.0" % "test"
//      case (_,"2.6.2") => "org.scalacheck" %% "scalacheck" % "1.11.4" % "test"
//      case (_,_) => "org.specs2" %% "specs2-scalacheck" % "3.8.6" % "test"
//      }) ::
//  Nil
//}

libraryDependencies ++= { 
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "provided" ::
  "log4j" % "log4j" % "1.2.16" % "provided" ::
  Nil
}

libraryDependencies in ThisBuild ++= {
  ((scalaVersion.value, liftVersion.value) match {
    case ("2.10.4", _) | ("2.9.2", _) | ("2.9.1", _) | ("2.9.1-1", _) =>
      "org.specs2" %% "specs2" % "1.12.3" % "test"
    case ("2.11.7", "2.6.2") | ("2.11.7", "2.6.3") =>
      "org.specs2" %% "specs2" % "2.3.11" % "test"
    case (_, "3.0.0") => "org.specs2" %% "specs2"      % "3.7"   % "test"
    case (_, "3.0.1") | (_, "3.0.2") => "org.specs2" %% "specs2-core" % "3.8.6" % "test"
    case (_, _) =>
      "org.specs2" %% "specs2-core" % "3.8.6" % "test" //lift 3.1.x
  }) ::
    ((scalaVersion.value, liftVersion.value) match {
      case ("2.10.4", _) | ("2.9.2", _) | ("2.9.1", _) | ("2.9.1-1", _) =>
        "org.specs2" %% "specs2" % "1.12.3" % "test"
      case ("2.11.7", "2.6.2") | ("2.11.7", "2.6.3") =>
        "org.specs2" %% "specs2" % "2.3.11" % "test"
      case (_, "3.0.0") =>
        "org.specs2" %% "specs2" % "3.7" % "test" //no mather extras for 3.7
      case (_, "3.0.1") | (_, "3.0.2") =>
        "org.specs2" %% "specs2-matcher-extra" % "3.8.6" % "test"
      case (_, _) =>
        "org.specs2" %% "specs2-matcher-extra" % "3.8.6" % "test" //lift 3.1.x
    }) ::
    ((scalaVersion.value, liftVersion.value) match {
      case (_, "2.6.2") | (_, "2.6.3") =>
        "org.scalacheck" %% "scalacheck" % "1.10.1" % "test"
      case (_, "3.0.0") =>
        "org.specs2" %% "specs2-scalacheck" % "3.7" % "test"
      case (_, "3.0.1") | (_, "3.0.2") =>
        "org.specs2" %% "specs2-scalacheck" % "3.8.6" % "test"
      case (_, _) =>
        "org.specs2" %% "specs2-scalacheck" % "3.8.6" % "test" //lift 3.1.x
    }) ::
    Nil
}

//################################################################
//#### Publish to sonatype org
//## 
//##  
//## 
//################################################################
credentials += Credentials(Path.userHome / ".sbt" / "liftmodules" /".credentials" )

credentials += Credentials( file("/private/liftmodules/sonatype.credentials") )

publishTo in ThisBuild := {
  version { v: String =>
    val sonatype = "https://oss.sonatype.org/"
    if (v.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at sonatype + "content/repositories/snapshots")
    else
      Some("releases" at sonatype + "service/local/staging/deploy/maven2")
  }
}.value

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






