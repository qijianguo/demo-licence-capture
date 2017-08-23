package com.learn.springboot.controller;

import com.learn.springboot.expection.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-22
 * Time: 17:25
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String helloSpringBoot() {
        return "Hello Spring Boot !";
    }

    @RequestMapping("/index")
    public String index (ModelMap map) {
        map.put("email", "1633972602@qq.com");
        return "index";
    }

    /**
     * 自定义异常测试
     * @return
     * @throws CustomException
     */
    @RequestMapping("/json")
    public String json() throws CustomException {
        throw new CustomException("发生错误");
    }
}
