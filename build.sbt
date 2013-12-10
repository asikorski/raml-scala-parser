name := "raml-scala-parser"

version := "0.8"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Maven repository" at "http://morphia.googlecode.com/svn/mavenrepo/"

resolvers += "SnakeYAML repository" at "http://oss.sonatype.org/content/groups/public/"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11",
  "org.powermock" % "powermock-module-junit4" % "1.5.1",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "org.powermock" % "powermock-core" % "1.5.1",
  "org.powermock" % "powermock-api-mockito" % "1.5.1",
  "org.scalatest" % "scalatest_2.10" % "2.0",
  "org.yaml" % "snakeyaml" % "1.13",
  "net.codingwell" % "scala-guice_2.10" % "4.0.0-beta",
    "com.fasterxml.jackson.core" % "jackson-core" % "2.2.3",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.2.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.2.3",
  "com.google.inject" % "guice" % "4.0-beta",
  "commons-lang" % "commons-lang" % "2.2",
  "commons-beanutils" % "commons-beanutils" % "1.8.3",
  "commons-io" % "commons-io" % "2.4",
  "org.kitchen-eel" % "json-schema-validator" % "1.4.9",
  "org.fusesource.scalate" % "scalate-core_2.10" % "1.6.1"
)