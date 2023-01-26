package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventHandling26012023Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EventHandling26012023Application.class, args);
		context.start();
		
		//context.stop();
	}

}
