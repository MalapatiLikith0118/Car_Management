package com.javaintro;

import java.util.Scanner;

public class ForLoop5 {
	
	// samllest prime number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a starting number");
		int start = sc.nextInt();
		
		System.out.println("enter a ending number");
		int end = sc.nextInt();
		
		int count = PrimeNumber(start, end);
		
		System.out.println(count);
		
		sc.close();
		
	}

	 static int PrimeNumber(int start, int end) {
		
		 int count = 0;
		 int n;
		 
		 for( n = start; n <= end; n++) {
			 
			 
			 for(int i = 1; i<= n; i++) {
				 
				 
				 if(n % i == 0) {
					 count++;
				 }
			 }
			 if(count == 2)
				 return n;
		 }
		 
		 
		 return -1;
	}
		

}
