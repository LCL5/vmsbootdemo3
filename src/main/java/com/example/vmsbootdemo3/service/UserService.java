package com.example.vmsbootdemo3.service;

import com.example.vmsbootdemo3.bean.User;


public interface UserService {
    //登录查询
    User Login(String name, String password);
}
