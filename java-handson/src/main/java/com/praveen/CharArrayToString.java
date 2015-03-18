package com.praveen;

/**
 * This class demonstrate Char array to string and copyvalueof function.
 * 
 * @author PRAVEEN
 *
 */
public class CharArrayToString {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		char[] Str1 = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		String Str2 = "";
		String md = new String(Str1);
		System.out.println(md);

		Str2 = Str2.copyValueOf(Str1);
		System.out.println("Returned String: " + Str2);

		Str2 = Str2.copyValueOf(Str1, 2, 6);
		System.out.println("Returned String: " + Str2);
	}
}
