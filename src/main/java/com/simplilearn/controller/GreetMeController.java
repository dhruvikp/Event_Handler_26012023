package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.publisher.SweetPublisher;

@Controller
public class GreetMeController {

	@Autowired
	SweetPublisher publisher;
	
	@GetMapping("/buys/car")
	public String publishEvent() {
		publisher.publish();
		//invoke dhruvik
		//invoke abhay
		//invoke pratibha
		
		
		return "sweet-distributed";
	}
}
