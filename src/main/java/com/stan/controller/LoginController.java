package com.stan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping(value = "/api/test")
    public void test(){
        System.out.println("我拉了");
    }
}
