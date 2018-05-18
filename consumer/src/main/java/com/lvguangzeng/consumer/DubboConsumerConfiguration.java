package com.lvguangzeng.consumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConsumerConfiguration {
    private static final Logger LOGGER = LoggerFactory.getLogger(DubboConsumerConfiguration.class);
    @Value("${zookeeper.dubbo.name:consumer}")
    private String name;
    @Value("${zookeeper.dubbo.address:zookeeper://127.0.0.1:2181}")
    private String address;
    @Value("${zookeeper.dubbo.client:curator}")
    private String client;
    @Value("${zookeeper.dubbo.timeout:3000}")
    private int timeout;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(name);
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(timeout);
        return consumerConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(address);
        registryConfig.setClient(client);
        return registryConfig;
    }
}
