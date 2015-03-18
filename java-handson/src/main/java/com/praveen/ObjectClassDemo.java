package com.praveen;


/** 
 * This class demonstrate object class.
 * 
 * @author PRAVEEN
 *
 */
public class ObjectClassDemo{

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		float floatVar = 5;
		int intVar= 6;
		String stringVar="Hello";
		String fs;
		Object[] obj = {new Float(floatVar), new Integer(intVar), stringVar};
		
		Object o = new Integer(5);
		
//		fs = String.format("The value of the float variable is "+
//				"%f, while the value of the integer "+ 
//				 
//				"variable is %d, and the string "+
//				"is %s", floatVar, intVar, stringVar);
//		System.out.println(fs);
		
		fs= String.format("The value of the float variable is "+
				"%f, while the value of the integer "+
				"variable is %d, and the string "+
				"is %s", obj);
		System.out.println(fs);
		
		String res = Str.format("Input1", "Input2");
		System.out.println(res);
		
		String[] str = {"Anna University","Bharathiyar University","Kongu Arts College"};
		for(int i=0;i<str.length;i++) {
			if(str[i].endsWith("University"))
				System.out.println("Endswith Univ:" + str[i]);
		}
	}
}

final class Str {
	private static String format(String arg1) {
		return "Iniside format " + arg1 + " ";
	}
	
	public static String format(String arg1, String arg2) {
		return format(arg1) + arg2;
	}
}