package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {
  @Bean(name = "smsMessageSender")
  public MessageSender smsMessageSender() {
    return new SmsMessageSender();
  }
}
