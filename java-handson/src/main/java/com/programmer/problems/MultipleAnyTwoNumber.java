package com.programmer.problems;

import java.util.Scanner;

/**
 * This class demonstrate multiplication of two number.
 * 
 * @author PRAVEEN
 *
 */
public class MultipleAnyTwoNumber {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int product;

		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();

		product = num1 * num2;

		System.out.println("The product of the two numbers is:" + product);
		scanner.close();
	}

}
