package com.feri.springcloud1807.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Author feri
 *@Date Created in 2019/3/21 15:41
 */
@FeignClient(value = "lxprovider")
public interface HelloService {

    @GetMapping("helloprovider.do")
    String hello();
}
