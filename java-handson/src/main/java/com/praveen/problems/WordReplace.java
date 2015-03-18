package com.praveen.problems;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Replace word with given word in file.
 * 
 * @author PRAVEEN
 *
 */
public class WordReplace {

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\PRAVEEN\\Downloads\\hello1.txt");
		Scanner in = new Scanner(f);
		while (in.hasNextLine()) {
			if (in.hasNext()) {
				String s = in.next();
				System.out.println(s);
				if (s == "hello") {
					s = s.replace("hello", "Tamil");
				}
			}
			f.close();
		}
		in.close();
	}
}
