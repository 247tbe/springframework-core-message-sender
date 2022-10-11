package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {


    public SmsMessageSender() {
        System.out.println("프로토타입");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);

    }
}
