package com.lvguangzeng.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lvguangzeng.api.MessageProvider;
import com.lvguangzeng.entity.Message;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Reference
    private MessageProvider messageProvider;

    public String sendMessage(String message){
        messageProvider.sendMessage(new Message(message));
        return message;
    }
}
