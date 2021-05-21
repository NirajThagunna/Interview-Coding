package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Find Remainder
 */

public class FindRemainder {

	// FastRedaer class
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	
	public static void main(String[] args) {
		// FastRedaer object to read an input
		FastReader fastReader = new FastReader();
		
		// ArrayList to store the result
		ArrayList<Integer> output = new ArrayList<>();
		
		// taking the input for the test cases 
		int t = fastReader.nextInt();
		
		while (t-- > 0) {
			int a = fastReader.nextInt();
			int b = fastReader.nextInt();
			// find remainder
			int remainder = a % b;
			// adding the output
			output.add(remainder);
		}
		
		// printing the output
		for (int value : output) {
			System.out.println(value);
		}
	}
}






