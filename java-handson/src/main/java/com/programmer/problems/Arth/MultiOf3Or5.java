package com.programmer.problems.Arth;

/**
 * This class demonstrate total of multiple of 3 or 5 till user defined number.
 * 
 * @author PRAVEEN
 *
 */
public class MultiOf3Or5 {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10, total = 0;
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {// 356910
				total = total + i;
			} else if (i % 3 == 0) {
				total = total + i;
			} else if (i % 5 == 0) {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}
