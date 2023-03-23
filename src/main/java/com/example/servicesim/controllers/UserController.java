package com.example.servicesim.controllers;

import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.User;
import com.example.servicesim.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    @GetMapping("/template")
    public UserEntity getTemplate(){
        return new UserEntity();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody UserEntity user){
        userService.addUser(user);
    }

    @GetMapping("/{uuid}")
    public User getUserByUUID(@PathVariable String uuid){
        return userService.getUserByUUID(uuid);
    }

    @GetMapping("/all")
    public Iterable<User> getAllUser(){
        return userService.getAllUsers();
    }
}
