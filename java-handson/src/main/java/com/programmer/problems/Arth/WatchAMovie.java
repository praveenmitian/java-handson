package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to watch a movie problem. Ref:
 * http://www.programmr.com/watch-movie-now
 * 
 * @author PRAVEEN
 *
 */
public class WatchAMovie {

	/**
	 * Method check for interest.
	 * 
	 * @param cost
	 * @param review
	 */
	public static void seeMovie(double cost, int review) {
		if (cost < 5.00 || review == 5 && cost < 12.00) {
			System.out.println("very much interested ");
		} else if ((cost > 12.00 && review == 5)
				|| (cost > 5.00 && cost < 11.99)) {
			System.out.println("sort of interested ");
		} else {
			System.out.println("not interested ");
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int review;
		double cost;
		System.out.println("Enter cost of ticket in dollars:");
		cost = scanner.nextDouble();
		System.out.println("Enter stars it received out of 5:");
		review = scanner.nextInt();
		System.out.println("Your level of interest in watching movie:");
		seeMovie(cost, review);
		scanner.close();
	}
}
