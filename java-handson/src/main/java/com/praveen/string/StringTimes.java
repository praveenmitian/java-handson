package com.praveen.string;

import java.util.Scanner;

/**
 * Solution to String Times Ref: http://www.programmr.com/stringtimes
 * 
 * @author PRAVEEN
 *
 */
public class StringTimes {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		System.out.println("No of times");
		int n = in.nextInt();
		String result = "";
		for (int i = 1; i <= n; i++) {
			result = result + s;
		}
		System.out.println("Result: " + result);
		in.close();
	}
}
