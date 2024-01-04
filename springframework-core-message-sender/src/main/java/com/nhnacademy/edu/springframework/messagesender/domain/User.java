package com.nhnacademy.edu.springframework.messagesender.domain;

public class User {
  private final String userName;
  private final String email;
  private final String phoneNumber;

  public User(String userName, String email, String phoneNumber) {
    this.userName = userName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getUserName() {
    return userName;
  }
}
