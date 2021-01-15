package com.mawen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/15 8:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreServiceApplication.class, args);
    }
}
