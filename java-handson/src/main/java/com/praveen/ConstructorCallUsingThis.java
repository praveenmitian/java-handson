package com.praveen;

/**
 * This class used to demonstrate call constructor using this method.
 * 
 * @author PRAVEEN
 *
 */
public class ConstructorCallUsingThis {
	private int age;
	private String name;

	/**
	 * Initialize using constructor.
	 * 
	 * @param age
	 * @param name
	 */
	public ConstructorCallUsingThis(int age, String name) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Default constructor calls using this method.
	 * 
	 */
	public ConstructorCallUsingThis() {
		this(100, "Hello");
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructorCallUsingThis h = new ConstructorCallUsingThis();

		System.out.println(h.age);
		System.out.println(h.name);
	}
}
