package com.mawen;

import com.mawen.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:29
 */

@SpringBootApplication
@EnableFeignClients(clients = HelloService.class)
public class HelloServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }
}
