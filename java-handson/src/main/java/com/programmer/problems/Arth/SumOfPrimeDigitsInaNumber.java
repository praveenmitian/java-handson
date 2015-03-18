package com.programmer.problems.Arth;

/**
 * This class demonstrate sum of prime number in certain digits of number.
 * 
 * @author PRAVEEN
 *
 */
public class SumOfPrimeDigitsInaNumber {

	/**
	 * This method check for prime number.
	 * 
	 * @param rem
	 * @return boolean
	 */
	public static boolean isPrime(int rem) {
		for (int i = 2; i <= rem / 2; i++) {
			if (rem % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 123679;
		int sum = 0, rem;
		while (num > 0) {
			rem = num % 10;
			if (isPrime(rem)) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		System.out.println("Sum of Prime:" + sum);
	}
}
