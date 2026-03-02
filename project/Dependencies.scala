import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum         = "1.9.5"
    val OrganizeImports    = "0.6.0"
    val ScalaCheck         = "1.18.1"
    val ScalaTest          = "3.2.19"
    val ScalaTestPlusCheck = "3.2.19.0"
  }

  val enumeratum: ModuleID         = "com.beachape"         %% "enumeratum"       % Versions.Enumeratum
  val organizeImports: ModuleID    = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports
  val scalaCheck: ModuleID         = "org.scalacheck"       %% "scalacheck"       % Versions.ScalaCheck         % Test
  val scalaTestPlusCheck: ModuleID = "org.scalatestplus"    %% "scalacheck-1-18"  % Versions.ScalaTestPlusCheck % Test
  val scalaTest: ModuleID          = "org.scalatest"        %% "scalatest"        % Versions.ScalaTest          % Test

}
