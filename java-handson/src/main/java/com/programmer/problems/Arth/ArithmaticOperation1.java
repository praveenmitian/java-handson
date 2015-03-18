package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate arthimatic operation.
 * 
 * @author PRAVEEN
 *
 */
public class ArithmaticOperation1 {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int diff = 0;
		int product = 0;
		int quotient = 0;
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		sum = num1 + num2;
		diff = num1 - num2;
		product = num1 * num2;
		quotient = num1 / num2;
		System.out.println("Addition is:" + sum);
		System.out.println("Difference is:" + diff);
		System.out.println("Product is:" + product);
		System.out.println("Quotient is:" + quotient);
		scanner.close();
	}

}
