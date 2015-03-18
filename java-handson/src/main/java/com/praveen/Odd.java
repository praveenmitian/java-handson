package com.praveen;

import java.util.Scanner;

/**
 * This class used to fine odd number from given combination of char and number,
 * 
 * @author PRAVEEN
 *
 */
public class Odd {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		System.out.println("Input anything you want: ");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();
		s = s.replaceAll("[A-Za-z]", "");
		System.out.println(s);
		System.out.println("Odd Numbers are");
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch % 2) != 0) {
				System.out.print(ch + " ");
			}
		}
		scanner.close();
	}
}
