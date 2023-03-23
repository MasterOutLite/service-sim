package com.example.servicesim.Entity;

import com.example.servicesim.model.Orders;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersEntity {

    public OrdersEntity(Orders orders, UserEntity user, GoodsEntity goods) {
        this.uuid = orders.getUuid();
        this.user = user;
        this.goods = goods;
        this.amount = orders.getAmount();
        this.price = orders.getPrice();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    @ManyToOne()
    @JoinColumn(name = "goods_id")
    private GoodsEntity goods;

    private Integer amount;
    private Float price;

    @PrePersist
    public void onCreate(){
        this.uuid = UUID.randomUUID().toString();
    }


}
