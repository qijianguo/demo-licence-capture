package com.learn.springboot.mapper;

import com.learn.springboot.domain.Page;
import com.learn.springboot.domain.vo.PictureVo;

import java.util.List;
import java.util.Map;

/**
 * Created by qijianguo on 2017/8/24.
 */
public interface CarMapper {

    List<PictureVo> getPicturesByTimeAndLicenceByPage(Page page) throws Exception;

    /**
     * 总数
     *
     * @return
     */
    int getPictureCount(Page page);
}
