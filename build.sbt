val dottyVersion = "0.24.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-art",
    version := "0.1.0",

    scalaVersion := dottyVersion,

  )
