package com.praveen;

import java.util.Scanner;

/**
 * This class used to Add, Subtract, Multiple given input by switch case.
 * 
 * @author PRAVEEN
 *
 */
public class AdditionSubMulUsingSwitchCase {
	static int a, b, c, d;

	/**
	 * This method call another method and print the result.
	 * 
	 * @param e
	 */
	public void m1(int e) {
		int f = m2(e);
		System.out.println("Result" + f);
	}

	/**
	 * This method calculate value depend on user choice.
	 * 
	 * @param e
	 * @return int
	 */
	public int m2(int e) {
		int result = 0;
		switch (e) {
		case 1:
			result = add(b, c);
			break;
		case 2:
			result = sub(b, c);
			break;
		case 3:
			result = mul(b, c);
			break;
		}
		return result;
	}

	/**
	 * This method add two input Value.
	 * 
	 * @param a
	 * @param b
	 * @return int
	 */
	public int add(int a, int b) {
		int g = a + b;
		return g;
	}

	/**
	 * This method substract two input Value.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int sub(int a, int b) {
		int g = a + b;
		return g;
	}

	/**
	 * This method multiple two input Value.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int mul(int a, int b) {
		int g = a + b;
		return g;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AdditionSubMulUsingSwitchCase opperation = new AdditionSubMulUsingSwitchCase();
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for sub");
		System.out.println("Enter 3 for mul");
		a = in.nextInt();
		b = 10;
		c = 20;
		opperation.m1(a);
		in.close();
	}
}
