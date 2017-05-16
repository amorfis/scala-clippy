resolvers += Resolver.typesafeRepo("releases")

// Workaround for the bug: https://github.com/sbt/sbt-assembly/issues/236
resolvers += "JBoss" at "https://repository.jboss.org"

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.4.0")

addSbtPlugin("com.updateimpact" % "updateimpact-sbt-plugin" % "2.1.1")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.4.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.1")

addSbtPlugin("com.heroku" % "sbt-heroku" % "0.5.4")

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.6.8")

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6")

// web plugins

addSbtPlugin("com.typesafe.sbt" % "sbt-less"   % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-mocha"  % "1.1.0")

// scalajs

addSbtPlugin("com.vmunier"  % "sbt-web-scalajs" % "1.0.3")
addSbtPlugin("org.scala-js" % "sbt-scalajs"     % "0.6.15")
