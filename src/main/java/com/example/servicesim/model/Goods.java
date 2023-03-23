package com.example.servicesim.model;

import com.example.servicesim.Entity.GoodsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Goods {

    public Goods(GoodsEntity goodsEntity) {
        this.uuid = goodsEntity.getUuid();
        this.name = goodsEntity.getName();
        this.type = goodsEntity.getType();
        this.price = goodsEntity.getPrice();
        this.discount = goodsEntity.getDiscount();
    }

    private String uuid;

    private String name;
    private String type;
    private Float price;
    private Float discount;
}
