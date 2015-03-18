package com.praveen.problems;

import java.util.Scanner;

/**
 * This class used to convert decimal number to binary, octal and hexa values.
 * 
 * @author PRAVEEN
 *
 */
public class DecimalConversion {

	private static char[] binary = { '0', '1' };
	private static char[] octal = { '0', '1', '2', '3', '4', '5', '6', '7' };
	private static char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
			'9', 'A', 'B', 'C', 'D', 'E', 'F' };

	int number;

	/**
	 * Constructor initialize the number
	 * 
	 * @param num
	 */
	public DecimalConversion(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Invalid decimal number \""
					+ num + "\" received!");
		number = num;
	}

	/**
	 * A private helper method used to convert decimal to other bases.
	 * 
	 * @param values
	 * @param number
	 * @param base
	 * @return
	 */
	private String convert(char[] values, int number, int base) {
		int num = number;
		int rem;
		String str = "";
		while (num > 0) {
			rem = num % base;
			str = values[rem] + str;
			num = num / base;
		}
		return str.length() == 0 ? "0" : str;
	}

	/**
	 * Method returns binary value.
	 * 
	 * @return String.
	 */
	public String toBinary() {
		return convert(binary, number, 2);
	}

	/**
	 * Method returns octal value.
	 * 
	 * @return String.
	 */
	public String toOctal() {
		return convert(octal, number, 8);
	}

	/**
	 * Method returns Hexa value.
	 * 
	 * @return String.
	 */
	public String toHexaDeci() {
		return convert(hex, number, 16);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number....");
		num = in.nextInt();
		DecimalConversion d = new DecimalConversion(num);
		System.out.println(d.toBinary());
		d.toOctal();
		d.toHexaDeci();
		in.close();
	}
}
