package com.praveen;

import java.io.*;

/**
 * This class read file and write in another file.
 * 
 * @author PRAVEEN
 *
 */
public class CopyFileToAnother {

	/**
	 * Main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("C:\\Users\\PRAVEEN\\Downloads\\input.txt");
			out = new FileWriter("C:\\Users\\PRAVEEN\\Downloads\\output2.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

}
