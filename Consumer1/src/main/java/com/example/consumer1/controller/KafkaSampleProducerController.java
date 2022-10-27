package com.example.consumer1.controller;

import com.example.consumer1.model.MessageDTO;
import com.example.consumer1.service.KafkaSampleProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaSampleProducerController {

    private final KafkaSampleProducerService kafkaSampleProducerService;

    /*@PostMapping(value = "/sendMessage")
    public void sendMessage(String message) {
        kafkaSampleProducerService.sendMessage(message);
    }*/

    @PostMapping(value = "/sendJsonMessage")
    public void sendMessage(@RequestBody @Valid MessageDTO messageDTO) {
        kafkaSampleProducerService.sendJsonMessage(messageDTO);
    }

}
