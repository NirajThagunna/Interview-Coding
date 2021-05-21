package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * @Author: Niraj Thagunna
 * 
 * Factorial Iterative
 */
public class FactorialIterative {

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
		FastReader reader = new FastReader();

		int num = reader.nextInt();
		
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}

		System.out.println("Factorial of " + num + " is : " + res);
	}
}
