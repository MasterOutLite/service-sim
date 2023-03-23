package com.example.servicesim.repository;

import com.example.servicesim.Entity.GoodsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsRepository  extends JpaRepository<GoodsEntity, Long> {
    public GoodsEntity findGoodsEntityByUuid(String uuid);
}
