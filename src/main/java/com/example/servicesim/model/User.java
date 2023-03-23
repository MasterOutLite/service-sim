package com.example.servicesim.model;

import com.example.servicesim.Entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    public  User (UserEntity userEntity){
        this.uuid = userEntity.getUuid();
        this.address = userEntity.getAddress();
        this.city = userEntity.getCity();
        this.name = userEntity.getName();
        this.lastname = userEntity.getLastname();
        this.email = userEntity.getEmail();
        this.phone = userEntity.getPhone();
    }

    private String uuid;

    private String name;
    private String lastname;
    private String city;
    private String address;
    private String phone;
    private String email;
}
