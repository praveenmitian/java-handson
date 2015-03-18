package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to problem RedLotteryTicket
 * 
 * @author PRAVEEN
 *
 */
public class RedLotteryTicket {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 number");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if ((a < 3) && (b < 3) && (c < 3)) {
			if (a == 2 && b == 2 && c == 2) {
				System.out.println("Value of your ticket:10");
			} else if (a == b && b == c) {
				System.out.println("Value of your ticket:5");
			} else if (b != a && c != a) {
				System.out.println("Value of your ticket:1");
			} else {
				System.out.println("Value of your ticket:0");
			}

		}
		in.close();
	}
}
