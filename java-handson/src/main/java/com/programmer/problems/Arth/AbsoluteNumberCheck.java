package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate check for absolute number.
 * 
 * @author PRAVEEN
 *
 */
public class AbsoluteNumberCheck {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = in.nextInt();
		int b = in.nextInt();
		a = (a < 0) ? -a : a;
		b = (b < 0) ? -b : b;
		System.out.println(a == b);
		in.close();
	}
}
