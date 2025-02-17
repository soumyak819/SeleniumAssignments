package com.selenium.locators;

public class Assignment25 {

	public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        
        long exp = n; // Convert to long to handle edge case of Integer.MIN_VALUE
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        
        double result = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1) { // If exponent is odd
                result *= x;
            }
            x *= x;  // Square the base
            exp /= 2; // Halve the exponent
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));  // Output: 1024.00000
        System.out.println(myPow(2.10000, 3));   // Output: 9.26100
        System.out.println(myPow(2.00000, -2));  // Output: 0.25000
    }
}