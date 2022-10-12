package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

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
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
    }
}
