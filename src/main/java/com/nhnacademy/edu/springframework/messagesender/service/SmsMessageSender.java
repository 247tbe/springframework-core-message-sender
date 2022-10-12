package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

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
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);

    }
}
