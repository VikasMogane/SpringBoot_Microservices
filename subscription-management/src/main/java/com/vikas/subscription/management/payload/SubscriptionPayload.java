package com.vikas.subscription.management.payload;

import java.util.Date;

import org.springframework.data.annotation.Id;

import com.vikas.subscription.management.entity.Subscription;

public class SubscriptionPayload {

	@Id
	private Date startDate;
	private Date expiryDate;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public SubscriptionPayload(Date startDate, Date expiryDate) {
		super();
		this.startDate = startDate;
		this.expiryDate = expiryDate;
	}
	public SubscriptionPayload() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SubscriptionPayload(Subscription subscription) {
		
		if(subscription != null) {
			
			setStartDate(subscription.getStartDate());
			setExpiryDate(subscription.getExpiryDate());
		
		}
	}
	
	
	
	
}
