package com.programmer.problems;

import java.util.Scanner;

/**
 * This class used to check a number odd or even.
 * 
 * @author PRAVEEN
 *
 */
public class EvenOrOdd {

	private static String[] ODD_EVEN = { "Even", "Odd" };

	/**
	 * This method check number odd or even without if.
	 * 
	 * @param num
	 */
	private void oddEvenWithoutIf(int num) {
		System.out.println(ODD_EVEN[num % 2]);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b = 16;
		Scanner in = new Scanner(System.in);
		double n = Math.sqrt(b);
		System.out.println(n);
		System.out.println("Enter the number...");
		a = in.nextInt();
		if (a % 2 == 0) {
			System.out.println("Given number is even");
		} else
			System.out.println("Given number is odd");
	}
}
