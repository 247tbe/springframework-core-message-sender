package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DoorayMessageSender implements MessageSender {

    @Override
    public boolean sendMessage(User user, String Message) {
        new DoorayHookSender(new RestTemplate(), "https://hook.dooray.com/services/3036349505739914786/3371740733259172017/cdnzcggTTWmx2GtusEMUJw")
                .send(DoorayHook.builder()
                    .botName("정세현")
                    .text("2주간 고생 많으셨습니다!!")
                    .build());

        return true;
    }
}
