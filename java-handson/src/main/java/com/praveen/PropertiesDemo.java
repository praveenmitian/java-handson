package com.praveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * This class used to demonstrate Properties class.
 * 
 * @author PRAVEEN
 *
 */
public class PropertiesDemo {

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void main(String args[]) throws FileNotFoundException,
			IOException {
		Properties capitals = new Properties();
		capitals.load(new FileInputStream("src\\com\\ibm\\sample.properties"));
		Set states;
		String str;

		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		capitals.put("Florida", "Not Found");

		// Show all states and capitals in hashtable.
		states = capitals.keySet();// get set-view of keys
		Iterator itr = states.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is "
					+ capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look for state not in list -- specify default
		str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + str + ".");
	}
}
