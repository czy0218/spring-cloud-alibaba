package com.czy.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by czy0218 on 2019/1/13.
 */
@RestController
public class EchoProviderController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private ConfigurableApplicationContext configurableApplicationContext;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message + " i am from port " + port;
    }

    @GetMapping(value = "/hi")
    public String hi() {
        String property = configurableApplicationContext.getEnvironment().getProperty("user.name");
        return property;
    }
}
