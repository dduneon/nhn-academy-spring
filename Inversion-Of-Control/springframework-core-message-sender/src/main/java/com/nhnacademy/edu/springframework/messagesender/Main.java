package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    User user = new User("test@nhnacademy.com", "010-9465-3421");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
      MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
      MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
      MessageSender emailMessageSender2 = context.getBean("emailMessageSender", MessageSender.class);

      System.out.println(emailMessageSender == emailMessageSender2);
      // singleton이기 때문에 두 객체는 같은 객체이다

      emailMessageSender.sendMessage(user, "hello");
      smsMessageSender.sendMessage(user, "hello");
    }
  }
}