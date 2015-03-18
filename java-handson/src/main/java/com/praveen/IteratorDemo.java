package com.praveen;

import java.util.*;

/**
 * Iterator, List Iterator Demonstration.
 * 
 * @author PRAVEEN
 *
 */
public class IteratorDemo {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String element;
		// Create an array list
		ArrayList<String> al = new ArrayList<String>();
		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");

		// Use iterator to display contents of al
		System.out.print("Original contents of al: ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			element = (String) itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Modify objects being iterated
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			element = (String) litr.next();
			litr.set(element + "+");
		}
		System.out.print("Modified contents of al: ");
		itr = al.iterator();
		while (itr.hasNext()) {
			element = (String) itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// Now, display the list backwards
		System.out.print("Modified list backwards: ");
		while (litr.hasPrevious()) {
			element = (String) litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
