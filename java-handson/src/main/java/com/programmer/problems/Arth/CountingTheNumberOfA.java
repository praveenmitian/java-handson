package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate count number of 'a' in string.
 * 
 * @author PRAVEEN
 *
 */
public class CountingTheNumberOfA {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println("Number of a's: " + count);
		sc.close();
	}
}
