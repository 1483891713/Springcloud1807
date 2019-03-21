package com.feri.springcloud1807.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@Author feri
 *@Date Created in 2019/3/21 15:58
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced //负载均衡标记  开启
    public RestTemplate createRT(){
        return new RestTemplate();
    }
}
