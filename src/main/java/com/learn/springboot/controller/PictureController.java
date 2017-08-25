package com.learn.springboot.controller;

import com.learn.springboot.domain.Result;
import com.learn.springboot.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qijianguo on 2017/8/24.
 */
@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/")
    public Result getLatestPicture() {
        return pictureService.getLatestPicture();
    }

}
