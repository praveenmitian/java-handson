package com.praveen.employee;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * HashTable demo.
 * 
 * @author PRAVEEN
 *
 */
public class HashTableDemo {

	private static Person p1, p2, p3, p4, p5;

	public HashTableDemo() {
		p1 = new Person("Arun", 25);
		p1.setPin("638056");
		p2 = new Person("Bala", 29);
		p2.setPin("638057");
		p3 = new Person("Kannan", 24);
		p3.setPin("638050");
		p4 = new Person("Dinesh", 27);
		p4.setPin("638056");
		p5 = new Person("Ramesh", 29);
		p5.setPin("638050");
	}

	private static void listPersonWithHashTable() {
		System.out.println("Listing person using hash table...");
		Hashtable<String, Person[]> table = new Hashtable<String, Person[]>();
		Person[] pg1 = new Person[] { p1, p4 };
		Person[] pg2 = new Person[] { p3, p5 };
		Person[] pg3 = new Person[] { p2 };

		table.put("638056", pg1);
		table.put("638050", pg2);
		table.put("638057", pg3);

		Enumeration<String> keys = table.keys();
		String pin = null;
		while (keys.hasMoreElements()) {
			pin = keys.nextElement();
			Person[] p = table.get(pin);
			System.out.println("\nPIN:" + pin);
			System.out.println("----------");
			for (Person person : p) {
				System.out.println("\tName:" + person.getName());
				System.out.println("\tAge:" + person.getAge());
				System.out.println("\tName:" + person.getPin());
				System.out.println("\n");
			}
		}
	}

	private static void listPersonUsingArray() {
		System.out.println("Listing person using array...");
		Person[] persons = new Person[] { p1, p2, p3, p4, p5 };
		for (Person p : persons) {
			if (!p.getPin().equals("638056")) {
				System.out.println(p.getName());
				System.out.println(p.getAge());
			}
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		listPersonUsingArray();
		listPersonWithHashTable();
	}

}
