import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

inThisBuild(
  List(
    scalaVersion       := "2.13.8",
    homepage           := Some(url("https://github.com/lambdaworks/scountries/")),
    licenses           := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    organization       := "io.lambdaworks",
    organizationName   := "LambdaWorks",
    startYear          := Some(2022)
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "scountries",
    crossScalaVersions := Seq("2.12.16", "2.13.8"),
    libraryDependencies ++= Seq(
      enumeratum
    )
  )
