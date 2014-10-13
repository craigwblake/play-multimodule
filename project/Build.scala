import sbt._
import Keys._
import play.Play._
import com.typesafe.sbt.packager.universal.UniversalKeys
import net.virtualvoid.sbt.graph.Plugin.graphSettings

object ApplicationBuild extends Build with UniversalKeys {

	override def rootProject = Some(webapp)

	lazy val buildSettings = Defaults.defaultSettings ++ graphSettings

    lazy val model = Project(id = "model", base = file("model"))

    lazy val webapp = Project(id = "webapp", base = file("webapp")) enablePlugins (play.PlayScala) aggregate (model) dependsOn (model)
}
