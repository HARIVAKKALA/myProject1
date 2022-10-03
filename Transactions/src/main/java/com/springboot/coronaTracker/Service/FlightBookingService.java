package com.springboot.coronaTracker.Service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.coronaTracker.dto.FlightBookingAcknowledgement;
import com.springboot.coronaTracker.dto.FlightBookingRequest;
import com.springboot.coronaTracker.entity.PassengerInfo;
import com.springboot.coronaTracker.entity.PaymentInfo;
import com.springboot.coronaTracker.repository.PassengerInfoRepository;
import com.springboot.coronaTracker.repository.PaymentInfoRepository;
import com.springboot.coronaTracker.utils.PaymentUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInforesInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Autowired
	PaymentUtils paymentUtils;
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
	    passengerInfo=passengerInforesInfoRepository.save(passengerInfo);
	    PaymentInfo paymentInfo = request.getPaymentInfo();
	    
	    /*The below method validates the payment information*/
	    
	    PaymentUtils.validateCreditLimit(paymentInfo.getAccountNumber(), passengerInfo.getFare());
	    
	    paymentInfo.setPassengerId(passengerInfo.getId());
	    paymentInfo.setAmount(passengerInfo.getFare());
	    paymentInfoRepository.save(paymentInfo);
	    
	    return new FlightBookingAcknowledgement("success",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
	    
	}
}
