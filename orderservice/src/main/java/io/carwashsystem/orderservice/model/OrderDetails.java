package io.carwashsystem.orderservice.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Orderdetails")
public class OrderDetails {
	
	@Id
	@NotEmpty(message = "Order Id must not be empty")
	int orderId;
	
	@NotEmpty(message = "carName must not be empty")
	String carName;

	@NotEmpty(message = "car model must not be empty")
	String carModel;
	
	@NotEmpty(message = "Washer Name must not be empty")
	String washerName;

	@NotEmpty(message = "wash pack must not be empty")
	int washpackId;

	@NotEmpty(message = "date must not be empty")
	int date;
	
	@NotEmpty(message = "phone no must not be empty")
	int phoneNo;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getWasherName() {
		return washerName;
	}
	public void setWasherName(String washerName) {
		this.washerName = washerName;
	}
	public int getWashpackId() {
		return washpackId;
	}
	public void setWashpackId(int washpackId) {
		this.washpackId = washpackId;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", carName=" + carName + ", carModel=" + carModel + ", washerName="
				+ washerName + ", washpackId=" + washpackId + ", date=" + date + ", phoneNo=" + phoneNo + "]";
	}
	
	
}

	
	