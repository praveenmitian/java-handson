package com.praveen.string;

import java.util.Scanner;

/**
 * Soultion to Sub String Check. Ref: http://www.programmr.com/substring-checker
 * 
 * @author PRAVEEN
 *
 */
public class SubStringCheck {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		// s= s.replaceAll("[A-Za-z]", "");
		System.out.println(s);
		System.out.println("Enter Substring");
		String n = in.next();
		System.out.println("Result: " + s.contains(n));
		in.close();
	}
}
