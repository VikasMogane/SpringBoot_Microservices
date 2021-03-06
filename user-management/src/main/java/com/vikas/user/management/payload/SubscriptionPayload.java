package com.vikas.user.management.payload;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter  @AllArgsConstructor @NoArgsConstructor
public class SubscriptionPayload {

	@Id
	private Date startDate;
	private Date expiryDate;
	
		
}
