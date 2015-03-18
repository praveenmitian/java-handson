package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate dynamic adding.
 * 
 * @author PRAVEEN
 *
 */
public class DynamicAdding {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter number of number to add");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int total = 0;
		int[] add = new int[n];
		System.out.println("Enter " + n + " input to add");
		for (int i = 0; i < n; i++) {
			add[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			total = total + add[i];
		}
		System.out.println("Total:" + total);
		in.close();
	}
}
