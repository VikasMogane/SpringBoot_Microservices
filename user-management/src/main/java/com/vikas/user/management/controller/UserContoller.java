package com.vikas.user.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {

	private static final Logger logger = LoggerFactory.getLogger(UserContoller.class);
	
	
	@PostMapping(value ="/user")
	public ResponseEntity<String> createUser( @RequestBody String data)
	{
		logger.info("received request to create user ");
		return new ResponseEntity<>("User Created Success",HttpStatus.OK);
	}

	
	@PutMapping(value ="/user/{userId}")
	public ResponseEntity<String> updateUser(
			@PathVariable String userId,
			@RequestBody String data)
	{
		logger.info("received request to update user ");
		return new ResponseEntity<>("User update Success",HttpStatus.OK);
	}
	
	
	@GetMapping(value ="/user/{userId}")
	public ResponseEntity<String> getUserMessage( @PathVariable String userId)
	{
		logger.info("Receiver request to get user   ");
		return new ResponseEntity<>("User get Success : "+userId.toUpperCase(),HttpStatus.OK);
	}
	
	
	@DeleteMapping(value ="/user/{userId}")
	public ResponseEntity<String> deleteUser( @PathVariable String userId)
	{
		logger.info("Receiver request to delete user   ");
		return new ResponseEntity<>("User delete Success : "+userId.toUpperCase(),HttpStatus.OK);
	}

	
}
