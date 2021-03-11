package com.stan.controller;

import com.stan.dao.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class LoginController {

    @GetMapping(value = "/test")
    public void test(){
        System.out.println("我拉了");
    }

    @PostMapping(value = "login")
    public void login(@RequestBody User user){
        System.out.println(user);
    }
}
