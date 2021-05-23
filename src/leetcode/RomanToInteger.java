package leetcode;

/*
 * @Author: Niraj Thagunna
 * 
 * Roman To Integer
 * 
 */
public class RomanToInteger {

	// getting the value corresponding the roman letters
	public int value(char c) {
		if (c == 'I')
			return 1;
		if (c == 'V')
			return 5;
		if (c == 'X')
			return 10;
		if (c == 'L')
			return 50;
		if (c == 'C')
			return 100;
		if (c == 'D')
			return 500;
		if (c == 'M')
			return 1000;
		return -1;
	}

	// method to find a number corresponding to the Roman
	public int romanToInt(String s) {

		// variable to store the result
		int res = 0;

		// Iterate the string
		for (int i = 0; i < s.length(); i++) {

			// getting the value of the first character
			int s1 = value(s.charAt(i));

			// if the String is having more characters
			// it will be false if the i + 1 become greater than the length of a String
			if (i + 1 < s.length()) {
				// getting the second character value
				int s2 = value(s.charAt(i + 1));

				// if the value of first character is greater than second one just add the value of first character into the result
				if (s1 >= s2) {
					res += s1;
				}
				else {
					res += s2 - s1;
					i++; // increment becoz I used the value of i and i + 1
				}
			}
			else {
				res += s1;
			}
		}

		// return the result
		return res;
	}

	public static void main(String[] args) {
		try {
			RomanToInteger roman = new RomanToInteger();

			String s = "MCMXCIV";
			System.out.println(roman.romanToInt(s));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}




