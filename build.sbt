ThisBuild / organization := "com.udavpit.fp.cats"
ThisBuild / version      := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-language:postfixOps"
)

lazy val root = (project in file("."))
  .settings(
    name := "fp-cats",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.6.1"
    )
  )
