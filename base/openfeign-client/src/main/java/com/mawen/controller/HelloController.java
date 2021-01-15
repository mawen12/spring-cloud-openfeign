package com.mawen.controller;

import com.mawen.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.SheetCollate;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:13
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        return helloService.sayHello();
    }

}
