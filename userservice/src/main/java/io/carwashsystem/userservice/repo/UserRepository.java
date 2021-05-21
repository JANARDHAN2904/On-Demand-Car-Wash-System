package io.carwashsystem.userservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.userservice.model.Userdetails;

public interface UserRepository extends MongoRepository<Userdetails, Integer> {

	Userdetails findByName(String name);


}

