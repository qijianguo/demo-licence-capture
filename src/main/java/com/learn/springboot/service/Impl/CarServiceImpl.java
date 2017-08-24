package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.PictureVo;
import com.learn.springboot.mapper.CarMapper;
import com.learn.springboot.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qijianguo on 2017/8/25.
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public Result getPicturesByTimeAndLicence(String licence, Long receiveTime) {
        List<PictureVo> list = carMapper.getPicturesByTimeAndLicence(licence, receiveTime);
        return list!=null && list.size() > 0
                ? new Result(Result.OK, "成功",list)
                : new Result(Result.NO_RESULT, "失败",null);
    }
}
