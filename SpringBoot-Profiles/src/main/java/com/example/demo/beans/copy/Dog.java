package com.example.demo.beans.copy;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dog")
public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Bow......");
	}

}
