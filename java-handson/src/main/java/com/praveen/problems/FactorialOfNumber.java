package com.praveen.problems;

import java.util.Scanner;

/**
 * Find factorial of number.
 * 
 * @author PRAVEEN
 *
 */
public class FactorialOfNumber {

	/**
	 * Factorial using recursion.
	 * 
	 * @param n
	 * @return
	 */
	public static int fact(int n) {
		if (n == 1)
			return 1;
		return n = n * fact(n - 1);
	}

	/**
	 * Factorial using loop.
	 * 
	 * @param n
	 * @return
	 */
	public static int factWithoutRecursion(int n) {
		int fact = 1;
		if (n >= 0) {
			for (int c = 1; c <= n; c++)
				fact = fact * c;
		} else {
			return n;
		}
		return fact;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Enter an integer to calculate it's factorial");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		System.out.println(fact(number));
		System.out.println(factWithoutRecursion(number));
		in.close();
	}
}
