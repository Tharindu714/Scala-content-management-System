enablePlugins(JavaWebPlugin)

name := "ScalaTutorial"

version := "0.1"

scalaVersion := "2.13.13"

libraryDependencies ++= Seq(
  // Hibernate Core (Using Jakarta Hibernate for compatibility with GlassFish 7)
  "org.hibernate" % "hibernate-core" % "5.4.30.Final",

  // MySQL Connector (JDBC Driver)
  "mysql" % "mysql-connector-java" % "8.0.23",

  // Jakarta EE API (GlassFish 7 uses Jakarta EE, not Java EE)
  "jakarta.platform" % "jakarta.jakartaee-api" % "9.1.0",

  // Logging
  "org.jboss.logging" % "jboss-logging" % "3.4.1.Final"
)

enablePlugins(SbtWeb)  // For sbt-web plugin

enablePlugins(WarPlugin) // For WAR packaging


mainClass in (Compile, run) := Some("com.scalatutorial.servlet.ContentServlet")
