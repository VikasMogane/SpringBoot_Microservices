package com.vikas.user.management.entity;

import java.time.Instant;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="user")
public class User
{
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private Date createdDate;
	
}
