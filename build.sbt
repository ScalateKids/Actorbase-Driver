name := "Actorbase-CLI"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1",
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "org.scalaj" %% "scalaj-http" % "2.3.0",
  "com.netaporter" %% "pre-canned" % "0.0.8" % "test",
  "org.json4s" %% "json4s-native" % "3.3.0",
  "org.json4s" %% "json4s-jackson" % "3.3.0"
  )

initialCommands in console += """
import com.actorbase.driver.ActorbaseDriver
import com.actorbase.driver.client.api._
import com.actorbase.driver.data._
val admin = ActorbaseDriver("http://admin:Actorb4se@127.0.0.1:9999")
admin.addUser("a")
admin.addUser("b")
admin.addUser("c")
val a = ActorbaseDriver("http://a:Actorb4se@127.0.0.1:9999")
val b = ActorbaseDriver("http://b:Actorb4se@127.0.0.1:9999")
val c = ActorbaseDriver("http://c:Actorb4se@127.0.0.1:9999")
"""

assemblyJarName in assembly := "Actorbase-Client.jar"
mainClass in assembly := Some("com.actorbase.cli.views.CommandLoop")
test in assembly := {}
assemblyMergeStrategy in assembly := {
    case x if Assembly.isConfigFile(x) =>
      MergeStrategy.concat
    case PathList(ps @ _*) if Assembly.isReadme(ps.last) || Assembly.isLicenseFile(ps.last) =>
      MergeStrategy.rename
    case PathList("META-INF", xs @ _*) =>
      (xs map {_.toLowerCase}) match {
        case ("manifest.mf" :: Nil) | ("index.list" :: Nil) | ("dependencies" :: Nil) =>
          MergeStrategy.discard
        case ps @ (x :: xs) if ps.last.endsWith(".sf") || ps.last.endsWith(".dsa") =>
          MergeStrategy.discard
        case "plexus" :: xs =>
          MergeStrategy.discard
        case "services" :: xs =>
          MergeStrategy.filterDistinctLines
        case ("spring.schemas" :: Nil) | ("spring.handlers" :: Nil) =>
          MergeStrategy.filterDistinctLines
        case _ => MergeStrategy.first
      }
    case _ => MergeStrategy.first
}
