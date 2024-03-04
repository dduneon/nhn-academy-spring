package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;
import java.util.Objects;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender{
  public boolean sendMessage(User user, String message) {
    if(Objects.isNull(user) || Objects.isNull(message)) {
      System.out.println("cannot send message");
      return false;
    }
    System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    return true;
  }
}
