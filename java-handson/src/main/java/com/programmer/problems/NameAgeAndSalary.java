package com.programmer.problems;

import java.util.Scanner;

/**
 * This class demonstrate of Scanner class.
 * 
 * @author PRAVEEN
 *
 */
public class NameAgeAndSalary {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		double salary;
		System.out.println("Hello. What is your name?");
		name = in.nextLine();
		System.out.println("Hi" + " " + name + " " + "How old are you?");
		age = in.nextInt();
		System.out.println("So you're " + age + " eh? That's not old at all! ");
		System.out.println("How much do you make " + name + "?");
		salary = in.nextDouble();
		System.out.println(salary
				+ "! I hope that's per hour and not per year! LOL!");
		in.close();
	}

}
