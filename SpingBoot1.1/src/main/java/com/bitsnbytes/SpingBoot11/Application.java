package com.bitsnbytes.SpingBoot11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		MyApp a1 = context.getBean(MyApp.class);
		a1.run();
	}
}
