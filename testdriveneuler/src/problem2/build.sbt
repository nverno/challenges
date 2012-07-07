name := "euler"

version := "1.0"

scalaVersion := "2.9.2"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.7.2" % "test"

libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1"

javacOptions ++= Seq("-Xlint:all", "-deprecation")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-optimise", "-explaintypes")


