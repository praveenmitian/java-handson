package com.praveen.string;

import java.util.Scanner;

/**
 * Find long and sort word in array.
 * 
 * @author PRAVEEN
 *
 */
public class LongAndSortWord {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] wordsArray = s.split(" ");
		String small = wordsArray[0];
		String large = wordsArray[0];
		System.out.println("leb:" + wordsArray.length);

		for (int i = 0; i < wordsArray.length; i++) {
			if (small.length() > wordsArray[i].length()) {
				small = wordsArray[i];
			} else if (large.length() < wordsArray[i].length()) {
				large = wordsArray[i];
			}
		}
		System.out.println("Largest word " + large + " it length is "
				+ large.length());
		System.out.println("Smallest word " + small + " it length is "
				+ small.length());

		int sl = Integer.MAX_VALUE, ll = 0;
		for (int i = 0; i < wordsArray.length; i++) {
			if (sl > wordsArray[i].length()) {
				small = wordsArray[i];
			} else if (ll < wordsArray[i].length()) {
				large = wordsArray[i];
			}
		}
		System.out.println("Largest word " + large + " it length is "
				+ large.length());
		System.out.println("Smallest word " + small + " it length is "
				+ small.length());
		in.close();
	}
}
