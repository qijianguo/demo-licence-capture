package com.learn.springboot.service.Impl;

import com.learn.springboot.dao.UserRepository;
import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.User;
import com.learn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * Created by qijianguo on 2017/8/24.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Result<User> findUserByUsernameAndPassword(String username, String password) {
        Result<User> result = new Result<>();;

        if (StringUtils.isEmpty(username) && StringUtils.isEmpty(password)) {
            result.setCode(Result.ERROR);
            result.setMessage("用户名或密码不能为空！");
            return result;
        }

        User user = userRepository.findUserByUsernameAndPassword(username, password);
        if (user == null) {
            result.setCode(Result.NO_RESULT);
            result.setMessage("用户名或密码错误！");
            return result;
        }
        result.setCode(Result.OK);
        result.setMessage("用户名或密码不能为空");
        result.setData(Result.getMap("username", user.getUsername()));
        return result;
    }
}
