package com.programmer.problems;

import java.util.Scanner;

/**
 * This class used to check pin in three tries.
 * 
 * @author PRAVEEN
 *
 */
public class DoUKnowPin {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n, pin = 12345, tries = 0;
		for (tries = 1; tries <= 3; tries++) {
			System.out.println("Input");
			n = in.nextInt();
			if (n == pin) {
				System.out
						.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				break;
			} else {
				System.out.println("INCORRECT PIN. TRY AGAIN.");
			}
		}
		in.close();
	}

}
