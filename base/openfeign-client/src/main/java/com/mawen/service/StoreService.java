package com.mawen.service;

import com.mawen.entity.Store;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("store-service")
@RequestMapping("/store")
public interface StoreService {

    @GetMapping("/list")
    List<Store> getStores();

    @GetMapping("/first")
    Store getFirst();

}
