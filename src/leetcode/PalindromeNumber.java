package leetcode;

/*
 * @Author: Niraj Thagunna
 * 
 * Palindrome Number 
 * Given an integer x, return true if x is palindrome integer.
 * 
 * An integer is a palindrome when it reads the same backward as forward. 
 * For example, 121 is palindrome while 123 is not.
 */
public class PalindromeNumber {
	
	// method to check a number is a palindrome number or not
	public static boolean isPalindrome(int x) {
		
		// check if the number is negative
		if (x < 0)
			return false;
		
		else if (x >= 0 && x < 10)
			return true;
		
		// if not reverse a number and compare by forward and backward
		int res = 0;
		// you need to copy original number into any var to maintain that number
		int copyX = x;
		
		while (x != 0) {
			if (res > Integer.MAX_VALUE / 10) 
				return false;
			
			res = res * 10 + x % 10;
			x /= 10;
		}
		
		if (copyX == res)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		try {
			int x = -121;
			System.out.println(isPalindrome(x));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}





