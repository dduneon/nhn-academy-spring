package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
  private MessageSender messageSender;

  // setter injection 반드시 default constructor 필요
  public MessageSendService() {
  }

  public void setMessageSender(
      MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public MessageSendService(MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public void doSendMessage(User user, String message) {
    messageSender.sendMessage(user, message);
  }
}
