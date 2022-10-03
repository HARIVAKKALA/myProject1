package com.example.demo.beans.copy;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class Cat implements Animal {

	@Override
	public void makeSound() {
		System.out.println("mew......");
	}

}
