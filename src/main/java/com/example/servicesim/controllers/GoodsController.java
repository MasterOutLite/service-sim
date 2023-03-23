package com.example.servicesim.controllers;

import com.example.servicesim.Entity.GoodsEntity;
import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.Goods;
import com.example.servicesim.model.User;
import com.example.servicesim.service.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
@AllArgsConstructor
public class GoodsController {

    private GoodsService goodsService;

    @GetMapping("/template")
    public GoodsEntity getTemplate(){
        return new GoodsEntity();
    }

    @PostMapping("/add")
    public void addGoods(@RequestBody GoodsEntity goods){
        goodsService.addGoods(goods);
    }

    @GetMapping("/{uuid}")
    public Goods getGoodsByUUID(@PathVariable String uuid){
        return goodsService.getGoodsByUUID(uuid);
    }

    @GetMapping("/all")
    public Iterable<Goods> getAllGoods(){
        return goodsService.getAllGoods();
    }
}
