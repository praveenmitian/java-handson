package com.praveen.collections;

import java.util.Scanner;
import java.util.Stack;

/**
 * This class demonstrates stack functionality.
 * 
 * @author PRAVEEN
 *
 */
public class Stacktrace {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number of element to add");
		int n = in.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		Stack<Integer> demo = new Stack<Integer>();
		System.out.println("Stack:" + demo);

		for (int i = 0; i < n; i++) {
			demo.push(a[i]);
			System.out.println("Stack:" + demo);
		}

		for (int i = 0; i < n; i++) {
			demo.peek();
			System.out.println("Stack:" + demo);
		}

		in.close();
	}
}
