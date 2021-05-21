package com.vayliu.ch13.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: VayLiu
 **/


public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if (url.indexOf("/toLogin") >=0 || url.indexOf("/login") >=0) {
            return true;
        }
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if (obj != null) {
            return true;
        }
        request.setAttribute("msg", "还没登录。请先登录！");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle 方法在控制器的处理请求方法调用之后，解析视图之前执行");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion 方法在控制器的处理请求方法执行完成后执行，即视图渲染结束之后执行");
    }

}
