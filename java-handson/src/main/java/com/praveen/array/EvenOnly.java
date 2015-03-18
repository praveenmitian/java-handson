package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to Ask user for 5 numbers, store in a array and print the even numbers only.
 * If not a single even number is entered print 'No Even number in array
 * 
 * @author PRAVEEN
 *
 */
public class EvenOnly {
/**
 * Main meethod
 * 
 * @param args
 */
	public static void main(String[] args) {
		int[] a = new int[5];
		int i;
		boolean hasEven = false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 integer");
		for (i = 0; i < 5; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < 5; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				hasEven = true;
			}
		}
		if (!hasEven) {
			System.out.println("No even number in the array");
		}
		in.close();
	}
}
