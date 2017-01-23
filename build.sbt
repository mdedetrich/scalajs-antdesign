name := """scalajs-antdesign"""

version := "0.1.0-SNAPSHOT"

val scalaVersion212 = "2.12.1"
val scalaVersion211 = "2.11.8"

scalaVersion in ThisBuild := scalaVersion211

crossScalaVersions in ThisBuild := Seq(scalaVersion212, scalaVersion211)

isScalaJSProject := true

organization := "org.mdedetrich"

libraryDependencies ++= Seq(
  "org.webjars.npm"                   % "antd"                % "2.6.3",
  "ru.pavkin"                         %%% "scala-js-momentjs" % "0.4.1",
  "com.github.japgolly.scalajs-react" %%% "core"              % "0.11.3"
)
