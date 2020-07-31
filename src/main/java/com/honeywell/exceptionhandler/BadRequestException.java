package com.honeywell.exceptionhandler;

/**
 * This is a custom exception class for handling Bad request error scenarios
 * @author yogmalho
 *
 */
public class BadRequestException extends RuntimeException {
	

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -1560699933185708849L;

	
	/**
	 * Constructor for BadRequestException
	 * @param message : Error message
	 */
	public  BadRequestException(String message) {
		super(message);
	}
}
