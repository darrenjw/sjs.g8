name := "$name$"

enablePlugins(ScalaJSPlugin)

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

libraryDependencies ++= Seq(
  "org.scalameta" %%% "munit" % "1.0.0" % Test,
  "org.scala-js" %%% "scalajs-dom" % "2.2.0",
  "org.typelevel" %%% "cats-core" % "2.12.0",
  "org.typelevel" %%% "spire" % "0.18.0",
  "dev.optics" %%% "monocle-core"  % "3.2.0",
  "dev.optics" %%% "monocle-macro"  % "3.2.0"
)

scalaVersion := "3.3.3"


