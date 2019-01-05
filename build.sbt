import com.typesafe.sbt.SbtStartScript

name := "CSC447 Assignments"

version := "1.0"

scalaVersion := "2.11.2"

scalacOptions ++= 
  Seq("-deprecation",
      "-feature",
      "-target:jvm-1.7",
      "-unchecked")

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.1"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test",
  "org.pegdown"    %  "pegdown"    % "1.4.2"  % "test"
)

seq(SbtStartScript.startScriptForClassesSettings: _*)
