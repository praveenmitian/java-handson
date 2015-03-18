package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to problem Evenly spaced. Ref:
 * http://www.programmr.com/evenly-spaced
 * 
 * @author PRAVEEN
 *
 */
public class EvenlySpaced {

	/**
	 * Method checks evenly spaced or not.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return boolean
	 */
	public static boolean evenlySpaced(int a, int b, int c) {
		return (b - a) == (c - b);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		boolean s;
		System.out.println("Enter 3 values:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		s = evenlySpaced(a, b, c);
		System.out.println("EvenlySpaced?:" + s);
		scanner.close();
	}
}
