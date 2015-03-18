package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to find index of largest number in array.
 * 
 * @author PRAVEEN
 *
 */
public class LocateLargesrNumLocation {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[])

	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of input");
		int n = in.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n + " of input");

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		int large = array[0];

		for (int i = 0; i < n; i++) {
			if (array[i] > large) {
				large = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == large) {
				System.out.println("Location of Largest number: ");
				break;
			}
		}
		in.close();
	}
}
