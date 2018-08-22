package com.wtu.service;

import com.wtu.model.User;

/**
 *  业务层 接口
 *
 * @Author dengbo
 * @Date 2018-08-22
 */
public interface UserService {
    User getUserById(int userId);
}
