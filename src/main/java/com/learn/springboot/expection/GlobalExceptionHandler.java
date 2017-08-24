package com.learn.springboot.expection;

import com.learn.springboot.common.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Description: 全局异常处理类
 * <p>
 * User: Administrator
 * Date: 2017-08-23
 * Time: 9:55
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /** 默认错误视图 */
//    private static final String DEFAULT_ERROR_VIEW = "error";
//
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public ErrorInfo<Object> defaultErrorHandler(HttpServletRequest req, CustomException e) throws Exception {
//        ErrorInfo<Object> errorInfo = new ErrorInfo<>();
//        errorInfo.setCode(ErrorInfo.ERROR);
//        errorInfo.setMessage(e.getMessage());
//        errorInfo.setUrl(req.getRequestURL().toString());
//        errorInfo.setData("Some Data");
//        return errorInfo;
//    }
}
