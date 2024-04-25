package com.example.apachekafkaproducer.controller;

import com.example.apachekafkaproducer.service.ApacheKafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApacheKafkaProducerController {
    @Autowired
    private ApacheKafkaProducerService apacheKafkaProducerService;

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(){
        long round = Math.round(Math.random() * 10000);
        apacheKafkaProducerService.sendMessage("Hello World, my id is : "+round);
        return new ResponseEntity<>("message sent successfully , with id : "+round, HttpStatus.OK);
    }
}
