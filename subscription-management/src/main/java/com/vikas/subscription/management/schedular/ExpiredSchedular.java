package com.vikas.subscription.management.schedular;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vikas.subscription.management.configuration.SubscriptionConfig;
import com.vikas.subscription.management.controller.SubscriptionContoller;

@Component
public class ExpiredSchedular {

	private static final Logger logger = LoggerFactory.getLogger(SubscriptionContoller.class);

	@Autowired	SubscriptionConfig config;
	
	@Scheduled(initialDelay = 5000, fixedDelay = 15000)
	public void markExpired()
	{
		logger.info("current api key: {} ", config.getApiKey());
	}
	
}
