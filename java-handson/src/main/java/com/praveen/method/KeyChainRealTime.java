package com.praveen.method;

import java.util.Scanner;

/**
 * Key chain shop demonstration.
 * 
 * @author PRAVEEN
 *
 */

public class KeyChainRealTime {
	Scanner in = new Scanner(System.in);

	/**
	 * Add key chian to stock.
	 * 
	 * @param key
	 * @return
	 */

	public int addKeychains(int key) {
		int key1;
		System.out.println("You have " + key + " keychains");
		System.out.println("How many do you want to add-");
		key1 = in.nextInt();
		key1 += key;
		return key1;
	}

	/**
	 * Remove key chain from stock.
	 * 
	 * @param key
	 * @return
	 */

	public int removeKeychains(int key) {
		int key1;
		System.out.println("You have " + key + " keychains");
		System.out.println("How many do you want to remove-");
		key1 = in.nextInt();
		key1 -= key;
		return key1;
	}

	/**
	 * View order of stock.
	 * 
	 * @param key
	 * @param p
	 */

	public void viewOrder(int key, int p) {
		System.out.println("No. of keychains-" + key);
		System.out.println("Cost per keyChain-" + p);
		System.out.println("Total Cost-" + (key * p));
	}

	/**
	 * Check out from shop.
	 * 
	 * @param key
	 * @param p
	 */

	public void checkout(int key, int p) {
		System.out.println("What is your name-");
		String s = in.next();
		System.out.println("No. of keychains-" + key);
		System.out.println("Cost per keyChain-" + p);
		System.out.println("Total Cost-" + (key * p));
		System.out.println("Thank you for your order-" + s);

	}

	/**
	 * Key chain shop menu.
	 * 
	 */

	public void menu() {
		int choice, keyChains = 0, price = 10;

		System.out
				.print("1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice-");
		choice = in.nextInt();
		switch (choice) {
		case 1:
			keyChains = addKeychains(keyChains);
			break;
		case 2:
			keyChains = removeKeychains(keyChains);
			break;
		case 3:
			viewOrder(keyChains, price);
			break;
		default:
			checkout(keyChains, price);
			return;
		}
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome To The Keychain Shop!");
		KeyChainRealTime k = new KeyChainRealTime();
		k.menu();
	}

}
