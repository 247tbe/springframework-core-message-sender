package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {JavaConfig.class})
public class TestMessageSendServiceIntegration {
    @Autowired
    private MessageSendService service;

    @Mock
    private MessageSender sender;

    @Test
    public void test() {
        MockitoAnnotations.initMocks(this);


        service.doSendMessage();
    }
}
