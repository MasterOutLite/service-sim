package com.example.servicesim.controllers;

import com.example.servicesim.Entity.GoodsEntity;
import com.example.servicesim.Entity.OrdersEntity;
import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.Orders;
import com.example.servicesim.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrdersController {

    private OrderService orderService;

    @GetMapping("/template")
    public OrdersEntity getTemplate(){
        var ordersEntity = new OrdersEntity();
        ordersEntity.setGoods(new GoodsEntity());
        ordersEntity.setUser(new UserEntity());
        return ordersEntity;
    }

    @PostMapping("/add")
    public void addOrders(@RequestBody Orders orders){
        orderService.addOrders(orders);
    }

    @GetMapping("/{uuid}")
    public Orders getOrdersByUUID(@PathVariable String uuid){
        return orderService.getOrdersByUUID(uuid);
    }

    @GetMapping("/all")
    public Iterable<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }
}
