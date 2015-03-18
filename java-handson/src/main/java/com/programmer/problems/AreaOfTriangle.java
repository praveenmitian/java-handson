package com.programmer.problems;

/**
 * This class used to calculate area of triangle using method.
 * 
 * @author PRAVEEN
 *
 */
public class AreaOfTriangle {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double a;

		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of:" + a);

		a = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9,9,9 has an area of:" + a);

	}

	// Write your code here
	public static double triangleArea(int a, int b, int c)

	// Converting int to double is importan to get accurate result.
	{
		// the code in this function computes the area of a triangle whose sides
		// have lengths a, b, and c
		double s = (double) (a + b + c) / 2;
		double s1 = (double) (s * (s - a) * (s - b) * (s - c));
		double area = Math.pow(s1, 0.5);
		return area;
	}

}
