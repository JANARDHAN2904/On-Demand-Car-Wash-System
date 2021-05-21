package io.carwashsystem.washerservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.washerservice.model.WasherDetails;


public interface WasherRepository extends MongoRepository<WasherDetails, Integer> {

	List<WasherDetails> findBylocation(String location);

	WasherDetails findByName(String name);

}
