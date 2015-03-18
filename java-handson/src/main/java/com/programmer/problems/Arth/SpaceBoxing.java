package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to space boxing problem. Ref:
 * http://www.programmr.com/space-boxing-1
 * 
 * @author PRAVEEN
 *
 */
public class SpaceBoxing {

	private static final double[] relativeGravity = { .78, .39, 2.65, 1.17,
			1.05, 1.23 };
	double pounds;

	/**
	 * This method Convert weight to pounds.
	 * 
	 * @param opt
	 * @param weg
	 * @return double
	 */
	public double conversion(int opt, double weg) {
		double temp = relativeGravity[opt - 1];
		pounds = temp * weg;
		return pounds;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double weight;

		int opt;

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your current earth weight : ");

		weight = in.nextFloat();

		System.out.println();

		System.out.println("I have information for the following planets :");

		System.out
				.println("1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting : ");

		opt = in.nextInt();
		SpaceBoxing s = new SpaceBoxing();
		if (opt > 1 && opt < 8) {
			s.conversion(opt, weight);
			System.out.println(s.pounds);
		} else {
			System.out.println("Enter correct input");
		}

		// System.out.println("Weight in Pounds:" + s.conversion(opt, weight));
		in.close();
	}
}
