package com.nhnacademy.edu.springframework.messagesender.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // beans.xml과 1:1 맵핑하게 해주는 어노테이션
public class MainConfig {
    @Bean /* (name = dbms) */
    public String dbms() {
        return new String("MYSQL");
    }
}
// 위의 설정은 아래의 XML 설정과 동일
/*
* <bean id="dbms" (<- 위의) name class="java.lang.String" (<- 위의 return type)>
        <constructor-arg type="java.lang.String" value="MYSQL" />
* </bean>
*/