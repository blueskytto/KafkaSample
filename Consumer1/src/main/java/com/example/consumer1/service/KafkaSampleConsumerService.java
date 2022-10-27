package com.example.consumer1.service;

import com.example.consumer1.model.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaSampleConsumerService {

    @KafkaListener(topics = "hello2", groupId = "group-id-hello")
    public void consume(@Payload MessageDTO messageDTO) {
      log.debug("receive message: {}", messageDTO);
    }
}
