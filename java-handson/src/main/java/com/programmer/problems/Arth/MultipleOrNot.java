package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class used to check second user entered number is multiple of first.
 * 
 * @author PRAVEEN
 *
 */
public class MultipleOrNot {

	/**
	 * Method check multiple of not.
	 * 
	 * @param x
	 * @param y
	 * @return boolean
	 */
	public static boolean multiples(int x, int y) {
		return (y % x == 0) ? true : false;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = scanner.nextInt();
		System.out.println("Enter second number:");
		int y = scanner.nextInt();

		System.out.println(multiples(x, y));
		scanner.close();
	}

}
