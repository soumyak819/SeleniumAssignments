package com.selenium.locators;

import java.util.Scanner;

public class Assignment26 {

	public static boolean isPrime(int n) {
        if (n <= 1) return false;  // 1 and negative numbers are not prime
        if (n == 2 || n == 3) return true;  // 2 and 3 are prime numbers
        if (n % 2 == 0 || n % 3 == 0) return false;  // Eliminate multiples of 2 and 3
        
        // Check for factors from 5 to sqrt(n) with step 6 (optimization)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Is " + n + " a prime number? " + isPrime(n));
    }
}
