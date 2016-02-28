package com.formation.spring.technique;

public class StringMessage implements IMessage {
	private String message;
	public StringMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StringMessage(String message) {
		super();
		this.message = message;
	}
	public Object getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	@Override
	public String toString() {
		return "StringMessage [message=" + message + "]";
	}

	

	
}
