package com.javaintro;

import java.util.Scanner;

public class ForLoop2 {
	
	// Finding factorial for nth number
	
	
	public static void main(String[] args) {
		
		System.out.println("enter number");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int result = nthFactorial(n);
		
		System.out.println("The factorial number is "+ result);
		
		sc.close();
		
	}
	
	static int nthFactorial(int n){
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		
		
		return fact;
	}

}
