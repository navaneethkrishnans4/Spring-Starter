package com.niit.WebDemo;

import com.niit.WebDemo.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WebDemoApplication {

	private static MessageService messageService;
	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(WebDemoApplication.class, args);
		messageService= context.getBean("messageService",MessageService.class);
		String message = messageService.goodDay();
		System.out.println(message);
	}

}
