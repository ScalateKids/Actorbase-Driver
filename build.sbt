name := "actorbase-driver"

version := "1.0"

organization := "com.actorbase"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1",
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "com.netaporter" %% "pre-canned" % "0.0.8" % "test",
  "org.json4s" %% "json4s-native" % "3.3.0",
  "org.json4s" %% "json4s-jackson" % "3.3.0"
  )

publishMavenStyle := true
