package com.example.vmsbootdemo3.controller;

import com.example.vmsbootdemo3.bean.User;
import com.example.vmsbootdemo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

    //将Service注入Web层
    @Autowired(required = false)
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String name, String password){
        User user = userService.Login(name,password);
        if(user!=null){
            return "success";
        }else {
            return "failure";
        }
    }
}
