import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum      = "1.9.6"
    val OrganizeImports = "0.6.0"
    val ScalaCheck      = "1.18.0"
    val ScalaCheckPlus  = "3.2.19.0"
    val ScalaTest       = "3.2.19"
  }

  val enumeratum: ModuleID      = "com.beachape"         %% "enumeratum"       % Versions.Enumeratum
  val organizeImports: ModuleID = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports
  val scalaCheck: ModuleID      = "org.scalacheck"       %% "scalacheck"       % Versions.ScalaCheck     % Test
  val scalaCheckPlus: ModuleID  = "org.scalatestplus"    %% "scalacheck-1-18"  % Versions.ScalaCheckPlus % Test
  val scalaTest: ModuleID       = "org.scalatest"        %% "scalatest"        % Versions.ScalaTest      % Test

}
