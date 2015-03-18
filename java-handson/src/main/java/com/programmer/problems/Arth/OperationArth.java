package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate performing of arthmatic operation using seperate
 * method.
 * 
 * @author PRAVEEN
 *
 */
public class OperationArth {
	int n1, m1;

	/**
	 * Constructor initialize value.
	 * 
	 * @param n
	 * @param m
	 */
	public OperationArth(int n, int m) {
		n1 = n;
		m1 = m;
	}

	/**
	 * Method perform sum.
	 */
	public void sum() {
		System.out.println(n1 + m1);
	}

	/**
	 * Method perform suctraction.
	 */
	public void difference() {
		System.out.println(n1 - m1);
	}

	/**
	 * Method perform multiplication.
	 * 
	 * @return int
	 */
	public int product() {
		return n1 * m1;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		num2 = sc.nextInt();
		OperationArth o = new OperationArth(num1, num2);
		o.sum();
		o.difference();
		System.out.print(o.product() + "\n");
		sc.close();

	}

}
