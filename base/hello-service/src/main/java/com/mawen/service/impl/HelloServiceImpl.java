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

    @Override
    public String timeout(Long timout) {
        try {
            Thread.sleep(timout * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello World!";
    }


}
