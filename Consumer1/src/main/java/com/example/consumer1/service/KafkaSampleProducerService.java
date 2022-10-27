package com.example.consumer1.service;

import com.example.consumer1.model.MessageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaSampleProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

/*    public void sendMessage(String message) {
        log.debug("Send message: {}", message);
        this.kafkaTemplate.send("hello", message);
    }*/

    public void sendJsonMessage(MessageDTO messageDTO) {
        log.debug("Send message(Object): {}", messageDTO.toString());
        this.kafkaTemplate.send("hello", messageDTO);
    }
}
