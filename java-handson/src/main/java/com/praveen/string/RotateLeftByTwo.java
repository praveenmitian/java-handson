package com.praveen.string;

import java.util.Scanner;

/**
 * Solution to Rotate left by two.
 * Ref: http://www.programmr.com/left2
 *
 * @author PRAVEEN
 *
 */
public class RotateLeftByTwo {
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String s = in.next();
		String result = s.substring(2, s.length()) + s.substring(0, 2);
		System.out.println(result);
		in.close();
	}
}
