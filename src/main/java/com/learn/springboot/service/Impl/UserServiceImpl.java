package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.User;
import com.learn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Description: 用户管理的业务实现
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 14:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addUser(User user) throws Exception {
        jdbcTemplate.update("insert into user (name, age) values (?,?)", user.getName(), user.getAge());
    }

    @Override
    public void deleteUser(int id) throws Exception {
        jdbcTemplate.update("delete from user where id = ? ", id);
    }

    @Override
    public void updateUser(User user) throws Exception {
        jdbcTemplate.update("UPDATE user SET name = ? and age = ?", user.getName(), user.getAge());
    }

    @Override
    public List<User> findUserByName(String name) throws Exception {
        String sql = "select * from user where name like '%?%'";
        Object[] params = new Object[] {name};
        List<Map<String, Object>> users = jdbcTemplate.queryForList(sql, params, new BeanPropertyRowMapper(User.class));
        return null;
    }

    @Override
    public User findUserById(int id) throws Exception {
        String sql = "select * from user where id = ?";
        Object[] params = new Object[]{id};
        User user = (User) jdbcTemplate.queryForObject(sql, params, new BeanPropertyRowMapper(User.class));
        return user;
    }

    @Override
    public void deleteAll() throws Exception {
        jdbcTemplate.update("delete from user ");
    }
}
