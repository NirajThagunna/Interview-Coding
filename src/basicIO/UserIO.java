package basicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Program to take the input from the user

public class UserIO {
	
	// Reading the String from a user
	public static String readInput() {
		
		String str = null;
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return str;
	}
	
	
	// Reading an integer from a user
	public static int readInt() {
		
		int num = Integer.parseInt(readInput());
		
		return num;
	}
}





