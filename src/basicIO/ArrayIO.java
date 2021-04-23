package basicIO;

// Program to read an array from a user

public class ArrayIO {
	
	// Reading a 1-D array
	public static int[] readOneDimensionalArray(int MAX) {
		
		int[] temp = new int[MAX];
		
		for (int i = 0; i < MAX; i++) {
			System.out.print("Enter any number at index " + i + " : ");
			temp[i] = UserIO.readInt();
		}
		
		return temp;
	}
	
	
	// Reading the 2-D Array
	public static int[][] readTwoDimensionalArray(int rows, int cols) {
		
		int[][] temp = new int[rows][cols];
		
		for (int row = 0; row < temp.length; row++) { // length of a 2-D array = no. of rows in the 2-d array
			for (int col = 0; col < temp[row].length; col++) { // number of columns 
				System.out.print("Enter the element at row " + row + " and at col " + col + " : ");
				temp[row][col] = UserIO.readInt();
			}
		}
		
		return temp;
	}
	
	// Printing a 1-D array
	public static void printOneDimensionalArray(int[] arr) {
		
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	
	// Printing the 2-D array
	public static void printTwoDimensionalArray(int[][] arr) {
		
		for (int[] row : arr) { // rows means a 1-D array
			for (int item : row) { // item - all the elements present in each row
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}







