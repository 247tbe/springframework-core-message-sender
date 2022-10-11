package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        new MessageSendService(new SmsMessageSender()).doSendMessage();
//        new MessageSendService(new EmailMessageSender()).doSendMessage();

        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
        messageSendService.doSendMessage();
//        User user = new User("123@123", "000");
//        String message = "Hi";
//
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, message);
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, message);
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, message);
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, message);
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//
//        context.close(); // cleanup을 위해 닫아준다.
//        System.out.println("********************************");

//        String name = "com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender";
//        MessageSender messageSender = MessageSender.class.cast()

//        MessageSender email = context.getBean("emailMessageSender", MessageSender.class);
//        MessageSender sms = context.getBean("smsMessageSender", MessageSender.class);
//
//        email.sendMessage(user, message);
//        sms.sendMessage(user, message);

//        sendSmsMessage(new User("JSH@korea.com", "000-1234-5678"), "Hello");
    }

//    static void sendSmsMessage(User user, String message) {
//        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
//    }
//    void sendEmailMessage(User user, String message) {
//        System.out.println("Email Message Sent " + user.getEmail() + " : " + message);
//    }
}
