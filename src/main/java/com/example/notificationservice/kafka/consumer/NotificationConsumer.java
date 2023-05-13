package com.example.notificationservice.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "visitor", groupId = "notification")
    public void listenNotification(String message) {
        System.out.println("Received Message in visitor notification: " + message);
    }
}
