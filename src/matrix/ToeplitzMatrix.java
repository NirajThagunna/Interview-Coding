package matrix;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

/*
 * @Author: Niraj Thagunna
 * Toeplitz Matrix
 * Given, m * n matrix, return true, if the matrix is Toeplitz. Otherwise, return false.
 * 
 * A matrix is known as a Toeplitz matrix, if the every diagonal from top-left to bottom-right has the same elements.
 */

public class ToeplitzMatrix {
	
	// method to check if the matrix is Toeplitz matrix or not
	public static boolean isToeplitzMatrix(int[][] matrix) {
		
		// Iterating the matrix using for loop
		// matrix.length - 1, because we are not checking for the last element, checking upto one element less than length
		for (int i = 0; i < matrix.length - 1; i++) { // for rows, length of a 2-d array = no. of rows
			for (int j = 0; j < matrix[i].length - 1; j++) { // no. of cols
				
				// Checks if every diagonal from top-left to bottom-right elements are same or not
				if (matrix[i][j] != matrix[i + 1][j + 1]) // Checks all the diagonal elements
					return false;
			}
		}
		
		// we only reach here when all the elements in a given diagonal are same
		// else, return true
		return true;
	}
	
	// Main or Driver method
	public static void main(String[] args) {
		
		try {
			int rows, cols;
			
			System.out.print("Enter the number of rows : ");
			rows = UserIO.readInt();
			
			System.out.print("Enter the number of cols : ");
			cols = UserIO.readInt();
			
			// Reading a 2-D array from a user
			System.out.println("\nReading a 2-D array from the user : ");
			
			int[][] testCase = ArrayIO.readTwoDimensionalArray(rows, cols);
			
//			int[][] testCase2 = ArrayIO.readTwoDimensionalArray(rows, cols);
			
			// Printing an array
			System.out.println("\nGiven Matrix is : ");
			ArrayIO.printTwoDimensionalArray(testCase);
			
			System.out.println("Is the given matrix[testCase] is Toeplitz Matrix : " + isToeplitzMatrix(testCase));
			
			if (isToeplitzMatrix(testCase)) {
				System.out.println("Given matrix is a Toeplitz Matrix");
			}
			else {
				System.out.println("Given matrix is not a Toeplitz Matrix");
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


// Time Complexity : O(n^2)

// The time complexity of this solution would be O(n^2) as we are traversing each element in the matrix once only.








