package com.programmer.problems.Arth;

/**
 * This class used to demonstrate given number is multiple of 3 of 4.
 * 
 * @author PRAVEEN
 *
 */
public class NoMultipleOf3Or4 {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 15;
		for (int i = 0; i <= num; i++) {
			if (!((i % 3 == 0) || (i % 4 == 0))) {
				System.out.println(i);
			}
		}
	}
}
