package com.onlinecake.order.webservices.onlinecakeorderwebservices.repository;

public class UserNotFoundException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
