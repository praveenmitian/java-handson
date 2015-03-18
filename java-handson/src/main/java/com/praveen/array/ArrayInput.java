package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to get certain number of input from user.
 * 
 * @author PRAVEEN
 *
 */
public class ArrayInput {
	/**
	 * This method used to receive input from user
	 * @return int[] array of integer.
	 */
	public int[] inputArray(){
		int i, array[];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		array = new int[n];
		System.out.println("Enter " + n + " integers");
		
		for (i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		return array;
		
		
	}
}
