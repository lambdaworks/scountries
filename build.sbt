import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

inThisBuild(
  List(
    scalaVersion               := "2.13.8",
    homepage                   := Some(url("https://github.com/lambdaworks/scountries/")),
    licenses                   := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    organization               := "io.lambdaworks",
    organizationName           := "LambdaWorks",
    startYear                  := Some(2022),
    semanticdbEnabled          := true,
    semanticdbVersion          := scalafixSemanticdb.revision,
    scalafixScalaBinaryVersion := CrossVersion.binaryScalaVersion(scalaVersion.value),
    scalafixDependencies ++= List(
      organizeImports
    )
  )
)

addCommandAlias("prepare", "fix; fmt")
addCommandAlias("check", "fixCheck; fmtCheck")
addCommandAlias("fix", "scalafixAll")
addCommandAlias("fixCheck", "scalafixAll --check")
addCommandAlias("fmt", "all scalafmtSbt scalafmtAll")
addCommandAlias("fmtCheck", "all scalafmtSbtCheck scalafmtCheckAll")

lazy val root = (project in file("."))
  .settings(
    name               := "scountries",
    crossScalaVersions := List("2.12.16", "2.13.8"),
    libraryDependencies ++= List(
      enumeratum,
      scalaTest
    ),
    scalacOptions ++= List(
      "-Ywarn-unused"
    )
  )
