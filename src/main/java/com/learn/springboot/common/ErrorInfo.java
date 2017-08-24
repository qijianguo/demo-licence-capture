package com.learn.springboot.common;

/**
 * Description: 统一的返回JSON对象
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 13:13
 */
public class ErrorInfo<T> {
    /** 成功 */
    public static final Integer OK = 0;
    /** 失败 */
    public static final Integer ERROR = 100;
    /** 响应状态码 */
    private Integer code;
    /** 响应信息 */
    private String message;
    /** 请求URL */
    private String url;
    /** 返回的数据 */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
