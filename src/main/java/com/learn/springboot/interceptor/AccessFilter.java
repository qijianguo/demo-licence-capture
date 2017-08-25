package com.learn.springboot.interceptor;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: 设置其他IP地址的机器可以直接访问本项目Url--工具filter
 * <p>
 * User: Administrator
 * Date: 2017-06-28
 * Time: 9:07
 */
public class AccessFilter extends HttpServlet implements Filter {

    private static final long serialVersionUID = 1L;

    private String projectDemoAllowOriginUrl = "http://192.168.1.121:8080/";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    //设置其他IP地址的机器可以直接访问到这个项目的后端
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", projectDemoAllowOriginUrl);
        httpResponse.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(request, httpResponse);
    }

}