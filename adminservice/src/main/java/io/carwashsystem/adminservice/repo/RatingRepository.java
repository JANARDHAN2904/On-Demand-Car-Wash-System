package io.carwashsystem.adminservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.adminservice.model.Ratings;

public interface RatingRepository extends MongoRepository<Ratings, String> {

	

}

