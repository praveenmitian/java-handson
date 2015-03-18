package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to Swap the first element and the last element in the array.
 * Print the modified array.
 * 
 * @author PRAVEEN
 *
 */
public class SwappingFirstAndLast {
	/**
	 * Mian method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of input");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter " + n + " of input");

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int temp = a[0];
		a[0] = a[n - 1];
		a[n - 1] = temp;

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
}
