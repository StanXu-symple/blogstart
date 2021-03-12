package com.stan.service;

import com.stan.dao.User;
import com.stan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUserName());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}
