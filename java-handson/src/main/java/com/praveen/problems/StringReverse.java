package com.praveen.problems;

import java.util.Scanner;

public class StringReverse {
	static String reverse = "";

	String reverse(String name) {
		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		return reverse;

	}

	public static void main(String[] args) {
		String name;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to be Reversed...");
		name = in.nextLine();
		StringReverse s = new StringReverse();
		s.reverse(name);
		System.out.println("Reversed String...." + reverse);

		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];

		// put original string in an array of chars
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}

		// reverse array of chars
		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
		in.close();
	}

}
