package com.learn.springboot.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 返回请求结果
 *
 * Created by qijianguo on 2017/8/24.
 */
public class Result<T> {

    /** 成功 */
    public static final int OK = 200;

    /** 请求参数错误 */
    public static final int ERROR = 100;

    /** 无查询结果，但请求参数正确 */
    public static final int NO_RESULT = 204;

    /** 响应码 */
    private int code;

    /** 响应信息 */
    private String message;

    /** 响应结果 */
    private Object data;

    public Result() {
    }

    public Result(int code, String message, String url, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static Map<String, Object> getMap(String key, Object object) {
        Map<String, Object> map = new ConcurrentHashMap<>();
        map.put("key", object);
        return map;
    }
}
