package com.luv2code.springboot.thymeleafdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoLoggingAspect {

    // Setup Logger
    private Logger myLogger = Logger.getLogger(getClass().getName());

    // Setup Pointcut declarations
    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.controller.*.*(..))")
    private void forControllerPackage() {}

    // do the same for service and dao
    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.service.*.*(..))")
    private void forServicePackage() {}

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.dao.*.*(..))")
    private void forDaoPackage() {}

    // Combine pointcut declarations
    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow(){}

    // add @Before advice
    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint) {

        // display method we are calling
        String method = joinPoint.getSignature().toShortString();
        myLogger.info("====>> in @Before: calling method: " + method);

        // display the arguments to the method

        // get the arguments
        Object[] args = joinPoint.getArgs();

        // loop through and display args
        for (Object tempArg: args) {
            myLogger.info("====>> argument: " + tempArg);
        }
    }

    // add @AfterReturning advice
    @AfterReturning(
            pointcut = "forAppFlow()",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result) {

        // display method we are returning from
        String method = joinPoint.getSignature().toShortString();
        myLogger.info("====>> in @AfterReturning: from method: " + method);

        // display data returned
        myLogger.info("====>> result: " + result);
    }
}
