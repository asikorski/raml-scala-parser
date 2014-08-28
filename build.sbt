logLevel in compile := Level.Warn

scalacOptions += "-deprecation"

lazy val main_raml = project.in(file("."))

name := "raml-scala-parser"

version := "0.8"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Maven repository" at "http://morphia.googlecode.com/svn/mavenrepo/"

resolvers += "SnakeYAML repository" at "http://oss.sonatype.org/content/groups/public/"

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11",
  "ch.qos.logback" % "logback-classic" % "1.1.1",
  "org.yaml" % "snakeyaml" % "1.13",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.2.3",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.2.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.2.3",
  "commons-lang" % "commons-lang" % "2.2",
  "commons-beanutils" % "commons-beanutils" % "1.8.3",
  "commons-io" % "commons-io" % "2.4",
  "org.kitchen-eel" % "json-schema-validator" % "1.4.9"
)
