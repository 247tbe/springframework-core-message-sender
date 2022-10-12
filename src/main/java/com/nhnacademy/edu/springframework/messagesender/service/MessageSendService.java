package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import com.nhnacademy.edu.springframework.messagesender.annotation.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class MessageSendService {
    private MessageSender messageSender;

//    public MessageSendService() {
//        // TODO document why this constructor is empty
//    }

//    @Value("${send.from}")
    private final String from;

    @Autowired
    public MessageSendService(@SMS(sender = Sender.SMS, dummy = true) MessageSender messageSender,
                              @Value("${send.from}") String from) {
        System.out.println("@Autowired Constructor Injection");
        this.from = from;
        this.messageSender = messageSender;
    }

//    public void setMessageSender(MessageSender messageSender) {
//        System.out.println("setMessageSender() 호출");
//        this.messageSender = messageSender;
//    }
//    @Required
    public void setEmailMessageSender(MessageSender messageSender) {
//        System.out.println("@Autowired Setter Injection ");
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
        System.out.print("From " + this.from + " ");
        messageSender.sendMessage(new User("JSH2@korea.com", "010-1234-5678"), "Hello");

//        User user = new User("JSH827@ko.com", "010-1111-9999");
//        String msg = "Good";
//        emailMessageSender.sendMessage(user, msg);
//        smsMessageSender.sendMessage(user, msg);
    }

}
