package com.praveen.string;

import java.util.Scanner;

/**
 * Solution to combo string. Ref: http://www.programmr.com/combostring
 * 
 * @author PRAVEEN
 *
 */
public class ComboString {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String-1");
		String s1 = in.next();
		System.out.println("Enter String-2");
		String s2 = in.next();
		if (s1.length() != s2.length()) {
			System.out
					.println("Result:"
							+ (s1.length() < s2.length() ? s1 + s2 + s1 : s2
									+ s1 + s2));
		} else {
			System.out.println("Result:" + s1 + s2 + s1);
		}
		in.close();
	}
}
