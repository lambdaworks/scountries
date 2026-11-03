import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum         = "1.9.8"
    val OrganizeImports    = "0.6.0"
    val ScalaCheck         = "1.20.0"
    val ScalaTest          = "3.2.20"
    val ScalaTestPlusCheck = "3.2.20.0"
  }

  // sbt 2's `%%` is platform-aware: it resolves the JVM, Scala.js or Scala Native artifact
  // based on the project's `platform` setting, so `%%%` is no longer needed.
  val enumeratum: ModuleID         = "com.beachape"         %% "enumeratum"       % Versions.Enumeratum
  val organizeImports: ModuleID    = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports
  val scalaCheck: ModuleID         = "org.scalacheck"       %% "scalacheck"       % Versions.ScalaCheck         % Test
  val scalaTest: ModuleID          = "org.scalatest"        %% "scalatest"        % Versions.ScalaTest          % Test
  val scalaTestPlusCheck: ModuleID = "org.scalatestplus"    %% "scalacheck-1-19"  % Versions.ScalaTestPlusCheck % Test

}
