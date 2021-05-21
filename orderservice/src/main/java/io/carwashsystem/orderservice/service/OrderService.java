package io.carwashsystem.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.carwashsystem.orderservice.model.OrderDetails;
import io.carwashsystem.orderservice.repo.OrderRepository;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	

	public OrderDetails addorder(OrderDetails order) {
		return repository.save(order);
	}

	public List<OrderDetails> getUsers() {
		List<OrderDetails> orders = repository.findAll();
		System.out.println("Getting data from DB : " + orders);
		return orders;
	}
	public void deleteUser(OrderDetails user) {
		repository.delete(user);
	}

	public void deleteById(int id) {
		repository.deleteById(id);
		
	}
}
