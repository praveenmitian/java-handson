package com.programmer.problems;

import java.util.Scanner;

/**
 * This class demonstrate check prime number or not.
 * 
 * @author PRAVEEN
 *
 */
class PrimeNumberOrNot {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("Enter the number to evaluate for prime number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= n / 2; i++) {
			System.out.println(i);
			if (n % i == 0) {
				System.out.println(n + " is not a Prime Number ");
				return;
			}
		}
		System.out.println(n + " is a Prime Number ");

		sc.close();
	}
}
