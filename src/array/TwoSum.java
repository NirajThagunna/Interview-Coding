package array;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

/*
 * @Author: Niraj Thagunna
 * @LeetCode
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * You can return the answer in any order.
 */

public class TwoSum {
	
	// method for two-sum
//	public static int[] twoSum(int[] nums, int target) {
//		
//		int[] temp = new int[2];
//		
//		for (int i = 0; i < nums.length - 1; i++) {
//			if (nums[i] + nums[i + 1] == target) {
//			}
//		}
//	}
	
	// Main
	public static void main(String[] args) {
		
		try {
			System.out.print("Enter the size of an array : ");
			int MAX = UserIO.readInt();
			
			// Creating an array of integers
			int[] nums = new int[MAX];
			
			System.out.print("Enter the target number : ");
			int target = UserIO.readInt();
			
			
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
