package com.praveen;

/**
 * This class demonstrate tostring method.
 * 
 * @author PRAVEEN
 *
 */
class ToStringDemo {
	int i;

	ToStringDemo(int i) {
		this.i = i;
	}

	/**
	 * Method returns hashcode.
	 * 
	 * @return int
	 */
	public int hashCode() {
		return i;
	}

	/**
	 * Method returns string.
	 * 
	 * @return String
	 */
	public String toString() {
		return i + " ";
	}

	/**
	 * Main method.
	 * 
	 * @param arg
	 */
	public static void main(String arg[]) {
		ToStringDemo t1 = new ToStringDemo(100);
		ToStringDemo t2 = new ToStringDemo(110);
		System.out.println(t1);
		System.out.println(t2);
	}
}
