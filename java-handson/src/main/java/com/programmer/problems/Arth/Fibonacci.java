package com.programmer.problems.Arth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class demonstrate fibonacci series solution.
 * 
 * @author PRAVEEN
 *
 */
public class Fibonacci {

	/**
	 * Method gives fibonacci series values using list.
	 * 
	 * @param n
	 * @return List<Integer>
	 */
	public static List<Integer> fibonacciTemp(int n) {
		int f0 = 0, f1 = 1, f2 = 0;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			f2 = f0;
			result.add(f2);
		}
		return result;
	}

	/**
	 * Method gives fibonacci series values using for loop.
	 * 
	 * @param n
	 * @return int array
	 */
	public static int[] fibonacciArray(int n) {
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = in.nextInt();
		List<Integer> result = fibonacciTemp(n);
		for (int r : result) {
			System.out.println(r);
		}
		int[] results = fibonacciArray(n);
		for (int r : results) {
			System.out.println(r);
		}
		in.close();
	}

}
