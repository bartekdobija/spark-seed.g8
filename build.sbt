lazy val commonSettings = Seq(
  version := "0.1",
  organization := "com.github.bartekdobija",
  scalaVersion := "2.11.8",
  name := "spark-template"
)

lazy val sparkVersion = "2.2.0"

lazy val root = (project in file(".")).settings(
  commonSettings,
  mainClass in Compile := Some("com.github.bartekdobija.core.Main"),
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.0.4" % Test,

    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
  )

)