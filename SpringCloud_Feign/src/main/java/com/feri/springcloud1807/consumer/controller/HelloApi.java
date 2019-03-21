package com.feri.springcloud1807.consumer.controller;

import com.feri.springcloud1807.consumer.service.HelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/3/21 15:43
 */
@RestController
public class HelloApi {
    @Autowired
    private HelloService helloService;

    @GetMapping("hello.do")
    public String hello(){
        return helloService.hello();
    }
}
