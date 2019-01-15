package com.czy.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.czy.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoProviderService;
import org.springframework.stereotype.Component;

/**
 * Created by czy0218 on 2019/1/15.
 */
@Component
public class EchoProviderServiceFallback implements EchoProviderService {
    @Override
    public String echo(String message) {
        return "您的网络异常,触发sentinel熔断。";
    }
}
