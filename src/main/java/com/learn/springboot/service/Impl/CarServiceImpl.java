package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Page;
import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.CarQuery;
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
    public Result getPicturesByTimeAndLicenceByPage(CarQuery carQuery) {
        Page page = encapsulationPage(carQuery);
        List<PictureVo> list = null;
        try {
            list = carMapper.getPicturesByTimeAndLicenceByPage(page);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("getPicturesByTimeAndLicence查询失败: {}" , e);
            new Result(Result.ERROR, "查询失败!",null);
        }
        page.setResults(list);
        return list!= null && list.size() > 0 ? new Result(Result.OK, "查询成功",page) : new Result(Result.NO_RESULT, "无牌照为: +"+ carQuery.getLicence() +"   时间为:"+ carQuery.getReceiveTime() + " 的抓拍信息",page);
    }

    /**
     * 封装分页查询
     *
     * @param carQuery 查询的封装条件
     * @return 分页查询结果
     */
    private Page encapsulationPage(CarQuery carQuery) {
        Page<PictureVo> page = new Page<>();
        Long time = 0L;
        if (carQuery != null && !StringUtils.isEmpty(carQuery.getReceiveTime())) {
            time = DateFormatUtil.string2Long(carQuery.getReceiveTime());
        }
        Map<String, Object> map = new HashMap<>();
        map.put("licence", carQuery.getLicence());
        map.put("receiveTime", time);
        map.put("skip", (carQuery.getPageNum() - 1) * page.getPageSize());
        map.put("pageSize", page.getPageSize());
        page.setParams(map);
        int count = carMapper.getPictureCount(page);
        page.setTotalPage(count);
        return page;
    }
}
