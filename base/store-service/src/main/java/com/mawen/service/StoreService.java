package com.mawen.service;

import com.mawen.entity.Store;

import java.util.List;

public interface StoreService {

    List<Store> getStores();

    Store getFirst();

}
