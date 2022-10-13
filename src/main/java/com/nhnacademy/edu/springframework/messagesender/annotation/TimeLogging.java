package com.nhnacademy.edu.springframework.messagesender.annotation;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TimeLogging {
    String value() default "time";
}
