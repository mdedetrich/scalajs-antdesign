name := """scalajs-antdesign"""

version := "0.1.0-SNAPSHOT"

val scalaVersion212 = "2.12.1"
val scalaVersion211 = "2.11.8"

scalaVersion in ThisBuild := scalaVersion211

crossScalaVersions in ThisBuild := Seq(scalaVersion212, scalaVersion211)

organization := "org.mdedetrich"

libraryDependencies ++= Seq(
  "ru.pavkin"                         %%% "scala-js-momentjs" % "0.5.0",
  "com.github.japgolly.scalajs-react" %%% "core"              % "0.11.3"
)

jsDependencies ++= Seq(
  "org.webjars.npm" % "antd" % "2.7.2" / "dist/antd.js" commonJSName "antd"
)

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ =>
  false
}

pomExtra := <url>https://github.com/mdedetrich/scalajs-antdesign</url>
  <licenses>
    <license>
      <name>BSD 3-Clause</name>
      <url>https://opensource.org/licenses/BSD-3-Clause</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:mdedetrich/scalajs-antdesign.git</url>
    <connection>scm:git:git@github.com:mdedetrich/scalajs-antdesign.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mdedetrich</id>
      <name>Matthew de Detrich</name>
      <email>mdedetrich@gmail.com</email>
    </developer>
  </developers>

enablePlugins(ScalaJSPlugin)
