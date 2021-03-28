package com.vikas.user.management.payload;

import java.util.Date;

import com.vikas.user.management.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter  @AllArgsConstructor @NoArgsConstructor

public class UserPayload {

	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private Date createdDate;
	
	private SubscriptionPayload subscriptions;
	
	
	public User mapToModel() {
		
		return  new User(getFirstName(),getLastName(),getAge());
	}
	
	public UserPayload(User user) 
	{
		setId(user.getId());
		setFirstName(user.getFirstName());
		setLastName(user.getLastName());
		setAge(user.getAge());
		setCreatedDate(user.getCreatedDate());
	}
	

	public UserPayload(User user, SubscriptionPayload subscriptionpayload) {
		this(user);
		setSubscriptions(subscriptionpayload);
	}
	
}
