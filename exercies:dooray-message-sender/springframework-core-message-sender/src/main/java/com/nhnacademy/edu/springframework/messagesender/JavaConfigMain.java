package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

  public static void main(String[] args) {
    User user = new User("김준현", "test@nhnacademy.com", "010-9465-3421");

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender.config");

    MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
    service.doSendMessage(user, "안녕하세요");
  }
}