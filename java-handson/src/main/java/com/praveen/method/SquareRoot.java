package com.praveen.method;

import java.util.Scanner;

/**
 * This class used to find square root with out math function.
 * 
 * @author PRAVEEN
 *
 */

public class SquareRoot {
	private static final double pi = 3.14;
	/**
	 * method calculate square root.
	 *  
	 * @param a
	 */
	
	public static void sqt(int a) {
		  double n = (double) a;//4
		  double x = 1;
		  for( int i = 0; i < a; i++)//<04<14
		  {
		   x = 0.5 * ( x+n / x );//2.5//
		   System.out.println(x);
		  }
		 
		  System.out.println("sqrt of " + a + " is " + x);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		int n;
		float radius;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to find squareroot");
		n = in.nextInt();
		int squareRoot = (int) Math.sqrt(n);
		System.out.println(squareRoot);
		sqt(n);
		System.out.println("Enter radius");
		radius = in.nextFloat();
		double area = pi * Math.pow(radius, 2);
		System.out.println("Area:" + area);
		in.close();
	}
}
