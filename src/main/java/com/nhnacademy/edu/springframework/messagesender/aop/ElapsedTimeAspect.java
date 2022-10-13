//package com.nhnacademy.edu.springframework.messagesender.aop;
//
//import com.nhnacademy.edu.springframework.messagesender.annotation.TimeLogging;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StopWatch;
//
//@Aspect
//@Component
//public class ElapsedTimeAspect {
//    @Pointcut("execution(* com.nhnacademy.edu.springframework.messagesender.service.*.sendMessage(..))")
//    private void anyOldTransfer() {}
//
//    @Before("@annotation(timeLogging) && " +
//            "args()")
//    public void test(ProceedingJoinPoint pjp, TimeLogging timeLogging) {
//        StopWatch stopWatch = new StopWatch("Start Logger");
//        try {
//            stopWatch.start();
//            System.out.println("timeLogging start");
//            pjp.proceed();
//            System.out.println("timeLogging stop");
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//    }
//}
