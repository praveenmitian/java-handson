package com.praveen.method;

import java.util.Scanner;

/**
 * This class used to find prime number between user defined input.
 * 
 * @author PRAVEEN
 *
 */

public class PrimeNoChallange {
	/**
	 * This method used to find number is prime or not.
	 * 
	 * @param n
	 * @return boolean.
	 */

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Printing prime number from n to m:");
		System.out.println("Enter n and m");
		int n = in.nextInt();
		int m = in.nextInt();
		if (m > n) {
			for (int number = n; number <= m; number++) {

				if (isPrime(number)) {
					System.out.println(number + " <");
				} else
					System.out.println(number);
			}
		} else {
			System.out.println("Enter correct starting value");
		}
		in.close();
	}
}
