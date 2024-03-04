package com.nhnacademy.edu.springframework.messagesender.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {
  @Around("com.nhnacademy.edu.springframework.messagesender.pointcut.CommonPointcuts.hasLoggingAnnotation() && com.nhnacademy.edu.springframework.messagesender.pointcut.CommonPointcuts.inServiceLayer()")
  public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {

    StopWatch stopWatch = new StopWatch();
    try {
      stopWatch.start();

      return pjp.proceed();
    }finally {
      stopWatch.stop();
      System.out.println(stopWatch.prettyPrint());
    }
  }
}
