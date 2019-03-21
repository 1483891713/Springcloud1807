package com.feri.springcloud1807.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 *@Author feri
 *@Date Created in 2019/3/21 16:12
 */
@SpringBootApplication
@EnableConfigServer  //标记配置的服务器
//@EnableHystrix
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
