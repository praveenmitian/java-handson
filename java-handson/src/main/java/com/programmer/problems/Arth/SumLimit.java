package com.programmer.problems.Arth;

/**
 * Solution to sum limit problem. Ref: http://www.programmr.com/sum-limit
 * 
 * @author PRAVEEN
 *
 */
public class SumLimit {

	/**
	 * Method calculate number of digits.
	 * 
	 * @param num
	 * @return int
	 */
	public int noOfDigits(int num) {
		int digit = 0;
		while (num > 0) {
			num = num / 10;
			digit++;
		}
		// System.out.println(digit);
		return digit;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = 110, num2 = 11, sum;
		sum = num1 + num2;
		SumLimit s = new SumLimit();
		if ((s.noOfDigits(num1)) == (s.noOfDigits(sum))) {
			System.out.println(sum);
		} else {
			System.out.println(num1);
		}
	}
}
