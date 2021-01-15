package com.mawen.service.impl;

import com.mawen.entity.Store;
import com.mawen.service.StoreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mw118
 * @version 1.0
 * @date 2021/1/15 8:08
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Override
    public List<Store> getStores() {
        List<Store> list = new ArrayList<>();
        list.add(new Store(1L, "apple"));
        list.add(new Store(2L, "orange"));
        list.add(new Store(3L, "banana"));
        return list;
    }

    @Override
    public Store getFirst() {
        return new Store(1L, "apple");
    }
}
