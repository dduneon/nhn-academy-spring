package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.domain.User;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoorayMessageSender implements MessageSender{
  @Value("${hookUrl}")
  private String hookUrl;

  @Override
  public boolean sendMessage(User user, String message) {
    System.out.println("DoorayMessageSender:sendMessage called");
    if(Objects.isNull(hookUrl) || Objects.isNull(user) || Objects.isNull(message)) {
      System.out.println("cannot send message");
      return false;
    }
    new DoorayHookSender(new RestTemplate(), hookUrl)
        .send(DoorayHook.builder()
            .botName(user.getUserName())
            .text(message)
            .build());
    return true;
  }
}
