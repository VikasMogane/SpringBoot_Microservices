package com.vikas.user.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sun.corba.se.spi.activation.Repository;

@Controller
public class UserContoller {

	private static final Logger logger = LoggerFactory.getLogger(UserContoller.class);
	
	@GetMapping(value ="/name/{fname}/welcome")
	public ResponseEntity<String> getMessage( @PathVariable String fname)
	{
		logger.info("Welcome   "+fname);
		return new ResponseEntity<>("Welcome to  user controller : "+fname.toUpperCase(),HttpStatus.OK);
	}

	
}
