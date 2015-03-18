package com.praveen.array;

import java.util.Scanner;

/**
 * This class used to perform search index of a given value.
 * 
 * @author PRAVEEN
 *
 */
public class SearchArrayIndex {

	/**
	 * 
	 * This method used to search index of user given input.
	 * 
	 * @param array
	 * @param search
	 * 
	 */
	public void indexSearch(int[] array, int search) {
		boolean numFound = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search) {

				System.out.println(search + "  present at location " + (i + 1)
						+ ".");
				numFound = true;
				break;
			}
		}
		if (!numFound) {
			System.out.println("Entered elment not found in array");
		}

	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		int i, search, array[];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = in.nextInt();
		array = new int[n];
		System.out.println("Enter " + n + " integers");

		for (i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		System.out.println("Enter value to find");
		search = in.nextInt();
		SearchArrayIndex s = new SearchArrayIndex();
		s.indexSearch(array, search);
		in.close();
	}
}
