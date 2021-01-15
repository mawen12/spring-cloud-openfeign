package com.mawen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/14 22:42
 */

public interface HelloService {

    String getHello();

}
