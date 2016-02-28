package com.formation.spring.technique;

public class ConsoleNotification implements INotification {

	
	public void notify(IMessage msg) {
		
		System.out.println(msg.toString());
	}
	
	

}
