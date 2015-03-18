package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to find product of small and large number in array.
 * 
 * @author PRAVEEN
 *
 */

public class ProductOfSmallAndLarge {
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of input");
		int n = in.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n + " of input");
		
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		int small = array[0];
		int large = array[0];
		
		for (int i = 0; i < n; i++) {
			if (array[i] > large) {
				large = array[i];
			} else if (array[i] < small) {
				small = array[i];
			}
		}
		System.out.println("product of small and large no in array---" + small
				* large);
		in.close();
	}
}
