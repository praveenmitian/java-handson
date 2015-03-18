package com.praveen.array;

import java.util.Scanner;

/**
 * 
 * This class used to Swap every even positioned element with odd positioned
 * element next to it.
 * 
 * @author PRAVEEN
 *
 */
public class Swapping {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int limit = 5;
		int[] a = new int[limit];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 integer");

		for (int i = 0; i < limit; i++) {
			a[i] = in.nextInt();
		}

		int limit1 = limit % 2 == 0 ? limit : limit - 1;

		for (int i = 0; i < limit1; i = i + 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}

		for (int i = 0; i < limit; i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
}
