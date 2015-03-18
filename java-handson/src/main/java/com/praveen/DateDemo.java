package com.praveen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class used to Demonstrate date.
 * 
 * @author PRAVEEN
 *
 */
public class DateDemo {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Date date = new Date();
		System.out.println("Prints the current date:" + date.toString());
		System.out.println("Prints the current date:" + date.toGMTString());
		System.out.println("Prints the current year:" + date.getYear());
		System.out.println("Prints the current date:" + date.getHours());
		System.out.println("Prints the current date:" + date.getDate());
		System.out.println("Prints the current date:" + date.getDay());
		System.out.println("Prints the current date:" + date.getTime());
		System.out.println("Prints the current date:" + date.getMonth());
		// System.out.println("boolean after:"+date.after(Mon Jan 26 18:25:32
		// IST 2015));
		SimpleDateFormat d1 = new SimpleDateFormat(
				"yyyy.M.dd 'at' HH:mm:ss zzz");
		System.out.println("Date:" + d1.format(date));
	}
}