package com.example.vmsbootdemo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@MapperScan("com.example.vmsbootdemo3.mapper")
public class Vmsbootdemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Vmsbootdemo3Application.class, args);
    }
}
