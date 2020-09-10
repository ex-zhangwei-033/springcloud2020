package com.zhangwei.example.springbootdemo80.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-demo-80
 * @description
 * @author: 张伟
 * @create: 2020-09-10 22:33
 **/
@RestController
public class MyController {

    @GetMapping("/hello")
    private String hello(){
        return "Hello World";
    }
}
