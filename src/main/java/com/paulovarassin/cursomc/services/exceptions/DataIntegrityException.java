package com.paulovarassin.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{

	final long serialVersionUID = 1L;

	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
