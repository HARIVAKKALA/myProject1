package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int lid;
	private String laptop;

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLaptop() {
		return laptop;
	}
	public void setLaptop(String laptop) {
		this.laptop = laptop;
	}
	public void compile() {
		System.out.println("This is compiler method");
	}
}
