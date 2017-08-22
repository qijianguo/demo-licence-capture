package com.learn.springboot.controller;

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
public class HelloSpringBoot {

    @GetMapping(value = "/hello")
    public String helloSpringBoot() {
        return "Hello Spring Boot !";
    }
}
