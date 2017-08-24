package com.learn.springboot.controller;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.User;
import com.learn.springboot.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public Result doLogin(String username, String password) {
        return userService.findUserByUsernameAndPassword(username,password);
    }


    /**
     * 查找所有用户
     *
     * @return
     */
    @ApiOperation(value="获取用户列表", notes="")
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
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
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
    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
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
    @ApiOperation(value="删除用户", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(int id) {
        return "success";
    }
}
