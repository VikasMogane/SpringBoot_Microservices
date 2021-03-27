package com.vikas.user.management.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vikas.user.management.controller.UserContoller;
import com.vikas.user.management.payload.UserPayload;

@Service
public class UserService 
{

	private static final Logger logger = LoggerFactory.getLogger(UserContoller.class);

	private UserPayload createUser(UserPayload payload)
	{
		if(StringUtils.isEmpty(payload.getClass()))
		{
			
		}
		return null;
	}
	
	
}
