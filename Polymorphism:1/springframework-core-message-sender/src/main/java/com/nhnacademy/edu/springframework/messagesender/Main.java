package com.nhnacademy.edu.springframework.messagesender;

public class Main {

  public static void main(String[] args) {
    User user = new User("test@nhnacademy.com", "010-9465-3421");
    sendSmsMessage(user, "hello world");
  }

  private static void sendSmsMessage(User user, String message) {
    System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
  }

  private static void sendEmailMessage(User user, String message) {
    System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
  }
}