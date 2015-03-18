package com.praveen.problems;

import java.util.Scanner;

/**
 * Check for Ramanujam number.
 * 
 * @author PRAVEEN
 *
 */
public class RamanujamNo {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		num = in.nextInt();
		int num1;
		int rem = 0;
		int rem1 = 0;
		num1 = num;
		int sum = 0;
		int revSum = 0;

		while (num > 0) {
			rem = num % 10;
			// sum = sum*10;
			sum = sum + rem;// 321
			// 320
			num = num / 10;// 1
		}
		System.out.println(sum);// 19

		int tmp = sum;
		while (sum > 0) {
			rem1 = sum % 10;// 1
			revSum = revSum * 10;
			revSum = revSum + rem1;// 90
			sum = sum / 10;// 1
		}
		System.out.println(revSum);
		System.out.println(num1);
		int x = tmp * revSum;
		System.out.println(x);
		if (num1 == x)
			System.out.println("This is ramanujam number");
		else
			System.out.println("This is not a ramanujam number");
		in.close();
	}
}
