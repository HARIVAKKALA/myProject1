package com.springboot.coronaTracker.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank(message="name must be provided")
	private String name;
	
	@NotBlank(message="emial must be provide")
	private String email;
	
	@NotBlank(message="source must be provide")
	private String source;
	
	@NotBlank(message="destination must be provide")
	private String destination;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern ="dd-mm-yyyy")
	private Date travelDate;
	
	@NotBlank(message="pickup time  must be provide")
	private String pickupTime;
	
	@NotBlank(message="arrival time must be provide")
	private String arrivalTime;
	
	//@NotBlank(message="fare amount must be provide")
	private double fare;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String toString() {
		return "";
	}
}
