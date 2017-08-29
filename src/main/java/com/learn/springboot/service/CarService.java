package com.learn.springboot.service;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.CarQuery;

/**
 * Created by qijianguo on 2017/8/25.
 */
public interface CarService {

    Result getPicturesByTimeAndLicenceByPage(CarQuery carQuery);
}
