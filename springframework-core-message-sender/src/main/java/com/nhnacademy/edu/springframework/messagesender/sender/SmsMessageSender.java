package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;
import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender{

  public SmsMessageSender() {
    System.out.println("SmsMessageSender Initialize");
  }

  @Override
  public boolean sendMessage(User user, String message) {
    if(Objects.isNull(user) || Objects.isNull(message)) {
      System.out.println("cannot send message");
      return false;
    }
    System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    return true;
  }
}
