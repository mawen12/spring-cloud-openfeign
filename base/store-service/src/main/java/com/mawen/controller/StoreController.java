package com.mawen.controller;

import com.mawen.entity.Store;
import com.mawen.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/15 8:11
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/list")
    public List<Store> getStores() {
        return storeService.getStores();
    }

    @GetMapping("/first")
    public Store getFirst() {
        return storeService.getFirst();
    }

}
