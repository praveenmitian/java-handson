package com.programmer.problems;

/**
 * This class demonstrate dynamic initialing of value.
 * 
 * @author PRAVEEN
 *
 */
public class DynamicallyInitialize {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int a = 10;
		int b;
		// dynamically initialize this
		System.out.println("Output is:");
		b = 100 - a;
		System.out.println(a);
		System.out.println(b);
	}
}
