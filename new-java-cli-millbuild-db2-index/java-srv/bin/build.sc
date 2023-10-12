import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.slf4j:slf4j-log4j12:1.7.5",
ivy"org.slf4j:slf4j-api:1.7.5",
ivy"log4j:log4j:1.2.17",
ivy"com.ibm.db2:jcc:11.1.4.4"
    // Dependices
  )
}
