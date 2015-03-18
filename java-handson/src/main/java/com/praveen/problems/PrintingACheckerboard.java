package com.praveen.problems;

import java.util.Scanner;
/**
 * Solution to Printing a checkerboard problem.
 * Ref: http://www.programmr.com/printing-checkerboard
 * 
 * @author PRAVEEN
 *
 */
public class PrintingACheckerboard {
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		int n = in.nextInt();
		String[] s = { "_%", "%_" };
		String pattern;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				pattern = s[i%2];
				for (int j = 1; j <= n; j++) {
					System.out.print(pattern);
				}
				System.out.println();
			}
		} else {
			System.out.println("Enter correct input");
		}
		in.close();
	}
}
