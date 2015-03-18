package com.praveen.string;

import java.util.Scanner;

/**
 * Solution to DoubleX problem. Ref: http://www.programmr.com/doublex
 * 
 * @author PRAVEEN
 *
 */
public class DoubleX {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
		String ss, s = in.next();
		ss = "xx";
		boolean result = s.contains(ss);
		System.out.println(result);
		in.close();
	}
}
