package com.praveen.method;

import java.util.Scanner;

/**
 * This class used to demonstration of methods in java.
 * 
 * @author PRAVEEN
 *
 */

public class KeychainsShop {
	/**
	 * Method without return type.
	 */

	public void addKeychains() {
		System.out.println("ADD KEYCHAINS.");
	}

	/**
	 * Method without return type.
	 */

	public void removeKeychains() {
		System.out.println("REMOVE KEYCHAINS.");
	}

	/**
	 * Method without return type.
	 */

	public void viewOrder() {
		System.out.println("VIEW ORDER.");
	}

	/**
	 * Method without return type.
	 */
	public void checkout() {
		System.out.println("CHECKOUT.");
	}

	/**
	 * Method without return type.
	 */

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int choice;

		System.out
				.println("\n1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice: ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			addKeychains();
			break;
		case 2:
			removeKeychains();
			break;
		case 3:
			viewOrder();
			break;
		case 4:
			checkout();
			break;
		default:
			System.out.print("Incorrect Choice.");
		}
		sc.close();
	}

	/**
	 * Main method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("Welcome To The Keychain Shop!");
		KeychainsShop k = new KeychainsShop();
		k.menu();
	}

}
