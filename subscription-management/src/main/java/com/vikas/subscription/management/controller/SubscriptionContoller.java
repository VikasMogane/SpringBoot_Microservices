package com.vikas.subscription.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.subscription.management.payload.SubscriptionPayload;
import com.vikas.subscription.management.repository.SubscriptionRepository;
import com.vikas.subscription.management.services.SubscriptionService;

@RestController
@RequestMapping("/subscription/user")
public class SubscriptionContoller {

	private static final Logger logger = LoggerFactory.getLogger(SubscriptionContoller.class);
	
	@Autowired
	protected SubscriptionService SubscriptionService;
	
	@GetMapping(value ="/{userId}/default")
	public ResponseEntity<SubscriptionPayload> createUser( @PathVariable String userId)
	{
		logger.info("received request to create Subscription ");
		try
		{
			SubscriptionPayload data  = SubscriptionService.createSubscription(userId);
			return new ResponseEntity<>(data,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);

		}
		
	
	}

	
	@GetMapping(value ="/{userId}")
	public ResponseEntity<SubscriptionPayload> getSubscription( @PathVariable String userId)
	{
		logger.info("Receiver request to get Subscription   ");

		try
		{
		 SubscriptionPayload data  = SubscriptionService.getSubscription(userId);
		 return new ResponseEntity<>(data,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

		}
		
	}
	
	

	
}
