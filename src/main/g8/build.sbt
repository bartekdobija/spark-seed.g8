lazy val commonSettings = Seq(
  version := "0.1",
  organization := "$organization$",
  scalaVersion := "2.11.8",
  name := "$name$"
)

lazy val sparkVersion = "2.2.+"

lazy val sparkapp = (project in file(".")).settings(
  commonSettings,
  mainClass in Compile := Some("$organization$.core.Main"),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.4" % Test,

    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
  )

)
