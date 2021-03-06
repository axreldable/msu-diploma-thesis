package ru.star

import io.radicalbit.flink.pmml.scala.models.control.ServingMessage
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.connectors.kafka.{FlinkKafkaConsumer, FlinkKafkaProducer}
import org.slf4j.LoggerFactory
import ru.star.model.ServingMessageDeserializer
import ru.star.models.{InternalEvent, InternalEventDeserializer, InternalEventSerializer}

object PmmlJob extends App {
  private val logger = LoggerFactory.getLogger(PmmlJob.getClass)
  logger.info("pmml-job started.")

  val env = StreamExecutionEnvironment.getExecutionEnvironment

  val params = PmmlJobParams(args)
  println("params", params)

  val eventConsumer = new FlinkKafkaConsumer[InternalEvent](
    "ml-stream-pmml-event-in", new InternalEventDeserializer(), params.kafkaProperties
  )

  val modelConsumer = new FlinkKafkaConsumer[ServingMessage](
    "ml-stream-pmml-model-in", new ServingMessageDeserializer(), params.kafkaProperties
  )

  val eventProducer = new FlinkKafkaProducer[InternalEvent](
    "ml-stream-output-adapter-event-in", new InternalEventSerializer(), params.kafkaProperties
  )

  PmmlJobBuilder(
    env = env,
    eventSource = eventConsumer,
    modelSource = modelConsumer,
    eventSink = eventProducer
  ).build()

  env.execute("pmml-job")
}
