package com.javaintro;

import java.util.Scanner;

public class ForLoop1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean result = isPerfect(n);

        if (result) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

        sc.close();
    }

    static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}