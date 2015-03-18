package com.praveen.problems;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Count words from file input.
 * 
 * @author PRAVEEN
 *
 */
public class WordCount {
	
	/**
	 * Count word using BufferReader.
	 * 
	 * @throws IOException
	 */
	public static void wordBuffer() throws IOException {
		FileReader in = new FileReader(
				"C:\\Users\\PRAVEEN\\Downloads\\hello1.txt");
		BufferedReader br = new BufferedReader(in);
		String s = br.readLine();
		int length = 0, i = 0;
		while (s != null) {
			// System.out.println(++i + "=" + s.split(" ").length + "/"
			// + s.length());
			if (s.length() > 0) {
				length = length + s.split(" ").length;
			}
			s = br.readLine();
		}
		System.out.println("Word count using Buffered Reader: " + length);
		br.close();
	}

	/**
	 * Count word using Scanner.
	 * 
	 * @throws FileNotFoundException
	 */
	public static void wordScanner() throws FileNotFoundException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\SANTHIYA\\Downloads\\hello1.txt");
		Scanner in = new Scanner(f);
		int count = 0;
		while (in.hasNextLine()) {
			if (in.hasNext()) {
				in.next();
				count++;
			}
		}
		System.out.println("Word Count Using Scanner" + count);
		in.close();
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		wordBuffer();
		wordScanner();

	}
}
