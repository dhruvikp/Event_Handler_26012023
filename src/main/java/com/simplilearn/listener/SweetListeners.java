package com.simplilearn.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class SweetListeners {

	@EventListener
	public void dhruvik(SweetEvent se) {
		System.out.println("Dhruvik received sweet");
	}
	
	@EventListener
	public void khushboo(SweetEvent se) {
		System.out.println("Khushboo received sweet");
	}

	@EventListener
	public void vibhore(SweetEvent se) {
		System.out.println("Vibhore received sweet");
	}
	
	@EventListener
	public void abhay(SweetEvent se) {
		System.out.println("Abhay received sweet");
	}
}
