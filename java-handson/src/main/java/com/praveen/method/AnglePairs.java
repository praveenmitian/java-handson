package com.praveen.method;

import java.util.Scanner;

/**
 * 
 * This class used to find complementary and supplementary angles.
 * 
 * @author PRAVEEN
 *
 */
public class AnglePairs {

	/**
	 * 
	 * This method check for complementary and supplementary angles.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return boolean.
	 */
	public static boolean anglePairs(int a, int b, int c) {
		return (((a + b) == 90 || (b + c) == 90 || (a + c) == 90) && ((a + b) == 180
				|| (b + c) == 180 || (a + c) == 180));
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		boolean s;
		System.out.println("Enter any three angles:");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		s = anglePairs(x, y, z);
		System.out.println("anglePairs(" + x + " " + y + " " + z
				+ ") has complementary and supplementary angles:" + s);
		scanner.close();
	}

}
