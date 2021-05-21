package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Sum of Digits
 */

public class SumOfDigits {
	
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
		
		// FastReader object
		FastReader fastReader = new FastReader();
		
		// To store the result 
		ArrayList<Integer> output = new ArrayList<>();
		
		// Taking the number of test cases
		int t = fastReader.nextInt();
		
		while (t-- > 0) {
			
			// taking the input number to be sum all the digits
			int n = fastReader.nextInt();
			
			// store the sum
			int sum = 0;
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}
			output.add(sum);
		}
		
		// printing the output
		for (int value : output) {
			System.out.println(value);
		}
	}
}








