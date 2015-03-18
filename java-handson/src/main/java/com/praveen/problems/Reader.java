package com.praveen.problems;
import java.io.File;
import java.io.IOException;

/**
 * Reade Demo.
 * 
 * @author PRAVEEN
 *
 */
public class Reader {

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\PRAVEEN\\Downloads\\hello2.txt");
	System.out.println(f.exists());
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println(f.isFile());
	System.out.println(f.delete());
}
}
