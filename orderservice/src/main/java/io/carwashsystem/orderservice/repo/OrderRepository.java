package io.carwashsystem.orderservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import io.carwashsystem.orderservice.model.OrderDetails;

public interface OrderRepository extends MongoRepository<OrderDetails, Integer> {

}
