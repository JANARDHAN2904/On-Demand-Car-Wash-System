package io.carwashsystem.userservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.carwashsystem.userservice.model.Userdetails;
import io.carwashsystem.userservice.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public Userdetails addUser(Userdetails user) {
		return repository.save(user);
	}

	public List<Userdetails> getUsers() {
		List<Userdetails> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}
	public void deleteUser(Userdetails user) {
		repository.delete(user);
	}

	public void deleteById(int id) {
		repository.deleteById(id);
		
	}
}