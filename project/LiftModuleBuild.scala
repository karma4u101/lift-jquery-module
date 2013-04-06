import sbt._
import sbt.Keys._

object LiftModuleBuild extends Build {
  
  val liftVersion = SettingKey[String]("liftVersion", "Version number of the Lift Web Framework")
  
  val liftVName = SettingKey[String]("liftVName", "Lift Web Framework short version number to append to artifact name")
  
  val project = Project("Lift-JQuery-Module", file("."))

}
