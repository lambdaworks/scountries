import Dependencies._

Global / onChangedBuildSource := ReloadOnSourceChanges

val Scala212: String = "2.12.21"
val Scala213: String = "2.13.18"
val Scala3: String   = "3.10.1"

inThisBuild(
  List(
    scalaVersion         := Scala213,
    homepage             := Some(uri("https://github.com/lambdaworks/scountries/")),
    licenses             := List("Apache-2.0" -> uri("https://www.apache.org/licenses/LICENSE-2.0")),
    organization         := "io.lambdaworks",
    organizationName     := "LambdaWorks",
    organizationHomepage := Some(uri("https://www.lambdaworks.io/")),
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
        uri("https://github.com/lambdaworks")
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
  .aggregate(scountries.jvm, scountries.js, scountries.native)
  .settings(
    name                                 := "scountries-root",
    publish / skip                       := true,
    crossScalaVersions                   := Nil,
    Compile / unmanagedSourceDirectories := Nil,
    Test / unmanagedSourceDirectories    := Nil
  )

lazy val scountries = crossProject(JVMPlatform, JSPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("."))
  .settings(
    name               := "scountries",
    crossScalaVersions := List(Scala212, Scala213, Scala3),
    libraryDependencies ++= List(
      enumeratum,
      scalaCheck,
      scalaTest,
      scalaTestPlusCheck
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
  .nativeSettings(
    // ScalaTest and ScalaCheck are built against older Scala Native 0.5.x test-interface releases. These are
    // binary compatible within 0.5.x, but the module declares a strict version scheme, which sbt 2 enforces.
    // The full artifact name is needed because eviction checks do not apply the platform suffix to `%%` here.
    libraryDependencySchemes +=
      "org.scala-native" % s"test-interface_${platform.value}_${scalaBinaryVersion.value}" % VersionScheme.EarlySemVer
  )
