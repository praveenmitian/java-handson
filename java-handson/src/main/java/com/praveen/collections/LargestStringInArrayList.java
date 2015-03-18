package com.praveen.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class used to find largest string and its index in array list.
 * 
 * @author PRAVEEN
 *
 */
public class LargestStringInArrayList {

	/**
	 * This method returns large string.
	 * 
	 * @param larg
	 * @return String
	 */
	public String largest(List<String> larg) {
		String large = larg.get(0);
		int size = larg.get(1).length();

		for (int i = 1; i < larg.size(); i++) {
			if (size < large.length()) {
				large = larg.get(i);
				size = large.length();
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
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.next();
		}
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list.add(a[i]);
		}
		LargestStringInArrayList l = new LargestStringInArrayList();
		String high = l.largest(list);
		System.out.println("High: " + high + "Index " + list.indexOf(high));
		in.close();
	}
}
