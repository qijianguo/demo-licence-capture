package com.learn.springboot.service.Impl;

import com.learn.springboot.domain.Picture;
import com.learn.springboot.domain.Result;
import com.learn.springboot.mapper.PictureMapper;
import com.learn.springboot.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qijianguo on 2017/8/24.
 */
@Service
public class PictureServiceImpl implements PictureService{

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public Result<Picture> getLatestPicture(){
        Picture picture = pictureMapper.getLatestPicture();
        if (picture!= null) {
            return new Result(Result.OK, "查询成功!", picture);
        }
        return new Result(Result.NO_RESULT, "无查询结果", null);
    }

}
