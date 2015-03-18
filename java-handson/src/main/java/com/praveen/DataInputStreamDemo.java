package com.praveen;

import java.io.*;

/** 
 * This class demonstrate Data input stream.
 * 
 * @author PRAVEEN
 *
 */
public class DataInputStreamDemo {
	
	/**
	 * Main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {

		DataInputStream d = new DataInputStream(new FileInputStream(
				"C:\\Users\\SANTHIYA\\Downloads\\test.txt"));

		DataOutputStream out = new DataOutputStream(new FileOutputStream(
				"C:\\Users\\SANTHIYA\\Downloads\\test1.txt"));

		String count;
		while ((count = d.readLine()) != null) {
			String u = count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u + "  ,");
		}
		d.close();
		out.close();
	}
}
