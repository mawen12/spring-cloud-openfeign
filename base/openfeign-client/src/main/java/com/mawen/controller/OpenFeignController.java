package com.mawen.controller;

import com.mawen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:13
 */
@RestController
public class OpenFeignController {

    /**
     * 注入 HelloService
     */
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return helloService.sayHello();
    }

    @GetMapping("/timeout")
    public String timeout(@RequestParam("timeout") Long timeout) {
        return helloService.timeout(timeout);
    }
}
