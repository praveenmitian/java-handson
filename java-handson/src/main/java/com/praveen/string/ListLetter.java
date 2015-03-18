package com.praveen.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Solution to list the letter. Ref: http://www.programmr.com/lisrletter
 * 
 * @author PRAVEEN
 *
 */
public class ListLetter {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.replaceAll("\\s", "");// or this also give same result s =
									// s.replaceAll("\\W","");
		System.out.println(s);
		char[] c = s.toCharArray();
		List<Character> l = new ArrayList<Character>();

		for (int i = 0; i < c.length; i++) {
			l.add(c[i]);
		}
		Set<Character> ss = new LinkedHashSet<Character>(l);
		int count = 0;
		for (char cc : ss) {
			count++;
			System.out.println(cc);
		}
		System.out.println(count);
		in.close();
	}
}
