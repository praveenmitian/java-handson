package com.praveen;

/**
 * This class demonstrate object creation.
 * @author PRAVEEN
 *
 */
public class ObjectCreationDemo{ 
	   
	/**
	 * Method add the age.
	 * 
	 */
	public void pupAge(){
	      int age = 0;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }
	   
	   
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String args[]){
		   int age=10;
	      ObjectCreationDemo test = new ObjectCreationDemo();
	      test.pupAge();   
	      System.out.println("Puppy age is : " + age);
	   }
	}
