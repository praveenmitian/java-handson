package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate check leap year or not.
 * 
 * @author PRAVEEN
 *
 */
public class DetermineLeapYear {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// year we want to check
		int year;
		boolean isLeap = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year");
		year = in.nextInt();

		// if year is divisible by 4, it is a leap year

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			isLeap = true;
		}
		System.out.println(isLeap);
		in.close();
	}
}
