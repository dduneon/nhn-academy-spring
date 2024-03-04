package com.nhnacademy.edu.springframework.messagesender;

public class Main {

  public static void main(String[] args) {
    User user = new User("test@nhnacademy.com", "010-9465-3421");

    MessageSendService smsMessageSendService = new MessageSendService(new SmsMessageSender());
    smsMessageSendService.doSendMessage(user, "Hello");
  }
}