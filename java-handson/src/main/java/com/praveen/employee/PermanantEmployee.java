package com.praveen.employee;


/**
 * This class used to find bonus and details of permenent employee.
 * 
 * @author PRAVEEN
 *
 */
public class PermanantEmployee extends AbstractEmployee {

	private float bonusPer;

	/**
	 * Getter to get bonus percentage.
	 * 
	 * @return float
	 */
	public float getBonusPer() {
		return bonusPer;
	}

	/**
	 * Setter to set bonus percentage.
	 * 
	 */
	public void setBonusPer(float bonusPer) {
		this.bonusPer = bonusPer;
	}

	/**
	 * Constructor to initialize value.
	 * 
	 * @param name
	 * @param address
	 * @param number
	 * @param salary
	 */
	public PermanantEmployee(String name, String address, int number, int salary) {
		super(name, address, number, salary);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEmployee pe = new PermanantEmployee("Arun", "Chennai", 100, 15000);
		pe.setBonusPer(10.0f);
		System.out.println("Name:" + pe.getName());
		System.out.println("Address:" + pe.getAddress());
		System.out.println("No:" + pe.getNumber());
		System.out.println("Bonus:" + pe.calculateBonus());
	}
}
