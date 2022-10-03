package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stringlength {

	public static void main(String[] args) {
		
		ArrayList<Integer>al = new ArrayList<>();
		al.add(10);
		al.add(1);
		al.add(9);
		al.add(18);
		al.add(15);
		al.add(12);
		al.add(11);
		al.add(8);
		
		
	List<Integer>list =al.stream().filter(i->i%2==0).collect(Collectors.toList());
    System.out.println(al);
    
    Predicate<Integer> p =(k)->k%2==0;
    
    for(Integer i:al) {
    	if(p.test(i)) {
    		System.out.println(i);
    	}	
    }

		
		
	}

	
}
