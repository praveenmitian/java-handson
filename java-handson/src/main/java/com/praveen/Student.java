package com.praveen;

/**
 * This class used to get and set students name.
 * 
 * @author PRAVEEN
 *
 */
public class Student {

	private String name;

	/**
	 * getter to get name.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter to set name.
	 * 
	 * @param studentName
	 */
	public void setName(String studentName) {
		name = studentName;
	}

	/**
	 * Setter to set default value.
	 * 
	 */
	public void setName() {
		name = "Student";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Arun");
		Student s2 = new Student();
		s2.setName("Babu");
		Student s3 = new Student();
		s3.setName();

		System.out.println("S1 name:" + s1.getName());
		System.out.println("S2 name:" + s2.getName());
		System.out.println("S3 name:" + s3.getName());
	}
}
