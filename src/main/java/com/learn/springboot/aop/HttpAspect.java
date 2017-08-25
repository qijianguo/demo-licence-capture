package com.learn.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Description: 记录Http请求
 * <p>
 * User: Administrator
 * Date: 2017-06-15
 * Time: 11:41
 */
@Aspect
@Component
public class HttpAspect {

    @Value("${spring.profiles.active}")
    private String dev;

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //@Pointcut("execution(public * com.landfun.controller.UserController.*(..))")
    @Pointcut("execution(* com.learn.springboot.controller..*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        logger.info("url={}", request.getRequestURL());
        // method
        logger.info("method={}", request.getMethod());
        // ip
        logger.info("ip={}", request.getRemoteAddr());
        // 类方法
        logger.info("classMethod={}", joinPoint.getSignature().getDeclaringTypeName()   // 获取类名
                + "." + joinPoint.getSignature().getName());        // 类方法
        // 参数
        logger.info("params={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        logger.info("doAfter");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("response={}", object == null ? null : object.toString());
    }

}
