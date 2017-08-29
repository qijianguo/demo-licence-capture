package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Csite;
import com.learn.springboot.domain.Result;
import com.learn.springboot.mapper.CsiteMapper;
import com.learn.springboot.service.CsiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * <p>
 * User: Administrator
 * Date: 2017-08-29
 * Time: 14:23
 */
@Service
public class CsiteServiceImpl implements CsiteService {

    private static final Logger logger = LoggerFactory.getLogger(CsiteServiceImpl.class);

    @Autowired
    private CsiteMapper csiteMapper;

    @Override
    public Result selectCsiteOne() {
        Csite csite = null;
        try {
            csite = csiteMapper.selectCsiteOne();

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("查询失败:{}", e);
            return new Result(Result.ERROR, "监测点信息查询失败!", e);
        }
        return csite != null
                ? new Result(Result.OK, "查询成功!", csite)
                : new Result(Result.NO_RESULT, "无监测点信息!", null);
    }
}
