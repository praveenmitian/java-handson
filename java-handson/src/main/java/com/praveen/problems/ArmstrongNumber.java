package com.praveen.problems;

import java.util.Scanner;

/**
 * This class used to find give number is Armstrong or not.
 * 
 * @author PRAVEEN
 *
 */

public class ArmstrongNumber {
	/**
	 * check the number Armstron or not.
	 * 
	 * @param num
	 * @return boolean.
	 */

	public boolean isArmNum(int num) {
		int tmp = num;
		int numOfDigit = String.valueOf(num).length();
		int sum = 0;
		int rem = 0;
		while (tmp > 0) {
			rem = tmp % 10;
			int temp = 1;
			for (int i = 0; i < numOfDigit; i++) {
				temp = temp * rem;
			}
			sum = sum + temp;
			tmp = tmp / 10;
		}
		return (num == sum);

	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		ArmstrongNumber a = new ArmstrongNumber();
		System.out.println(a.isArmNum(num));
		if (a.isArmNum(num))
			System.out.println("The number is Amstrong");
		else
			System.out.println("The number is not Amstrong");

		in.close();
	}
}
