package com.feri.springcloud1807.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *@Author feri
 *@Date Created in 2019/3/21 15:59
 */
@Service
public class HelloProvider {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(){
        //注意：此处使用提供者的名称代替ip:port

        return restTemplate.getForObject("http://lxprovider/helloprovider.do",String.class);
    }
}
