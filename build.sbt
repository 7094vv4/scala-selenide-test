import Dependencies._

ThisBuild / scalaVersion := "2.13.12"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / scalafixDependencies += "com.github.liancheng" %% "organize-imports" % "0.6.0"

val sutUrl = "https://hotel.testplanisphere.dev"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaSelenideTest",
    libraryDependencies += munit % Test,
    libraryDependencies += selenide % Test,
    scalacOptions += "-Wunused",
    javaOptions += s"-Dselenide.baseUrl=$sutUrl"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
