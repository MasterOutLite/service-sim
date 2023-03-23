package com.example.servicesim.service.impl;

import com.example.servicesim.Entity.GoodsEntity;
import com.example.servicesim.Entity.OrdersEntity;
import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.Orders;
import com.example.servicesim.repository.GoodsRepository;
import com.example.servicesim.repository.OrdersRepository;
import com.example.servicesim.repository.UserRepository;
import com.example.servicesim.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GoodsRepository goodsRepository;
    @Override
    public void addOrders(Orders orders) {
        UserEntity user = userRepository.findUserEntityByUuid(orders.getUser());
        GoodsEntity goods = goodsRepository.findGoodsEntityByUuid(orders.getGoods());

        if(user == null || goods == null)
            return;

        OrdersEntity ordersEntity = new OrdersEntity(orders,user,goods);
        ordersRepository.save(ordersEntity);
    }

    @Override
    public Orders getOrdersByUUID(String uuid) {
        var ordersEntity = ordersRepository.findOrdersEntityByUuid(uuid);

        return new Orders(ordersEntity);
    }

    @Override
    public Iterable<Orders> getAllOrders() {
        return null;
    }
}
