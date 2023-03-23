package com.example.servicesim.service;

import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.User;

public interface UserService {

    public void addUser(UserEntity user);
    public User getUserByUUID(String uuid);
    public Iterable<User> getAllUsers();
}
