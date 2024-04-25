package com.example.apachekafkaconsumer.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ApacheKafkaConsumerConfiguration {
    @KafkaListener(topics = "myFirstTopic", groupId = "kafkaPractice")
    public void messageListen(String message){
        System.out.println("Message received: " + message);
    }
}
