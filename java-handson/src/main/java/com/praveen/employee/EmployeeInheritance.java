package com.praveen.employee;

/**
 * Class demonstrate getter and setter method.
 * 
 * @author PRAVEEN
 *
 */
class Person {
	private String name;
	private int age;
	private String pin;

	/**
	 * Constructor used to initialize value.
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * Getter method to get name.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method to set name.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method to get age.
	 * 
	 * @return String
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Setter method to set age.
	 * 
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Getter method to get pin.
	 * 
	 * @return String
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * Setter method to set pin.
	 * 
	 * @param pin
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
}

/**
 * Child class employee1 extends person.
 * 
 * @author PRAVEEN
 *
 */
public class EmployeeInheritance extends Person {

	private int salary;

	/**
	 * Constructor to initialize value.
	 * 
	 * @param name
	 * @param age
	 * @param salary
	 */
	public EmployeeInheritance(String name, int age, int salary) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	/**
	 * Getter to get salary.
	 * 
	 * @return int
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * Setter to set salary.
	 * 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInheritance e = new EmployeeInheritance("Anand", 25, 15000);
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
	}

}