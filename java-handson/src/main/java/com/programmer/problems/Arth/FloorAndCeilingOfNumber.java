package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate Floor and cdiling method.
 * 
 * @author PRAVEEN
 *
 */
public class FloorAndCeilingOfNumber {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double d;
		System.out.println("Enter number with decimal");
		d = in.nextDouble();
		System.out.println((int) Math.ceil(d));// int to change double value of
												// Math method return not must
												// to use int
		System.out.println((int) Math.floor(d));

		String s1 = "s1";

		StringBuffer sbuf = new StringBuffer("a");
		boolean b = s1.contentEquals(sbuf);
		System.out.println(b);

		int i = 2;
		String str = Integer.toString(i);
		System.out.println(str);
		// or
		str = "" + i;
		System.out.println(str);
		in.close();
	}

}
