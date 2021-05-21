package io.carwashsystem.userservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

@Document(collection="Ratings")
public class Ratings {
	
	@Id
	@NotEmpty(message = "Rating must not be empty")
	static
	int rating;
	
	@NotEmpty(message = "Name must not be empty")
	static
	String washerName;
	static String comment;
	
	public static int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		Ratings.rating = rating;
	}
	public static String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		Ratings.washerName = washerName;
	}
	public static String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		Ratings.comment = comment;
	}
	
	@Override
	public String toString() {
		return "RatingDetails [rating=" + rating + ", washerName=" + washerName + ", comment=" + comment + "]";
	}
	
}
