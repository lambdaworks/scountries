import sbt._

object Dependencies {

  private object Versions {
    val Enumeratum      = "1.7.0"
    val OrganizeImports = "0.6.0"
  }

  val enumeratum: ModuleID      = "com.beachape"         %% "enumeratum"       % Versions.Enumeratum
  val organizeImports: ModuleID = "com.github.liancheng" %% "organize-imports" % Versions.OrganizeImports

}
