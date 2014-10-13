organization in ThisBuild := "testing"

scalaVersion in ThisBuild := "2.11.1"

resolvers in ThisBuild += Resolver.sonatypeRepo("scala-tools")

resolvers in ThisBuild += Resolver.sonatypeRepo("public")

resolvers in ThisBuild += Resolver.sonatypeRepo("releases")

resolvers in ThisBuild += Resolver.sonatypeRepo("snapshots")

resolvers in ThisBuild += "Typesafe" at "http://repo.typesafe.com/typesafe/releases"
