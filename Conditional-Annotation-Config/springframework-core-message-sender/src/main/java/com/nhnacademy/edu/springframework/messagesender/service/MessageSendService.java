package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.condition.TestCondition;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

@Service
@Conditional(TestCondition.class)
public class MessageSendService {
  @Value("${senderName}")
  private String senderName;

  private MessageSender messageSender;

  public MessageSendService() {
    System.out.println("default constructor call");
  }

  @Autowired
  public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public void doSendMessage(User user, String message) {
    System.out.println("sender name: " + senderName);
    messageSender.sendMessage(user, message);
  }
}
