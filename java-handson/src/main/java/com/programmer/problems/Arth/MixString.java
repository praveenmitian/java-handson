package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to mix string.
 * Ref: http://www.programmr.com/mixstring
 * 
 * @author PRAVEEN
 *
 */
public class MixString {
	
	/**
	 * Method mix the string.
	 * 
	 * @param str1
	 * @param str2
	 * @return StringBuffer
	 */
	public static StringBuffer mixString(String str1, String str2) {
//		String result = "";
		StringBuffer sb = new StringBuffer();
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				sb.append(str1.charAt(i));
				sb.append(str2.charAt(i));
			}
		} else if (str1.length() < str2.length()) {
			String sub1 = str2.substring(0, str1.length());
			for (int i = 0; i < str1.length(); i++) {
				sb.append(str1.charAt(i));
				sb.append(sub1.charAt(i));
			}
			sb.append(str2.substring(str1.length()));
		} else {
			String sub1 = str1.substring(0, str2.length());//s1>s2
			for (int i = 0; i < sub1.length(); i++) {
				sb.append(sub1.charAt(i));
				sb.append(str2.charAt(i));
			}
			sb.append(str1.substring(str2.length()));
		}
//		String result = sb.toString();//convert StringBuffer to string then return as string possible.

		return sb;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter second string:");
		String str2 = scanner.nextLine();
		System.out.println(mixString(str1, str2));
	scanner.close();
	}

}
