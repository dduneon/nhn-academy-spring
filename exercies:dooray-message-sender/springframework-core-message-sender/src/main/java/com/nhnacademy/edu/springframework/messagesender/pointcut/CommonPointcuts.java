package com.nhnacademy.edu.springframework.messagesender.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class CommonPointcuts {

  @Pointcut("within(com.nhnacademy.edu.springframework.messagesender.service.*)")
  public void inServiceLayer() {}

  @Pointcut("@annotation(com.nhnacademy.edu.springframework.messagesender.annotation.Logging)")
  public void hasLoggingAnnotation() {}
}
