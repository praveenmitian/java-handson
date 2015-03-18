package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to reverse the given string.
 * 
 * @author PRAVEEN
 *
 */
public class ReverseString {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string to be reversed");
		String s = in.next();
		for (int i = 0; i < s.length(); i++) {
			reverse = reverse + s.charAt(s.length() - 1 - i);
		}
		System.out.println("Reversed string----" + reverse);
		in.close();
	}
}
