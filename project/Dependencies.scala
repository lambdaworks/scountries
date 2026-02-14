import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum      = "1.9.5"
    val OrganizeImports = "0.6.0"
    val ScalaTest       = "3.2.19"
  }

  val enumeratum: ModuleID      = "com.beachape"         %% "enumeratum"       % Versions.Enumeratum
  val organizeImports: ModuleID = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports
  val scalaTest: ModuleID       = "org.scalatest"        %% "scalatest"        % Versions.ScalaTest % Test

}
