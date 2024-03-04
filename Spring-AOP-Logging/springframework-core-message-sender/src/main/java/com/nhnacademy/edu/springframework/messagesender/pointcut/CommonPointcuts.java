package com.nhnacademy.edu.springframework.messagesender.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcuts {

  @Pointcut("within(com.nhnacademy.edu.springframework.messagesender.service.*)")
  private void inServiceLayer() {}

  @Pointcut("@annotation(com.nhnacademy.edu.springframework.messagesender.annotation.Logging)")
  private void hasLoggingAnnotation() {}
}
