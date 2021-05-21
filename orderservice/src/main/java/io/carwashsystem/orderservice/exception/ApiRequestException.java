package io.carwashsystem.orderservice.exception;

public class ApiRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApiRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApiRequestException(String message) {
		super(message);
	}
	
	

}
