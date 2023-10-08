package com.mackittipat.macbootcloudstream.producer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@Slf4j
@RestController
public class ProducerController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("producer")
    public String produce() {
        Integer num = new SecureRandom().nextInt(10000);
        streamBridge.send("numberProducer-out-0",  num);
        return "Sending " + num;
    }
}
