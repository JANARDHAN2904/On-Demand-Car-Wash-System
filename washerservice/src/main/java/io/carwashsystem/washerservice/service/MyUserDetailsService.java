package io.carwashsystem.washerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.carwashsystem.washerservice.model.WasherDetails;
import io.carwashsystem.washerservice.repo.WasherRepository;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private WasherRepository repository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
       //WasherDetails washer=repository.findByName(name);
       
       //return new User(washer.getName(),washer.getPassword(),new ArrayList<>());
    	
    	 return new User("user", "user",
                 new ArrayList<>());
    }
}