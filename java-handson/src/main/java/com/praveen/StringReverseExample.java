package com.praveen;

/**
 * Class used to reverse string.
 * 
 * @author PRAVEEN
 *
 */
public class StringReverseExample {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse:" + string);
		System.out.println("String after reverse:" + reverse);
	}
}
