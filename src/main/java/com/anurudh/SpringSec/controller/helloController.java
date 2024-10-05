package com.anurudh.SpringSec.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class helloController {
    @GetMapping("/")
    public String greet(HttpServletRequest  request) {
        return "Welcome to spring security peoject with session ID::"+request.getSession().getId();
    }
    
}
