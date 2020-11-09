package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {
	
	//add an exception handler for customerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException e){
		
		//create customerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
													HttpStatus.NOT_FOUND.value(),
													e.getMessage(),
													System.currentTimeMillis()
												);
		
		//return response entity
		
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	//add another exception handler ... to catch any exception 
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(Exception e){
		
		//create customerErrorResponse
		CustomerErrorResponse error = new CustomerErrorResponse(
													HttpStatus.BAD_REQUEST.value(),
													e.getMessage(),
													System.currentTimeMillis()
												);
		
		//return response entity
		
		return new ResponseEntity<CustomerErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
}
