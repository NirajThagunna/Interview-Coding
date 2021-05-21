package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Factorial Recursive
 */

public class FactorialRecursive {

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
	
	// method to find the factorial of a number
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		
		return n * factorial(n - 1);
	}
	
	public static void main(String[] args) {
		FastReader reader = new FastReader();
		
		int num = reader.nextInt();
		
		System.out.println("Factorial of " + num + " is : " + factorial(num));
	}
}
