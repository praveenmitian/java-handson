package com.praveen.string;

import java.util.Scanner;

/**
 * Check for string has word bad.
 * 
 * @author PRAVEEN
 *
 */
public class HasBad {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		if (s.substring(0, 3).contains("bad")
				|| s.substring(1, 4).contains("bad")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		String ss = "bad";
		int index = s.indexOf(ss);
		if (index == 0 || index == 1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		in.close();
	}
}