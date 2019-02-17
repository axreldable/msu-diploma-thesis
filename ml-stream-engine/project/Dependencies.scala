import sbt._

object Dependencies {
  lazy val flinkVersion = "1.7.1"

  lazy val flinkCore = "org.apache.flink" % "flink-core" % flinkVersion
  lazy val flinkStreaming = "org.apache.flink" %% "flink-streaming-scala" % flinkVersion
  lazy val flinkConnectorKafka = "org.apache.flink" %% "flink-connector-kafka" % flinkVersion
}