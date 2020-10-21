lazy val root = project
  .in(file("."))
  .settings(
      name := "blinky",
      version := "0.1.0",

      scalaVersion := "2.13.3",

      libraryDependencies += "com.pi4j" % "pi4j-core" % "1.2"

  )
