package com.nhnacademy.edu.springframework.messagesender;

//import com.nhnacademy.edu.springframework.messagesender.aop.TimeLoggingAspect;
import com.nhnacademy.edu.springframework.messagesender.config.JavaConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        // 이 패키지 밑에 있는 모든 클래스를 scanning 함.
//        String basePackage = "com.nhnacademy.edu.springframework.messagesender";
//        AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(basePackage);

        // 클래스별로 지정하는 방법
        AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(JavaConfig.class); // from japan으로 출력됨.
            new AnnotationConfigApplicationContext(JavaConfig.class, ServiceConfig.class); // from korea로 출력됨.
//
//        MessageSender smsSender = context.getBean("smsMessageSender", MessageSender.class);
//        MessageSender emailSender = context.getBean("emailMessageSender", MessageSender.class);

        // Refactoring에 유리한 방식 - 이름만 가져오면 되니까.
        MessageSender smsSender = MessageSender.class.cast(context.getBean("smsMessageSender"));
        MessageSender emailSender = MessageSender.class.cast(context.getBean("emailMessageSender"));
        MessageSender dooraySender = MessageSender.class.cast(context.getBean("doorayMessageSender"));

        User user = new User("2022@1013", "15-50");
        String msg = "good bye";

        smsSender.sendMessage(user, msg);
        emailSender.sendMessage(user, msg);
        dooraySender.sendMessage(user, msg);

//        MessageSendService service = context.getBean(MessageSendService.class);
//        service.doSendMessage();

        // 빈 찍어보기
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        context.getBeanFactory().getBeanNamesIterator().forEachRemaining(
//            System.out::println
//        );
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    }
}