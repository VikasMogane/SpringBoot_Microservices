package com.vikas.subscription.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vikas.subscription"})
public class SubscriptinManagementApplication 
{
    public static void main( String[] args )
    {
       
    	SpringApplication.run(SubscriptinManagementApplication.class, args);
    }
}
