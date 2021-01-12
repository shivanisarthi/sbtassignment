name := "hello"
version := "1.0"
scalaVersion := "2.12.12"

lazy val http = project.in(file("http"))
  .settings(
   libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.2",
"com.typesafe.akka" %% "akka-stream" % "2.6.10","com.typesafe.akka" %% "akka-stream-testkit" % "2.6.10" % Test,
"com.typesafe.akka" %% "akka-testkit" % "2.6.10" % Test,"org.mockito" %% "mockito-scala" % "1.16.13","com.typesafe.akka" %% "akka-http-testkit" % "10.2.2" % Test
)
)

lazy val actor = project.in(file("actor"))
.settings(
   libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.6.10",
"com.typesafe.akka" %% "akka-persistence" % "2.6.10","com.typesafe.akka" %% "akka-testkit" % "2.6.10" % Test,"com.typesafe.akka" %% "akka-persistence-testkit" % "2.6.10" % Test
)
)
lazy val root = project.in(file("root")).dependsOn(http,actor)

lazy val app = project.in(file(".")).dependsOn(root)







