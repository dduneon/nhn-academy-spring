package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender{

  public SmsMessageSender() {
    System.out.println("SmsMessageSender Initialize");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
  }
}
