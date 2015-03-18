package com.praveen;

import java.util.Scanner;

/**
 * This class used to Add, Subtract, Multiple given input by switch case.
 * 
 * @author PRAVEEN
 *
 */
public class AddSubAndMul {
	static int b, c, d;

	/**
	 * This method used to switch on user enterd value.
	 * 
	 * @param e
	 */
	public void m1(int e) {
		int f = m2(e);
		System.out.println("Result" + f);
	}

	/**
	 * Used to perform calculation.
	 * 
	 * @param e
	 * @return
	 */
	public int m2(int e) {
		switch (e) {
		case 1:
			d = c + b;
			break;
		case 2:
			d = c - b;
			break;
		case 3:
			d = c * b;
			break;
		}
		return d;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		AddSubAndMul opperation = new AddSubAndMul();
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for sub");
		System.out.println("Enter 3 for mul");
		int a = in.nextInt();
		b = 10;
		c = 20;
		opperation.m1(a);
		in.close();
	}
}
