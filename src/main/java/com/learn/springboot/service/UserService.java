package com.learn.springboot.service;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.User;

/**
 * Created by qijianguo on 2017/8/24.
 */
public interface UserService {

    /**
     * 通过用户名和密码查询用户
     *
     * @param username
     * @param password
     * @return
     */
    Result<User> findUserByUsernameAndPassword(String username, String password);
}
