package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework.messagesender")
@PropertySource("classpath:/sender.properties")
@EnableAspectJAutoProxy
//@ImportResource("classpath:/beans.xml")
public class JavaConfig {
    @Bean("smsMessageSender")
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }

    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService(smsMessageSender(), "japan");
    }

}
