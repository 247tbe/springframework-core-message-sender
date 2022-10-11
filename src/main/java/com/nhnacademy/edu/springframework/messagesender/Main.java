package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    public static void main(String[] args) {
        new MessageSendService(new SmsMessageSender()).doSendMessage();
        new MessageSendService(new EmailMessageSender()).doSendMessage();
//        sendSmsMessage(new User("JSH@korea.com", "000-1234-5678"), "Hello");
    }

//    static void sendSmsMessage(User user, String message) {
//        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
//    }
//    void sendEmailMessage(User user, String message) {
//        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
//    }
}
