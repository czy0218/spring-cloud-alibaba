package com.czy.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.czy.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czy0218 on 2019/1/13.
 */
@RestController
public class NacosConsumerFeignController {
    @Autowired
    private EchoProviderService echoProviderService;

    @GetMapping(value = "/echo/hi")
    public String echo() {
        return echoProviderService.echo("Hi Feign");
    }
}
