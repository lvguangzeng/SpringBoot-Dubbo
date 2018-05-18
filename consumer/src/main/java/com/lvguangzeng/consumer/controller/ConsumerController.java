package com.lvguangzeng.consumer.controller;

import com.lvguangzeng.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    @GetMapping("/send")
    public String sendMessage(String message){
        return consumerService.sendMessage(message);
    }
}
