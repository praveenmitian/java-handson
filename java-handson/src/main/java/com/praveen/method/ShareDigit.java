package com.praveen.method;

import java.util.Scanner;

/**
 * This class used to find two give input share common digit.
 * 
 * @author PRAVEEN
 *
 */

public class ShareDigit {
	/**
	 * return true if there is a digit that appears in both numbers otherwise
	 * return false
	 * 
	 * @param n1
	 * @param n2
	 * @return boolean.
	 */

	public static boolean shareDigit(int n1, int n2) {
		String s1 = Integer.toString(n1);
		String s2 = Integer.toString(n2);
		boolean result = false;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		System.out.println(shareDigit(num1, num2));
		scanner.close();
	}
}
