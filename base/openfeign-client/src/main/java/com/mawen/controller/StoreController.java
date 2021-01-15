package com.mawen.controller;

import com.mawen.entity.Store;
import com.mawen.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/15 8:16
 */
@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/feign/stores")
    public List<Store> getStores() {
        return storeService.getStores();
    }

    @GetMapping("/feign/first")
    public Store getFirst() {
        return storeService.getFirst();
    }

}
