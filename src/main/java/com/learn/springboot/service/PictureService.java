package com.learn.springboot.service;

import com.learn.springboot.domain.Picture;
import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.vo.PictureVo;

import java.util.List;

/**
 * Created by qijianguo on 2017/8/24.
 */
public interface PictureService{

    Result<Picture> getLatestPicture();

}
