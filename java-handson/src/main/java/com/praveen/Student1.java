package com.praveen;

/**
 * Calss used to demonstrate Constructor.
 * 
 * @author PRAVEEN
 *
 */
class Student1 {
	String name;
	int rollno;

	Student1(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	/**
	 * Main method.
	 * 
	 * @param arg
	 */
	public static void main(String arg[]) {
		Student1 s1 = new Student1("raju", 101);
		Student1 s2 = new Student1("giri", 102);
		Student1 s3 = new Student1("giri", 102);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
	}
}
