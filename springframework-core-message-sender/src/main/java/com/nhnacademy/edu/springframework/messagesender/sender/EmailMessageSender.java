package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender{
  public void sendMessage(User user, String message) {
    System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
  }
}
