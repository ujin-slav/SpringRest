package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.entity.UserEntity;

public interface UserRepo extends MongoRepository<UserEntity,String> {
}