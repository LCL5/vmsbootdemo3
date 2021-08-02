package com.example.vmsbootdemo3.serviceimpl;

import com.example.vmsbootdemo3.bean.User;
import com.example.vmsbootdemo3.mapper.UserMapper;
import com.example.vmsbootdemo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)//Autowired自动装配失败时，required = false
    private UserMapper userMapper;
    //登录查询用户
    @Override
    public User Login(String name, String password) {
        return userMapper.getInfo(name,password);
    }
}
