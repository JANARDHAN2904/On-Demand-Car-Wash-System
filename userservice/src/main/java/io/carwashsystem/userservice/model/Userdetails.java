package io.carwashsystem.userservice.model;


import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

@Document(collection="Userdata")
public class Userdetails {
	
	@Id
	int id;
	
	@NotEmpty(message = "Name must not be empty")
	String name;
	
	@NotEmpty(message = "Location must not be empty")
	String location;
	
	@NotEmpty(message = "Password must not be empty")
	String password;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Userdetails(int id, String name, String location,String password) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.password = password;
	}
	public Userdetails() {
		super();
	}
	
	@Override
	public String toString() {
		return "Userdetails [id=" + id + ", name=" + name + ", location=" + location + ", password=" + password + "]";
	}
	
	
}
