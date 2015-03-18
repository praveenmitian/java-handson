package com.praveen.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class used to find index of largest number in array.
 * 
 * @author PRAVEEN
 *
 */
public class LargeInArreyList {

	/**
	 * This method used to return index of larest number in array list.
	 * 
	 * @param larg
	 * @return int
	 */
	public int largest(List<Integer> larg) {
		int large = larg.get(0);
		for (int i = 1; i < larg.size(); i++) {
			if (large < larg.get(i)) {
				large = larg.get(i);
			}
		}
		return large;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number of element to add");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(a[i]);
		}
		
		LargeInArreyList l = new LargeInArreyList();
		int highColl = Collections.max(list);
		System.out.println("Highest: " + highColl + " Index of Large: "
				+ list.indexOf(highColl));
		int high = l.largest(list);
		System.out.println("Highest: " + high + " Index of Large: "
				+ list.indexOf(high));
		in.close();
	}
}
