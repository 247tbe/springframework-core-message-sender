package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        String basePackage = "com.nhnacademy.edu.springframework.messagesender";
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(basePackage);

        MessageSender smsSender = context.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailSender = context.getBean("emailMessageSender", MessageSender.class);

        User user = new User("2022@1012", "13-32");
        String msg = "good afternoon";

        smsSender.sendMessage(user, msg);
        emailSender.sendMessage(user, msg);
    }
}
