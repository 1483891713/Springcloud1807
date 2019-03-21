package com.feri.springcloud1807.consumer.controller;

import com.feri.springcloud1807.consumer.service.HelloProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/3/21 16:01
 */
@RestController
public class HelloApi {
    @Autowired
    private HelloProvider helloProvider;

    @GetMapping("helloribbon.do")
    public String hi(){
        return helloProvider.hello();
    }
}
