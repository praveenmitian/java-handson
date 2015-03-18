package com.praveen;

/**
 * This class demonstrate how to get instance variable.
 * 
 * @author PRAVEEN
 *
 */
public class GetterSetterDemo {

	static int puppyAge;

	/**
	 * Constructor to initialize value.
	 * 
	 * @param name
	 */
	public GetterSetterDemo(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed Name is :" + name);
	}

	/**
	 * Setter to set age.
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		puppyAge = age;
	}

	/**
	 * Getter to get age.
	 * 
	 */
	public void getAge() {
		System.out.println("Puppy's age is :" + puppyAge);
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/* Object creation */
		GetterSetterDemo myPuppy = new GetterSetterDemo("tommy");
		GetterSetterDemo myPuppy1 = new GetterSetterDemo("Hello");
		GetterSetterDemo myPuppy2 = new GetterSetterDemo("Gun");

		/* Call class method to set puppy's age */
		myPuppy.setAge(2);
		myPuppy1.setAge(5);
		myPuppy2.setAge(10);
		/* Call another class method to get puppy's age */
		myPuppy.getAge();
		myPuppy1.getAge();
		myPuppy2.getAge();
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myPuppy.puppyAge);
		System.out.println("Variable Value :" + myPuppy1.puppyAge);
		System.out.println("Variable Value :" + myPuppy2.puppyAge);
	}
}