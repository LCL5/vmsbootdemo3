package com.example.vmsbootdemo3;

import com.example.vmsbootdemo3.bean.User;
import com.example.vmsbootdemo3.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Vmsbootdemo3ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.Login("zhangsan", "123456");
        System.out.println("该用户ID为：");
        System.out.println(user.getId());
    }
}
