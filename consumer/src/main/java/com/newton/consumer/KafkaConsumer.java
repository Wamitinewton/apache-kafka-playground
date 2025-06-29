package com.newton.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "new-group-now")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }

    @KafkaListener(topics = "test-topic", groupId = "new-group-now-1")
    public void listen2(String message) {
        System.out.println("Received Message: " + message);
    }

}
