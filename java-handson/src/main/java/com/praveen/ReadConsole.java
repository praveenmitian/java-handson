package com.praveen;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class used to get value from using InputStreamReader.
 * 
 * @author PRAVEEN
 *
 */
public class ReadConsole {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		System.out.println("Enter Input");
		char c;
		while ((c = (char) in.read()) != 'm') {
			System.out.println(c);
		}
		
		System.out.println("Reading String:");
		char[] ch = new char[5];
		in.read(ch);
		System.out.println("Res:"+ch);
	}
}
