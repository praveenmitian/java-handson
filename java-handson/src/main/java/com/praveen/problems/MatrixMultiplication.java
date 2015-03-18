package com.praveen.problems;

import java.util.Scanner;

/**
 * This class used to find matrix multiplication.
 * 
 * @author PRAVEEN
 *
 */
public class MatrixMultiplication {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int mat1Row1, mat1Col1, mat2Row1, mat2Col2;

		Scanner in = new Scanner(System.in);
		System.out
				.println("Enter the number of rows and columns of first matrix");
		mat1Row1 = in.nextInt();
		mat1Col1 = in.nextInt();

		System.out
				.println("Enter the number of rows and columns of second matrix");
		mat2Row1 = in.nextInt();
		mat2Col2 = in.nextInt();

		if (mat1Col1 == mat2Row1) {
			int first[][] = new int[mat1Row1][mat1Col1];
			int second[][] = new int[mat2Row1][mat2Col2];
			System.out.println("Enter the elements of first matrix");

			for (int i = 0; i < mat1Row1; i++)
				for (int j = 0; j < mat1Col1; j++)
					first[i][j] = in.nextInt();
			System.out.println("Enter the elements of second matrix");

			for (int i = 0; i < mat2Row1; i++)
				for (int j = 0; j < mat2Col2; j++)
					second[i][j] = in.nextInt();

			int sum = 0;
			int multiply[][] = new int[mat1Row1][mat2Col2];

			for (int i = 0; i < mat1Row1; i++) {
				for (int j = 0; j < mat2Col2; j++) {
					for (int k = 0; k < mat2Row1; k++) {
						sum = sum + first[i][k] * second[k][j];
					}
					multiply[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Product of entered matrices:-");

			for (int i = 0; i < mat1Row1; i++) {
				for (int j = 0; j < mat2Col2; j++)
					System.out.print(multiply[i][j] + "\t");
				System.out.print("\n");
			}

		} else {
			System.out.println("Please enter correct matrix");
		}
		in.close();
	}
}
