import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum         = "1.9.8"
    val OrganizeImports    = "0.6.0"
    val ScalaCheck         = "1.19.0"
    val ScalaTest          = "3.2.20"
    val ScalaTestPlusCheck = "3.2.20.0"
  }

  val enumeratum: Def.Initialize[ModuleID] = Def.setting("com.beachape" %%% "enumeratum" % Versions.Enumeratum)
  val scalaCheck: Def.Initialize[ModuleID] =
    Def.setting("org.scalacheck" %%% "scalacheck" % Versions.ScalaCheck % Test)
  val scalaTest: Def.Initialize[ModuleID]          = Def.setting("org.scalatest" %%% "scalatest" % Versions.ScalaTest % Test)
  val scalaTestPlusCheck: Def.Initialize[ModuleID] =
    Def.setting("org.scalatestplus" %%% "scalacheck-1-19" % Versions.ScalaTestPlusCheck % Test)

  val organizeImports: ModuleID = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports

}
