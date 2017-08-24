package com.learn.springboot.expection;

/**
 * Description: 自定义异常类
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 13:20
 */
public class CustomException extends Exception{

    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
