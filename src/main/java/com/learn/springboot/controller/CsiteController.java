package com.learn.springboot.controller;

import com.learn.springboot.domain.Result;
import com.learn.springboot.service.CsiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-29
 * Time: 14:18
 */
@RestController
@RequestMapping(value = "/csite")
public class CsiteController {

    @Autowired
    private CsiteService csiteService;

    @GetMapping(value = "")
    public Result getCsiteOne() {
        return csiteService.selectCsiteOne();
    }

}
