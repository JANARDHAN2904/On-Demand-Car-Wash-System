package io.carwashsystem.washerservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.carwashsystem.washerservice.model.WasherDetails;
import io.carwashsystem.washerservice.repo.WasherRepository;


@Service
public class WasherService {

	@Autowired
	private WasherRepository repository;
	

	public WasherDetails addWasher(WasherDetails washer) {
		return repository.save(washer);
	}

	public List<WasherDetails> getwashers() {
		List<WasherDetails> washers = repository.findAll();
		System.out.println("Getting data from DB : " + washers);
		return washers;
	}

	public List<WasherDetails> getwasherbylocation(String location) {
		return repository.findBylocation(location);
	}

	public void deletewasher(WasherDetails washer) {
		repository.delete(washer);
	}
}