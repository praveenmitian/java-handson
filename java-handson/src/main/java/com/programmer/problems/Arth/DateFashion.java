package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to date fashion problem. Ref: http://www.programmr.com/date-fashion
 * 
 * @author PRAVEEN
 *
 */
public class DateFashion {
	public static int datefashion(int you, int date) {
		if (you >= 8 || date >= 8) {
			return 2;
		} else if (you <= 2 || date <= 2) {
			return 0;
		} else {
			return 1;
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int you, date, success;
		System.out.println("Rate your style on scale on 10:");
		you = scanner.nextInt();
		System.out.println("Rate your date's style on scale on 10:");
		date = scanner.nextInt();
		success = datefashion(you, date);
		System.out.println("Will you get the table?(0=no/1=maybe/2=yes):"
				+ success);
		scanner.close();
	}
}
