# Apache Kafka Producer and Consumer

This project contains two Spring Boot applications: an Apache Kafka Producer and an Apache Kafka Consumer.

## Prerequisites

- Java 8 or higher
- Maven
- Apache Kafka

## Getting Started

1. Start your Kafka server.
2. Update the `application.properties` file in both applications with your Kafka server details.

## Running the Applications

You can run the applications using the following command:

```bash
mvn spring-boot:run
```
## Application Properties
- The application.properties file in both applications contains the following properties:  

- spring.application.name: The name of the Spring Boot application.

- server.port: The port on which the Spring Boot application runs.
spring.kafka.consumer.bootstrap-servers: The address of your Kafka server.

- spring.kafka.consumer.group-id: The group ID for the Kafka consumer.

- spring.kafka.consumer.auto-offset-reset: The offset reset policy for the Kafka consumer.

- spring.kafka.consumer.key-deserializer: The deserializer for the key that the Kafka consumer will use.

- spring.kafka.consumer.value-deserializer: The deserializer for the value that the Kafka consumer will use.

## Apache Kafka Producer
The producer application sends messages to a Kafka topic. It exposes a REST endpoint at /send which sends a message to the Kafka topic when accessed.  
![App Screenshot](https://github.com/Sarthakverse/Kafka-Demo/assets/117356021/2f171a8a-7a24-4e06-bedb-e1238e8132ba)


## Apache Kafka Consumer
The consumer application listens for messages on a Kafka topic. It prints out any messages it receives to the console.
![App Screenshot](https://github.com/Sarthakverse/Kafka-Demo/assets/117356021/3835f18f-92b1-4167-8d66-57eb1477a18d)




## Built With
- Java
- Spring Boot
- Apache Kafka

![App Screenshot](https://github.com/Sarthakverse/Kafka-Demo/assets/117356021/53532b4c-c9d4-47cf-bff0-4fb7dbfe41ab)

