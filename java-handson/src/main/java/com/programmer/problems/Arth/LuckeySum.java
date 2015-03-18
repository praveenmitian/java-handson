package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to problem luckey sum. Ref: http://www.programmr.com/lucky-sum
 * 
 * @author PRAVEEN
 *
 */
public class LuckeySum {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter no of Input");
		Scanner in = new Scanner(System.in);
		int t, sum = 0;
		t = in.nextInt();
		int[] n = new int[t];
		System.out.println("Enter" + t + "number");
		for (int i = 0; i < t; i++) {
			n[i] = in.nextInt();
		}
		for (int i = 0; i < t; i++) {
			if (n[i] == 13) {
				break;
			} else {
				sum = sum + n[i];
			}
		}
		System.out.println("Sum:" + sum);
		in.close();
	}
}
