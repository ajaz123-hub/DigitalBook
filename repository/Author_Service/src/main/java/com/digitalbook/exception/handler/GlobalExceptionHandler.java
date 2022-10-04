package com.digitalbook.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.digitalbook.exception.AuthorServiceException;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AuthorServiceException.class)
	public ResponseEntity<?> handleException(AuthorServiceException e) {
		return ResponseEntity.ok(new ErrorResponse(e.getMessage(), e.getClass().toString()));
	}
}
