package com.mawen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 标识接口为FeignClient及对应的服务名称
 * @FeignClient: 表明该接口会被 SpringCloud 以当前类的全限定类名（com.mawen.service.HelloService）定义Bean，而放到 Spring 容器中
 * hello-service: 表示会去 Eureka 的注册中心，查找名为 hello-service 的服务而找到具体的服务信息，用于在后续请求中发起调用
 */
@FeignClient("hello-service")
public interface HelloService {

    /**
     * 对 hello-service/say/hello 发起调用
     * @return
     */
    @GetMapping("/say/hello")
    String sayHello();

    /**
     * 对 hello-service/timeout 发起调用
     * @param timeout
     * @return
     */
    @PostMapping("/timeout")
    String timeout(@RequestParam("timeout") Long timeout);
}
