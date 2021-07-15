package com.example.vmsbootdemo3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vmsbootdemo3.mapper")
public class Vmsbootdemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Vmsbootdemo3Application.class, args);
    }

}
