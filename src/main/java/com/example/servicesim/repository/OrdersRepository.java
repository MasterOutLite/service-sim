package com.example.servicesim.repository;

import com.example.servicesim.Entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {
    public OrdersEntity findOrdersEntityByUuid(String uuid);
}
