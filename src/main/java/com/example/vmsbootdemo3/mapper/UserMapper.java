package com.example.vmsbootdemo3.mapper;

import com.example.vmsbootdemo3.bean.User;


public interface UserMapper {
    //登录查询
    User getInfo(String name, String password);
}
