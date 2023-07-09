ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "n-queens-combinatorial-puzzle-meets-cats",
    libraryDependencies += "org.creativescala"  %% "doodle" % "0.18.0",
    libraryDependencies += "org.typelevel"      %% "cats-core" % "2.9.0",
    libraryDependencies += "org.typelevel"      %% "cats-effect" % "3.4.8",
    libraryDependencies += ("org.scalaz"        %% "scalaz-core" % "7.3.3").cross(CrossVersion.for3Use2_13),
  )
