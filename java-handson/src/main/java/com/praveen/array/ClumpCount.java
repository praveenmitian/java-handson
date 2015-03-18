package com.praveen.array;

/**
 * This class used to get Clump count,that a "clump" in an array is a series of
 * 2 or more adjacent elements of the same value.
 * 
 * @author PRAVEEN
 *
 */
public class ClumpCount {
	
	/**
	 * Main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayInput a = new ArrayInput();
		ClumpCount c = new ClumpCount();
		int[] array = a.inputArray();
		int count = c.countClumps(array);
		int count1 = c.countClumps1(array);
		System.out.println(count);
		System.out.println(count1);
	}
	
	/**
	 * 
	 * @param nums int array.
	 * 				
	 * This method used to count no. of clump.
	 * @return int count of clump
	 */

	public int countClumps1(int[] nums) {
		boolean match = false;
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {// 11111
			if (nums[i] == nums[i + 1] && !match) {//
				match = true;
				count++;
			} else if (nums[i] != nums[i + 1]) {
				match = false;
			}
		}
		return count;
	}

	public int countClumps(int[] nums) {
		int clump = 0;
		for (int i = 0; i < nums.length; i++) {

			if (i + 1 < nums.length && nums[i + 1] == nums[i]) {
				clump++;
				System.out.println("clump:" + clump);
				while (i + 1 < nums.length && nums[i + 1] == nums[i]) {
					i++;
					System.out.println("i:" + i);
				}

			}
		}

		return clump;

	}

}
