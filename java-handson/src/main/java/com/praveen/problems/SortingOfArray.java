package com.praveen.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Sorting an array by different method.
 * 
 * @author PRAVEEN
 *
 */
public class SortingOfArray {
	private int[] array;

	//
	// public SortingOfArray(int[] num) {
	// array = num;
	// }

	/**
	 * Using build in function.
	 * 
	 * @param num
	 */
	public void sortUsingFunction(int[] num) {
		Arrays.sort(num);
		for (int arr : num) {
			System.out.println(arr);
		}
	}

	/**
	 * Using loop.
	 * 
	 */
	public void usingLoopAscending() {// 98765
		int temp, i, j;
		int[] num = array;
		for (i = 0; i < num.length; i++) {// 0//1
			for (j = 1; j < num.length - i; j++) {// 1//2//3//4//1-1//
				if (num[j - 1] > num[j]) {// 89765//87965//87695//87659//78659//76859//76589//
					temp = num[j - 1];//
					num[j - 1] = num[j];//
					num[j] = temp;//
				}
			}
		}
		for (int k = 0; k < num.length; k++) {
			System.out.println("Sort Ascending" + num[k]);
		}
	}

	/**
	 * Using sort.
	 */
	public void sortWithCollection() {
		List<Integer> sort = new ArrayList<Integer>();
		sort.add(4);
		sort.add(7);
		sort.add(10);
		sort.add(15);
		sort.add(3);
		sort.add(9);
		sort.add(8);
		sort.add(5);
		Collections.sort(sort);
		for (int s : sort) {
			System.out.println("Collection" + s);
		}
	}

	/**
	 * Using loop Decending order.
	 * 
	 */
	public void usingLoopDecending() {// 98765
		int temp, i, j;
		int[] num = array;
		for (i = 0; i < num.length; i++) {// 0//1
			for (j = 1; j < num.length - i; j++) {// 1//2//3//4//1-1//
				if (num[j - 1] < num[j]) {// 89765//87965//87695//87659//78659//76859//76589//
					temp = num[j - 1];//
					num[j - 1] = num[j];//
					num[j] = temp;//
				}
			}
		}
		for (int k = 0; k < num.length; k++) {
			System.out.println("Sort using loop" + num[k]);
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SortingOfArray s = new SortingOfArray();
		s.sortWithCollection();

	}
}
