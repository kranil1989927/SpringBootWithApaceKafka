# SpringBootWithApaceKafka

Integrate Spring Boot and Apache Kafka instance.

First download the kafka Scala 2.13  - kafka_2.13-2.7.0.tgz (asc, sha512) from https://kafka.apache.org/downloads. Unzip the kafa binary to any folder.
Open the cmd from C:\kafka_2.13-2.7.0 and execute the below commands in individual cmand priompts.

1.Start Apache Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

2.Start Apache Kafka
.\bin\windows\kafka-server-start.bat .\config\server.properties

3. Start Spring Boot Appliction - It will create a topiv named myfirst-topic and start the kafka producer.

4. Start the Consumer that reads message from topic named myfirst-topic
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic myfirst_topic --from-beginning
  
Send the request to produce the message http://localhost:8080//kafkamessage/producer?message=testing in browser. Consumer would read the message and display whatever we pass in message request param.
