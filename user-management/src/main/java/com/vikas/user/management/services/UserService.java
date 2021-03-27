package com.vikas.user.management.services;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vikas.user.management.controller.UserContoller;
import com.vikas.user.management.entity.User;
import com.vikas.user.management.payload.UserPayload;
import com.vikas.user.management.repository.UserRepository;

@Service
public class UserService 
{

	private static final Logger logger = LoggerFactory.getLogger(UserContoller.class);
	
	@Autowired
	protected UserRepository userRepository;
	
	
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
	
	
}
