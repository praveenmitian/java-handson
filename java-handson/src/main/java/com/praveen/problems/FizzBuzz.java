package com.praveen.problems;

/*
 * Players generally sit in a circle. The player designated to go first says the number "1", and each player thenceforth counts one number in turn. However, any number divisible by three is replaced by the word fizz and any divisible by five by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates or makes a mistake is eliminated from the game.
 * For example, a typical round of fizz buzz would start as follows:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
 * Ref:http://en.wikipedia.org/wiki/Fizz_buzz
 */

/**
 * This class solves FizzBuzz problem.
 * 
 * @author PRAVEEN
 *
 */
public class FizzBuzz {

	/**
	 * Main method.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if ((i % 3 == 0) && (i % 5 == 0))
				System.out.print("FizzBuzz\t");
			else if (i % 3 == 0)
				System.out.print("Fizz\t");
			else if (i % 5 == 0)
				System.out.print("Buzz\t");
			else
				System.out.print(i + "\t");
		}
	}
}
