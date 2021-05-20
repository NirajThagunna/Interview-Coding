package leetcode;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @Author: Niraj Thagunna
 * 
 * Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */
public class TwoSum {
	
	// method to find the two sum
	public static int[] twoSum(int[] nums, int target) {
		
		// Creating a temp array to store the result
		int[] temp = new int[2];
		
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				
				// Checks for the sum
				if (i != j && nums[i] + nums[j] == target) {
					temp[0] = i;
					temp[1] = j;
					break;
				}
			}
		}
		
		return temp;
	}
	
	// main method
	public static void main(String[] args) {
		try {
			// testCase
			int[] nums = {3, 2, 4};
			
			// target element
			int target = 6;
			
			// twoSum method
			System.out.println("Output : " + Arrays.toString(twoSum(nums, target)));
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}
