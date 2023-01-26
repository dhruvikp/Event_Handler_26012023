package com.simplilearn.eventhandler;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventListener {
	
	@EventListener
	public void onAppContextStarted(ContextStartedEvent cse) {
		System.out.println("sending an email.. logic here...");
	}
	
	@EventListener
	public void onAppContextStarted1(ContextStartedEvent cse) {
		System.out.println("sending an sms.. logic here...");
	}

	@EventListener
	public void onAppContextStarted1(ContextStoppedEvent cse) {
		System.out.println("Context stopped event executed..");
	}
}
