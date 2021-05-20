package leetcode;

/*
 * @Author: Niraj Thagunna
 * 
 * Run Length Encoding
 * Checks all the consecutive similar characters only
 * e.g. 
 * 		"aaaabcccaa" then the RLE is "4a1b3c2a"
 */
public class RunLengthEncoding {

	// encoding the String
	public String encoding(String toEncode) {
		
		// Creating a StringBuilder to store the encoded String 
		StringBuilder encodedString = new StringBuilder();
		
		// Count the number of the similar consecutive character from the String
		int consecutiveCharCount = 1;
		
		for (int currentChar = 1; currentChar <= toEncode.length(); currentChar++) {
			
			// Checking the condition
			if (currentChar == toEncode.length() || toEncode.charAt(currentChar) != toEncode.charAt(currentChar - 1)) {
				encodedString.append(consecutiveCharCount);
				encodedString.append(toEncode.charAt(currentChar - 1));
				
				// Reset the count
				consecutiveCharCount = 1;
			}
			else { // all the consecutive character are equals then increment the count by one every time
				consecutiveCharCount++;
			}
		}
		
		// return the encoded String
		return encodedString.toString();
	}
	
	public static void main(String[] args) {
		
		try {
			RunLengthEncoding runLengthEncoding = new RunLengthEncoding();
			
			// calling the encoding method
			System.out.println("Encoded String is : " + runLengthEncoding.encoding("aaaabcccaa"));
			System.out.println("Encoded String is : " + runLengthEncoding.encoding("Niraj"));
			System.out.println("Encoded String is : " + runLengthEncoding.encoding("Thagunna"));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
