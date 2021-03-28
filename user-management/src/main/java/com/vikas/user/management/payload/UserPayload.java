package com.vikas.user.management.payload;

import java.util.Date;

import com.vikas.user.management.entity.User;

public class UserPayload {

	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private Date createdDate;
	
	private SubscriptionPayload subscriptions;
	
	public SubscriptionPayload getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(SubscriptionPayload subscriptions) {
		this.subscriptions = subscriptions;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
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
	
	public UserPayload() 
	{
		
	}
	public UserPayload(User user, SubscriptionPayload subscriptionpayload) {
		this(user);
		setSubscriptions(subscriptionpayload);
	}
	
}
