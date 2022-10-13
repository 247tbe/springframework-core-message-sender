package com.nhnacademy.edu.springframework.messagesender.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestSms {
    @InjectMocks
    private MessageSendService messageSendService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSms() {
        MessageSender mockSender = new EmailMessageSender();
        MessageSendService service = new MessageSendService(mockSender, "정");
        User user = new User("111", "222");
        String msg = "333";
        when(messageSender.sendMessage(user, msg)).thenReturn(false);
        boolean actual = messageSendService.doSendMessage();
        Assertions.assertThat(actual).isFalse();

//        Mockito.verify(mockSender, Mockito.times(2))
//            .sendMessage(user, msg);
    }
}
