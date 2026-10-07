package com.javaintro;

import java.util.Scanner;

public class ForLoop3 {
	
	// Fibonacci series

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int result = Fibonacci(n);
		
		sc.close();
		
		System.out.println(result);
		
	}
	
	static int Fibonacci(int n)
	{
		
		int start = 0;
		int c = 0 ;
		int next = 1;
		
		for(int i = 1; i <= n; i++)
		{
			
			System.out.print(start+" ");
			c = start+next;
			
			start = next;
			next = c;
		}
		
		return c;
	}

}
