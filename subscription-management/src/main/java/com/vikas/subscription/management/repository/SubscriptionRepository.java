package com.vikas.subscription.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vikas.subscription.management.entity.Subscription;

@Repository
public interface SubscriptionRepository extends MongoRepository<Subscription, String>
{

	Subscription findByUserId(String userId);

}
