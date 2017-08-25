package com.learn.springboot.interceptor;

import com.learn.springboot.domain.Result;
import com.learn.springboot.domain.User;
import com.sun.org.apache.regexp.internal.RE;
import net.sf.json.JSONObject;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Description: 基于注解权限校验的拦截器
 * <p>
 * User: Administrator
 * Date: 2017-06-26
 * Time: 12:27
 */
@Component
public class AuthorityAnnotationInterceptor extends HandlerInterceptorAdapter {

    private static String active = "dev";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {


        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            Class<?> clazz = hm.getBeanType();
            Method m = hm.getMethod();
            // 开发环境中不验证登录
            if (!"prod".equals(active)) {
                System.out.println(active);
                return true;
            }

            try {
                if (clazz != null && m != null) {
                    User user = (User)request.getSession().getAttribute("user");
                    if(user == null){
//                        Map<String, Object> responseMap = new HashMap<String, Object>();
//                        responseMap.put("code", "-1");
//                        responseMap.put("message", "未验证通过,请登录");
//                        responseMap.put("data", null);

                        Result result = new Result(Result.ERROR, "未验证通过,请登录", null);
                        String json = JSONObject.fromObject(result).toString();
                        response.setCharacterEncoding("UTF-8");
                        response.setContentType("application/json; charset=utf-8");
                        response.getWriter().write(json);
                        return false;
                    }
                    return true;
                }
            } catch (Exception e) {
            }
        }
        return false;
    }
}