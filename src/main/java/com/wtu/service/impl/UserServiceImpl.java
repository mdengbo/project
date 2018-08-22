package com.wtu.service.impl;


import com.wtu.dao.UserMapper;
import com.wtu.model.User;
import com.wtu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现UserService
 *
 * @Author dengbo
 * @Date 2018-08-22
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
