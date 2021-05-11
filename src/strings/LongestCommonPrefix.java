package strings;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import basicIO.ArrayIO;
import basicIO.UserIO;

/*
 * @Author: Niraj Thagunna
 * 
 * Write a function to find the longest common prefix amongst an array of Strings.
 * 
 * If there is no any common prefix, return an empty string "".
 */

public class LongestCommonPrefix {
	
	// function to find the longest common prefix
	public static String longestCommonPrefix(String[] strings) {
		
		// If the strings array is empty
		if (strings == null || strings.length == 0)
			return "";
		
		// else if there are arrays of the strings are present then
		for (int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++) {
			
			// Taking all the characters of the first String one by one
			char toMatch = strings[0].charAt(prefixLen);
			
			// Comparing the prefix String character to the remaining strings one by one
			for (int i = 1; i < strings.length; i++) {
				
				// check if the character is mismatch or empty
				if (prefixLen >= strings[i].length() || toMatch != strings[i].charAt(prefixLen))
					return strings[0].substring(0, prefixLen);
			}
		}
		
		// if all the characters are same in all the strings then return first string
		return strings[0];
	}

	public static void main(String[] args) {

		try {
			
			System.out.print("How many strings do you want to enter: ");
			int SIZE = UserIO.readInt();
			
			String[] strings = ArrayIO.readStringArray(SIZE);
			
			System.out.println("\nArrays of String: " + Arrays.toString(strings));
			
			// calling the longestCommonPrefix() method
			String longestCommonPrefixString = longestCommonPrefix(strings);
			
			System.out.println("\nThe longest common prefix is : " + longestCommonPrefixString);
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
