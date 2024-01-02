package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    User user = new User("test@nhnacademy.com", "010-9465-3421");

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
      System.out.println("-----emailMessageSender getBean-----");
      MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
      System.out.println("-----smsMessageSender getBean-----");
      MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
      System.out.println("-----emailMessageSender getBean-----");
      MessageSender emailMessageSender2 = context.getBean("emailMessageSender", MessageSender.class);
      System.out.println("-----smsMessageSender getBean-----");
      MessageSender smsMessageSender2 = context.getBean("smsMessageSender", MessageSender.class);
    }
  }
}