package com.teamproject.teamproject01.controller;

import com.teamproject.teamproject01.entity.User;
import com.teamproject.teamproject01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Timestamp;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"", "/"})
    public String index(){
        return "index";
    }

    //loginForm 이동
    @GetMapping("login")
    public String loginForm(){
        return "user/login";
    }

    //joinForm 이동
    @GetMapping("join")
    public String joinForm(){
        return "user/join";
    }
    //회원가입
    @PostMapping("join")
    public String join(User user){
        user.setUserBuyPoint(0);
        user.setUserClass("준회원");
        user.setUserAuth("ROLE_USER");
        user.setUserRegdate(new Date(System.currentTimeMillis()));
        userService.join(user);
        return "success";
    }
}
