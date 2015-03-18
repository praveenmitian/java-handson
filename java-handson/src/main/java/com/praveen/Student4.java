package com.praveen;

/**
 * Class used to demonstralt toString method.
 * 
 * @author PRAVEEN
 *
 */
public class Student4 {
	String name;
	int rollno;

	Student4(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public int hashCode() {
		return rollno;
	}

	public String toString() {
		return name + "----" + rollno;
	}

	/**
	 * Main method.
	 * 
	 * @param arg
	 */
	public static void main(String arg[]) {
		Student4 s1 = new Student4("raju", 101);
		Student4 s2 = new Student4("giri", 102);
		System.out.println(s1);
		System.out.println(s2);
	}
}
