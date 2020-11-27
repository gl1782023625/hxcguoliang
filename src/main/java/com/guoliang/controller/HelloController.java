package com.guoliang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gl
 * @Date: 2020/11/27 14:05
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
