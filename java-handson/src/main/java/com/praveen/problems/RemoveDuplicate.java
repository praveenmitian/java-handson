package com.praveen.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Remove duplicate in array list.
 * 
 * @author PRAVEEN
 *
 */
public class RemoveDuplicate {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("one");
	list.add("one");
	list.add("two");
	list.add("two");
	list.add("three");
	list.add("three");
	list.add("four");
	list.add("four");
	HashSet<String> set = new LinkedHashSet<String>(list); 
//	ArrayList<String> list1 = new ArrayList<String>(set);
	for(String s: set){
		System.out.println(s);
	}
}
}
