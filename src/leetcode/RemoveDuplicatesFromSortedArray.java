package leetcode;

import java.io.PrintWriter;
import java.io.StringWriter;

/*
 * @Author: Niraj Thagunna
 * 
 * Remove Duplicates From a Sorted Array
 * 
 * Given a sorted array nums, 
 * remove the duplicates in-place such that each element appears only once and returns the new length.
 * 
 * Do not allocate extra space for another array, 
 * you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {

	// method to remove duplicates from a sorted array
	public static int removeDuplicates(int[] nums) {
		
		// If the length of an array is 1 or no elements are present then
		if (nums.length <= 1)
			return nums.length;
		
		// to keep track of the elements of an array
		int index = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[index]) {
				index++;
				nums[index] = nums[i];
			}
		}
		
		// return the length of in-place array
		return (index + 1);
	}

	public static void main(String[] args) {
		try {
			int[] nums = {1, 1, 2};
			
			int len = removeDuplicates(nums);
			
			System.out.print("Output : ");
			for (int i = 0; i < len; i++) {
				System.out.print(nums[i] + " ");
			}
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
