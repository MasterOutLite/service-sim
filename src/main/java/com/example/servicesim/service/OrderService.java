package com.example.servicesim.service;

import com.example.servicesim.Entity.OrdersEntity;
import com.example.servicesim.model.Orders;

public interface OrderService {
    public void addOrders(Orders orders);
    public Orders getOrdersByUUID(String uuid);
    public Iterable<Orders> getAllOrders();
}
