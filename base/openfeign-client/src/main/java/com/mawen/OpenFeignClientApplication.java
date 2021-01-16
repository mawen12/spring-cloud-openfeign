package com.mawen;

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
@EnableDiscoveryClient // 开启服务发现
@EnableFeignClients // 开启 openfeign
public class OpenFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignClientApplication.class, args);
    }

}
