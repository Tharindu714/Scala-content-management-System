// Add the WAR plugin for sbt-web
addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.4")

// You can also add the Jetty plugin if needed for running the server
addSbtPlugin("org.scala-sbt" % "sbt-jetty" % "1.0.0")

// Add Java Web Plugin (alternative to sbt-web for a more complete solution)
addSbtPlugin("com.earldouglas" % "sbt-assembly" % "0.14.10")
