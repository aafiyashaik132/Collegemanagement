package com.cms.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String register(String user) {
        return "User Registered Successfully";
    }

    public String login(String user) {
        return "Login Successful";
    }
}
