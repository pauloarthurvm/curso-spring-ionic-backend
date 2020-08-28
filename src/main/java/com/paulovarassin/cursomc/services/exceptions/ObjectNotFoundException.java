package com.paulovarassin.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
