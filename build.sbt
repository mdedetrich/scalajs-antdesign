name := """scalajs-antdesign"""

version := "0.1.0-SNAPSHOT"

val scalaVersion212 = "2.12.1"
val scalaVersion211 = "2.11.8"

scalaVersion in ThisBuild := scalaVersion211

crossScalaVersions in ThisBuild := Seq(scalaVersion212, scalaVersion211)

organization := "org.mdedetrich"

libraryDependencies ++= Seq(
  "org.webjars.npm"                   % "antd"                % "2.6.4",
  "ru.pavkin"                         %%% "scala-js-momentjs" % "0.5.0",
  "com.github.japgolly.scalajs-react" %%% "core"              % "0.11.3"
)

enablePlugins(ScalaJSPlugin)
