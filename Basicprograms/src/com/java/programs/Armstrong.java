package com.java.programs;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the number");
		int  num= sc.nextInt();
		int sum = 0;
		int temp=num;
		while(num>0) {
			
			int n = num%10;
			//System.out.println("N value = "+n);
			sum = sum+(n*n*n);
			//System.out.println("Sum = "+sum);
			num=num/10;
			//System.out.println("******num = "+num);
		}
		if(temp==sum)
		{
			System.out.println("This is armstrong number");
		}else {
			System.out.println("Not armstrong number");
		}
		
		

	}

}
