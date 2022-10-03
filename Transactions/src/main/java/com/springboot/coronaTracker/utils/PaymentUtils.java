package com.springboot.coronaTracker.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.springboot.coronaTracker.Exception.InsufficientAmountException;

@Component 
public class PaymentUtils {
	
	
	private static Map<String ,Double> paymentMap=new HashMap<String,Double>();
	{
		paymentMap.put("acc1",20000.0);
		paymentMap.put("acc2",30000.0);
		paymentMap.put("acc3",50000.0);
		paymentMap.put("acc4",70000.0);
		paymentMap.put("acc5",60000.0);
		paymentMap.put("acc6",10000.0);
   }
   
   public static boolean validateCreditLimit(String accNo,double paidAmount){
	   
	   if(paidAmount>paymentMap.get(accNo)){
		   throw new InsufficientAmountException("insufficient fund....!");
   }else {
	   return true;
   }
  }
}