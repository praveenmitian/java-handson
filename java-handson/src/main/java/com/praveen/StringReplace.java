package com.praveen;

/**
 * This class used to replace given string.
 * 
 * @author PRAVEEN
 *
 */
class StringReplace {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String org = "This is a test. This is, too.";
		String search = "is";
		String sub = "was";
		String result = "";
		int i;
		do { // replace all matching substrings
			System.out.println(org);
			i = org.indexOf(search);
			System.out.println(i);
			if (i != -1) {
				result = org.substring(0, i);
				System.out.println(result);
				result = result + sub;
				System.out.println(result);
				result = result + org.substring(i + search.length());
				System.out.println(result);
				org = result;
			}
		} while (i != -1);
	}
}
