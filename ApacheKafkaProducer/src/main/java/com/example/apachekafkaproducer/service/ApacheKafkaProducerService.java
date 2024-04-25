package com.example.apachekafkaproducer.service;

import com.example.apachekafkaproducer.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApacheKafkaProducerService {
    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

    public boolean sendMessage(String message){
        this.kafkaTemplate.send(Constants.TOPIC_NAME, message);
        return true;
    }
}
