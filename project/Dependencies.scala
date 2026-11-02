import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum      = "1.9.8"
    val OrganizeImports = "0.6.0"
    val ScalaTest       = "3.2.20"
  }

  val enumeratum: Def.Initialize[ModuleID] = Def.setting("com.beachape" %%% "enumeratum" % Versions.Enumeratum)
  val scalaTest: Def.Initialize[ModuleID]  = Def.setting("org.scalatest" %%% "scalatest" % Versions.ScalaTest % Test)

  val organizeImports: ModuleID = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports

}
