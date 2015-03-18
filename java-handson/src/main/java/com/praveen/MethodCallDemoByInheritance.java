package com.praveen;

/**
 * This class demonstrate method call and Inheritance.
 * 
 * @author PRAVEEN
 *
 */
public class MethodCallDemoByInheritance {
	void can() {
		System.out.println("I am can");
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Bike b = new Bike();
		b.dis();
	}
}

/**
 * This class inherit another class.
 * 
 * @author PRAVEEN
 *
 */
class Bike extends MethodCallDemoByInheritance {
	void candy() {
		System.out.println("can");
	}

	/**
	 * Method calls another child and parent class method.
	 * 
	 */
	void dis() {
		candy();
		can();
	}

}
