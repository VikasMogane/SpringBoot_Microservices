package com.vikas.subscription.management.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SubscriptionConfig 
{
	@Value("${api.key}")
	private String apikey;
	
	public String getApiKey()
	{
		return apikey;
	}
	
	
	
	
}
