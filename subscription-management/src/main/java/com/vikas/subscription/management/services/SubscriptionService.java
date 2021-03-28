package com.vikas.subscription.management.services;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vikas.subscription.management.controller.SubscriptionContoller;
import com.vikas.subscription.management.entity.Subscription;
import com.vikas.subscription.management.payload.SubscriptionPayload;
import com.vikas.subscription.management.repository.SubscriptionRepository;

@Service
public class SubscriptionService 
{

	private static final Logger logger = LoggerFactory.getLogger(SubscriptionContoller.class);
	
	@Autowired
	protected SubscriptionRepository subscriptionRepository;

	public SubscriptionPayload createSubscription(String userId) {

		Subscription subscription = subscriptionRepository.findByUserId(userId);
		
		if(subscription == null)
		{
			subscription = new Subscription();
			subscription.setStartDate(new Date());
			subscription.setExpiryDate(Date.from(Instant.now().plus(7,ChronoUnit.DAYS)));
		}
		else
		{
			subscription.setStartDate(new Date());
			subscription.setExpiryDate(Date.from(Instant.now().plus(7,ChronoUnit.DAYS)));
		}
		subscriptionRepository.save(subscription);
			
		
		return new SubscriptionPayload(subscription);
	}

	public SubscriptionPayload getSubscription(String userId) {

		Subscription subscription = subscriptionRepository.findByUserId(userId);
		return new SubscriptionPayload(subscription);
		
	}
	
	
}
