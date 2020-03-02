lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    organization := "com.futurice",
    name := "minimal-play2",
    version := "1.4.0",
    scalaVersion := "2.13.1",
    libraryDependencies += guice,
  )
