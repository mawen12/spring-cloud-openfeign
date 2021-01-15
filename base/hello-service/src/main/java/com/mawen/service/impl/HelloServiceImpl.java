package com.mawen.service.impl;

import com.mawen.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:44
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHello() {
        return "Hello World!";
    }
}
