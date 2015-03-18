package com.praveen.employee;


/**
 * his class used to get set and calculate bonus for contract employee.
 * 
 * @author PRAVEEN
 *
 */
public class ContractEmployee extends AbstractEmployee {

	private float bonusPer;

	/**
	 * Getter method to get bonus percentage.
	 * 
	 */
	public float getBonusPer() {
		return bonusPer;
	}

	/**
	 * Setter method to set bonus percentage.
	 * 
	 */
	public void setBonusPer(float bonusPer) {
		this.bonusPer = bonusPer;
	}

	/**
	 * Constructor calls parent class constructor.
	 * 
	 * @param name
	 * @param address
	 * @param number
	 * @param salary
	 */
	public ContractEmployee(String name, String address, int number, int salary) {
		super(name, address, number, salary);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractEmployee ce = new ContractEmployee("Babu", "Delhi", 101, 20000);
		ce.setBonusPer(20.0f);
		System.out.println("Name:" + ce.getName());
		System.out.println("Address:" + ce.getAddress());
		System.out.println("No:" + ce.getNumber());
		System.out.println("Bonus:" + ce.calculateBonus());

	}

}
