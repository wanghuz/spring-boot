package com.example.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Zero on 2018/1/7.
 */

@Component
@ConfigurationProperties(prefix = "book")  // spring boot 1.5 以上版本 取消了 locations 属性
                                           // 使用 @Pro PropertySource 加载配置文件
@PropertySource("classpath:book.properties")  // 加载配置文件
public class Book {


	private String bookName;

	private String bookDesc;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
}
