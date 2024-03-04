package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigMain {

  public static void main(String[] args) {
    User user = new User("test@nhnacademy.com", "010-9465-3421");

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender");
    SmsMessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
    smsMessageSender.sendMessage(user, "message");

    MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
    service.doSendMessage(user, "message");
  }
}