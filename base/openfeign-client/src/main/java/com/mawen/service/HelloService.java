package com.mawen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("hello-service")
public interface HelloService {

    @GetMapping("/say/hello")
    String sayHello();

}