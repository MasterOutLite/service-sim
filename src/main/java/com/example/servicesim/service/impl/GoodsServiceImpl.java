package com.example.servicesim.service.impl;

import com.example.servicesim.Entity.GoodsEntity;
import com.example.servicesim.model.Goods;
import com.example.servicesim.repository.GoodsRepository;
import com.example.servicesim.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;
    @Override
    public void addGoods(GoodsEntity goods) {
        goodsRepository.save(goods);
    }

    @Override
    public Goods getGoodsByUUID(String uuid) {
        var goodsEntity = goodsRepository.findGoodsEntityByUuid(uuid);

        return new Goods(goodsEntity);
    }

    @Override
    public Iterable<Goods> getAllGoods() {
        var goodsEntityList = goodsRepository.findAll();
        List<Goods> goodsList = new ArrayList<>();

        for (GoodsEntity goodsEntity : goodsEntityList) {
            goodsList.add(new Goods(goodsEntity));
        }

        return goodsList;
    }
}
