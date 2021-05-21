package io.carwashsystem.adminservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.adminservice.model.AdminDetails;


public interface AdminRepository extends MongoRepository<AdminDetails, Integer> {

}
