package com.praveen.string;

import java.util.Scanner;

/**
 * Solution to Bob There. Ref: http://www.programmr.com/bob-there
 * 
 * @author PRAVEEN
 *
 */
public class BobThere {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		s = s.toLowerCase();
		if (s.length() <= 3) {
			if (s.startsWith("b") && s.endsWith("b")) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		}
		in.close();
	}
}
