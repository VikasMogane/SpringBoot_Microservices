package com.vikas.user.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.vikas.user"})
public class UserApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApplication.class, args);
    }
    
    @Bean
    public RestTemplate getRestTemplate()
    {
    	RestTemplate restTemplate = new RestTemplate();
    	restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
    	return restTemplate;
    
    }
    
}
