package com.praveen.string;

import java.util.Scanner;

/**
 * Replace first half string with second half.
 * 
 * @author PRAVEEN
 *
 */
public class FirstHalfWithSecondHalf {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		String s1 = "";
		if (s.length() > 1) {
			int index = s.length() / 2;
			s1 = s.substring(index, s.length()) + s.substring(0, index);
			System.out.println("After:" + s1);
		} else {
			System.out.println("After:" + s);
		}
		in.close();
	}
}
