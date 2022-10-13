package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.TimeLogging;

//@Component
// emailMessageSender
public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("Email initialized");
    }

    public void init() {
        System.out.println(" + EmailMessageSender initializing");
    }
    public void cleanup() {
        System.out.println(" + EmailMessageSender cleanup called");
    }
    @Override
//    @TimeLogging("emailMessageSender")
    public boolean sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
        return true;
    }
}
