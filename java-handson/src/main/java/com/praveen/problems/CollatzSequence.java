package com.praveen.problems;

/**
 * This class If n is even, divide it by 2 to get n / 2. If n is odd, multiply
 * it by 3 and add 1 to get 3n + 1. Repeat the process indefinitely. Stop when
 * you reach 1. Ref: http://www.programmr.com/collatz-sequence
 * 
 * @author PRAVEEN
 *
 */
public class CollatzSequence {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		System.out.println();
		System.out.println(n);
		do {
			n = n % 2 == 0 ? n / 2 : (3 * n) + 1;
			System.out.println(n);
			count++;
		} while (n > 1);
		System.out.println("Count" + count);
	}
}
