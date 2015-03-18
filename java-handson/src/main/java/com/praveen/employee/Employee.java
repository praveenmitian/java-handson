package com.praveen.employee;

/**
 * This class used to get and set employee details.
 * 
 * @author PRAVEEN
 *
 */
public class Employee {
	public String name;
	int age;
	private String designation;
	double salary;

	// This is the constructor of the class Employee

	/**
	 * Constructor used to initialize value.
	 * 
	 * @param name
	 */
	public Employee(String name) {
		this.name = name;
	}

	// Assign the age of the Employee to the variable age.

	/**
	 * Methods set age.
	 * 
	 * @param empAge
	 */
	public void empAge(int empAge) {
		age = empAge;
	}

	/* Assign the designation to the variable designation. */

	/**
	 * Set employee desigination.
	 * 
	 * @param empDesig
	 */
	public void empDesignation(String empDesig) {
		designation = empDesig;
	}

	/* Assign the salary to the variable salary. */

	/**
	 * Set employee salary.
	 * 
	 * @param empSalary
	 */
	public void empSalary(double empSalary) {
		salary = empSalary;
	}

	/* Print the Employee details */

	/**
	 * This method prints details of employee.
	 * 
	 */
	public void printEmployee() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Designation:" + designation);
		System.out.println("Salary:" + salary);
	}
}
