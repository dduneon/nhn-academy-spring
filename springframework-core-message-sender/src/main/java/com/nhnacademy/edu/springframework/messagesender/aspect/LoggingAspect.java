package com.nhnacademy.edu.springframework.messagesender.aspect;

import java.util.Objects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

  @Pointcut("within(com.nhnacademy.edu.springframework.messagesender.service.*)")
  private void inServiceLayer() {}

  @Pointcut("@annotation(com.nhnacademy.edu.springframework.messagesender.annotation.Logging)")
  private void hasLoggingAnnotation() {}

  @Around("inServiceLayer() && hasLoggingAnnotation()")
  public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
    StopWatch stopWatch = new StopWatch();
    try {
      stopWatch.start();

      Object ret = pjp.proceed();
      return ret;
    }finally {
      stopWatch.stop();
      System.out.println(stopWatch.prettyPrint());
    }
  }
}
