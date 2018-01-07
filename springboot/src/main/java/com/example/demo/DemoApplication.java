package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = {EnableAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example.model"})  //启动加载注解包
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
