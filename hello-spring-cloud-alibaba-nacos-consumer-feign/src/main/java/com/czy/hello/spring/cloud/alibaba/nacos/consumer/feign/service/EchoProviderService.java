package com.czy.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by czy0218 on 2019/1/13.
 */
@FeignClient(value = "nacos-provider")
public interface EchoProviderService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
