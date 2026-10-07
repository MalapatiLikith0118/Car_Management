package com.javaintro;

import java.util.Scanner;

public class ForLoop4 {
	
	// finding N th prime number
	
	
	 static int NthPrimeNumber(int n) {
		 
		 int count = 0;
		 
		 for(int i = 1; i <= n; i++)
		 {
			 if(n % i == 0)
				 count++;
		 }
		 
		 return count;
				
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int count = NthPrimeNumber(n);
		
		if (count == 2)
			System.out.println("its prime number");
		else
			System.out.println("no its not a prime number");
		sc.close();
		
	}

	
}
