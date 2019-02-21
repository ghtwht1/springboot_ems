package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public String login(User user){
        System.out.println(user);
        boolean flag = userService.select(user.getUsername(), user.getPassword());
        if(flag){
            return "emplist";
        }else{
            return "login";
        }
    }
}
