package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;

public interface MessageSender {
  void sendMessage(User user, String message);
}
