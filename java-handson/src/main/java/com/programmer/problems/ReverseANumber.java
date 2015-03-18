package com.programmer.problems;

/**
 * This class demonstrate reverse of given number.
 * 
 * @author PRAVEEN
 *
 */
public class ReverseANumber {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
