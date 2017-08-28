package com.learn.springboot.controller;

import com.learn.springboot.domain.Result;
import com.learn.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qijianguo on 2017/8/25.
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    /**
     *
     *
     * @param licence 车牌号
     * @param receiveTime 抓拍时间
     * @param pageNum 当前页数
     * @return
     */
    @GetMapping("/")
    public Result getPicturesByTimeAndLicenceByPage(String licence, String receiveTime, int pageNum) {
        return carService.getPicturesByTimeAndLicenceByPage(licence, receiveTime, pageNum);
    }
}
