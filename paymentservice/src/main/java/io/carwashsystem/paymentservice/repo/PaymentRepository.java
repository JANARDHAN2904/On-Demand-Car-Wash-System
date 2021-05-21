package io.carwashsystem.paymentservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.paymentservice.model.PaymentDetails;

public interface PaymentRepository extends MongoRepository<PaymentDetails, Integer> {


}

