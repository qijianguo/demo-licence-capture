package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.User;
import com.learn.springboot.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 14:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
        userService.deleteAll();
    }

    @Test
    public void addUser() throws Exception {
        User user = new User("Angus", 18);
        userService.addUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void findUserByName() throws Exception {
    }

    @Test
    public void findUserById() throws Exception {
    }

}