package com.stan.controller;


import com.alibaba.fastjson.JSONObject;
import com.stan.annotation.UserLoginToken;
import com.stan.dao.User;
import com.stan.service.TokenService;
import com.stan.service.UserService;
import com.stan.util.TokenUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/api")
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    @GetMapping(value = "/test")
    public void test(){
        System.out.println("我拉了");
    }

    @PostMapping(value = "login")
    public void login(@RequestBody User user){
        System.out.println(user);
    }

    @ApiOperation(value = "token登录", notes = "登录")
    @GetMapping(value = "/loginToken")
    public Object loginToken(User user, HttpServletResponse response){
        JSONObject jsonObject = new JSONObject();
        User userForBase = new User();
        userForBase.setUserId(userService.findByUsername(user).getUserId());
        userForBase.setUserName(userService.findByUsername(user).getUserName());
        userForBase.setUserPassword(userService.findByUsername(user).getUserPassword());
        if (!userForBase.getUserPassword().equals(user.getUserPassword())){
            jsonObject.put("message","登录失败，密码错误");
            return jsonObject;
        }else {
            String token=tokenService.getToken(userForBase);
            jsonObject.put("token",token);
            Cookie cookie = new Cookie("token", token);
            cookie.setPath("/");
            response.addCookie(cookie);
            return jsonObject;
        }
    }

    /**
     * 这个请求需要验证token才能访问
     * @return 信息
     */
    @UserLoginToken
    @ApiOperation(value = "获取信息",notes = "获取信息")
    @GetMapping(value = "/getMessage")
    public String getMessage(){
        //取出token中带的用户id 进行操作
        System.out.println(TokenUtil.getTokenUserId());
        return "您已通过验证";
    }

}
