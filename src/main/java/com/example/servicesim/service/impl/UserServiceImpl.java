package com.example.servicesim.service.impl;

import com.example.servicesim.Entity.UserEntity;
import com.example.servicesim.model.User;
import com.example.servicesim.repository.UserRepository;
import com.example.servicesim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public User getUserByUUID(String uuid) {
        var userEntity = userRepository.findUserEntityByUuid(uuid);
        return new User(userEntity);
    }

    @Override
    public Iterable<User> getAllUsers() {

        var userEntityList = userRepository.findAll();
        List<User> userList = new ArrayList<>();

        for (UserEntity userEntity : userEntityList) {
        userList.add(new User(userEntity));
        }

        return userList;
    }
}
