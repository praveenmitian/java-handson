package com.praveen.string;

import java.util.Scanner;

/**
 * 
 * Solution to String Splosion.
 * Ref: http://www.programmr.com/stringsplosion
 * 
 * @author PRAVEEN
 *
 */
public class StringSplosion {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		for (int i = 1; i <= s.length(); i++) {
			System.out.print(s.substring(0, i));
		}
	in.close();}
}