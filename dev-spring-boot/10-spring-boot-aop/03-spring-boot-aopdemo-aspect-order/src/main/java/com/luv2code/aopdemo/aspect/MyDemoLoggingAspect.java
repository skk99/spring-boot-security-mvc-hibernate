package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {

        System.out.println("\n=======>>> Executing @Before advice on method");

        // display the method signature with help of JoinPoint
        // JoinPoint has meta data about method call
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("Method: " + methodSignature);

        // display method arguments with help of JoinPoint

        // get args
        Object[] args = joinPoint.getArgs();

        // loop through args and print them
        for (Object tempArg: args) {
            System.out.println(tempArg);

            if (tempArg instanceof Account) {

                // downcast and print Account specifications
                Account theAccount = (Account) tempArg;

                System.out.println("Account name: "+ theAccount.getName());
                System.out.println("Account level: "+ theAccount.getLevel());
            }
        }
    }

    // add a new advice for @AfterReturning on the findAccounts method
    @AfterReturning(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result"
    )
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {

        // print out which method we are advising on
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
        // print out the results of the method call
        System.out.println("\n=====>>> result is: " + result);

        // let's post-process the data.. let's modify it :-)
        // convert the account names to uppercase
        convertAccountNamesToUpperCase(result);
        System.out.println("\n=====>>> result after modification is: " + result);
    }

    @AfterThrowing(
            pointcut = "execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theExc"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable theExc) {

        // Print out which method we are advising on
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);

        // log the exception
        System.out.println("\n=====>>> The exception caught in @AfterThrowing: " + theExc);
    }

    // @After will run for success or failure (finally)
    @After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint) {
        // Print out which method we are advising on
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @After(Finally) on method: " + method);

    }

    @Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(
            ProceedingJoinPoint proceedingJoinPoint
    ) throws Throwable {

        // print out method we are advising on
        String method = proceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @Around on method: " + method);

        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now let's execute the method
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception exc) {

            // log the exception
            System.out.println(exc.getMessage());

            // give user a custom message
            // result = "Major accident ! But no worries, you private AOP helicopter is on the way!";

            // rethrow the exception
            throw exc;
        }

        // get end timestamp
        long end = System.currentTimeMillis();

        // compute duration and display it
        long duration = end - begin;
        System.out.println("\n ====> Duration in Seconds: "+ duration/1000);

        return result;
    }


    private void convertAccountNamesToUpperCase(List<Account> result) {

        // loop through the accounts
        for (Account tempAccount: result) {
            // get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase();
            // update the name on account
            tempAccount.setName(theUpperName);

        }
    }

}
