package com.feri.springcloud1807.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/3/21 10:23
 */
@RestController
public class HelloController {
    @GetMapping("helloprovider.do")
    public String hello(){
        System.out.println("我是提供者");
        return "下课了";
    }
}
