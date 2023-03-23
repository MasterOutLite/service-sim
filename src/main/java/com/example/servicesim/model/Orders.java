package com.example.servicesim.model;

import com.example.servicesim.Entity.OrdersEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Orders {
    public Orders(OrdersEntity ordersEntity) {
        this.uuid = ordersEntity.getUuid();
        this.goods = ordersEntity.getGoods().getUuid();
        this.user =  ordersEntity.getUser().getUuid();
        this.amount = ordersEntity.getAmount();
        this.price = ordersEntity.getPrice();
    }

    private String uuid;
    private String goods;
    private String user;
    private Integer amount;
    private Float price;

}
