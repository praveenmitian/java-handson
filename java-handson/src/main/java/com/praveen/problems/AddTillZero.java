package com.praveen.problems;

import java.util.Scanner;

/**
 * This class used to add user input till enters zero.
 * 
 * @author PRAVEEN
 *
 */

public class AddTillZero {
	/**
	 * Main method.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int n, total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Input");
		while ((n = in.nextInt()) != 0) {
			total += n;
		}
		System.out.println(total);
		in.close();
	}
}
