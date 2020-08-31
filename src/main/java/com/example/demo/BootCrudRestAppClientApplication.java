package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.client.BookServiceClient;

@SpringBootApplication
public class BootCrudRestAppClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(BootCrudRestAppClientApplication.class, args);
		BookServiceClient service=	ctx.getBean(BookServiceClient.class);
		service.saveBook();
	}

}
