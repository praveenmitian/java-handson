package com.praveen;

import java.util.Date;

/**
 * This class used to demonstrate date.
 * 
 * @author PRAVEEN
 *
 */
public class DateDemo2 {
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Date date = new Date(2015, 05, 13);
		Date curDate = new Date();
		curDate.setTime(61392277800000L);
		Object obj2 = new Date(2010, 06, 13);
		System.out.println(curDate.compareTo((Date) obj2));
		System.out.println(curDate.getTime());
		System.out.println(curDate.toString());
		String date3 = "1999-05-14";
		System.out.println(curDate.toString());

	}
}