package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {
        // TODO document why this constructor is empty
    }

//    public void setMessageSender(MessageSender messageSender) {
//        System.out.println("setMessageSender() 호출");
//        this.messageSender = messageSender;
//    }
    public void setEmailMessageSender(MessageSender messageSender) {
        System.out.println("setEmailMessageSender() 호출");
        this.messageSender = messageSender;
    }
//    private final MessageSender emailMessageSender;
//    private final MessageSender smsMessageSender;

//    public MessageSendService(MessageSender emailMessageSender, MessageSender smsMessageSender) {
//        this.emailMessageSender = emailMessageSender;
//        this.smsMessageSender = smsMessageSender;
//    }

    public void doSendMessage() {
        messageSender.sendMessage(new User("JSH2@korea.com", "010-1234-5678"), "Hello");

//        User user = new User("JSH827@ko.com", "010-1111-9999");
//        String msg = "Good";
//        emailMessageSender.sendMessage(user, msg);
//        smsMessageSender.sendMessage(user, msg);
    }

}
