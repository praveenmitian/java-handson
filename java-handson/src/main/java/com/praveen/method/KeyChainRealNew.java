package com.praveen.method;

import java.util.Scanner;

/**
 * This class used find stock in key chain shop.
 * 
 * @author PRAVEEN
 *
 */
public class KeyChainRealNew {
	Scanner in = new Scanner(System.in);

	/**
	 * Add key chain in stock.
	 * 
	 * @param key
	 * @return int value.
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
	 * Remove key chain in stock .
	 * 
	 * @param key
	 * @return int value.
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
	 * View the order.
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
	 * Check out.
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
	 * Meun for keychian shop.
	 */
	public void menu() {
		int keyChains = 0, price = 10;

		keyChains = addKeychains(keyChains);
		keyChains = removeKeychains(keyChains);
		viewOrder(keyChains, price);
		checkout(keyChains, price);

	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println("Welcome To The Keychain Shop!");
		KeyChainRealNew k = new KeyChainRealNew();
		k.menu();
	}

}
