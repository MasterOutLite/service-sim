package com.example.servicesim.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "goods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String name;
    private String type;
    private Float price;
    private Float discount;

    @OneToMany(mappedBy = "goods")
    private List<OrdersEntity> orders;

    @PrePersist
    public void onCreate() {
        uuid = UUID.randomUUID().toString();
    }
}
