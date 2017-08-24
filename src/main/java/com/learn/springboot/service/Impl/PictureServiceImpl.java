package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Result;
import com.learn.springboot.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qijianguo on 2017/8/24.
 */
@Service
public class PictureServiceImpl implements PictureService{

    @Override
    public Result getPicturesByTimeAndLicence(String carUuid) {

        return new Result(Result.NO_RESULT, "无查询结果", null);
    }

}
