package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.Message;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.MessageQualifier;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {

  private MessageSender messageSender;

  @Autowired
  @MessageQualifier(message = Message.EMAIL)
  public MessageSendService( MessageSender messageSender) {
    this.messageSender = messageSender;
  }

  public void doSendMessage(User user, String message) {
    messageSender.sendMessage(user, message);
  }
}
