package com.praveen.problems;

import java.util.Scanner;

/**
 * String palindrome.
 *  
 * @author PRAVEEN
 *
 */
public class Palindrome {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to be Reversed...");
		String name = in.nextLine();
		StringReverse sr = new StringReverse();
		if (name.equals(sr.reverse(name)))
			System.out.println("The given string " + name + " is palindrome");
		else
			System.out
					.println("The given string " + name + "is not palindrome");
		in.close();
	}

}
