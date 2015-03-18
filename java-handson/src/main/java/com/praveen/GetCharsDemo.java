package com.praveen;

import java.io.*;

/**
 * This class used to get char from string.
 * 
 * @author PRAVEEN
 *
 */
public class GetCharsDemo {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		char[] Str2 = new char[20];
		try {
			Str1.getChars(2, 9, Str2, 3);
			System.out.print("Copied Value = ");
			System.out.println(Str2);

		} catch (Exception ex) {
			System.out.println("Raised exception...");
		}
	}
}
