package com.praveen.problems;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class used solves the problem of denomination.
 * 
 * @author PRAVEEN
 *
 */
public class Denamination {
	private static final int[] money = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

	/**
	 * Method used to calculate denomination.
	 * 
	 * @param amount
	 * @return Map<Integer, Integer>
	 */
	public static Map<Integer, Integer> calculateDenommination(int amount) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int i = 0, d;
		while (amount > 0) {
			d = amount / money[i];
			if (d > 0)
				map.put(money[i], d);
			amount = amount % money[i];
			i++;
		}
		return map;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 1652;
		for (Map.Entry<Integer, Integer> entry : calculateDenommination(n)
				.entrySet()) {
			System.out.println(entry.getKey() + " Denominations "
					+ entry.getValue());
		}

	}
}
