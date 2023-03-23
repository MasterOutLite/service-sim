package com.example.servicesim.service;

import com.example.servicesim.Entity.GoodsEntity;
import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.Goods;
import com.example.servicesim.model.User;

public interface GoodsService {

    public void addGoods(GoodsEntity goods);
    public Goods getGoodsByUUID(String uuid);
    public Iterable<Goods> getAllGoods();
}
