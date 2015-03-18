package com.programmer.problems;

import java.util.Scanner;

/**
 * Solution to Login problem. Ref: http://www.programmr.com/login
 * 
 * @author PRAVEEN
 *
 */
public class LogIn {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		String user[] = new String[3];
		String pass[] = new String[3];

		user[0] = "John";
		user[1] = "Bob";
		user[2] = "ArnoldSchwarzenegger";

		pass[0] = "123";
		pass[1] = "456";
		pass[2] = "theterminator";

		System.out.println("Enter username:");
		String username = in.next();
		System.out.println("Enter pasword:");
		String password = in.next();

		boolean matches = false;
		for (int i = 0; i < 3; i++) {
			if (username.equals(user[i]) && password.equals(pass[i])) {
				matches = true;
				break;
			}
		}

		if (matches)
			System.out.println("Hello " + username);
		else
			System.out.println("Incorrect Login!");
		in.close();
	}

}
