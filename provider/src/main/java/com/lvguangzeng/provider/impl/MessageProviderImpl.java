package com.lvguangzeng.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lvguangzeng.api.MessageProvider;
import com.lvguangzeng.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MessageProviderImpl implements MessageProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProviderImpl.class);

    @Override
    public void sendMessage(Message message) {
        LOGGER.info("message = {}", message.getMessage());
    }
}
