package com.praveen;

/**
 * This method used to replace given string with other with our
 * replace/replaceAll function.
 * 
 * @author PRAVEEN
 *
 */
public class StringReplaceWithOutFunction {

	/**
	 * This method used to replace the given text with other.
	 * 
	 * @param s
	 */
	public void change(String s) {
		StringBuffer sb = new StringBuffer();
		String[] tokens = s.split(" ");
		for (int j = 0; j < tokens.length; j++) {
			if (tokens[j].equals("is")) {
				tokens[j] = "was";
			}
			if (j == tokens.length - 1) {
				sb.append(tokens[j]);
			} else {
				sb.append(tokens[j] + " ");
			}

			// System.out.println(tokens[j]);
		}
		System.out.println(sb);
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Hello is world is new";
		StringReplaceWithOutFunction d = new StringReplaceWithOutFunction();
		d.change(s);
	}
}
