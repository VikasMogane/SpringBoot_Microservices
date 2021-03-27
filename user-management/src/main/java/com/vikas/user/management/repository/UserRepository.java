package com.vikas.user.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vikas.user.management.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{

}
