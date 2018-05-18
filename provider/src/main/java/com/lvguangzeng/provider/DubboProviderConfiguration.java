package com.lvguangzeng.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboProviderConfiguration {
    @Value("${zookeeper.dubbo.name:provider}")
    private String name;
    @Value("${zookeeper.dubbo.address:zookeeper://127.0.0.1:2181}")
    private String address;
    @Value("${zookeeper.dubbo.client:curator}")
    private String client;

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(name);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(address);
        registryConfig.setClient(client);
        return registryConfig;
    }
}
