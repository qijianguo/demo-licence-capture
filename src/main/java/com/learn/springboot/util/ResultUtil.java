package com.learn.springboot.util;

import com.learn.springboot.domain.Result;

/**
 * Http返回信息的工具类
 * Created by Administrator on 2017/6/15.
 */
public class ResultUtil {

    /**
     * 执行成功
     * @param object
     * @return
     */
    public static Result<Object> success(Object object){
        Result<Object> result = new Result<Object>();
        result.setCode(Result.OK);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    /**
     * 执行失败
     * @param code
     * @param message
     * @return
     */
    public static Result<Object> fail(Integer code, String message){
        Result<Object> result = new Result<Object>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }
}
