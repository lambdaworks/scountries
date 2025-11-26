import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

val Scala212: String = "2.12.20"
val Scala213: String = "2.13.18"
val Scala3: String   = "3.7.4"

inThisBuild(
  List(
    scalaVersion         := Scala213,
    homepage             := Some(url("https://github.com/lambdaworks/scountries/")),
    licenses             := List("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0")),
    organization         := "io.lambdaworks",
    organizationName     := "LambdaWorks",
    organizationHomepage := Some(url("https://www.lambdaworks.io/")),
    description          := "Scala library that provides an enumeration of ISO 3166 codes for countries, along with their subdivisions.",
    startYear            := Some(2022),
    semanticdbEnabled    := scalaVersion.value != Scala3, // enable SemanticDB
    semanticdbVersion    := scalafixSemanticdb.revision,
    scalafixDependencies ++= List(
      organizeImports
    ),
    developers := List(
      Developer(
        "lambdaworks",
        "LambdaWorks' Team",
        "admin@lambdaworks.io",
        url("https://github.com/lambdaworks")
      )
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
    crossScalaVersions := List(Scala212, Scala213, Scala3),
    libraryDependencies ++= List(
      enumeratum,
      scalaTest
    ),
    scalacOptions ++= {
      if (scalaVersion.value.startsWith("3")) {
        List(
          "-Werror",
          "-Wunused:all",
          "-Wvalue-discard",
          "-deprecation",
          "-feature",
          "-unchecked"
        )
      } else {
        List(
          "-Xfatal-warnings",
          "-Ywarn-unused",
          "-Ywarn-dead-code",
          "-Ywarn-value-discard",
          "-deprecation",
          "-feature",
          "-unchecked"
        )
      }
    }
  )
