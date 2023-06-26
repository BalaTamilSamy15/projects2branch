package com.employee2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeException {
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> idCheck() {
		return new ResponseEntity<>("Enployee Not in this Id: ",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DesireDetailsNotFound.class)
	public ResponseEntity<Object> dataFound() {
		return new ResponseEntity<>("Desire Data Not Found: ",HttpStatus.NOT_FOUND);
	}

	
	
}
