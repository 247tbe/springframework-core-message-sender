package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//@Component
// smsMessageSender
public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println("SMS initialized");
    }

    public void close() {
        System.out.println("callback close() 0");
    }

    @Override
    public boolean sendMessage(User user, String message) {
            System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
            return true;
    }
}
