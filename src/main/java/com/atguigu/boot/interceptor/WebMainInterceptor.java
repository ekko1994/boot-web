package com.atguigu.boot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhanghao
 * @date 2021/3/10 09:47
 */
@Slf4j
public class WebMainInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser != null) {
            log.info("执行WebMainInterceptor的preHandle方法并放行{}",loginUser);
            return true;
        }else {
            request.setAttribute("msg", "请先去登录");
            request.getRequestDispatcher("/").forward(request, response);
            log.info("执行WebMainInterceptor的preHandle方法并拦截{}",loginUser);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("执行postHandle方法{}",modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("执行afterCompletion方法{}",ex);
    }
}
