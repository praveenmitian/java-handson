package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate calculation of simple interest.
 * 
 * @author PRAVEEN
 *
 */
public class SimpleInterest {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int year, iRate;
		float principle, si;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter principle amount");
		principle = in.nextFloat();
		System.out.println("Enter no of years");
		year = in.nextInt();
		System.out.println("Enter Interest rate");
		iRate = in.nextInt();
		si = (principle * year * iRate) / 100;
		System.out.println("Amount" + si);
		in.close();
	}
}
