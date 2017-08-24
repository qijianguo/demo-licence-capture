package com.learn.springboot.dao;

import com.learn.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qijianguo on 2017/8/24.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 通过用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findUserByUsernameAndPassword(String username, String password);

}
