package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Page;
import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.PictureVo;
import com.learn.springboot.mapper.CarMapper;
import com.learn.springboot.service.CarService;
import com.learn.springboot.util.DateFormatUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qijianguo on 2017/8/25.
 */
@Service
public class CarServiceImpl implements CarService {

    private static final Logger logger = LoggerFactory.getLogger(CarServiceImpl.class);

    @Autowired
    private CarMapper carMapper;

    @Override
    public Result getPicturesByTimeAndLicenceByPage(String licence, String receiveTime, int pageNum) {
        Page page = encapsulationPage(licence, receiveTime, pageNum);
        List<PictureVo> list = null;
        try {
            list = carMapper.getPicturesByTimeAndLicenceByPage(page);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getPicturesByTimeAndLicence查询失败: {}" , e);
            new Result(Result.ERROR, "查询失败!",null);
        }
        page.setResults(list);
        return new Result(Result.OK, "查询成功",page);
    }

    /**
     * 封装分页查询
     *
     * @param licence
     * @param receiveTime
     * @param pageNum
     */
    private Page encapsulationPage(String licence, String receiveTime, int pageNum) {
        Page<PictureVo> page = new Page<>();
        Long time = 0L;
        if (!StringUtils.isEmpty(receiveTime)) {
            time = DateFormatUtil.string2Long(receiveTime);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("licence", licence);
        map.put("receiveTime", time);
        map.put("skip", (pageNum - 1) * page.getPageSize());
        map.put("pageSize", page.getPageSize());
        page.setParams(map);
        int count = carMapper.getPictureCount(page);
        page.setTotalPage(count);
        return page;
    }
}
