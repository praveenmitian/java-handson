package com.praveen.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Remove vowels from given string.
 * 
 * @author PRAVEEN
 *
 */
public class RemoveVowels {
	private static String vowels = "aeiouAEIOU";

	/**
	 * Check the char vowel or not.
	 * 
	 * @param c
	 * @return boolean.
	 */
	private static boolean isVowell(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
				|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
			return true;
		}
		return false;
	}

	/**
	 * Check the char vowel or not(using for loop).
	 * 
	 * @param c
	 * @return boolean.
	 */
	private static boolean isVowel(char c) {

		for (int i = 0; i < vowels.length(); i++) {
			if (c == vowels.charAt(i))
				return true;
		}
		return false;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		 replaceVowelUsingRegEx();

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char ch = ' ';

		System.out.println("Enter the Word:");
		String str = br.readLine();
		// str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (!(isVowel(ch) && isVowell(ch))) {
				newstr = newstr + str.charAt(i);
			}
		}

		System.out.println("Edited Word:" + newstr);
	}
	
	/**
	 * Remove vowels using RegEx.
	 */
	private static void replaceVowelUsingRegEx() {
		String str= "Your String";
		 str= str.replaceAll("[AEIOUaeiou]", "");
		 System.out.println(str);
	}
}
