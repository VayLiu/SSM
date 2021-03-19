package com.vayliu.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.vayliu.dynamic.jdk.*.*(..))")
    public void myPointCut() {
    }

    /**
     * 前置通知
     * @param joinPoint
     */
    @Before("myPointCut()")
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
    @Around("myPointCut()")
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
    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("后置返回通知：模拟删除删除临时文件\t");
        System.out.println("被增强处理的方法：" + joinPoint.getSignature().getName());
    }

    /**
     * 异常通知
     * @param e
     */
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void except(Throwable e) {
        System.out.println("异常通知：程序执行异常" + e.getMessage());
    }

    /**
     * 后置（最终）通知
     */
    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知：模拟释放资源");
    }
}
