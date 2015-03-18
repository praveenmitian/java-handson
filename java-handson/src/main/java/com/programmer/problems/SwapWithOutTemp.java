package com.programmer.problems;

/**
 * This class demonstrate swapping without temp value.
 * 
 * @author PRAVEEN
 *
 */
public class SwapWithOutTemp {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Value before swap" + "   " + "a = " + a + "   "
				+ "b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value after swap" + "   " + "a = " + a + "   "
				+ "b = " + b);
	}
}
