package com.praveen.problems;

import java.util.Scanner;

/**
 * This class used to find Minium and Maximum of given array of numbers.
 * 
 * @author PRAVEEN
 */
public class MaxAndMinNum {

	/**
	 * Method used to receive input from user.
	 * 
	 * @return int[] array of integer.
	 */
	private static int[] getInteractiveInput() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array limit:");
		int limit = in.nextInt();
		int[] numbers = new int[limit];
		System.out.println("Enter " + limit
				+ " numbers one by one or with space");
		for (int i = 0; i < limit; i++) {
			numbers[i] = in.nextInt();
		}
		in.close();
		return numbers;
	}

	/**
	 * Method converts command line args i.e String[] to int[].
	 * 
	 * @param args
	 *            String array.
	 * @return int[] array of integer.
	 */
	private static int[] getCliArgs(String[] args) {
		int[] numbers = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			numbers[i] = Integer.parseInt(args[i]);
		}
		return numbers;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers;
		numbers = getInteractiveInput();
		 numbers = getCliArgs(args);

		if (numbers.length != 0) {
			int smallest = numbers[0];
			int largetst = numbers[0];
			int total = 0;
			for (int i = 0; i < numbers.length; i++) {
				total += numbers[i];
				// System.out.println(average);
				if (numbers[i] > largetst)
					largetst = numbers[i];
				else if (numbers[i] < smallest)
					smallest = numbers[i];
			}

			System.out.println("Largest Number is : " + largetst);
			System.out.println("Smallest Number is : " + smallest);
			System.out.println("Average " + total / numbers.length);
			System.out.println();
		} else {
			System.out.println("No input received...");
		}
	}
}
