package com.praveen;

/**
 * This class demonstrate String replace first function.
 * 
 * @author PRAVEEN
 *
 */
public class StringReplaceFirst {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String Str = new String(
				"Tutorials Welcome to Welcome");
		String result = Str.replaceFirst("Tutorials", "AMROOD");

		System.out.print("Return Value :");
		System.out.println(result);
		System.out.println(Str);
	}
}