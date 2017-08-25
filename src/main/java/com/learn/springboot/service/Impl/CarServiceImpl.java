package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.PictureVo;
import com.learn.springboot.mapper.CarMapper;
import com.learn.springboot.service.CarService;
import com.learn.springboot.util.DateFormatUtil;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by qijianguo on 2017/8/25.
 */
@Service
public class CarServiceImpl implements CarService {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    @Autowired
    private CarMapper carMapper;

    @Override
    public Result getPicturesByTimeAndLicence(String licence, String receiveTime) {

        List<PictureVo> list = null;
        try {
            Long time = DateFormatUtil.string2Long(receiveTime);
            list = carMapper.getPicturesByTimeAndLicence(licence, time);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getPicturesByTimeAndLicence查询失败: {}" , e);
        }
        return list!=null && list.size() > 0
                ? new Result(Result.OK, "查询成功",list)
                : new Result(Result.NO_RESULT, "无  "+ licence +"==>"+ receiveTime + "  数据",null);
    }
}
