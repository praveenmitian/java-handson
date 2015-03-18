package com.praveen.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hashmap demonstration using various car models.
 * 
 * @author PRAVEEN
 *
 */
public class FindTheCarModel {
	private static String[] suv = { "PAJERO", "HONDA CITY" };
	private static String[] sedan = { "Hyundai VERNA" };
	private static String[] economy = { "MARUTI SWIFT", "SKODA LAURA" };
	private static String[] mini = { "MARUTI CERVO", "TATA NANO" };
	private Map<String, String[]> category = new HashMap<String, String[]>();

	/**
	 * Constructor used to in initialize value.
	 */
	public FindTheCarModel() {
		category.put("suv", suv);
		category.put("sedan", sedan);
		category.put("economy", economy);
		category.put("mini", mini);
	}

	/**
	 * This method used to find model.
	 * 
	 * @param cat
	 * @return Sting array.
	 */

	public String[] model(String cat) {
		return category.get(cat);

	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String category;
		System.out.print("Enter category of car:");
		category = in.next();
		System.out.print("Model available in category:");
		FindTheCarModel f = new FindTheCarModel();
		String[] cars = f.model(category);

		for (String s : cars) {
			System.out.println(s);
		}
		in.close();
	}
}
