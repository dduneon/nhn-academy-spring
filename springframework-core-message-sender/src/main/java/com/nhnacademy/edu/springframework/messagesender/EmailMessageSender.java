package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender{
  public EmailMessageSender() {
    System.out.println("EmailMessageSender Initialize");
  }
  public void sendMessage(User user, String message) {
    System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
  }
}
