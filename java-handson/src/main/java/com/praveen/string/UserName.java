package com.praveen.string;

import java.util.Date;
import java.util.Scanner;

/**
 * This class used to check username
 * 
 * @author PRAVEEN
 *
 */
public class UserName {

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = new Date(0);

		System.out.println(d.toString());

		Scanner in = new Scanner(System.in);
		System.out.println("Enter username");
		String s = in.next();
		if (s.equalsIgnoreCase("admin")) {
			System.out.println("Username accepted");
		} else
			System.out.println("Incorrect username");
		in.close();
	}
}
// str123guj456hhk56,12+12