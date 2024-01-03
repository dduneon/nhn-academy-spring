package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.Message;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.MessageQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageSendService {

  private MessageSender messageSender;

  public MessageSendService() {
    System.out.println("default constructor call");
  }

  @Autowired
  public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public void doSendMessage(User user, String message) {
    messageSender.sendMessage(user, message);
  }
}
