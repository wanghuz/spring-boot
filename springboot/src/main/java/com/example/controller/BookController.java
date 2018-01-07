package com.example.controller;

import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zero on 2018/1/7.
 */

@RestController
public class BookController {

	@Autowired
	private Book book;

	@RequestMapping("/book")
	private Book book(){

		return book;
	}
}
