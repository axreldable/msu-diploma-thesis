
### ml-stream-engine

Streaming engine to serve machine learning models.

#### Technologies

- [Apache Kafka](https://kafka.apache.org)
- [Apache Flink](https://flink.apache.org)
- [Apache Spark](https://spark.apache.org)
- Monitoring: [Prometheus](https://prometheus.io), [Grafana](https://grafana.com)

#### How to install
Requirements:
```
curl
git
docker
flink
```

#### How to run
```
./scripts/start.sh
```

#### How to stop
```
./scripts/stop.sh
```

#### How to monitor
Connect to Kafka on the localhost:9092 and use something like [Conductor](https://www.conduktor.io) to monitor messages.  
[Grafana UI](http://localhost:3000) with Kafka metrics  
[Prometheus UI](http://localhost:9090) with Kafka metrics  
[Flink cluster UI](http://localhost:8081)  

#### Architecture
![Architecture](https://github.com/axreldable/msu-diploma-thesis/blob/master/images/msu-ml-streaming-system.png)
