package com.praveen;

/**
 * This class used to reverse string without build in function in various ways..
 * 
 * @author PRAVEEN
 *
 */
public class ReverseString {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String str = "ABC";
		String reverse = "";

		int length = str.length();
		System.out.println(length);

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of entered string is: " + reverse);

		 StringBuffer reverse1 = new StringBuffer("NarainKarthi");
		 System.out.println(reverse1.reverse());
		
		String str1  = "ABC";
		String str2  = "abc";
		//System.out.println(str1.equals(str2));
		System.out.println(str2.compareTo(str1));
		
		char[]Str1={'h','e','l','l','o',' ','w','o','r','l','d'};
		String Str2="";
		char ch='a';

		Str2 = String.copyValueOf(Str1);
		System.out.println("Returned String: " + Str2);

		Str2 = String.copyValueOf(Str1, 2, 6);
		System.out.println("Returned String: " + Str2);
		System.out.println('9');
		
	}

}
