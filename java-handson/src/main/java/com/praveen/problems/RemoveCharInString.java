package com.praveen.problems;

/**
 * This class used to remove character in a given String.
 * 
 * @author PRAVEEN
 *
 */
public class RemoveCharInString {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
	    String str = "this is a test";
	    
	    System.out.println(removeChar(str,'s'));
	    System.out.println(removeCharAt(str, 3));
	    System.out.println(replaceCharAt(str, 5, 'c'));
	  }

	/**
	 * Remove input character in string.
	 *   
	 * @param s
	 * @param c
	 * @return String.
	 */
	public static String removeChar(String s, char c) {
	    String r = "";
	    for (int i = 0; i < s.length(); i++) {
	      if (s.charAt(i) != c)
	        r += s.charAt(i);
	    }
	    return r;
	  }
	  
	/**
	 * Remove char at given position.
	 * 
	 * @param s
	 * @param pos
	 * @return String.
	 */
	public static String removeCharAt(String s, int pos) {
		    return s.substring(0, pos) + s.substring(pos + 1);
		  }
	  public static String replaceCharAt(String s, int pos, char c) {
		    return s.substring(0, pos) + c + s.substring(pos + 1);
		  }
}
