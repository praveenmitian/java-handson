package com.praveen.string;

import java.util.Scanner;

/**
 * This class change user entered lower case string to upper case.
 * 
 * @author PRAVEEN
 *
 */
public class ToggleCase {

	/**
	 * This mehtod converts lower case to upper case.
	 * 
	 * @param text
	 * @return String
	 */
	public static String reverseCase(String text) {
		char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (Character.isUpperCase(c)) {
				chars[i] = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				chars[i] = Character.toUpperCase(c);
			}
		}
		return new String(chars);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String result = "";
		char c1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				c1 = Character.toLowerCase(c);
				result = result + c1;
			} else {
				c1 = Character.toUpperCase(c);
				result = result + c1;
			}
		}
		System.out.println(result);

		System.out.println(reverseCase(s));
		in.close();
	}
}
