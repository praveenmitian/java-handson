package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * This class demonstrate conversion of calcius to fahrenheit.
 * 
 * @author PRAVEEN
 *
 */
public class DegreeToFahrenheitConverter {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Enter a temperature in Celsius: ");
		Scanner in = new Scanner(System.in);
		double celcius = in.nextDouble();
		double fahrenheit = 0;
		fahrenheit = (celcius * 9 / 5) + 32;
		System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
		in.close();
	}

}
