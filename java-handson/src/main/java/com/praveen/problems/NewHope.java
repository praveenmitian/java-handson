package com.praveen.problems;

/**
 * Solution for new hope problem
 * Ref: http://www.programmr.com/new-hope
 * 
 * @author PRAVEEN
 *
 */
public class NewHope {
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean gotResult = false;
		for (int a = 0; a <= 45 && !gotResult; a++) {
			for (int b = 0; b <= 45 && !gotResult; b++) {
				for (int c = 0; c <= 45 && !gotResult; c++) {
					for (int d = 0; d <= 45; d++) {
						if ((((a + 2) == (b - 2)) && ((b - 2) == (c * 2)) && ((c * 2) == (d / 2)))
								&& (a + b + c + d == 45)) {
							System.out.println("A=" + a + ", B=" + b + ", C="
									+ c + ", D=" + d);
							gotResult = true;
							break;
						}
					}
				}
			}
		}
	}
}
