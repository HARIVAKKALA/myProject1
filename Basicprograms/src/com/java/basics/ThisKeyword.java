package com.java.basics;

public class ThisKeyword {

	public ThisKeyword() {
		System.out.println("THis is default constructor");
	}
public ThisKeyword(int x){
	this();
	System.out.println(x);
	}
	public static void main(String[] args) {
	ThisKeyword t = new ThisKeyword(10);	
	int in  =10;
	System.out.println(in);	
	}
}
