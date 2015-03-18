package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to problem sleep.
 * Ref: http://www.programmr.com/sleep
 * 
 * @author PRAVEEN
 *
 */
public class Sleep {
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is it a weekday today?(true or false):");
		boolean weekday = scanner.nextBoolean();
		System.out.print("Are you on a vacation?(true or false):");
		boolean vocation = scanner.nextBoolean();
		String sleep = (!weekday || vocation) ? "sleep" : "not sleep";
		System.out.println("You " + sleep + ".");
		scanner.close();
	}
}
