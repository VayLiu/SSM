package com.vayliu.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类，此类编写各种类型的通知
 *
 * @author: VayLiu
 **/


public class MyAspect {

    /**
     * 前置通知
     * @param joinPoint
     */
    public void before(JoinPoint joinPoint) {
        System.out.print("前置通知：模拟权限检查\t");
        System.out.println("目标类对象：" + joinPoint.getTarget() +
                "，被增强处理的方法：" + joinPoint.getSignature().getName());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕开始：模拟开始事务");
        Object object = proceedingJoinPoint.proceed();
        System.out.println("环绕结束：关闭事务");
        return object;
    }

    /**
     * 后置返回通知
     * @param joinPoint
     */
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("后置返回通知：模拟删除删除临时文件\t");
        System.out.println("被增强处理的方法：" + joinPoint.getSignature().getName());
    }

    /**
     * 异常通知
     * @param e
     */
    public void except(Throwable e) {
        System.out.println("异常通知：程序执行异常" + e.getMessage());
    }

    public void after() {
        System.out.println("最终通知：模拟释放资源");
    }
}
