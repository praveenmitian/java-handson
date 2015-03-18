package com.praveen;

/**
 * This class demonstrate String Matches function.
 * 
 * @author PRAVEEN
 *
 */
public class StringMatchesDemo {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String Str = new String("Welcome to Tutorialspoint.com");

		System.out.print("Return Value :");
		System.out.println(Str.matches("(.*)Tutorials(.*)"));

		System.out.print("Return Value :");
		System.out.println(Str.matches("Tutorials"));

		System.out.print("Return Value :");
		System.out.println(Str.matches("Welcome(.*)"));
	}
}