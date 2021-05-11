package matrix;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.ArrayIO;
import basicIO.UserIO;

/*
 * @Author: Niraj Thagunna
 * Program to find the sum of the diagonals of a 2-D matrix.
 * 
 * 1. Primary Diagonal: 00 11 22
 * 		-> Condition: row == col
 * 
 * 2. Secondary Diagonal: 02 11 20
 * 		-> Condition: row == (noOfRows - col - 1)
 */

public class SumOfDiagonalsMatrix {
	
	// function to find the sum of the diagonal elements of a matrix
	public static void sumOfDiagonals(int[][] matrix) {
		
		// Number of the rows of a matrix - length of a matrix
		int n = matrix.length;
		
		int primarySum = 0, secondarySum = 0;
		
		// loop to iterate the matrix
		for (int i = 0; i < n; i++) {
			
			// for the primary diagonals condition is : row == col
			primarySum += matrix[i][i];
			
			// for the sum of the elements of the secondary diagonals, condition is : row == (n - col - 1) i.e. (n-i-1)
			secondarySum += matrix[i][n - i - 1];
		}
		
		System.out.println("Sum of the elements of the primary diagonal : " + primarySum);
		
		System.out.println("Sum of the elements of the secondary diagonal : " + secondarySum);
	}
	
	public static void main(String[] args) {
		
		try {
			
			System.out.print("Enter the number of rows: ");
			int row = UserIO.readInt();
			
			System.out.print("Enter the number of cols: ");
			int col = UserIO.readInt();
			
			int[][] matrix = ArrayIO.readTwoDimensionalArray(row, col);
			
			System.out.println("\nThe given matrix is : ");
			ArrayIO.printTwoDimensionalArray(matrix);
			
			// Finding the sum of the elements of the diagonals
			// both the methods are in the same class that's why we don't need to use the class name to use the sumOfDiagonals()
			sumOfDiagonals(matrix);
		}
		catch(Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}


// Time Complexity : O(n)
// Auxiliary Space : O(1)







