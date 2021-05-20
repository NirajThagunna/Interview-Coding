package leetcode;

import java.io.PrintWriter;
import java.io.StringWriter;

/*
 * @Author: Niraj Thagunna
 * 
 * Reverse an Integer
 * 
 * Given a signed 32-bit integer x, return x with its digits reversed. 
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseAnInteger {

	// method to reverse an integer
	public static int reverse(int x) {
		// Store the reversed integer in the reversed 
		long reversed = 0;
		
		// Iterate the integer
		while (x != 0) {
			reversed = reversed * 10 + x % 10; // * 10 for getting the reverse number and % 10 to get the last digit
			x /= 10; // x = x / 10; to distinct the last digit from the integer
		}
		
		// checking if the reversed crossed the it's limit or not
		if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
			return 0;
		
		// else return the reversed integer
		return (int)reversed;
	}
	
	public static void main(String[] args) {
		try {
			int x = -123;
			System.out.println("Reversed Integer is : " + reverse(x));
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
