val dottyVersion = "0.24.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-art",
    version := "0.1.0",

    scalaVersion := dottyVersion,
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint"),

    initialize := {
      val _ = initialize.value
      val javaVersion = sys.props("java.specification.version")
      if (javaVersion != "1.8")
        sys.error("Java 1.8 is required for this project. Found " + javaVersion + " instead")
    }
  )
