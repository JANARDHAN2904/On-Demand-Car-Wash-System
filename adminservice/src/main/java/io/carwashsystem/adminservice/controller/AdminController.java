package io.carwashsystem.adminservice.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import io.carwashsystem.adminservice.model.AdminDetails;
import io.carwashsystem.adminservice.model.Ratings;
import io.carwashsystem.adminservice.model.WashPacks;
import io.carwashsystem.adminservice.repo.AdminRepository;
import io.carwashsystem.adminservice.repo.RatingRepository;
import io.carwashsystem.adminservice.repo.WashPackRepository;


@RestController
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private AdminRepository repo;
	
	@Autowired
	private WashPackRepository repo1;
	
	@Autowired
	private RatingRepository repo2;
	
	@PostMapping("/addadmin")
	public String saveadmin(@RequestBody AdminDetails admin)
	{
		repo.save(admin);
		return " Admin saved successfully with id :"+admin.getId();
	}
	
	@GetMapping("/alladmins")
	public List<AdminDetails> getadmin()
	{
		return repo.findAll();
	}
	
	@GetMapping("/alladmins/{id}")
	public Optional<AdminDetails> getadmin(@PathVariable int id)
	{
		return repo.findById(id);
	}
	
	
	@PostMapping("/addpack")
	public String savepack(@RequestBody WashPacks pack)
	{
		repo1.save(pack);
		return " Pack saved successfully with id :"+pack.getId();
	}
	
	@GetMapping("/allpacks")
	public List<WashPacks> getpack()
	{
		return repo1.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletepack(@PathVariable int id)
	{
		repo1.deleteById(id);
		return "pack deleted with id "+id;
	}
	
	@PostMapping("/addrating")
	public String saverating(@RequestBody Ratings rating)
	{
		repo2.save(rating);
		return " Thanks for Your Valuable feedback";
	}
	@GetMapping("/allratings")
	public List<Ratings> getuser()
	{
		return repo2.findAll();
	}
			

	
	@PostMapping("/addwasher")
	public String addwasher() throws RestClientException,IOException {
		
		String baseurl="http://localhost:9090/addwasher";
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> response=null;
		try {
			response=restTemplate.exchange(baseurl,HttpMethod.POST,getHeaders(),String.class);
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
		
		return response.getBody().toString();
	
	}
	private HttpEntity<?> getHeaders() throws IOException{
		HttpHeaders headers=new HttpHeaders();
		headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
		
	}
			
}
