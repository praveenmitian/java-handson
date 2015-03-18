package com.programmer.problems.Arth;

import java.util.Scanner;

/**
 * Solution to problem devryadmission program.
 * Ref: http://www.programmr.com/devry-admission-program
 * 
 * @author PRAVEEN
 *
 */
public class DevryAdmissionProgram {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double gpa;
		int sat_score;
		System.out.println("Devry University Admission Program");
		System.out.print("Enter your GPA out of 5:");
		gpa = scanner.nextDouble();
		System.out.print("Enter your SAT Score:");
		sat_score = scanner.nextInt();
		// if ((gpa >= 1.8) && (sat_score >= 900)) {
		// System.out.println("Your were accepted");
		// } else if ((gpa < 1.8) && (sat_score > 900) || (gpa < 1.8)
		// && (sat_score < 900)) {
		// System.out.println("Your GPA is too low");
		// } else {
		// System.out.println("Your SAT sore is low ");
		// }
		if ((gpa >= 1.8) && (sat_score >= 900)) {
			System.out.println("Your were accepted");
		} else if (gpa < 1.8 || sat_score < 900) {
			System.out.println("Your GPA is too low");
		} else
			System.out.println("Your SAT sore is low ");
		scanner.close();
	}

}
