package com.example.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zero on 2018/1/1.
 */

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/say")
    public String say(){
        return "hello world";
    }
}
