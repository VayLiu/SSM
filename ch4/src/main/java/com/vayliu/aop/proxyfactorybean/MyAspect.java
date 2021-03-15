package com.vayliu.aop.proxyfactorybean;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类
 *
 * @author: VayLiu
 **/


public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // 增强方法
        check();
        expect();
        // 目标方法
        Object obj = methodInvocation.proceed();
        // 增强方法
        log();
        monitor();
        return obj;
    }

    private void check() {
        System.out.println("模拟权限控制");
    }

    private void expect() {
        System.out.println("模拟异常处理");
    }

    private void log() {
        System.out.println("模拟日志记录");
    }

    private void monitor() {
        System.out.println("性能监测");
    }
}
