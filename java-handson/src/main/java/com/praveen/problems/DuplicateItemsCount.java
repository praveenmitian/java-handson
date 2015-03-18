package com.praveen.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class used to count the number of duplicate items.
 * 
 * @author PRAVEEN
 *
 */
public class DuplicateItemsCount {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> items = new ArrayList<String>();
		items.add("apple");
		items.add("banana");
		items.add("apple");
		items.add("orange");
		items.add("orange");
		items.add("mango");

		Integer count = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String key : items) {
			count = map.get(key);
			map.put(key, (count == null) ? 1 : count + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 1)
				System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
