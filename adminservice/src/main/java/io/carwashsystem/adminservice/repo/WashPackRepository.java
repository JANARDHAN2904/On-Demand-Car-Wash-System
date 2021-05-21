package io.carwashsystem.adminservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.adminservice.model.WashPacks;


public interface WashPackRepository extends MongoRepository<WashPacks, Integer> {

}
