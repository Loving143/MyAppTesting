package com.example.MyApp;

import com.example.MyApp.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyAppApplication {

	// here we have created a method for SB to inject the object of it using
	// @Bean annotation
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}

	public static void main(String[] args) {

	 	ApplicationContext applicationContext = SpringApplication.run(MyAppApplication.class, args);
		 HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		System.out.println(helloWorld.helloWorld());
	}

}
