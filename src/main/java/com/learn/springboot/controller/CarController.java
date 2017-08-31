package com.learn.springboot.controller;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.CarQuery;
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
     * 分页并按照条件查询
     *
     * @param carQuery 查询对象分装
     * @return
     */
    @GetMapping("")
    public Result getPicturesByTimeAndLicenceAndPage(CarQuery carQuery) {
        return carService.getPicturesByTimeAndLicenceByPage(carQuery);
    }
}
