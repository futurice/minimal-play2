lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    organization := "com.futurice",
    name := "minimal-play2",
    version := "1.3.0",
    scalaVersion := "2.12.3",
    libraryDependencies += guice,
  )
