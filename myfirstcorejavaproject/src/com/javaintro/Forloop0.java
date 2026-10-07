package com.javaintro;

import java.util.Scanner;
// Write a Java program to find the sum of all numbers 
// from 1 to N that are divisible by both 3 and 5 using a for loop.

public class Forloop0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int n = sc.nextInt();
		
		int result = sumOfNum(n);
		
		System.out.println("total sum of that divisible is "+ result);
		
		sc.close();
	}

	static int sumOfNum(int n) {
		int sum = 0;
		
		for (int i =1; i<=n;i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				sum = sum+i;
			}
		}
				return sum;
				
	}

}
