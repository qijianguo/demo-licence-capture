package com.learn.springboot.service;

import com.learn.springboot.domain.Result;

/**
 * Created by qijianguo on 2017/8/25.
 */
public interface CarService {

    Result getPicturesByTimeAndLicence(String licence, Long receiveTime);
}
