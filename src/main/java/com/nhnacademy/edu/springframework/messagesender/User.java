package com.nhnacademy.edu.springframework.messagesender;

public class User {
    final String email;
    final String phoneNumber;

    public User(String email, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
