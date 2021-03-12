package com.stan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stan.dao.User;


public interface UserMapper extends BaseMapper<User> {
    User findByUsername(String username);

    User findUserById(String id);
}
