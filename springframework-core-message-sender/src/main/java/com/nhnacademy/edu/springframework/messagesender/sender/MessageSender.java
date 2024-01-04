package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.domain.User;

public interface MessageSender {
  boolean sendMessage(User user, String message);
}
