package com.learn.springboot.controller;

import com.learn.springboot.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 实现复杂的Restful接口
 *
 * Created by qijianguo on 2017/8/22.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    /** 创建线程安全的map */
    private Map<Integer, User> users = Collections.synchronizedMap(new HashMap<>());

    /**
     * 查找所有用户
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> r = new ArrayList<>(users.values());
        return r;
    }

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(User user) {

        return "success";
    }

    /**
     * 更新用户
     *
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable(value = "id")int id,@ModelAttribute User user) {

        return "success";
    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(int id) {
        return "success";
    }
}
