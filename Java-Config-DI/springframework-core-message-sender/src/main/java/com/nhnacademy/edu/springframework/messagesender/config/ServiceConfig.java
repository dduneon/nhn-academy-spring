package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
  @Bean(name = "messageSendService")
  public MessageSendService messageSendService(MessageSender emailMessageSender) {
    return new MessageSendService(emailMessageSender);
  }
}
