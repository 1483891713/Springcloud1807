package com.feri.springcloud1807.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@Author feri
 *@Date Created in 2019/3/21 09:53
 */
@SpringBootApplication
@EnableEurekaServer  //标记这是一个Eureka的服务器
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
