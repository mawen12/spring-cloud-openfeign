package com.mawen.controller;

import com.mawen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:30
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/say/hello")
    public String sayHello() {
        return helloService.getHello();
    }

}
