package com.mawen;

import com.mawen.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 21:59
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OpenFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignClientApplication.class, args);
    }

}
