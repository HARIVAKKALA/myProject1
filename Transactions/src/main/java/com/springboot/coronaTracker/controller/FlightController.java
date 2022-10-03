package com.springboot.coronaTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.coronaTracker.Service.FlightBookingService;
import com.springboot.coronaTracker.dto.FlightBookingAcknowledgement;
import com.springboot.coronaTracker.dto.FlightBookingRequest;

@RestController
@EnableTransactionManagement
public class FlightController {
	
	@Autowired
	FlightBookingService flightBookingService;
	
	@PostMapping("/bookflight")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
			
		return flightBookingService.bookFlightTicket(request);
	}
}
