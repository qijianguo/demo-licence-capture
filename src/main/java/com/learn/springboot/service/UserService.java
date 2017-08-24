package com.learn.springboot.service;

import com.learn.springboot.domain.User;

import java.util.List;

/**
 * Description: 用户操作的业务层
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 14:28
 */
public interface UserService {

    /**
     * 增加用户
     * @param user
     * @throws Exception
     */
    void addUser(User user) throws Exception;

    /**
     * 根据用户Id删除用户
     * @param id
     * @throws Exception
     */
    void deleteUser(int id) throws Exception;

    /**
     * 修改用户信息
     *
     * @param user
     * @throws Exception
     */
    void updateUser(User user) throws Exception;

    /**
     * 根据用户名查询用户
     *
     * @param name
     * @return
     * @throws Exception
     */
    List<User> findUserByName(String name) throws Exception;

    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     * @throws Exception
     */
    User findUserById(int id) throws Exception;

    /**
     * 删除所有
     *
     * @throws Exception
     */
    void deleteAll() throws Exception;


}
