package com.praveen.problems;

/**
 * Multiplication tables solution.
 * 
 * @author PRAVEEN
 *
 */
public class Tables {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Table...." + i);
			System.out.println("\n");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("\n");
		}

	}
}