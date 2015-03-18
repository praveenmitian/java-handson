package com.praveen.employee;

/**
 * class used to calculate bonus.
 * 
 * @author PRAVEEN
 *
 */
public abstract class AbstractEmployee {
	private String name;
	private String address;
	private int number;
	private int salary;

	public abstract float getBonusPer();

	public abstract void setBonusPer(float bonusPer);

	/**
	 * Constructor to initialize value.
	 * 
	 * @param name
	 * @param address
	 * @param number
	 * @param salary
	 */
	public AbstractEmployee(String name, String address, int number, int salary) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
		setSalary(salary);
	}

	/**
	 * Getter to get name.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter to Address.
	 * 
	 * @return String.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Getter to get number.
	 * 
	 * @return int
	 */
	public int getNumber() {
		return number;
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
	 * @param newSalary
	 */
	public void setSalary(int newSalary) {
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}

	/**
	 * Method to calculate bonus.
	 * 
	 * @return double
	 */
	public double calculateBonus() {
		return salary * getBonusPer() / 100;
	}
	
}