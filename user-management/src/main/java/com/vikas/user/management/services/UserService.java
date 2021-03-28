package com.vikas.user.management.services;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.vikas.user.management.controller.UserContoller;
import com.vikas.user.management.entity.User;
import com.vikas.user.management.payload.SubscriptionPayload;
import com.vikas.user.management.payload.UserPayload;
import com.vikas.user.management.repository.UserRepository;

@Service
public class UserService 
{

	private static final Logger logger = LoggerFactory.getLogger(UserContoller.class);
	
	@Autowired
	protected UserRepository userRepository;
	
	@Autowired
	protected RestTemplate restTemplate;
	
	
	public UserPayload createUser(UserPayload payload)
	{
		if(StringUtils.isEmpty(payload.getFirstName())|| StringUtils.isEmpty(payload.getLastName())|| payload.getAge()==null|| payload.getAge()<18)
		{
			throw new IllegalArgumentException("Invalid Data");
		}
		
		User user = payload.mapToModel();
		user.setCreatedDate(new Date());
		userRepository.save(user);
		
		return new UserPayload(user);
	}
	
	
	public UserPayload getUser(String userId)
	{
		User user = userRepository.findOne(userId);
		
		if(user == null)
		{
			throw new IllegalArgumentException();
		}
		SubscriptionPayload subscriptionpayload = getSubscription(userId);
		
		
		return new UserPayload(user,subscriptionpayload);
		
	}
	
	private SubscriptionPayload getSubscription(String userId)
	{
		String url ="http://localhost:8082/subscription/user/"+userId;
		
		ResponseEntity<SubscriptionPayload> responseEntity;
		try {
			responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, SubscriptionPayload.class);
			logger.info("Get Enterprise response status: {}", responseEntity.getStatusCode());
			return responseEntity.getBody();
		} catch (HttpStatusCodeException exception) {
			logger.error("Get Enterprise response status : {} & body : {}", exception.getStatusCode(),
					exception.getResponseBodyAsString());
		} catch (ResourceAccessException resourceAccessException) {
			throw new ResourceAccessException("Internal Server Error");
		}
		return null;
	}
	
}
