package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
  @Autowired
  @SMS
  private MessageSender messageSender;

  public void setEmailMessageSender(
      MessageSender messageSender) {
    System.out.println("setMessageSender invoked!");
    this.messageSender = messageSender;
  }

  public void doSendMessage(User user, String message) {
    messageSender.sendMessage(user, message);
  }
}
