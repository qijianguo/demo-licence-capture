package com.learn.springboot.mapper;

import com.learn.springboot.domain.vo.PictureVo;

import java.util.List;

/**
 * Created by qijianguo on 2017/8/24.
 */
public interface PictureMapper {

    List<PictureVo> getPicturesByTimeAndLicence(String licence);
}