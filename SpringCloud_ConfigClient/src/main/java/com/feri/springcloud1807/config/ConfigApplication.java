package com.feri.springcloud1807.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@Author feri
 *@Date Created in 2019/3/21 16:22
 */
@SpringBootApplication
public class ConfigApplication {
    @Value("${db.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
