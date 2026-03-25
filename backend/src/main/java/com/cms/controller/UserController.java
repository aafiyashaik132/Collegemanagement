package com.cms.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @GetMapping("/")
    public String home() {
        return "College Management System Backend Running";
    }

    @PostMapping("/login")
    public String login(@RequestBody String user) {
        return "Login Successful";
    }

    @PostMapping("/register")
    public String register(@RequestBody String user) {
        return "User Registered Successfully";
    }
}
