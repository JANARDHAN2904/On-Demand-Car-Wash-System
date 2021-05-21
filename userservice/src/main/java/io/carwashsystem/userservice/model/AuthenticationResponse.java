package io.carwashsystem.userservice.model;


import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

   
	private static final long serialVersionUID = 1L;
	private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}