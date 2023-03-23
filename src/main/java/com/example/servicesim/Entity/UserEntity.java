package com.example.servicesim.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String password;

    private String name;
    private String lastname;
    private String city;
    private String address;
    private String phone;
    private String email;
    private Date dateRegistration;

    @OneToMany(mappedBy = "user")
    private List<OrdersEntity> orders;

    @PrePersist
    public void onCreate() {
        uuid = UUID.randomUUID().toString();
    }
}
