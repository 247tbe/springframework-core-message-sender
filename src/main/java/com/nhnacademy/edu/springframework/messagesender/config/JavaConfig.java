package com.nhnacademy.edu.springframework.messagesender.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class JavaConfig {
//    @Bean
//    public MessageSender smsMessageSender() {
//        return new SmsMessageSender();
//    }
//
//    @Bean
//    public MessageSender emailMessageSender() {
//        return new EmailMessageSender();
//    }
}
